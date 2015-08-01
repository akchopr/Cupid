package org.xtext.example.generator;

import org.xtext.example.cupido.TimeStamp;

public class IntervalLeftRightEventReferenceQuery extends IntervalQuery {

	public IntervalLeftRightEventReferenceQuery(Query ev, TimeStamp l, TimeStamp r) {
		super(ev, l, r);
	}

	@Override
	public String toSQL() {
		return null;
	}

}
