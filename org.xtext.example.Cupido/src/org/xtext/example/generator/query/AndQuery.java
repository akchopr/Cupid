package org.xtext.example.generator.query;

public class AndQuery extends Query {

	public AndQuery(Query leftQ, Query rightQ){
		
		this.initializeColumns();
		//And means you take union of the columns
		this.insertColumns(leftQ.getAllColumns());
		this.insertColumns(rightQ.getAllColumns());
		
		//And means you take union of the keys
		this.initializeKeyColumns();
		this.insertKeyColumns(leftQ.getKeyColumns());
		this.insertKeyColumns(rightQ.getKeyColumns());
		
		//By convention, take left's time column
		this.setTimeColumn(leftQ.getTimeColumn());
		
		this.setLeft(leftQ);
		this.setRight(rightQ);
		
		this.setName(getNewQueryName());
		
	}
	@Override
	public String toSQL() {
		//Before doing join, rename the right timestamp
		Query renamed = new RenameTimeStampQuery(this.getRight());
		Query joinQ =  new JoinQuery(this.getLeft(),renamed);
		return joinQ.toSQL();
	}

}
