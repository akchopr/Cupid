package org.xtext.example.generator.query;

public class JoinQuery extends Query {
	
	public JoinQuery(Query leftQ, Query rightQ) {
		this.setName(getNewQueryName());
		
		this.setLeft(leftQ);
		this.setRight(rightQ);
		
		this.initializeColumns();
		this.insertColumns(leftQ.getAllColumns());
		this.insertColumns(rightQ.getAllColumns());
		//Right will have been renamed. Must be left
		this.setTimeColumn(leftQ.getTimeColumn());
		//No need to worry about keys because this is internal processing
		this.initializeKeyColumns();
		this.insertKeyColumns(leftQ.getKeyColumns());
		this.insertKeyColumns(rightQ.getKeyColumns());
	}
	
	
	@Override
	public String toSQL() {
		
		StringBuffer sql = new StringBuffer();
		sql.append(SQLSELECT + SQLSPACE);
		String colStr = this.getColumnsAsString();
		sql.append(colStr);
		//Timestamp still needs to be appended
		sql.append(SQLCOMMA + SQLSPACE);
		
		//Construct timestamp part of the select clause: "GREATEST(left.timestamp, right.timestamp) as timestamp"
		sql.append(SQLGREATEST + SQLLPAREN + this.getLeft().getFullTimeStampName() + SQLCOMMA + 
					this.getRight().getFullTimeStampName() + SQLRPAREN + 
					SQLSPACE + SQLAS + SQLSPACE + this.getTimeColumn().getFullName());
		
		//Now create the from part
		sql.append(SQLSPACE);
		
		sql.append(SQLFROM + SQLSPACE + 
				SQLLPAREN + this.getLeft().toSQL() + SQLRPAREN + SQLSPACE + SQLAS + SQLSPACE + this.getLeft().getName() +  
				SQLSPACE + SQLJOIN + SQLSPACE +
				SQLLPAREN + this.getRight().toSQL() + SQLRPAREN + SQLSPACE + SQLAS + SQLSPACE + this.getRight().getName());
		
		
		return sql.toString();
	}


}
