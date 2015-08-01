package org.xtext.example.generator.query;

import org.xtext.example.cupido.TimeStamp;

public abstract class IntervalQuery extends Query  {
	
	TimeStamp lT, rT;

	public TimeStamp getlT() {
		return lT;
	}

	public void setlT(TimeStamp lT) {
		this.lT = lT;
	}

	public TimeStamp getrT() {
		return rT;
	}

	public void setrT(TimeStamp rT) {
		this.rT = rT;
	}

	public IntervalQuery(Query ev, TimeStamp l, TimeStamp r){
		
		this.setName(getNewQueryName());
		
		this.initializeColumns();
		this.insertColumns(ev.getAllColumns());
		
		this.initializeKeyColumns();
		this.insertKeyColumns(ev.getKeyColumns());
	
		this.setTimeColumn(ev.getTimeColumn());
		
		this.setLeft(ev);
		
		this.setlT(l);
		this.setrT(r);		
	}	

}
