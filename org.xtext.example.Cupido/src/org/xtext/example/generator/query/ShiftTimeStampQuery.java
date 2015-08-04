package org.xtext.example.generator.query;


public class ShiftTimeStampQuery extends Query {
	
	private int shift;
	
	
	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public ShiftTimeStampQuery(Query left, int shift) {
		this.setName(getNewQueryName());
		
		this.initializeColumns();
		this.insertColumns(left.getAllColumns());
		
		this.initializeKeyColumns();
		this.insertKeyColumns(left.getKeyColumns());
		
		this.setTimeColumn(left.getTimeColumn());
		
		this.setLeft(left);
		
		this.setShift(shift);
		
	}

	@Override
	public String toSQL() {
		StringBuffer sql = new StringBuffer();
		sql.append(SQLSELECT + SQLSPACE);
		sql.append(this.getColumnsAsString());
		sql.append(SQLSPACE + SQLCOMMA);
		
		sql.append(this.getTimeColumn().getFullName() + SQLPLUS + IntervalQuery.toDateTime(this.getShift()) + SQLSPACE + SQLAS + this.getTimeColumn().getFullName());
	
		sql.append(SQLSPACE + SQLFROM + SQLSPACE + SQLLPAREN + this.getLeft().toSQL() + SQLRPAREN + SQLSPACE + SQLAS + this.getLeft().getName());
		// TODO Auto-generated method stub
		return sql.toString();
	}

}

