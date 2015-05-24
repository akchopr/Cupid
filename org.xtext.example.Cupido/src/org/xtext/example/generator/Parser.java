package org.xtext.example.generator;

import java.util.HashMap;
import java.util.Iterator;

import org.xtext.example.cupido.ArithExpr;
import org.xtext.example.cupido.Commitment;
import org.xtext.example.cupido.Event;
import org.xtext.example.cupido.EventRelation;
import org.xtext.example.cupido.Expr;
import org.xtext.example.cupido.GeneralExpr;
import org.xtext.example.cupido.Interval;
import org.xtext.example.cupido.Param;
import org.xtext.example.cupido.TimeStamp;

public class Parser {

	private static final String PRIMARY_KEY = "PRIMARY KEY";
	private static final String DATETIME = "DATETIME";
	private static final String VARCHAR_10 = "VARCHAR(10)";
	private static final String CREATE_TABLE = "CREATE TABLE";
	private static final TimeStamp MAXTIME = null; // max DATETIME of SQL
	private static final TimeStamp MINTIME = null;
	public static final String SPACE = " ";
	public static final String UNDERSCORE = "_";
	public static final String LPAREN = "(";
	public static final String RPAREN = ")";
	public static final String LBRACE = "{";
	public static final String RBRACE = "}";
	public static final String COMMA = ",";
	private static final String AND = "and";
	private static final String OR = "or";
	private static final String EXCEPT = "except";

	private static final String CREATED = "created";
	private static final String DETACHED = "detached";
	private static final String DISCHARGED = "discharged";
	private static final String EXPIRED = "expired";
	private static final String VIOLATED = "violated";
	private static final String PLUS = "+";
	private static final String SEMICOLON = ";";
	private static final Object NEWLINE = "\n";

	static Parser theParser = null;
	
	HashMap<CharSequence, EventRelation> attrs = null; 

	HashMap<String, HashMap<String, RelationalExpr>> lifeExprs = null; 

	private Parser() {
		attrs = new HashMap<CharSequence, EventRelation>();
		lifeExprs = new HashMap<String, HashMap<String, RelationalExpr>>();
	}
	
	public static Parser getParser() {
		if (theParser == null) {
			theParser = new Parser();			
		}
		return theParser;
	}

	public void storeEventRelation(EventRelation relation) {
	  attrs.put(relation.getEvent().getName(), relation);
	}

	public String toSQL (EventRelation eRelation) {
		StringBuffer sb = new StringBuffer();
		
		sb.append(CREATE_TABLE + Parser.SPACE);
		sb.append(eRelation.getEvent().getName());
		sb.append(Parser.SPACE + Parser.LPAREN);

		sb.append(Parser.NEWLINE);
		sb.append(Parser.SPACE + Parser.SPACE);

		for (Param p : eRelation.getParams()) {
			sb.append(p.getName());
			sb.append(Parser.SPACE + Parser.SPACE + VARCHAR_10 + Parser.COMMA + Parser.SPACE);
		}
		
		sb.append(Parser.NEWLINE);
		sb.append(Parser.SPACE + Parser.SPACE);
		sb.append(eRelation.getTimeParam().getName());
		sb.append(Parser.SPACE + Parser.SPACE + DATETIME + Parser.COMMA + Parser.SPACE);
		
		sb.append(Parser.NEWLINE);
		sb.append(Parser.SPACE + Parser.SPACE + PRIMARY_KEY + Parser.LPAREN);
		
		Iterator<Param> paramIterator = eRelation.getKeyParams().iterator();
		sb.append(paramIterator.next().getName());
		while (paramIterator.hasNext()) {
			sb.append(Parser.COMMA + Parser.SPACE);
			sb.append(paramIterator.next().getName());
		}
		
		sb.append(Parser.RPAREN);
		sb.append(Parser.NEWLINE);
		sb.append(Parser.RPAREN + Parser.SEMICOLON);
		sb.append(Parser.NEWLINE);
		sb.append(Parser.NEWLINE);

		return sb.toString();
	}

	private EventRelation findEventRelation(String eName) {
		return attrs.get(eName);
	}
	
	private RelationalExpr getLifeExpr(String lifeState, String label) {
	  HashMap<String, RelationalExpr> labelExprs = lifeExprs.get(label);

	  return ((labelExprs == null)
			  ? null
			  : lifeExprs.get(label).get(lifeState)); 
	}

	private void storeLifeExpr(String lifeState, String label, RelationalExpr expr) {
		HashMap<String, RelationalExpr> labelExprs = lifeExprs.get(label);
		if (labelExprs == null) {
			labelExprs = new HashMap<String, RelationalExpr>();
			lifeExprs.put(label, labelExprs);
		}
		
		labelExprs.put(lifeState, expr);	  
	}

	public RelationalExpr compileCreated (Commitment c) {
	  return compileGeneralExpr(c.getTrigger());
	}

	public RelationalExpr compileDetached (Commitment c) {
		RelationalExpr oldDetachExpr = this.getLifeExpr(Parser.DETACHED, c.getLabel());
		if (oldDetachExpr != null) {
			return oldDetachExpr;
		} else {
			RelationalExpr triggerExpr = this.compileGeneralExpr(c.getTrigger());
			RelationalExpr antecedentExpr = this.compileGeneralExpr(c.getAntecedent());
			RelationalExpr detachExpr = this.compileAND(triggerExpr, antecedentExpr);
			this.storeLifeExpr(Parser.DETACHED, c.getLabel(), detachExpr);
			return detachExpr;
		}
	}

	public RelationalExpr compileDischarged (Commitment c) {
		RelationalExpr triggerExpr = this.compileGeneralExpr(c.getTrigger());
		RelationalExpr antecedentExpr = this.compileGeneralExpr(c.getAntecedent());
		RelationalExpr consequentExpr = this.compileGeneralExpr(c.getConsequent());
		RelationalExpr dischargeExpr = this.compileOR(this.compileAND(triggerExpr, consequentExpr),
						     			this.compileAND(antecedentExpr, consequentExpr));
		return dischargeExpr; 
     }
			
	public RelationalExpr compileExpired (Commitment c) {
		RelationalExpr triggerExpr = this.compileGeneralExpr(c.getTrigger());
		RelationalExpr antecedentExpr = this.compileGeneralExpr(c.getAntecedent());
		RelationalExpr expiredExpr = this.compileExcept(triggerExpr, antecedentExpr); 
		return expiredExpr;
	}

	public RelationalExpr compileViolated (Commitment c) {
		RelationalExpr consequentExpr = this.compileGeneralExpr(c.getAntecedent());
		RelationalExpr violatedExpr = this.compileExcept(this.compileDetached(c), consequentExpr); 
		return violatedExpr;
	  }
		  
	public RelationalExpr compileAND(RelationalExpr left, RelationalExpr right) {
		System.out.println("In compileAND");
		System.out.println("  left= " + left.toString());
		System.out.println("  right= " + right.toString());
		
		RelationalExpr lRename = left.getRenameTime();
		RelationalExpr rLaterThanL = this.getLeftLaterThanRight(right, lRename);

		RelationalExpr rRename = right.getRenameTime();
		RelationalExpr lLaterThanR = this.getLeftLaterThanRight(left, rRename);

	  	return this.getUnion(lLaterThanR, rLaterThanL);
	}

	public RelationalExpr compileOR(RelationalExpr left, RelationalExpr right) {
		System.out.println("In compileOR");
		System.out.println("  left= " + left.toString());
		System.out.println("  right= " + right.toString());
		
		RelationalExpr lRename = left.getRenameTime();
		RelationalExpr rLaterThanL = this.getLeftEarlierThanRight(right, lRename);

		RelationalExpr rRename = right.getRenameTime();
		RelationalExpr lLaterThanR = this.getLeftEarlierThanRight(left, rRename);

	  	return this.getUnion(lLaterThanR, rLaterThanL);
	}

	public RelationalExpr compileExcept(RelationalExpr left, RelationalExpr right) {
		return null; // TODO
	}

	public RelationalExpr compileGeneralExpr (GeneralExpr e) {
		// A GeneralExpr is an Expr with an optional WHERE
		System.out.println("expr= " + e.getExpr() + "; where =" + e.getArith());
		RelationalExpr mainExpr = this.compileExpr(e.getExpr()); 
		if (e.getArith() == null) {
	   	  return mainExpr;
	    } else {
	    	StringBuffer sb = new StringBuffer();
	    	Column first = Column.getColumn(e.getArith().getLeftAttr().getName());
	    	//TODO: Should test existence of the column; otherwise might as use the attribute name directly
	    	sb.append(first.getFullName());
	    	sb.append(Parser.SPACE);
	    	sb.append(e.getArith().getBinOp().getOp());
	    	sb.append(Parser.SPACE);
	    	
	    	if (e.getArith().getRightAttr() != null) {
		    	Column second = Column.getColumn(e.getArith().getRightAttr().getName());
		    	sb.append(second.getFullName());	    		
	    	} else {
	    		sb.append(e.getArith().getNum());
	    	}
	    	
	    	String cond = sb.toString();
	    	
//	    	if (mainExpr.hasColumn(first)) {
//	    		
//	    	} else {
//	    		System.out.println("Nonexistent column in where clause; should throw an exception");
//	    		return null;
//	    	}
	   	  return this.getSelect(mainExpr, cond); 
	    }
	  }

	public RelationalExpr compileExpr(Expr expr) {
		if (expr.getExpr() != null) {
			return this.compileExpr(expr.getExpr());
    	} else if (expr.getOp() != null) {
    		if (expr.getOp().equalsIgnoreCase(Parser.AND)) {
    			RelationalExpr left = this.compileInterval(expr.getLeft());
    			RelationalExpr right = this.compileExpr(expr.getRight()); 
    			return this.compileAND(left, right);
    		} else if (expr.getOp().equalsIgnoreCase(Parser.OR)) {
    			RelationalExpr left = this.compileInterval(expr.getLeft());
    			RelationalExpr right = this.compileExpr(expr.getRight()); 
    			return this.compileOR(left, right);
    		} else if (expr.getOp().equalsIgnoreCase(Parser.EXCEPT)) {
    			RelationalExpr left = this.compileInterval(expr.getLeft());
    			RelationalExpr right = this.compileExpr(expr.getRight()); 
    			return this.compileExcept(left, right);
    		}
	    } 
		return this.compileInterval(expr.getInterval());
    }
	
	private RelationalExpr getLeftEarlierThanRight (RelationalExpr left, RelationalExpr right) {
		Column lTime = left.getTimeColumn();
		Column rTime = right.getTimeColumn();
		String lEarlierR = Parser.LPAREN + Parser.LPAREN + lTime.getFullName() + Parser.SPACE 
				+ SelectExpr.LEQ + Parser.SPACE + rTime.getFullName() + Parser.RPAREN 
				+ SelectExpr.OR + Parser.LPAREN + rTime.getFullName() + SelectExpr.IS 
				+ SelectExpr.NULL + Parser.RPAREN + Parser.RPAREN;
		
		RelationalExpr theJoin = this.getLeftOuterJoin(left, right); 
		return this.getSelect(theJoin, lEarlierR);
	}

	private RelationalExpr getLeftLaterThanRight (RelationalExpr left, RelationalExpr right) {
		Column lTime = left.getTimeColumn();
		Column rTime = right.getTimeColumn();
		String lLaterR = Parser.LPAREN + lTime.getFullName() + Parser.SPACE + SelectExpr.GEQ
				+ Parser.SPACE + rTime.getFullName() + Parser.RPAREN;
		
		RelationalExpr theJoin = this.getJoin(left, right); 
		return this.getSelect(theJoin, lLaterR);
	}

	private RelationalExpr compileInterval (Interval interval) {
		System.out.println("In compileInterval");
		System.out.println("  left= " + ((interval.getLeft() != null) ? interval.getLeft().toString() : "NoLeft"));
		System.out.println("  right= " + ((interval.getRight() != null) ? interval.getRight().toString() : "NoRight"));

		TimeStamp lTime = (interval.getLeft() != null) ? interval.getLeft(): MINTIME;
		TimeStamp rTime = (interval.getRight() != null) ? interval.getRight(): MAXTIME; 
		if ((lTime == MINTIME) && (rTime == MAXTIME)) {	
			return this.compileEvent(interval.getEvent());
		} else {
			EventRelation eRelation = this.findEventRelation(interval.getEvent().getName());
			RelationalExpr iExpr = new RelationalExpr(eRelation);

			if ((lTime.getEventReference() == null) && (rTime.getEventReference() == null)) {
				String lCond = String.valueOf(lTime.getVal()) + SelectExpr.LEQ + iExpr.getTimeColumn().getFullName();
				String rCond = iExpr.getTimeColumn().getFullName() + SelectExpr.LT + String.valueOf(rTime.getVal());
				String cond = lCond + " AND " + rCond;
				return this.getSelect(iExpr, cond);
			} else if ((lTime.getEventReference() != null) && (rTime.getEventReference() == null)) {
				EventRelation lRelation = findEventRelation(lTime.getEventReference());
				RelationalExpr lExpr = new RelationalExpr(lRelation).getRenameTime();
				RelationalExpr theExpr = this.getLeftSemiJoin(iExpr, lExpr);

				String lCond = lExpr.getTimeColumn().getFullName() + Parser.PLUS + String.valueOf(lTime.getShift())
						+ SelectExpr.LEQ + iExpr.getTimeColumn().getFullName();
				String rCond = iExpr.getTimeColumn().getFullName() + SelectExpr.LT + String.valueOf(rTime.getVal());
				String cond = lCond + " AND " + rCond;
				return this.getSelect(theExpr, cond);
			}  else if ((lTime.getEventReference() == null) && (rTime.getEventReference() != null)) {
				EventRelation rRelation = findEventRelation(rTime.getEventReference());
				RelationalExpr rExpr = new RelationalExpr(rRelation).getRenameTime();
				RelationalExpr theExpr = this.getLeftSemiJoin(iExpr, rExpr);

				String lCond = String.valueOf(lTime.getVal()) + SelectExpr.LEQ + iExpr.getTimeColumn().getFullName();
				String rCond = iExpr.getTimeColumn().getFullName() + SelectExpr.LT 
						+ rExpr.getTimeColumn().getFullName() + Parser.PLUS + String.valueOf(rTime.getShift());
				String cond = lCond + " AND " + rCond;
				return this.getSelect(theExpr, cond);
			} else {
				EventRelation lRelation = findEventRelation(lTime.getEventReference());
				RelationalExpr lExpr = new RelationalExpr(lRelation).getRenameTime();
				String lCond = lExpr.getTimeColumn().getFullName() + Parser.PLUS + String.valueOf(lTime.getShift()) 
						+ SelectExpr.LEQ + iExpr.getTimeColumn().getFullName();
				RelationalExpr leftExpr = this.getSelect(this.getLeftSemiJoin(iExpr, lExpr), lCond);
				
				EventRelation rRelation = findEventRelation(rTime.getEventReference());
				RelationalExpr rExpr = new RelationalExpr(rRelation).getRenameTime();
				String rCond = iExpr.getTimeColumn().getFullName() + SelectExpr.LT 
						+ rExpr.getTimeColumn().getFullName() + Parser.PLUS + String.valueOf(rTime.getShift());
				RelationalExpr rightExpr = this.getSelect(this.getLeftSemiJoin(iExpr, rExpr), rCond);

				return this.getJoin(leftExpr, rightExpr);				
			}
		}    
	}

	private RelationalExpr compileEvent(Event event) {
		if (event.getName() != null) {
			EventRelation eRelation = this.findEventRelation(event.getName());

			assert (eRelation != null);
		
			RelationalExpr rExpr = new RelationalExpr(eRelation);
			return rExpr;
		} else {
			assert (event.getLifeState() != null);
			RelationalExpr lExpr = this.getLifeExpr(event.getLifeState(), event.getLabel());
			return lExpr;
		}
	}

	private RelationalExpr getSelect (RelationalExpr operand, String subscript) {
		RelationalExpr ee = new RelationalExpr(EventOperator.SELECT);
		ee.setLeft(operand);
		ee.setSubscript(subscript);

		ee.setColumns(operand.getColumns());
		ee.setKeyColumns(operand.getKeyColumns());
		ee.setTimeColumn(operand.getTimeColumn());

		return ee;
	}

	private RelationalExpr getJoin(RelationalExpr left, RelationalExpr right) {
		RelationalExpr rExpr = new RelationalExpr();
		rExpr.setLeft(left);
		rExpr.setRight(right);
		rExpr.setOperator(EventOperator.THETAJOIN);
		
		rExpr.initializeColumns(); 
		rExpr.insertColumns(left.getColumns());
		rExpr.insertColumns(right.getColumns());

		rExpr.initializeKeyColumns(); 
		rExpr.insertKeyColumns(left.getKeyColumns());
		rExpr.insertKeyColumns(right.getKeyColumns());

		// TODO: Verify: the left timestamp is the one we always want
		rExpr.setTimeColumn(left.getTimeColumn()); 
		
		return rExpr;
	}

	private RelationalExpr getLeftSemiJoin(RelationalExpr left, RelationalExpr right) {
		RelationalExpr lrJoin = this.getJoin(left, right);
		RelationalExpr semi = this.projectToLeft(lrJoin, left);
		return semi;
	}

	private RelationalExpr projectToLeft(RelationalExpr operand, RelationalExpr projection) {
		RelationalExpr projectExpr = new RelationalExpr(EventOperator.PROJECT);
		
		projectExpr.setLeft(operand);

		projectExpr.setColumns(projection.getColumns());
		projectExpr.setKeyColumns(projection.getKeyColumns());
		projectExpr.setTimeColumn(projection.getTimeColumn());
		
		StringBuffer sb = new StringBuffer();
		for (Column p: projection.getColumns()) {
			sb.append(p.getFullName());	
			sb.append(Parser.COMMA);
		}
		sb.append(projectExpr.getTimeColumn().getFullName());

		projectExpr.setSubscript(sb.toString());
		
		return projectExpr;
	}

	private RelationalExpr antiJoin(RelationalExpr leftC, RelationalExpr rightC) {
		RelationalExpr semi = this.getLeftSemiJoin(leftC, rightC);
		RelationalExpr anti = this.getDiff(leftC, semi);
		return anti;
    }
	
	private RelationalExpr getLeftOuterJoin(RelationalExpr left, RelationalExpr right) {
		RelationalExpr thetaJoin = this.getJoin(left, right);
		
		RelationalExpr anti = this.projectToLeft(left, right);
		RelationalExpr singleton = this.getSingleton(left, right);
		RelationalExpr cross = this.getCross(anti, singleton);
		
		RelationalExpr union = this.getUnion(thetaJoin, cross);
		return union;
	}

	private RelationalExpr getCross(RelationalExpr left, RelationalExpr right) {
		RelationalExpr crossExpr = new RelationalExpr(EventOperator.CROSS);
		crossExpr.setLeft(left);
		crossExpr.setRight(right);
		
		crossExpr.initializeColumns();
		crossExpr.insertColumns(left.getColumns());
		crossExpr.insertColumns(right.getColumns());

		crossExpr.initializeKeyColumns();
		crossExpr.insertKeyColumns(left.getKeyColumns());
		crossExpr.insertKeyColumns(right.getKeyColumns());
		
		crossExpr.setTimeColumn(left.getTimeColumn());
		
		return crossExpr;
	}

	private RelationalExpr getSingleton(RelationalExpr left, RelationalExpr right) {
		//TODO: Should create a table of name Singleton_X with these columns and should
		// output a statement of the form 
		// \sql_exec{INSERT INTO Singleton_X VALUES('NULL', ...)
		// for the correct number of columns

		RelationalExpr singleton = new RelationalExpr(EventOperator.SINGLETON); 
		singleton.initializeColumns();
		singleton.insertColumns(right.getColumns());
		singleton.removeColumns(left.getColumns());

		singleton.initializeKeyColumns();
		singleton.insertKeyColumns(right.getKeyColumns());
		singleton.removeKeyColumns(left.getKeyColumns());
		
		singleton.setTimeColumn(right.getTimeColumn());
		
		return singleton;
	}

	private RelationalExpr getDiff(RelationalExpr left, RelationalExpr semi) {
		RelationalExpr diffExpr = new RelationalExpr(EventOperator.DIFF);

		diffExpr.setLeft(left);
		diffExpr.setRight(semi);
		diffExpr.setColumns(left.getColumns());
		diffExpr.setKeyColumns(left.getKeyColumns());
		diffExpr.setTimeColumn(left.getTimeColumn());
		
		return diffExpr;
	}

	private RelationalExpr getUnion(RelationalExpr left, RelationalExpr right) {
		RelationalExpr unionExpr = new RelationalExpr();
		unionExpr.setOperator(EventOperator.UNION);
		unionExpr.setLeft(left);
		unionExpr.setRight(right);
		unionExpr.setColumns(left.getColumns());
		unionExpr.setKeyColumns(left.getKeyColumns());
		unionExpr.setTimeColumn(left.getTimeColumn()); // Should be the same for right
		
		return unionExpr;
	}


//TODO: All the unused private methods, especially those below, need to go
	
	private RelationalExpr compileArithmetic(String where) {
		// TODO Auto-generated method stub
		return null;
	}

	private RelationalExpr compileArithmetic(ArithExpr arith) {
		return null;
	}


}
