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
import org.xtext.example.generator.query.AndQuery;
import org.xtext.example.generator.query.BaseEventQuery;
import org.xtext.example.generator.query.CurrentTimeQuery;
import org.xtext.example.generator.query.ExceptQuery;
import org.xtext.example.generator.query.IntervalLeftEventReferenceQuery;
import org.xtext.example.generator.query.IntervalLeftRightEventReferenceQuery;
import org.xtext.example.generator.query.IntervalNoEventReferenceQuery;
import org.xtext.example.generator.query.IntervalRightEventReferenceQuery;
import org.xtext.example.generator.query.OrQuery;
import org.xtext.example.generator.query.ProjectToLeftQuery;
import org.xtext.example.generator.query.Query;
import org.xtext.example.generator.query.SQLInterface;
import org.xtext.example.generator.query.UnionQuery;
import org.xtext.example.generator.query.WhereQuery;

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

	private static final String CREATED = "created";
	private static final String DETACHED = "detached";
	private static final String DISCHARGED = "discharged";
	private static final String EXPIRED = "expired";
	private static final String VIOLATED = "violated";
	private static final String SEMICOLON = ";";
	private static final Object NEWLINE = "\n";

	static Parser theParser = null;
	
	HashMap<CharSequence, EventRelation> attrs = null; 

	HashMap<String, HashMap<String, Query>> lifeExprs = null; 

	private Parser() {
		attrs = new HashMap<CharSequence, EventRelation>();
		lifeExprs = new HashMap<String, HashMap<String, Query>>();
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
	private Query compileEvent(Event event) {
		if(null != event.getName()) {
			String name = event.getName();
			EventRelation er = attrs.get(name);
			return new BaseEventQuery(er);
		}
		else {
			//If event is of nested type. Assumption is that any such event would have been compiled earlier.
			//Therefore, important to specify commitments in an order such that if any expression in a commitment 
			//refers to a lifestate, then the expression corresponding to that lifestate must appear earlier in the order (could be in the same commitment). 
			//This can potentially be relaxed but some lookup implementation (get commitment given label) will be required in that case. 
			Query nested = getLifeExpr(event.getLifeState(),event.getLabel());
			return nested;
		}
			
	}
	
	private Query getLifeExpr(String lifeState, String label) {
	  HashMap<String, Query> labelExprs = lifeExprs.get(label);

	  return ((labelExprs == null)
			  ? null
			  : lifeExprs.get(label).get(lifeState)); 
	}

	private void storeLifeExpr(String lifeState, String label, Query expr) {
		HashMap<String, Query> labelExprs = lifeExprs.get(label);
		if (labelExprs == null) {
			labelExprs = new HashMap<String, Query>();
			lifeExprs.put(label, labelExprs);
		}
		
		labelExprs.put(lifeState, expr);	  
	}

	public Query compileCreated (Commitment c) {
		Query oldCreateExpr = this.getLifeExpr(Parser.CREATED, c.getLabel());
		if (oldCreateExpr != null) {
			return oldCreateExpr;
		} else {
			Query createExpr = compileExpr(c.getTrigger());
			this.storeLifeExpr(Parser.CREATED, c.getLabel(), createExpr);			
			return new CurrentTimeQuery(createExpr);
		}
	}
	
	public Query compileDetached (Commitment c) {
		Query oldDetachExpr = this.getLifeExpr(Parser.DETACHED, c.getLabel());
		if (oldDetachExpr != null) {
			return oldDetachExpr;
		} else {
			Query triggerExpr = this.compileExpr(c.getTrigger());
			Query antecedentExpr = this.compileExpr(c.getAntecedent());
			Query detachExpr = this.compileAND(triggerExpr, antecedentExpr);
			this.storeLifeExpr(Parser.DETACHED, c.getLabel(), detachExpr);
			return new CurrentTimeQuery(detachExpr);
		}
	}
	
	public Query compileDischarged (Commitment c) {
		Query oldDischargeExpr = this.getLifeExpr(Parser.DISCHARGED, c.getLabel());
		if (oldDischargeExpr != null) {
			return oldDischargeExpr;
		} else {
			Query triggerExpr = this.compileExpr(c.getTrigger());
			Query consequentExpr = this.compileExpr(c.getConsequent());
			Query dischargeExpr = this.compileAND(triggerExpr, consequentExpr);
			this.storeLifeExpr(Parser.DISCHARGED, c.getLabel(), dischargeExpr);
			return new CurrentTimeQuery(dischargeExpr); 
		}
     }
	
	/*
	 * Expired and Violated have to be treated in a special manner as they involve constructing
	 * a suitable EXCEPT expression and compiling it as a whole -- getting relationalExprs 
	 * separately for each component, as for created, detached, and discharged, won't help.
	 */
	public Query compileExpired (Commitment c) {
		Query oldExpireExpr = this.getLifeExpr(Parser.EXPIRED, c.getLabel());
		if (oldExpireExpr != null) {
			return oldExpireExpr;
		} else {
			//Construct the expression 'trigger except antecedent' and compile it
			Expr e = constructEExpr(c.getTrigger(),c.getAntecedent());
			Query expireExpr = compileExpr(e);
			this.storeLifeExpr(Parser.EXPIRED, c.getLabel(), expireExpr);
			return new CurrentTimeQuery(expireExpr);
		}
	}

	public Query compileViolated (Commitment c) {
		Query oldViolateExpr = this.getLifeExpr(Parser.VIOLATED, c.getLabel());
		if (oldViolateExpr != null) {
			return oldViolateExpr;
		} else {
			//Construct (trigger and antecedent) except consequent
			Expr aExpr = constructAExpr(c.getTrigger(),c.getAntecedent());
			Expr eExpr = constructEExpr(aExpr,c.getConsequent());
			Query violateExpr = compileExpr(eExpr);
			this.storeLifeExpr(Parser.VIOLATED, c.getLabel(), violateExpr);
			return new CurrentTimeQuery(violateExpr);
		}
	}
	

	public Query compileAND(Query left, Query right) {
		AndQuery aQuery = new AndQuery(left,right);
		return aQuery;
	}

	public Query compileOR(Query left, Query right) {
		OrQuery oQuery = new OrQuery(left,right);
		return oQuery;
	}

	public Query compileWHERE(Query left, String cond){
		WhereQuery whereQuery = new WhereQuery(left,cond);
		return whereQuery;
	}
	
	public Query compileEXCEPT(Query left, Event ev, TimeStamp lTime, TimeStamp rTime) {
		if(null == rTime)
			rTime = CustomTimeStamp.getMaxTimeStamp();
		if(null == lTime)
			lTime = CustomTimeStamp.getMinTimeStamp();
		
		Query leftTimeStampEventQ=null, rightTimeStampEventQ=null;
		Query eventQ = compileEvent(ev);
		if(null != lTime.getEventReference())
			//leftEvName = lTime.getEventReference().getName();
			leftTimeStampEventQ = compileEvent(lTime.getEventReference());
		if(null != rTime.getEventReference())
			//rightEvName = rTime.getEventReference().getName();
			rightTimeStampEventQ = compileEvent(rTime.getEventReference());
		
		/*Query exceptQ = new ExceptQuery(left, attrs.get(ev.getName()), 
				attrs.get(leftEvName),lTime, 
				attrs.get(rightEvName),rTime);*/
		Query exceptQ = new ExceptQuery(left, eventQ, 
				leftTimeStampEventQ,lTime, 
				rightTimeStampEventQ,rTime);
		return exceptQ;
	}

	public Query compileExpr (Expr e) {
		//
		if(null != e.getEvent())
			return compileInterval(e.getEvent(), e.getLTime(),e.getRTime());
		else if(e instanceof WExpr)
			return compileWHERE(compileExpr(e.getLeft()),((WExpr)e).getRight());
		else if (e instanceof AExpr)
			return compileAND(compileExpr(e.getLeft()),compileExpr(((AExpr)e).getRight()));
		else if(e instanceof OExpr)
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
	
	private Query reduceExcept(EExpr e) {
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
				//A except (B where p) = (A except B)  union (A and (B where NOT p))
				//But is the above formulation the simplest possible?
				EExpr ajLeft = constructEExpr(e.getLeft(),e.getRight().getLeft());//
				//We need to negate the where expression, that is, (left and right) where NOT (cond)
				String wCond = ((WExpr)e.getRight()).getRight();
				Expr wLeft = ((WExpr)e.getRight()).getLeft();
				String newWCond = SQLInterface.SQLNOT + SQLInterface.SQLLPAREN + wCond + SQLInterface.SQLRPAREN;
				Expr newWExpr = constructWExpr(wLeft,newWCond); 
				AExpr ajRight = constructAExpr(e.getLeft(),newWExpr);
				Query ptl = new ProjectToLeftQuery(compileExpr(ajRight));
				Query union = new UnionQuery(compileExpr(ajLeft),ptl);
				return union;
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
	
	private WExpr constructWExpr(Expr left, String right) {
		CustomWExpr e = new CustomWExpr();
		e.setLeft(left);
		e.setRight(right);
		//Set everything else to null (just to be sure)
		e.setEvent(null);
		e.setLTime(null);
		e.setRTime(null);
		return e;
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
	
	private Query compileInterval (Event e, TimeStamp l, TimeStamp r) {
		TimeStamp lTime = (l != null) ? l: CustomTimeStamp.getMinTimeStamp();
		TimeStamp rTime = (r != null) ? r: CustomTimeStamp.getMaxTimeStamp(); 
		Query evQ = compileEvent(e);
		if ((lTime == CustomTimeStamp.getMinTimeStamp()) && (rTime == CustomTimeStamp.getMaxTimeStamp())) {	
			return evQ;
		} else {
			if ((lTime.getEventReference() == null) && (rTime.getEventReference() == null)) {
				IntervalNoEventReferenceQuery q = new IntervalNoEventReferenceQuery(evQ, lTime, rTime);
				return q;
			} else if ((lTime.getEventReference() != null) && (rTime.getEventReference() == null)) {
				Query lRef = compileEvent(lTime.getEventReference());
				IntervalLeftEventReferenceQuery q = new IntervalLeftEventReferenceQuery(evQ, lRef, lTime, rTime);
				return q;			
			} else if ((lTime.getEventReference() == null) && (rTime.getEventReference() != null)) {
				Query rRef = compileEvent(rTime.getEventReference());
				IntervalRightEventReferenceQuery q = new IntervalRightEventReferenceQuery(evQ, rRef, lTime, rTime);
				return q;
			} else {
				Query lRef = compileEvent(lTime.getEventReference());
				Query rRef = compileEvent(rTime.getEventReference());
				Query q = new IntervalLeftRightEventReferenceQuery(evQ, lRef, rRef, lTime, rTime);
				return q;
			}
		}
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
