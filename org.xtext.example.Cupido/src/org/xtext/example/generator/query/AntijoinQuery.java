package org.xtext.example.generator.query;

import java.util.Set;

import org.xtext.example.generator.Column;

public class AntijoinQuery extends Query {
	
	/*
	 * Left antijoin right
	 */
	public AntijoinQuery(Query leftQ, Query rightQ){
		this.setName(getNewQueryName());

		//Antijoin's columns are left's
		this.initializeColumns();
		this.insertColumns(leftQ.getAllColumns());
		
		//Keys are left's
		this.initializeKeyColumns();
		this.insertKeyColumns(leftQ.getKeyColumns());
		
		//Timestamp is left's
		this.setTimeColumn(leftQ.getTimeColumn());
		
		this.setLeft(leftQ);
		this.setRight(rightQ);
		
	}

	@Override
	public String toSQL() {
		/*
		 * Algorithm: Construct a query of the form
		 * Select left's columns from left 
		 * where (columns common to left and right) 
		 * 		not in (select (common columns) from right)   
		 */
		Set<Column> common = this.getCommonColumnsWith(this.getRight());
		StringBuffer sql = new StringBuffer();
		
		sql.append(SQLSELECT + SQLSPACE);
		//Out the desired columns
		String colStr = this.getColumnsAsString();
		sql.append(colStr);
		//Append timestamp
		sql.append(SQLCOMMA + SQLSPACE);
		sql.append(this.getTimeColumn().getFullName());
		//Construct FROM
		sql.append(SQLSPACE + SQLFROM + SQLSPACE + SQLLPAREN + this.getLeft().toSQL() + SQLRPAREN + SQLSPACE + SQLAS + SQLSPACE + this.getName());
		//Add WHERE
		sql.append(SQLSPACE + SQLWHERE + SQLSPACE);
		//now add all common columns
		sql.append(SQLLPAREN + getColumnsAsString(common) + SQLRPAREN);
		sql.append(SQLSPACE + SQLNOTIN + SQLSPACE);
		//Now add the second argument
		sql.append(SQLLPAREN + SQLSELECT + SQLSPACE + getColumnsAsString(common) + SQLSPACE + 
				SQLFROM + SQLSPACE + SQLLPAREN + this.getRight().toSQL() + SQLRPAREN + SQLSPACE + SQLAS + SQLSPACE + this.getRight().getName() + SQLRPAREN);
		
		
		// TODO Auto-generated method stub
		return sql.toString();
	}
	
	
}
