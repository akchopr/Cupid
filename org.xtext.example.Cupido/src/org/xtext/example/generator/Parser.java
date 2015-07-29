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
	private static final String AS = "AS";

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
			sb.append(Parser.SPACE + Parser.SPACE + Parser.VARCHAR_10 + Parser.COMMA + Parser.SPACE);
		}
		
		sb.append(Parser.NEWLINE);
		sb.append(Parser.SPACE + Parser.SPACE);
		sb.append(eRelation.getTimeParam().getName());
		sb.append(Parser.SPACE + Parser.SPACE + Parser.DATETIME + Parser.COMMA + Parser.SPACE);
		
		sb.append(Parser.NEWLINE);
		sb.append(Parser.SPACE + Parser.SPACE + Parser.PRIMARY_KEY + Parser.LPAREN);
		
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

	/**
	 * AKC: Key assumption about ordering of commitments.
	 * @param event
	 * @return
	 */
	private RelationalExpr compileEvent(Event event) {
		if(null != event.getName())
			return new RelationalExpr(attrs.get(event.getName()));
		else {
			//If event is of nested type. Assumption is that any such event would have been compiled earlier.
			//Therefore, important to specify commitments in an order such that if any expression in a commitment 
			//refers to a lifestate, then the expression corresponding to that lifestate must appear earlier in the order (could be in the same commitment). 
			//This can potentially be relaxed but some lookup implementation (get commitment given label) will be required in that case. 
			RelationalExpr nested = getLifeExpr(event.getLifeState(),event.getLabel());
			return nested;
		}
			
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
	
	public RelationalExpr getANDCROSS(RelationalExpr left, RelationalExpr right) {	
		RelationalExpr rRename = right.getRenameTime();
		RelationalExpr lLaterThanR = this.getLeftLaterThanRightCross(left, rRename);

		RelationalExpr lRename = left.getRenameTime();
		RelationalExpr rLaterThanL = this.getLeftLaterThanRightCross(right, lRename);
		
		return this.getUnion(lLaterThanR, rLaterThanL);
	}


	public RelationalExpr compileAND(RelationalExpr left, RelationalExpr right) {
		RelationalExpr rRename = right.getRenameTime();
		RelationalExpr lLaterThanR = this.getLeftLaterThanRight(left, rRename);

		RelationalExpr lRename = left.getRenameTime();
		RelationalExpr rLaterThanL = this.getLeftLaterThanRight(right, lRename);
		
	  	return this.getUnion(lLaterThanR, rLaterThanL);
	}

	public RelationalExpr compileOR(RelationalExpr left, RelationalExpr right) {		
		RelationalExpr rRename = right.getRenameTime();
		RelationalExpr lLaterThanR = this.getLeftEarlierThanRight(left, rRename);

		RelationalExpr lRename = left.getRenameTime();
		RelationalExpr rLaterThanL = this.getLeftEarlierThanRight(right, lRename);

	  	return this.getUnion(lLaterThanR, rLaterThanL);
	}

	public RelationalExpr compileEXCEPT(RelationalExpr left, Event ev, TimeStamp lTime, TimeStamp rTime) {
		if(null == rTime)
			rTime = CustomTimeStamp.getMaxTimeStamp();
		if(null == lTime)
			lTime = CustomTimeStamp.getMinTimeStamp();
		//compute R
		RelationalExpr R = computeR(left, ev, lTime);
		RelationalExpr S = computeS(left, ev, rTime);
		RelationalExpr T = computeT(left.getTimeColumn(), rTime);
		
		if(null == rTime.getEventReference()) {
			RelationalExpr andC = getANDCROSS(S,T);
			return getUnion(R,projectToLeft(andC, S));
		}
		else
			return null; //TODO
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
		else {//e instanceof EExpr
			if(null != ((EExpr)e).getRight().getEvent()) 
				//Not a "complex" expression on the right and has a deadline
				return compileEXCEPT(compileExpr(e.getLeft()),
						((EExpr)e).getRight().getEvent(),
						((EExpr)e).getRight().getLTime(),
						((EExpr)e).getRight().getRTime());
			else 
				return reduceExcept((EExpr)e);	
			}
	 }
	
	private RelationalExpr reduceExcept(EExpr e) {
			if(e.getRight() instanceof AExpr) {
				// A except (B and C) = (A except B) or (A except C)
				EExpr newLeft = constructEExpr(e.getLeft(),e.getRight().getLeft());
				EExpr newRight = constructEExpr(e.getLeft(), ((AExpr)e.getRight()).getRight());
				OExpr combined = constructOExpr(newLeft,newRight);
				return compileExpr(combined);
			}
			else if(e.getRight() instanceof OExpr) {
				// A except (B or C) = (A except B) and (A except C)
				EExpr newLeft = constructEExpr(e.getLeft(),e.getRight().getLeft());
				EExpr newRight = constructEExpr(e.getLeft(),((OExpr)e.getRight()).getRight());
				AExpr combined = constructAExpr(newLeft,newRight);			
				return compileExpr(combined);
			}
			else if(e.getRight() instanceof WExpr) {
				//A except (B where p) = (A except B) antijoin (A and (B where p))
				//But is the above formulation the simplest possible?
				EExpr ajLeft = constructEExpr(e.getLeft(),e.getRight().getLeft());
				AExpr ajRight = constructAExpr(e.getLeft(),e.getRight());
				return this.antiJoin(compileExpr(ajLeft), compileExpr(ajRight));
			}
			else { //e.getRight instanceof of EExpr
				assert(e.getRight() instanceof EExpr);
				// A except (B except C) = (A except B) or (A and C)
				EExpr newLeft = constructEExpr(e.getLeft(),e.getRight().getLeft());
				AExpr newRight = constructAExpr(e.getLeft(),((EExpr)e.getRight()).getRight());
				OExpr combined = constructOExpr(newLeft,newRight);			
				return compileExpr(combined);
			}
	}
	
	private EExpr constructEExpr(Expr left, Expr right) {
		CustomEExpr e = new CustomEExpr();
		e.setLeft(left);
		e.setRight(right);
		//Set everything else to null (just to be sure)
		e.setEvent(null);
		e.setLTime(null);
		e.setRTime(null);
		return e;
	}
	
	private AExpr constructAExpr(Expr left, Expr right) {
		CustomAExpr e = new CustomAExpr();
		e.setLeft(left);
		e.setRight(right);
		//Set everything else to null (just to be sure)
		e.setEvent(null);
		e.setLTime(null);
		e.setRTime(null);
		return e;
	}
	
	private OExpr constructOExpr(Expr left, Expr right) {
		CustomOExpr e = new CustomOExpr();
		e.setLeft(left);
		e.setRight(right);
		//Set everything else to null (just to be sure)
		e.setEvent(null);
		e.setLTime(null);
		e.setRTime(null);
		return e;
	}
	
	
	
	private RelationalExpr computeR(RelationalExpr x, Event ev, TimeStamp lTime){
		RelationalExpr rExpr = compileAND(x,compileInterval(ev, CustomTimeStamp.getMinTimeStamp(), lTime)); 
		return projectToLeft(rExpr,x);
	}
	
	private RelationalExpr computeS(RelationalExpr x, Event ev, TimeStamp rTime){
		RelationalExpr right = compileInterval(ev,CustomTimeStamp.getMinTimeStamp(),rTime).getRenameTime();
		return antiJoin(x,right);
	}
	
	private RelationalExpr computeT(Column stamp, TimeStamp ts) {
		if(null == ts.getEventReference()) {
			//Enable constructing SELECT ts.getVal AS stamp;
			RelationalExpr singleton = new RelationalExpr();
			singleton.setTimeColumn(stamp);
			singleton.setSubscript(ts.getVal() + Parser.SPACE + Parser.AS + Parser.SPACE + stamp.getFullName());
			singleton.setOperator(EventOperator.TIMESINGLETON);
			singleton.initializeColumns();
			singleton.initializeKeyColumns();
			return singleton;
		}
		else {
			//Enable constructing SELECT all columns, stamp + ts.getShift FROM ts.getEventReference
			RelationalExpr addedTime  = new RelationalExpr();
			//TODO: not complete
			return addedTime;
		}
	}
	
	/*
	 * Used for computing OR
	 */
	private RelationalExpr getLeftEarlierThanRight (RelationalExpr left, RelationalExpr right) {
		Column lTime = left.getTimeColumn();
		Column rTime = right.getTimeColumn();
		String lEarlierR = Parser.LPAREN + Parser.LPAREN + lTime.getFullName() + Parser.SPACE 
				+ SelectExpr.LEQ + Parser.SPACE + rTime.getFullName() + Parser.RPAREN 
				+ SelectExpr.OR + Parser.LPAREN + rTime.getFullName() + SelectExpr.IS 
				+ SelectExpr.NULL + Parser.RPAREN + Parser.RPAREN;
		
		RelationalExpr theJoin = this.getDirectLeftOuterJoin(left, right); 
		return this.getSelect(theJoin, lEarlierR);
	}
	
	private RelationalExpr getDirectLeftOuterJoin(RelationalExpr left, RelationalExpr right){
		RelationalExpr rExpr = new RelationalExpr();
		rExpr.setLeft(left);
		rExpr.setRight(right);
		rExpr.setOperator(EventOperator.LEFTOUTERJOIN);
		
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
	
	
	private RelationalExpr getLeftLaterThanRight(RelationalExpr left, RelationalExpr right) {
		Column lTime = left.getTimeColumn();
		Column rTime = right.getTimeColumn();
		String lLaterR = Parser.LPAREN + lTime.getFullName() + Parser.SPACE + SelectExpr.GEQ
				+ Parser.SPACE + rTime.getFullName() + Parser.RPAREN;
		
		RelationalExpr theJoin = this.getJoin(left, right); 
		return this.getSelect(theJoin, lLaterR);
	}
	
	private RelationalExpr getLeftLaterThanRightCross(RelationalExpr left, RelationalExpr right) {
		Column lTime = left.getTimeColumn();
		Column rTime = right.getTimeColumn();
		String lLaterR = Parser.LPAREN + lTime.getFullName() + Parser.SPACE + SelectExpr.GEQ
				+ Parser.SPACE + rTime.getFullName() + Parser.RPAREN;
		
		RelationalExpr theCross = this.getCross(left, right); 
		return this.getSelect(theCross, lLaterR);
	}
	

	private RelationalExpr compileInterval (Event e, TimeStamp l, TimeStamp r) {
		TimeStamp lTime = (l != null) ? l: CustomTimeStamp.getMinTimeStamp();
		TimeStamp rTime = (r != null) ? r: CustomTimeStamp.getMaxTimeStamp(); 
		if ((lTime == CustomTimeStamp.getMinTimeStamp()) && (rTime == CustomTimeStamp.getMaxTimeStamp())) {	
			return this.compileEvent(e);
		} else {
			
			RelationalExpr iExpr = compileEvent(e);
			
			if ((lTime.getEventReference() == null) && (rTime.getEventReference() == null)) {
				String lCond = String.valueOf(lTime.getVal()) + SelectExpr.LEQ + iExpr.getTimeColumn().getFullName();
				String rCond = iExpr.getTimeColumn().getFullName() + SelectExpr.LT + String.valueOf(rTime.getVal());
				String cond = lCond + " AND " + rCond;
				return this.getSelect(iExpr, cond);
			} else if ((lTime.getEventReference() != null) && (rTime.getEventReference() == null)) {
				RelationalExpr lExpr = compileEvent(lTime.getEventReference()).getRenameTime();
				RelationalExpr theExpr = this.getLeftSemiJoin(iExpr, lExpr);

				String lCond = lExpr.getTimeColumn().getFullName() + Parser.PLUS + String.valueOf(lTime.getShift())
						+ SelectExpr.LEQ + iExpr.getTimeColumn().getFullName();
				String rCond = iExpr.getTimeColumn().getFullName() + SelectExpr.LT + String.valueOf(rTime.getVal());
				String cond = lCond + " AND " + rCond;
				return this.getSelect(theExpr, cond);
			}  else if ((lTime.getEventReference() == null) && (rTime.getEventReference() != null)) {
				RelationalExpr rExpr = compileEvent(rTime.getEventReference()).getRenameTime();
				RelationalExpr theExpr = this.getLeftSemiJoin(iExpr, rExpr);

				String lCond = String.valueOf(lTime.getVal()) + SelectExpr.LEQ + iExpr.getTimeColumn().getFullName();
				String rCond = iExpr.getTimeColumn().getFullName() + SelectExpr.LT 
						+ rExpr.getTimeColumn().getFullName() + Parser.PLUS + String.valueOf(rTime.getShift());
				String cond = lCond + " AND " + rCond;
				return this.getSelect(theExpr, cond);
			} else {
				RelationalExpr lExpr = compileEvent(lTime.getEventReference()).getRenameTime();
				String lCond = lExpr.getTimeColumn().getFullName() + Parser.PLUS + String.valueOf(lTime.getShift()) 
						+ SelectExpr.LEQ + iExpr.getTimeColumn().getFullName();
				RelationalExpr leftExpr = this.getSelect(this.getLeftSemiJoin(iExpr, lExpr), lCond);
				
				RelationalExpr rExpr = compileEvent(rTime.getEventReference()).getRenameTime();
				String rCond = iExpr.getTimeColumn().getFullName() + SelectExpr.LT 
						+ rExpr.getTimeColumn().getFullName() + Parser.PLUS + String.valueOf(rTime.getShift());
				RelationalExpr rightExpr = this.getSelect(this.getLeftSemiJoin(iExpr, rExpr), rCond);

				return this.getJoin(leftExpr, rightExpr);				
			}
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
