package org.xtext.example.generator.query;


public class JoinWithSingletonTimeQuery extends Query {
	
	private String value;
	
	private String getCastString(){
		return SQLCAST + SQLLPAREN + IntervalQuery.toDateTime(value) + SQLSPACE + SQLAS + SQLSPACE + SQLDATETIME + SQLRPAREN;
	}
	
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public JoinWithSingletonTimeQuery(Query left, String value) {
		this.setName(getNewQueryName());
		
		this.initializeColumns();
		this.insertColumns(left.getAllColumns());
		
		this.initializeKeyColumns();
		this.insertKeyColumns(left.getKeyColumns());
		
		this.setTimeColumn(left.getTimeColumn());
		
		this.setLeft(left);
		
		this.setValue(value);
		
	}

	@Override
	public String toSQL() {
		StringBuffer sql = new StringBuffer();
		sql.append(SQLSELECT + SQLSPACE);
		sql.append(this.getColumnsAsString());
		sql.append(SQLCOMMA + SQLSPACE);
		
		sql.append(SQLGREATEST + SQLLPAREN + this.getTimeColumn().getFullName() + SQLCOMMA + 
				this.getCastString() + SQLRPAREN + 
				SQLSPACE + SQLAS + SQLSPACE + this.getTimeColumn().getFullName());
	
		sql.append(SQLSPACE + SQLFROM + SQLSPACE + SQLLPAREN + this.getLeft().toSQL() + SQLRPAREN + SQLSPACE + SQLAS + SQLSPACE + this.getLeft().getName());
		// TODO Auto-generated method stub
		return sql.toString();
	}

}

