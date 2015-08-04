package org.xtext.example.generator.query;

public class RenameTimeStampQuery extends Query {
	
	public RenameTimeStampQuery(Query toRename){
		this.setName(getNewQueryName());
		
		this.initializeColumns();
		this.insertColumns(toRename.getAllColumns());
		this.initializeKeyColumns();
		this.insertKeyColumns(toRename.getKeyColumns());
		this.setTimeColumn(toRename.getTimeColumn().generateColumn());
		
		this.setLeft(toRename);
		
	}
	

	@Override
	public String toSQL() {
		StringBuffer sql = new StringBuffer();
		sql.append(SQLSELECT + SQLSPACE);
		//Add select columns
		sql.append(this.getColumnsAsString());
		//Add timestamp colum
		sql.append(SQLSPACE + SQLCOMMA);
		sql.append(this.getLeft().getTimeColumn().getFullName() + SQLSPACE + SQLAS + SQLSPACE + this.getTimeColumn().getFullName());
		//Add FROM
		sql.append(SQLSPACE);
		sql.append(SQLFROM + SQLSPACE + SQLLPAREN + this.getLeft().toSQL() + SQLRPAREN +
				SQLSPACE + SQLAS +SQLSPACE + this.getLeft().getName());
		return sql.toString();
	}

}
