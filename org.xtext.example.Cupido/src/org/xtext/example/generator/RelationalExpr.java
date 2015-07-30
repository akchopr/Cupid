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
	//public static final String SQLSELECTSTAR = "SELECT *";
	public static final String SQLJOIN = "NATURAL JOIN";
	public static final String SQLLEFTOUTERJOIN = "NATURAL LEFT OUTER JOIN";
	public static final String SQLUSING = "USING";

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

	private static String getNewTable(){
		return SQLTABLE + tableCounter++;
	}

	public String toSQL() throws MalformedSchemaException {
		StringBuffer sb = new StringBuffer();

		if (operator == EventOperator.SELECT){ 
			/* Recall in relational algebra, select is selecting a subset of rows, not selecting columns.
			 * Select in relational algebra has two operands: the set from which to select and the condition on the basis of which to select.
			 * These are left and subscript respectively. 
			 */

			sb.append(SQLSELECT + Parser.SPACE);

			for (Column p: this.getColumns()) {
				sb.append(p.getFullName());	
				sb.append(Parser.COMMA);
			}
			sb.append(this.getTimeColumn().getFullName());
			sb.append(Parser.SPACE);
			sb.append(SQLFROM + Parser.SPACE + Parser.LPAREN + leftExpr.toSQL() + Parser.RPAREN + Parser.SPACE + 
					SQLAS + Parser.SPACE + getNewTable() + Parser.SPACE + 
					SQLWHERE + Parser.SPACE + subscript) ;
		}
		else if (operator == EventOperator.PROJECT) {
			/* Project is SQL's "select". Two operands, the set from which to project (left)
			 * and the columns to project (subscript) 
			 */

			sb.append(SQLSELECT + Parser.SPACE  + subscript + Parser.SPACE + 
					SQLFROM + Parser.SPACE + Parser.LPAREN + leftExpr.toSQL() + Parser.RPAREN + Parser.SPACE + 
					SQLAS + Parser.SPACE + getNewTable());
		}
		else if (operator == EventOperator.RENAME) {
			/* Works exactly like Project because we have already put all columns including the renamed one in subscript. 
			 * This is an UGLY HACK. Ideally, we should be have a map for the renamed columns and generate the renaming string here
			 * from the columns of the relational expression and the map. 
			 */

			sb.append(SQLSELECT + Parser.SPACE  + subscript + Parser.SPACE + 
					SQLFROM + Parser.SPACE + Parser.LPAREN + leftExpr.toSQL() + Parser.RPAREN + Parser.SPACE + 
					SQLAS + Parser.SPACE + getNewTable());

		}
		else if (operator == EventOperator.THETAJOIN) {
			Set<Column> joinKeys = getCommonKeys(leftExpr,rightExpr);
			if(0 == joinKeys.size()) 
				throw new MalformedSchemaException("Attempting operation " + this.getOperator() + " without any common columns between " + this.getLeft() + " and " + this.getRight());
			else {
				sb.append(SQLSELECT + Parser.SPACE);
				for (Column p: this.getColumns()) {
					sb.append(p.getFullName());	
					sb.append(Parser.COMMA);
				}
				sb.append(this.getTimeColumn().getFullName());
				sb.append(Parser.SPACE);

				sb.append(SQLFROM + Parser.SPACE + Parser.LPAREN + leftExpr.toSQL() + Parser.RPAREN + Parser.SPACE + 
						SQLJOIN + Parser.SPACE + 
						Parser.LPAREN + rightExpr.toSQL() + Parser.RPAREN + Parser.SPACE + 
						SQLAS + Parser.SPACE + getNewTable());
			}
		}
		else if (operator == EventOperator.LEFTOUTERJOIN){
			Set<Column> joinKeys = getCommonKeys(leftExpr,rightExpr);
			if(0 == joinKeys.size()) 
				throw new MalformedSchemaException("Attempting operation " + this.getOperator() + " without any common columns between " + this.getLeft() + " and " + this.getRight());
			else {
				sb.append(SQLSELECT + Parser.SPACE);
				for (Column p: this.getColumns()) {
					sb.append(p.getFullName());	
					sb.append(Parser.COMMA);
				}
				sb.append(this.getTimeColumn().getFullName());
				sb.append(Parser.SPACE);
				sb.append(SQLFROM + Parser.SPACE + Parser.LPAREN + leftExpr.toSQL() + Parser.RPAREN + Parser.SPACE + 
						SQLLEFTOUTERJOIN + Parser.SPACE + 
						Parser.LPAREN + rightExpr.toSQL() + Parser.RPAREN + Parser.SPACE + 
						SQLAS + Parser.SPACE + getNewTable());
				
			}
		}
		else if (operator == EventOperator.CROSS)  {
			//A cross (cartesian product) does not require common keys, so no need to check
			sb.append(SQLSELECT + Parser.SPACE);
			for (Column p: this.getColumns()) {
				sb.append(p.getFullName());	
				sb.append(Parser.COMMA);
			}
			sb.append(this.getTimeColumn().getFullName());
			sb.append(Parser.SPACE);
			sb.append(SQLFROM + Parser.SPACE + Parser.LPAREN + leftExpr.toSQL() + Parser.RPAREN + Parser.SPACE + 
					SQLCROSSJOIN + Parser.SPACE + 
					Parser.LPAREN + rightExpr.toSQL() + Parser.RPAREN + Parser.SPACE + 
					SQLAS + Parser.SPACE + getNewTable());
			
		}
		else if (operator == EventOperator.UNION)  
			sb.append(Parser.LPAREN + leftExpr.toSQL() + Parser.RPAREN + Parser.SPACE + 
					SQLUNION + Parser.SPACE + 
					Parser.LPAREN + rightExpr.toSQL() + Parser.RPAREN);
		
		else if (operator == EventOperator.DIFF) {
			//Unfortunately, SQL implementations do not support a difference operator, so we must construct it using "NOT IN"
			//A diff B = (Select list of A's columns from A) where (list of A's columns) NOT IN (Select list of A's columns from B)
			//We always select A's columns because diff only works with sets that have the same columns
			//Prepare the left of the difference
			sb.append(SQLSELECT + Parser.SPACE);
			for (Column p: this.getColumns()) {
				sb.append(p.getFullName());	
				sb.append(Parser.COMMA);
			}
			sb.append(this.getTimeColumn().getFullName());
			sb.append(Parser.SPACE);
			sb.append(SQLFROM + Parser.SPACE + 
					Parser.LPAREN + leftExpr.toSQL() + Parser.RPAREN + Parser.SPACE + 
					SQLAS + Parser.SPACE + getNewTable());

			//Prepare the "middle"

			sb.append(Parser.SPACE);
			sb.append(SQLWHERE);
			sb.append(Parser.SPACE + Parser.LPAREN);
			for (Column p: this.getColumns()) {
				sb.append(p.getFullName());	
				sb.append(Parser.COMMA);
			}
			sb.append(this.getTimeColumn().getFullName());
			sb.append(Parser.RPAREN + Parser.SPACE);
			sb.append(SQLNOTIN);
			sb.append(Parser.SPACE);

			//Prepare the right of the difference
			sb.append(Parser.LPAREN);
			sb.append(SQLSELECT + Parser.SPACE);
			for (Column p: this.getColumns()) {
				sb.append(p.getFullName());	
				sb.append(Parser.COMMA);
			}
			sb.append(this.getTimeColumn().getFullName());
			sb.append(Parser.SPACE);

			sb.append(Parser.SPACE);
			sb.append(SQLFROM + Parser.SPACE + 
					Parser.LPAREN + rightExpr.toSQL() + Parser.RPAREN + Parser.SPACE + 
					SQLAS + Parser.SPACE + getNewTable());
			sb.append(Parser.RPAREN);

		}
		
		else if (operator == EventOperator.TIMESINGLETON) 
			sb.append(SQLSELECT + Parser.SPACE + subscript +
					Parser.SPACE + SQLAS + Parser.SPACE + getNewTable());
		else if (event != null) { // no operator, just a solitary event
			//Never do Select * in an SQL query as column ordering returned is not reliable 
			//Instead, always do Select followed by an explicit list of columns 
			sb.append(SQLSELECT + Parser.SPACE);
			for (Column p: this.getColumns()) {
				sb.append(p.getFullName());	
				sb.append(Parser.COMMA);
			}
			sb.append(this.getTimeColumn().getFullName());
			sb.append(Parser.SPACE);
			sb.append(SQLFROM + Parser.SPACE + event.getName());
			sb.append(Parser.SPACE + 
					SQLAS + Parser.SPACE + getNewTable());
		}
		else {
			System.out.println("Not handled " + this.getOperator().toString() + " in conversion from relational expression to SQL");
			return null;
		}
		return sb.toString();
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

	public static Set<Column> getCommonKeys(RelationalExpr left, RelationalExpr right){
		Set<Column> common = new LinkedHashSet<Column>();
		//If left key appears in right, add it
		for(Column lKey: left.getKeyColumns())
			for(Column rCol: right.getColumns())
				if(lKey.getFullName().equalsIgnoreCase(rCol.getFullName()))
					common.add(lKey);
		//If right key appears in left, add it
		for(Column rKey: right.getKeyColumns())
			for(Column lCol: left.getColumns())
				if(rKey.getFullName().equalsIgnoreCase(lCol.getFullName()))
					common.add(rKey);
		return common;
	}

}
