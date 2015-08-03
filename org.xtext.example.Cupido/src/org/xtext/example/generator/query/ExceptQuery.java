package org.xtext.example.generator.query;

import org.xtext.example.cupido.EventRelation;
import org.xtext.example.cupido.TimeStamp;
import org.xtext.example.generator.CustomTimeStamp;

public class ExceptQuery extends Query {
	
	private EventRelation ev, leftEvRef, rightEvRef;
	private TimeStamp leftT, rightT;

	public ExceptQuery(Query leftQ, EventRelation ev, EventRelation leftEvRef, TimeStamp leftT,  
			EventRelation rightEvRef, TimeStamp rightT) {
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
		Query evQ = new BaseEventQuery(ev); 
		if(null == this.rightEvRef){
			
			//meaning Singleton type query
			if(null == this.leftEvRef) {
				//Compute R
				Query uptoLeftQuery = new IntervalNoEventReferenceQuery(evQ, CustomTimeStamp.getMinTimeStamp(),leftT);
				Query andQ = new AndQuery(this.getLeft(),uptoLeftQuery);
				Query projQ = new ProjectToLeftQuery(andQ);
				//Compute S
				Query uptoRightQuery = new IntervalNoEventReferenceQuery(evQ, CustomTimeStamp.getMinTimeStamp(),rightT);
				Query renamed = new RenameTimeStampQuery(uptoRightQuery);
				Query antiJoin = new AntijoinQuery(this.getLeft(),renamed);
				Query joinSingleton = new JoinWithSingletonTimeQuery(antiJoin,rightT.getVal());
				
				StringBuffer sql = new StringBuffer();
				sql.append(projQ.toSQL());
				sql.append(SQLSPACE + SQLUNION +SQLSPACE);
				sql.append(joinSingleton.toSQL());
				
				return sql.toString();
			}
			System.out.println("Should not be here!!!!!!");
			return null;
		}
		System.out.println("Should not be here!!!!!!!!!!!!!!!!!!!!");
		return null;
	}
}
