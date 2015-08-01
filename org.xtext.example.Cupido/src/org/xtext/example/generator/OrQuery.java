package org.xtext.example.generator;

public class OrQuery extends Query {

	public OrQuery(Query leftQ, Query rightQ){
		
		this.setName(getNewQueryName());
		
		this.setLeft(leftQ);
		this.setRight(rightQ);
		
		
		this.initializeColumns();
		this.insertColumns(leftQ.getAllColumns());
		this.addNewColumns(rightQ.getAllColumns());
		
		this.initializeKeyColumns();
		//Should not matter whether left or right because keys must be identical for an OR to work correctly
		this.insertKeyColumns(leftQ.getKeyColumns());
		
		//Should not matter whether left or right
		this.setTimeColumn(leftQ.getTimeColumn());
	}
	
	@Override
	public String toSQL() {
		StringBuffer sql = new StringBuffer();
		//Construct select cols part: Select leftcol1, leftcol2,..., leftcoln,  rightcol1, rightcol2,..., rightcolm,
		sql.append(SQLSELECT + SQLSPACE);
		sql.append(this.getColumnsAsString());
		//Timestamp still needs to be appended
		sql.append(SQLCOMMA + SQLSPACE);
		//Construct timestamp part of the select clause: "LEAST(left.timestamp, right.timestamp) as timestamp"
		sql.append(SQLLEAST + SQLLPAREN + 
				SQLCOALESCE + SQLLPAREN + this.getLeft().getFullTimeStampName() + SQLCOMMA + this.getRight().getFullTimeStampName() + SQLRPAREN + SQLCOMMA +
				SQLCOALESCE + SQLLPAREN + this.getRight().getFullTimeStampName() + SQLCOMMA + this.getLeft().getFullTimeStampName() + SQLRPAREN + SQLRPAREN +
				SQLSPACE + SQLAS + SQLSPACE + this.getTimeColumn().getFullName());
		//Now create the from part
		//Now create the from part
				sql.append(SQLSPACE);
				sql.append(SQLFROM + SQLSPACE + 
						SQLLPAREN + this.getLeft().toSQL() + SQLRPAREN + SQLSPACE + SQLAS + SQLSPACE + this.getLeft().getName() +  
						SQLSPACE + SQLLEFTOUTERJOIN + SQLSPACE +
						SQLLPAREN + this.getRight().toSQL() + SQLRPAREN + SQLSPACE + SQLAS + SQLSPACE + this.getRight().getName());
		
		return sql.toString();
	}

}