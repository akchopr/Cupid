package org.xtext.example.generator.query;

import org.xtext.example.cupido.TimeStamp;

public class IntervalRightEventReferenceQuery extends IntervalQuery {
	
	private Query evRef;

	public Query getEvRef() {
		return evRef;
	}

	public void setEvRef(Query evRef) {
		this.evRef = evRef;
	}

	public IntervalRightEventReferenceQuery(Query ev, Query evRef, TimeStamp l, TimeStamp r) {
		super(ev, l, r);
		this.setEvRef(evRef); 
	}

	@Override
	public String toSQL() {
		
		Query renamed = new RenameTimeStampQuery(this.getEvRef());
		Query joinQ = new JoinQuery(this.getLeft(),renamed);
		
		StringBuffer sql = new StringBuffer();
		sql.append(joinQ.toSQL());
		
		sql.append(SQLSPACE + SQLWHERE + SQLSPACE);
		String lCond = toDateTime(this.getlT().getVal()) + SQLLEQ + this.getLeft().getFullTimeStampName();
		String rCond = this.getLeft().getFullTimeStampName() + SQLLT + renamed.getFullTimeStampName() +
				SQLPLUS + toDateTime(this.getrT().getShift());
		String cond = lCond + SQLSPACE + SQLAND + SQLSPACE + rCond;
		sql.append(cond);

		return sql.toString();
	}

}
