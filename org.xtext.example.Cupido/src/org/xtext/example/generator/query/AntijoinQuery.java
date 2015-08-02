package org.xtext.example.generator.query;

import java.util.LinkedHashSet;
import java.util.Set;

import org.xtext.example.generator.Column;
import org.xtext.example.generator.RelationalExpr;

public class AntijoinQuery extends Query {
	
	public AntijoinQuery(Query leftQ, Query rightQ){
		this.setName(getNewQueryName());

		this.initializeColumns();
		this.setAllColumns(leftQ.getAllColumns());
		
		this.initializeKeyColumns();
		this.setKeyColumns(leftQ.getKeyColumns());
		
		this.setTimeColumn(leftQ.getTimeColumn());
		
		this.setLeft(leftQ);
		this.setRight(rightQ);
		
	}

	@Override
	public String toSQL() {
		Set<Column> cKeys = Query.getCommonKeys(this.getLeft(), this.getRight());
		
		StringBuffer sql = new StringBuffer();
		
		
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
