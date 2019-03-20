package org.xtext.example.generator.query;

public class CurrentTimeQuery extends Query {

	public CurrentTimeQuery(Query q) {
		this.setName(getNewQueryName());
		
		this.initializeColumns();
		this.insertColumns(q.getAllColumns());
		
		this.initializeKeyColumns();
		this.insertKeyColumns(q.getKeyColumns());
		
		this.setTimeColumn(q.getTimeColumn());
		
		this.setLeft(q);
		
	}

	@Override
	public String toSQL() {
		StringBuffer sql = new StringBuffer();
		sql.append(SQLSELECT + SQLSPACE);
		sql.append(this.getColumnsAsString());
		sql.append(SQLCOMMA + SQLSPACE);
		sql.append(this.getTimeColumn().getFullName());
		sql.append(SQLSPACE + SQLFROM + SQLSPACE + SQLLPAREN + this.getLeft().toSQL() + SQLRPAREN + SQLSPACE +
				SQLAS + SQLSPACE + this.getLeft().getName());
		sql.append(SQLSPACE + SQLWHERE + SQLSPACE + this.getTimeColumn().getFullName() + SQLLT + SQLNOW);
		return sql.toString();
	}

}
