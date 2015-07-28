package org.xtext.example.generator;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.xtext.example.cupido.Event;
import org.xtext.example.cupido.EventRelation;
import org.xtext.example.cupido.Param;

public class RelationalExpr //extends GeneralExprImpl// implements EventRelation 
{ 
	private Set<Column> allColumns = null;
	private Set<Column> keyColumns = null;
	private Column timeColumn = null;
	private EventOperator operator;
	private RelationalExpr rightExpr;
	private RelationalExpr leftExpr;
	private String subscript;
	private Event event; 
	
	private static int tableCounter = 0;
	
	
	
	public static final String SQLFROM = "FROM";
	public static final String SQLAS = "AS";
	public static final String SQLTABLE = "TABLE";
	
	public static final String SQLINTERSECTION = "";
	public static final String SQLUNION = "UNION";
	public static final String SQLNOTIN = "NOT IN"; // FOR diff
	public static final String SQLCROSSJOIN = "CROSS JOIN";
	public static final String SQLWHERE = "WHERE";
	public static final String SQLSELECT = "SELECT";
	public static final String SQLSELECTSTAR = "SELECT *";
	public static final String SQLJOIN = "NATURAL JOIN";
	public static final String SQLLEFTOUTERJOIN = "LEFT OUTER JOIN";

	public String toString() {
		return indentedString(0);
	}
	
	public String indentedString(int indent) {
		StringBuffer sb = new StringBuffer();
		sb.append("\n");
		
		for (int i=0; i<indent; i++) {
			sb.append(" ");
		}
		
		sb.append("[" + ((operator == null) ? "op=NULL" : operator.toString()) + Parser.SPACE);
		sb.append("event= " + ((event == null) ? null : event.getName() + Parser.SPACE));
		sb.append(((leftExpr == null) ? "" : leftExpr.indentedString(indent + 1)));
		sb.append(((rightExpr == null) ? "" : rightExpr.indentedString(indent + 1)));
		sb.append(((timeColumn == null) ? (Parser.SPACE + "NoTIME") : timeColumn.getFullName()));
		sb.append("]");

		return sb.toString();
	}
	
	public String toRelationalAlgebra() {
		StringBuffer sb = new StringBuffer();
		sb.append(Parser.LPAREN);
		
		if (operator == EventOperator.SELECT) {
			sb.append(operator.toString() + Parser.UNDERSCORE + Parser.LBRACE + subscript + Parser.RBRACE + Parser.SPACE + leftExpr.toRelationalAlgebra());			
		} else if (operator == EventOperator.PROJECT) {
			sb.append(operator.toString() + Parser.UNDERSCORE + Parser.LBRACE + subscript + Parser.RBRACE + Parser.SPACE + leftExpr.toRelationalAlgebra());			
		} else if (operator == EventOperator.RENAME) {
			sb.append(operator.toString() + Parser.UNDERSCORE + Parser.LBRACE + subscript + Parser.RBRACE + Parser.SPACE + leftExpr.toRelationalAlgebra());
		} else if ((operator == EventOperator.THETAJOIN) || (operator == EventOperator.UNION) || (operator == EventOperator.INTERSECTION) || (operator == EventOperator.DIFF)) {
			sb.append(leftExpr.toRelationalAlgebra() + Parser.SPACE + operator.toString() + Parser.SPACE + rightExpr.toRelationalAlgebra());
		} else if (event != null) {
			sb.append(event.getName());
		}

		sb.append(Parser.RPAREN);

		return sb.toString();
	}
	
	private static String getNewTable(){
		return SQLTABLE + tableCounter++;
	}
	
	public String toSQL() {
		StringBuffer sb = new StringBuffer();
		sb.append(Parser.LPAREN);
		
		if (operator == EventOperator.SELECT) 
			sb.append(SQLSELECTSTAR + Parser.SPACE + 
					SQLFROM + Parser.SPACE + leftExpr.toSQL() + Parser.SPACE + 
					SQLAS + Parser.SPACE + getNewTable() + Parser.SPACE + 
					SQLWHERE + Parser.SPACE + subscript) ;			
		else if ((operator == EventOperator.PROJECT) || (operator == EventOperator.RENAME)) 
			sb.append(SQLSELECT + Parser.SPACE  + subscript + Parser.SPACE + 
					SQLFROM + Parser.SPACE + leftExpr.toSQL() + Parser.SPACE + 
					SQLAS + Parser.SPACE + getNewTable());			
		else if ((operator == EventOperator.THETAJOIN) || (operator == EventOperator.UNION) || 
				(operator == EventOperator.INTERSECTION) || (operator == EventOperator.DIFF) ||
				(operator == EventOperator.CROSS)) 
			sb.append(leftExpr.toSQL() + Parser.SPACE + operator.toString() + Parser.SPACE + rightExpr.toSQL());
		else if (operator == EventOperator.TIMESINGLETON) 
			sb.append(SQLSELECT + Parser.SPACE + subscript);
		else if (event != null) 
			sb.append(SQLSELECTSTAR + Parser.SPACE + SQLFROM + Parser.SPACE + event.getName());
		
		sb.append(Parser.RPAREN);
		return sb.toString();
	}
	
	
	
	public String toRelationalAlgebraOLD () {
		  String leftS = this.getLeft().toRelationalAlgebra();
		  String rightS = this.getRight().toRelationalAlgebra();

		  return "(" + leftS + EventOperator.THETAJOIN.toString() + rightS + ")";
		}

	public RelationalExpr() {
		// TODO Auto-generated constructor stub
	}

	RelationalExpr(EventOperator op) {
		operator = op;
	}

	public RelationalExpr(EventRelation eventRelation) {
		this.event = eventRelation.getEvent();
		this.initializeColumns(); 
		this.insertColumns(eventRelation.getParams());
		this.initializeKeyColumns(); 	
		this.insertKeyColumns(eventRelation.getKeyParams());
		this.timeColumn = Column.getColumn(eventRelation.getTimeParam().getName());
		this.operator = EventOperator.ID;
		
//		iExpr.setEvent(interval.getEvent());
	}

	public Set<Column> getColumns() {
		return allColumns;
	}	

	public void initializeColumns() {
		allColumns = new LinkedHashSet<Column>();
	}

	public void setColumns(Set<Column> columns) {
		allColumns = columns;
	}

	public Set<Column> getKeyColumns() {
		return keyColumns;
	}

	void insertColumns(Set<Column> list) {
		for (Column p : list) {
//			allColumns.add(Column.getColumn(p.getName()));
			allColumns.add(p);
		}
	}

	void insertColumns(Collection<Param> list) {
		for (Param p : list) {
			allColumns.add(Column.getColumn(p.getName()));			
		}
	}

	void removeColumns(Set<Column> columns) {
		allColumns.removeAll(columns);		
	}

	void initializeKeyColumns() {
		keyColumns = new LinkedHashSet<Column>();		
	}

	public void setKeyColumns(Set<Column> list) {
		keyColumns = list;
	}

	void insertKeyColumns(Set<Column> set) {
		for (Column p : set) {
//			keyColumns.add(Column.getColumn(p.getName()));
			keyColumns.add(p);
		}
	}

	void insertKeyColumns(Collection<Param> list) {
		for (Param p : list) {
			keyColumns.add(Column.getColumn(p.getName()));
		}
	}

	void removeKeyColumns(Set<Column> columns) {
		keyColumns.removeAll(columns);		
	}

	public Column getTimeColumn() {
		return timeColumn;
	}

	public void setTimeColumn(Column tColumn) {
		timeColumn = tColumn;
	}

	public EventOperator getOperator() {
		return operator;
	}

	public void setOperator(EventOperator op) {
		operator = op;
	}

	public RelationalExpr getLeft() {
		return leftExpr;
	}

	public RelationalExpr getRight() {
		return rightExpr;
	}

	public void setLeft(RelationalExpr expr) {
		leftExpr = expr;
	}

	public void setRight(RelationalExpr expr) {
		rightExpr = expr;
	}
			
	RelationalExpr getRenameTime() {
		String oldTimeName = this.getTimeColumn().getFullName();
		Column newTime = this.getTimeColumn().generateColumn();

		RelationalExpr renamedExpr = new RelationalExpr(EventOperator.RENAME);
		renamedExpr.setLeft(this);
		renamedExpr.setColumns(this.getColumns());		
		renamedExpr.setKeyColumns(this.getKeyColumns());		
		renamedExpr.setTimeColumn(newTime);

		StringBuffer sb = new StringBuffer();
		for (Column p: renamedExpr.getColumns()) {
			sb.append(p.getFullName());	
			sb.append(Parser.COMMA);
		}
		
		sb.append(oldTimeName + " AS " + renamedExpr.getTimeColumn().getFullName());

		renamedExpr.setSubscript(sb.toString());
		
		return renamedExpr;
	}

	public String getSubscript() {
		return subscript;
	}

	public void setSubscript(String arg) {
		this.subscript = arg;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event value) {
		event = value;
	}

}
