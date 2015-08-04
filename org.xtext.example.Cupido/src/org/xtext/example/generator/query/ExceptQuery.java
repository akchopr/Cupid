package org.xtext.example.generator.query;

import org.xtext.example.cupido.EventRelation;
import org.xtext.example.cupido.TimeStamp;
import org.xtext.example.generator.CustomTimeStamp;

public class ExceptQuery extends Query {
	
	private Query ev, leftEvRef, rightEvRef;
	private TimeStamp leftT, rightT;

	public ExceptQuery(Query leftQ, Query ev, Query leftEvRef, TimeStamp leftT,  
			Query rightEvRef, TimeStamp rightT) {
		this.setName(getNewQueryName());
		
		this.initializeColumns();
		this.insertColumns(leftQ.getAllColumns());
		
		this.initializeKeyColumns();
		this.insertKeyColumns(leftQ.getKeyColumns());
		
		this.setLeft(leftQ);
		
		this.setTimeColumn(leftQ.getTimeColumn());
		
		this.ev = ev;
		this.leftEvRef = leftEvRef;
		this.rightEvRef = rightEvRef;
		this.leftT = leftT;
		this.rightT = rightT;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toSQL() {
		//Query evQ = new BaseEventQuery(ev); 
		Query uptoLeftQuery;
		//meaning Singleton type query
		if(null == this.leftEvRef) {
			//Compute R
			uptoLeftQuery = new IntervalNoEventReferenceQuery(ev, CustomTimeStamp.getMinTimeStamp(),leftT);
		}
		else {
			uptoLeftQuery = new IntervalLeftEventReferenceQuery(ev, leftEvRef,CustomTimeStamp.getMinTimeStamp(),leftT);
		}
		Query andQ = new AndQuery(this.getLeft(),uptoLeftQuery);
		//projQ is R
		Query projQ = new ProjectToLeftQuery(andQ);
		
		Query theJoin; 
		if(null == this.rightEvRef){
			Query uptoRightQuery = new IntervalNoEventReferenceQuery(ev, CustomTimeStamp.getMinTimeStamp(),rightT);
			//Query renamed = new RenameTimeStampQuery(uptoRightQuery);
			//The S in the paper is this antijoin
			Query antiJoin = new AntijoinQuery(this.getLeft(),uptoRightQuery);
			theJoin = new JoinWithSingletonTimeQuery(antiJoin,rightT.getVal());
		}
		else {
			Query uptoRightQuery = new IntervalRightEventReferenceQuery(ev, rightEvRef, CustomTimeStamp.getMinTimeStamp(),rightT);
			//Query renamed = new RenameTimeStampQuery(uptoRightQuery);
			// S is the antijoin (no need to rename before antijoin because timestamp will never be among the common columns computed)
			Query antiJoin = new AntijoinQuery(this.getLeft(),uptoRightQuery);
			Query copyShifted = new ShiftTimeStampQuery(rightEvRef, rightT.getShift());
			//Join copyshifted with S
			Query renamedCopy = new RenameTimeStampQuery(copyShifted);
			theJoin = new JoinQuery(antiJoin,renamedCopy);
		}
		Query union = new UnionQuery(projQ,theJoin);
		return union.toSQL();
	}

}
