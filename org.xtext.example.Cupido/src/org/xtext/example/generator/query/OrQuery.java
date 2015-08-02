package org.xtext.example.generator.query;

public class OrQuery extends Query {

	public OrQuery(Query leftQ, Query rightQ){
		
		this.setName(getNewQueryName());
		
		this.setLeft(leftQ);
		this.setRight(rightQ);
		
		
		this.initializeColumns();
		this.insertColumns(leftQ.getAllColumns());
		this.insertColumns(rightQ.getAllColumns());
		
		this.initializeKeyColumns();
		this.insertKeyColumns(leftQ.getCommonKeysWith(rightQ));
		
		//Should not matter whether left or right
		this.setTimeColumn(leftQ.getTimeColumn());
	}
	
	@Override
	public String toSQL() {
		//First rename right, then get left NLOJ renamed and left NROJ renamed. Finally take their union
		Query renamedRight = new RenameTimeStampQuery(this.getRight());
		Query loj = new LeftOuterJoinQuery(this.getLeft(),renamedRight);
		Query roj = new RightOuterJoinQuery(this.getLeft(),renamedRight);
		
		
		StringBuffer sql = new StringBuffer();
		sql.append(loj.toSQL());
		sql.append(SQLSPACE + SQLUNION +SQLSPACE);
		sql.append(roj.toSQL());
		
		return sql.toString();
	}

}
