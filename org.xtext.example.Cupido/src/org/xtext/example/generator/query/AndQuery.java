package org.xtext.example.generator.query;

public class AndQuery extends Query {

	public AndQuery(Query leftQ, Query rightQ){
		
		this.initializeColumns();
		this.insertColumns(leftQ.getAllColumns());
		this.insertColumns(rightQ.getAllColumns());
		
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
		
		Query renamed = new RenameTimeStampQuery(this.getRight());
		Query joinQ =  new JoinQuery(this.getLeft(),renamed);
		StringBuffer sql = new StringBuffer();
		sql.append(joinQ.toSQL());
		/*//Construct select cols part: Select leftcol1, leftcol2,..., leftcoln,  rightcol1, rightcol2,..., rightcolm,
		sql.append(SQLSELECT + SQLSPACE);
		String colStr = this.getColumnsAsString();
		sql.append(colStr);
		//Timestamp still needs to be appended
		sql.append(SQLCOMMA + SQLSPACE);
		//Construct timestamp part of the select clause: "GREATEST(left.timestamp, right.timestamp) as timestamp"
		sql.append(SQLGREATEST + SQLLPAREN + this.getLeft().getFullTimeStampName() + SQLCOMMA + 
				renamed.getFullTimeStampName() + SQLRPAREN + 
				SQLSPACE + SQLAS + SQLSPACE + this.getTimeColumn().getFullName());
		//Now create the from part
		sql.append(SQLSPACE);
		
		sql.append(SQLFROM + SQLSPACE + 
				SQLLPAREN + this.getLeft().toSQL() + SQLRPAREN + SQLSPACE + SQLAS + SQLSPACE + this.getLeft().getName() +  
				SQLSPACE + SQLJOIN + SQLSPACE +
				SQLLPAREN + renamed.toSQL() + SQLRPAREN + SQLSPACE + SQLAS + SQLSPACE + renamed.getName());
		*/
		/*Set<Column> common = this.getLeft().getCommonColumns(this.getRight().getAllColumns());
		String usingCols = getColumnsAsString(common);
		sql.append(SQLSPACE + SQLUSING + SQLSPACE + SQLLPAREN + usingCols + SQLRPAREN);*/
		
		return sql.toString();
	}

}
