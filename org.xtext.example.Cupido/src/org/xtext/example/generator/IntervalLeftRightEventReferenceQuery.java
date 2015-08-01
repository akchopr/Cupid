package org.xtext.example.generator;

import org.xtext.example.cupido.TimeStamp;

public class IntervalLeftRightEventReferenceQuery extends IntervalQuery {
	
	private Query lEvRef, rEvRef;

	
	public Query getlEvRef() {
		return lEvRef;
	}

	public void setlEvRef(Query lEvRef) {
		this.lEvRef = lEvRef;
	}

	public Query getrEvRef() {
		return rEvRef;
	}

	public void setrEvRef(Query rEvRef) {
		this.rEvRef = rEvRef;
	}

	public IntervalLeftRightEventReferenceQuery(Query ev, Query lEvRef, Query rEvRef, TimeStamp l, TimeStamp r) {
		super(ev, l, r);
		this.setlEvRef(lEvRef);
		this.setrEvRef(rEvRef);
	}

	@Override
	public String toSQL() {
		//Construct SQL here
		StringBuffer sql = new StringBuffer();
	
		//TODO
		return sql.toString();
	}
}
