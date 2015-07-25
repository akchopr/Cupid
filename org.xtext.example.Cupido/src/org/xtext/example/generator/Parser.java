package org.xtext.example.generator;

import java.util.HashMap;
import java.util.Iterator;

import org.xtext.example.cupido.AExpr;
import org.xtext.example.cupido.Commitment;
import org.xtext.example.cupido.EExpr;
import org.xtext.example.cupido.Event;
import org.xtext.example.cupido.EventRelation;
import org.xtext.example.cupido.Expr;
import org.xtext.example.cupido.OExpr;
import org.xtext.example.cupido.Param;
import org.xtext.example.cupido.TimeStamp;
import org.xtext.example.cupido.WExpr;
import org.xtext.example.generator.CustomEExpr;

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
	private static final String WHERE = "where";

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
		RelationalExpr oldCreateExpr = this.getLifeExpr(Parser.CREATED, c.getLabel());
		if (oldCreateExpr != null) {
			return oldCreateExpr;
		} else {
			RelationalExpr createExpr = compileExpr(c.getTrigger());
			this.storeLifeExpr(Parser.CREATED, c.getLabel(), createExpr);
			return createExpr;
		}
	}

	public RelationalExpr compileDetached (Commitment c) {
		RelationalExpr oldDetachExpr = this.getLifeExpr(Parser.DETACHED, c.getLabel());
		if (oldDetachExpr != null) {
			return oldDetachExpr;
		} else {
			RelationalExpr triggerExpr = this.compileExpr(c.getTrigger());
			RelationalExpr antecedentExpr = this.compileExpr(c.getAntecedent());
			RelationalExpr detachExpr = this.compileAND(triggerExpr, antecedentExpr);
			this.storeLifeExpr(Parser.DETACHED, c.getLabel(), detachExpr);
			return detachExpr;
		}
	}

	public RelationalExpr compileDischarged (Commitment c) {
		RelationalExpr oldDischargeExpr = this.getLifeExpr(Parser.DISCHARGED, c.getLabel());
		if (oldDischargeExpr != null) {
			return oldDischargeExpr;
		} else {
			RelationalExpr triggerExpr = this.compileExpr(c.getTrigger());
			RelationalExpr antecedentExpr = this.compileExpr(c.getAntecedent());
			RelationalExpr consequentExpr = this.compileExpr(c.getConsequent());
			RelationalExpr dischargeExpr = this.compileOR(this.compileAND(triggerExpr, consequentExpr),
						     			this.compileAND(antecedentExpr, consequentExpr));
			this.storeLifeExpr(Parser.DISCHARGED, c.getLabel(), dischargeExpr);
			return dischargeExpr; 
		}
     }
		
	/*
	 * Expired and Violated have to be treated in a special manner as they involve constructing
	 * a suitable EXCEPT expression and compiling it as a whole -- getting relationalExprs 
	 * separately for each component, as for created, detached, and discharged, won't help.
	 */
	public RelationalExpr compileExpired (Commitment c) {
		RelationalExpr oldExpireExpr = this.getLifeExpr(Parser.EXPIRED, c.getLabel());
		if (oldExpireExpr != null) {
			return oldExpireExpr;
		} else {
			//Construct the expression 'trigger except antecedent' and compile it
			Expr e = constructEExpr(c.getTrigger(),c.getAntecedent());
			System.out.println(exprToString(e));
			RelationalExpr expireExpr = compileExpr(e);
			this.storeLifeExpr(Parser.EXPIRED, c.getLabel(), expireExpr);
			return expireExpr;
		}
	}

	public RelationalExpr compileViolated (Commitment c) {
		RelationalExpr oldViolateExpr = this.getLifeExpr(Parser.VIOLATED, c.getLabel());
		if (oldViolateExpr != null) {
			return oldViolateExpr;
		} else {
			//Construct (trigger and antecedent) except consequent
			Expr aExpr = constructAExpr(c.getTrigger(),c.getAntecedent());
			Expr eExpr = constructEExpr(aExpr,c.getConsequent());
			System.out.println(exprToString(eExpr));
			RelationalExpr violateExpr = this.compileExpr(eExpr);
			this.storeLifeExpr(Parser.VIOLATED, c.getLabel(), violateExpr);
			return violateExpr;
		}
	  }
		  
	public RelationalExpr compileAND(RelationalExpr left, RelationalExpr right) {	
		RelationalExpr lRename = left.getRenameTime();
		RelationalExpr rLaterThanL = this.getLeftLaterThanRight(right, lRename);

		RelationalExpr rRename = right.getRenameTime();
		RelationalExpr lLaterThanR = this.getLeftLaterThanRight(left, rRename);

	  	return this.getUnion(lLaterThanR, rLaterThanL);
	}

	public RelationalExpr compileOR(RelationalExpr left, RelationalExpr right) {		
		RelationalExpr lRename = left.getRenameTime();
		RelationalExpr rLaterThanL = this.getLeftEarlierThanRight(right, lRename);

		RelationalExpr rRename = right.getRenameTime();
		RelationalExpr lLaterThanR = this.getLeftEarlierThanRight(left, rRename);

	  	return this.getUnion(lLaterThanR, rLaterThanL);
	}

	public RelationalExpr compileExcept(EExpr e) {
		//System.out.println("In CompileExcept: " + e.toString());
		return new RelationalExpr(); // TODO
	}
	
	public RelationalExpr compileWHERE(RelationalExpr left, String cond){
		return this.getSelect(left, cond);
	}

	public RelationalExpr compileExpr (Expr e) {
		//
		if(null != e.getEvent())
			return compileInterval(e.getEvent(), e.getLTime(),e.getRTime());
		else if(e instanceof WExpr)
			return compileWHERE(compileExpr(e.getLeft()),((WExpr)e).getRight());
		else if (e instanceof AExpr)
			return compileAND(compileExpr(e.getLeft()),compileExpr(((AExpr)e).getRight()));
		else if (e instanceof OExpr)
			return compileOR(compileExpr(e.getLeft()),compileExpr(((OExpr)e).getRight()));
		else {//Except
			Event ev = ((EExpr)e).getRight().getEvent();
			if(null != ev) //Not a complex expression on the right
				return compileExcept((EExpr)e);
			else { 
				// Complex expression on the right, so reduce
				System.out.println("Reduced: " + exprToString(e));
				Expr reduced = reduceExcept((EExpr)e);
				System.out.println("To: " + exprToString(reduced));
				return compileExpr(reduced);
			}
				
		}
			
	 }
	
	private Expr reduceExcept(EExpr e) {
		if(null != e.getRight().getEvent()) //Nothing to reduce
			return e;
		else {
			if(e.getRight() instanceof AExpr) {
				// A except (B and C) = (A except B) or (A except C)
				EExpr newLeft = constructEExpr(e.getLeft(),e.getRight().getLeft());
				EExpr newRight = constructEExpr(e.getLeft(), ((AExpr)e.getRight()).getRight());
				OExpr combined = constructOExpr(reduceExcept(newLeft),reduceExcept(newRight));
				//RelationalExpr left = compileExpr(newLeft);
				//RelationalExpr right = compileExpr(newRight);			
				return combined;
			}
			else if(e.getRight() instanceof OExpr) {
				// A except (B or C) = (A except B) and (A except C)
				EExpr newLeft = constructEExpr(e.getLeft(),e.getRight().getLeft());
				EExpr newRight = constructEExpr(e.getLeft(),((OExpr)e.getRight()).getRight());
				AExpr combined = constructAExpr(reduceExcept(newLeft),reduceExcept(newRight));			
				return combined;
			}
			else {
				// A except (B except C) = (A except B) or (A and C)
				EExpr newLeft = constructEExpr(e.getLeft(),e.getRight().getLeft());
				AExpr newRight = constructAExpr(e.getLeft(),((EExpr)e.getRight()).getRight());
				OExpr combined = constructOExpr(reduceExcept(newLeft),newRight);			
				return combined;
			}
		}
	}
	
	private EExpr constructEExpr(Expr left, Expr right) {
		CustomEExpr e = new CustomEExpr();
		e.setLeft(left);
		e.setRight(right);
		//Set everything else to null
		e.setEvent(null);
		e.setLTime(null);
		e.setRTime(null);
		return e;
	}
	
	private AExpr constructAExpr(Expr left, Expr right) {
		CustomAExpr e = new CustomAExpr();
		e.setLeft(left);
		e.setRight(right);
		//Set everything else to null
		e.setEvent(null);
		e.setLTime(null);
		e.setRTime(null);
		return e;
	}
	
	private OExpr constructOExpr(Expr left, Expr right) {
		CustomOExpr e = new CustomOExpr();
		e.setLeft(left);
		e.setRight(right);
		//Set everything else to null
		e.setEvent(null);
		e.setLTime(null);
		e.setRTime(null);
		return e;
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

	private RelationalExpr compileInterval (Event e, TimeStamp l, TimeStamp r) {
		TimeStamp lTime = (l != null) ? l: MINTIME;
		TimeStamp rTime = (r != null) ? r: MAXTIME; 
		if ((lTime == MINTIME) && (rTime == MAXTIME)) {	
			return this.compileEvent(e);
		} else {
			EventRelation eRelation = this.findEventRelation(e.getName());
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
	
	/**
	 * Can be used to test generated expressions and for checking precedence and associativity
	 * as it inserts explicit parentheses. 
	 * @param e
	 * @return
	 */
	public static String exprToString(Expr e){
		StringBuffer b = new StringBuffer();
		b.append(Parser.LPAREN);
		if(null != e.getEvent()){
			b.append(e.getEvent().getName());//Ignoring timestamps
		}
		else if(e instanceof WExpr) {
			b.append(exprToString(e.getLeft()));
			b.append(Parser.SPACE + Parser.WHERE + Parser.SPACE);
			b.append(((WExpr)e).getRight());
		}
		else if (e instanceof AExpr) {
			b.append(exprToString(e.getLeft()));
			b.append(Parser.SPACE + Parser.AND + Parser.SPACE);
			b.append(exprToString(((AExpr)e).getRight()));
		}
		else if (e instanceof OExpr) {
			b.append(exprToString(e.getLeft()));
			b.append(Parser.SPACE + Parser.OR + Parser.SPACE);
			b.append(exprToString(((OExpr)e).getRight()));
		}
		else {//Except
			b.append(exprToString(e.getLeft()));
			b.append(Parser.SPACE + Parser.EXCEPT + Parser.SPACE);
			b.append(exprToString(((EExpr)e).getRight()));
		}
		
		b.append(Parser.RPAREN);
		return b.toString();
	}

}
