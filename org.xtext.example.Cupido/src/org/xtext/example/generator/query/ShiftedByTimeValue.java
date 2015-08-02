package org.xtext.example.generator.query;

public class ShiftedByTimeValue extends Query {
	
	private String shiftBy;
	
	public String getShiftBy() {
		return shiftBy;
	}

	public void setShiftBy(String shiftBy) {
		this.shiftBy = shiftBy;
	}

	public ShiftedByTimeValue(Query toShift, String shiftBy){
		this.setName(getNewQueryName());
		
		this.initializeColumns();
		this.setAllColumns(toShift.getAllColumns());
		
		this.initializeKeyColumns();
		this.setKeyColumns(toShift.getKeyColumns());
		
		this.setTimeColumn(toShift.getTimeColumn());
		
		this.setLeft(toShift);
		
		this.setShiftBy(shiftBy);
		
	}

	@Override
	public String toSQL() {
		StringBuffer sql = new StringBuffer();
		sql.append(SQLSELECT + SQLSPACE);
		sql.append(this.getColumnsAsString());
		sql.append(SQLCOMMA + SQLSPACE);
		sql.append(SQLLPAREN + this.getLeft().getFullTimeStampName() + SQLPLUS + this.getShiftBy() + SQLRPAREN +
				SQLSPACE + SQLAS + SQLSPACE + this.getTimeColumn().getFullName());
		sql.append(SQLSPACE + SQLFROM + SQLLPAREN + this.getLeft().toSQL() + SQLRPAREN +
				SQLSPACE + SQLAS + SQLSPACE + this.getLeft().getFullTimeStampName());
		// TODO Auto-generated method stub
		
		return sql.toString();
	}

}
