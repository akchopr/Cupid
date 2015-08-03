package org.xtext.example.generator.query;

import java.util.Set;

import org.xtext.example.generator.Column;

public class AntijoinQuery extends Query {
	
	public AntijoinQuery(Query leftQ, Query rightQ){
		this.setName(getNewQueryName());

		this.initializeColumns();
		this.setAllColumns(leftQ.getAllColumns());
		
		this.initializeKeyColumns();
		this.setKeyColumns(leftQ.getKeyColumns());
		
		this.setTimeColumn(leftQ.getTimeColumn());
		
		this.setLeft(leftQ);
		this.setRight(rightQ);
		
	}

	@Override
	public String toSQL() {
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
