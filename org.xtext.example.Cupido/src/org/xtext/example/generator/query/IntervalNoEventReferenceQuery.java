package org.xtext.example.generator.query;

import org.xtext.example.cupido.TimeStamp;

public class IntervalNoEventReferenceQuery extends IntervalQuery {

	public IntervalNoEventReferenceQuery(Query ev, TimeStamp l, TimeStamp r) {
		super(ev, l, r);
	}

	@Override
	public String toSQL() {
		StringBuffer sql = new StringBuffer();
		sql.append(this.getLeft().toSQL() + SQLSPACE + SQLWHERE + SQLSPACE);
		
		String lCond = IntervalQuery.toDateTime(this.getlT().getVal()) + SQLLEQ + this.getLeft().getTimeColumn().getFullName();
		String rCond = this.getLeft().getTimeColumn().getFullName() + SQLLT + IntervalQuery.toDateTime(this.getrT().getVal());
		String cond = lCond + SQLSPACE + SQLAND + SQLSPACE + rCond;
		sql.append(cond);
		return sql.toString();
	}

}
