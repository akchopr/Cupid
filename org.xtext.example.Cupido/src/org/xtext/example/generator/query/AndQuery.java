package org.xtext.example.generator.query;

public class AndQuery extends Query {

	public AndQuery(Query leftQ, Query rightQ){
		
		this.initializeColumns();
		this.insertColumns(leftQ.getAllColumns());
		this.addNewColumns(rightQ.getAllColumns());
		
		this.initializeKeyColumns();
		this.insertKeyColumns(leftQ.getKeyColumns());
		this.insertKeyColumns(rightQ.getKeyColumns());
		
		//Should not matter whether left or right
		this.setTimeColumn(leftQ.getTimeColumn());
		
		this.setLeft(leftQ);
		this.setRight(rightQ);
		
		this.setName(getNewQueryName());
		
	}
	@Override
	public String toSQL() {
		StringBuffer sql = new StringBuffer();
		//Construct select cols part: Select leftcol1, leftcol2,..., leftcoln,  rightcol1, rightcol2,..., rightcolm,
		sql.append(SQLSELECT + SQLSPACE);
		String colStr = this.getColumnsAsString();
		sql.append(colStr);
		//Timestamp still needs to be appended
		sql.append(SQLCOMMA + SQLSPACE);
		//Construct timestamp part of the select clause: "LEAST(left.timestamp, right.timestamp) as timestamp"
		sql.append(SQLGREATEST + SQLLPAREN + this.getLeft().getFullTimeStampName() + SQLCOMMA + this.getRight().getFullTimeStampName() + SQLRPAREN + 
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
