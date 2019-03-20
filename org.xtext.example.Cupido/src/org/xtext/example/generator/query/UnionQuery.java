package org.xtext.example.generator.query;

public class UnionQuery extends Query {

	public UnionQuery(Query left, Query right) {
		
		this.setName(getNewQueryName());
		this.setLeft(left);
		this.setRight(right);
		this.initializeColumns();
		this.insertColumns(left.getAllColumns());
		this.initializeKeyColumns();
		this.insertKeyColumns(left.getKeyColumns());
		this.setTimeColumn(left.getTimeColumn());
	}

	@Override
	public String toSQL() {
		StringBuffer sql = new StringBuffer();
		sql.append(this.getLeft().toSQL());
		sql.append(SQLSPACE + SQLUNION +SQLSPACE);
		sql.append(this.getRight().toSQL());
		return sql.toString();
	}

}
