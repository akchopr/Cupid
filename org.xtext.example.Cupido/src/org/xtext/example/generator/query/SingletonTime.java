package org.xtext.example.generator.query;

import org.xtext.example.generator.Column;

public class SingletonTime extends Query {
	
	private String value;
	
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public SingletonTime(Column ts, String value) {
		this.setTimeColumn(ts);
		this.setValue(value);
		this.setName(getNewQueryName());
	}

	@Override
	public String toSQL() {
		StringBuffer sql = new StringBuffer();
		sql.append(SQLSELECT + SQLSPACE);
		sql.append(value + SQLSPACE + this.getTimeColumn().getFullName());
		// TODO Auto-generated method stub
		return sql.toString();
	}

}
