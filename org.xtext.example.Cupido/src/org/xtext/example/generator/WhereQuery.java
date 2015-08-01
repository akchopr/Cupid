package org.xtext.example.generator;

public class WhereQuery extends Query {
	
	String cond;

	public WhereQuery(Query operand, String cond){
		
		this.initializeColumns();
		this.insertColumns(operand.getAllColumns());
		
		this.initializeKeyColumns();
		this.insertKeyColumns(operand.getKeyColumns());
		
		//Should not matter whether left or right
		this.setTimeColumn(operand.getTimeColumn());
		
		this.setLeft(operand);
		
		this.setName(getNewQueryName());
		
		this.cond = cond;
		
	}
	@Override
	public String toSQL() {
		StringBuffer sql = new StringBuffer();
		sql.append(SQLSELECT + SQLSPACE);
		String colStr = this.getColumnsAsString();
		sql.append(colStr);
		sql.append(SQLCOMMA + SQLSPACE);
		sql.append(this.getTimeColumn().getFullName());
		sql.append(SQLSPACE);
		sql.append(SQLFROM + SQLSPACE + SQLLPAREN + this.getLeft().toSQL() + SQLRPAREN +
				SQLSPACE + SQLAS + SQLSPACE + this.getName());
		
		sql.append(SQLSPACE + SQLWHERE + SQLSPACE + cond);
		
		return sql.toString();
	}

}
