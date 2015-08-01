package org.xtext.example.generator;

import org.xtext.example.cupido.TimeStamp;

public class IntervalRightEventReferenceQuery extends IntervalQuery {

	public IntervalRightEventReferenceQuery(Query ev, TimeStamp l, TimeStamp r) {
		super(ev, l, r);
	}

	@Override
	public String toSQL() {
		return null;
	}

}
