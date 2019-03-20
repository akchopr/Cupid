package org.xtext.example.generator.query;

import org.xtext.example.cupido.TimeStamp;

public class IntervalLeftEventReferenceQuery extends IntervalQuery {

	private Query evRef;

	public Query getEvRef() {
		return evRef;
	}

	public void setEvRef(Query evRef) {
		this.evRef = evRef;
	}

	public IntervalLeftEventReferenceQuery(Query ev, Query evRef, TimeStamp l, TimeStamp r) {
		super(ev, l, r);
		this.setEvRef(evRef); 
	}

	@Override
	public String toSQL() {
		//Construct SQL here
		Query renamed = new RenameTimeStampQuery(this.getEvRef());
		Query joinQ = new JoinQuery(this.getLeft(),renamed);
		
		StringBuffer sql = new StringBuffer();
		sql.append(joinQ.toSQL());
		//Finally the where part
		sql.append(SQLSPACE + SQLWHERE + SQLSPACE);
		String lCond = renamed.getFullTimeStampName() + SQLPLUS + toDateTime(this.getlT().getShift())
		+ SQLLEQ + this.getLeft().getFullTimeStampName();
		String rCond = this.getLeft().getFullTimeStampName() + SQLLT + toDateTime(this.getrT().getVal());
		String cond = lCond + SQLSPACE + SQLAND + SQLSPACE + rCond;
		sql.append(cond);

		return sql.toString();
	}

}