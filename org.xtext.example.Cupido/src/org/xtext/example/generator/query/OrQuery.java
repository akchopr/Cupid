package org.xtext.example.generator.query;

public class OrQuery extends Query {

	public OrQuery(Query leftQ, Query rightQ){
		
		this.setName(getNewQueryName());
		
		this.setLeft(leftQ);
		this.setRight(rightQ);
		
		
		this.initializeColumns();
		this.insertColumns(leftQ.getAllColumns());
		this.insertColumns(rightQ.getAllColumns());
		
		//Our assumption for OR is that left and right will have an identical key
		this.initializeKeyColumns();
		this.insertKeyColumns(leftQ.getCommonKeysWith(rightQ));
		
		//Should not matter whether left or right? By convention always take left. Always rename only right if needed
		this.setTimeColumn(leftQ.getTimeColumn());
	}
	
	@Override
	public String toSQL() {
		//First rename right, then get left NLOJ renamed and left NROJ renamed. Finally take their union
		Query renamedRight = new RenameTimeStampQuery(this.getRight());
		Query loj = new LeftOuterJoinQuery(this.getLeft(),renamedRight);
		Query roj = new RightOuterJoinQuery(this.getLeft(),renamedRight);
		Query union = new UnionQuery(loj,roj);
		
		return union.toSQL();
	}

}
