package org.xtext.example.generator.query;

import java.util.Set;

import org.xtext.example.cupido.TimeStamp;
import org.xtext.example.generator.Column;

public class IntervalLeftEventReferenceQuery extends IntervalQuery {

	private Query evRef;

	public Query getEvRef() {
		return evRef;
	}

	public void setEvRef(Query evRef) {
		this.evRef = evRef;
	}

	public IntervalLeftEventReferenceQuery(Query ev, Query evRef, TimeStamp l, TimeStamp r) {
		super(ev, l, r);
		this.setEvRef(evRef); 
	}

	@Override
	public String toSQL() {
		//Construct SQL here
		Query renamed = new RenameTimeStampQuery(this.getEvRef());
		Query joinQ = new JoinQuery(this.getLeft(),renamed);
		
		StringBuffer sql = new StringBuffer();
		sql.append(joinQ.toSQL());
		/*//Construct select cols part: Select leftcol1, leftcol2,..., leftcoln
		sql.append(SQLSELECT + SQLSPACE);
		String colStr = this.getColumnsAsString();
		sql.append(colStr);
		//Timestamp still needs to be appended
		sql.append(SQLCOMMA + SQLSPACE);
		sql.append(this.getLeft().getFullTimeStampName() + SQLSPACE + 
				SQLAS + SQLSPACE + this.getTimeColumn().getFullName());
		//Now create the from part
		sql.append(SQLSPACE);
		sql.append(SQLFROM + SQLSPACE + 
				SQLLPAREN + this.getLeft().toSQL() + SQLRPAREN + SQLSPACE + SQLAS + SQLSPACE + this.getLeft().getName() +  
				SQLSPACE + SQLJOIN + SQLSPACE +
				SQLLPAREN + this.getEvRef().toSQL() + SQLRPAREN + SQLSPACE + SQLAS + SQLSPACE + this.getEvRef().getName());
		*/
		/*Set<Column> common = this.getLeft().getCommonColumns(this.getEvRef().getAllColumns());
		String usingCols = getColumnsAsString(common);
		sql.append(SQLSPACE + SQLUSING + SQLSPACE + SQLLPAREN + usingCols + SQLRPAREN);*/
		
		//Finally the where part
		sql.append(SQLSPACE + SQLWHERE + SQLSPACE);
		String lCond = renamed.getFullTimeStampName() + SQLPLUS + toDateTime(this.getlT().getShift())
		+ SQLLEQ + this.getLeft().getFullTimeStampName();
		String rCond = this.getLeft().getFullTimeStampName() + SQLLT + toDateTime(this.getrT().getVal());
		String cond = lCond + SQLSPACE + SQLAND + SQLSPACE + rCond;
		sql.append(cond);

		return sql.toString();
	}

}