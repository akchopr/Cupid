package org.xtext.example.generator.query;

import org.xtext.example.cupido.TimeStamp;
import org.xtext.example.generator.CustomTimeStamp;

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
		
		IntervalLeftEventReferenceQuery lQuery = 
				new IntervalLeftEventReferenceQuery(this.getLeft(),this.getlEvRef(),
						this.getlT(),CustomTimeStamp.getMaxTimeStamp());
		IntervalRightEventReferenceQuery rQuery = 
				new IntervalRightEventReferenceQuery(this.getLeft(),this.getrEvRef(),
						CustomTimeStamp.getMinTimeStamp(),this.getrT());
		
		Query renamed = new RenameTimeStampQuery(rQuery);
		Query q = new JoinQuery(lQuery,renamed);
		return q.toSQL();
	}
}
