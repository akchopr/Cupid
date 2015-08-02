package org.xtext.example.generator.query;

import org.xtext.example.cupido.EventRelation;
import org.xtext.example.generator.Column;

public class BaseEventQuery extends Query {
	
	/*
	 * Event name
	 */
	private String eventName;
	
	public BaseEventQuery(EventRelation eventRelation) {
		this.eventName = eventRelation.getEvent().getName();
		this.setName(getNewQueryName());
		
		this.initializeColumns(); 
		this.insertColumns(eventRelation.getParams());
		
		this.initializeKeyColumns(); 	
		this.insertKeyColumns(eventRelation.getKeyParams());
		
		this.setTimeColumn(Column.getColumn(eventRelation.getTimeParam().getName()));
		
		//No need to set left or right

	}

	@Override
	public String toSQL() {
		StringBuffer sql = new StringBuffer();
		//Construct select cols part
		sql.append(SQLSELECT + SQLSPACE);
		String colStr = this.getColumnsAsString();
		sql.append(colStr);
		//Timestamp still needs to be appended
		sql.append(SQLCOMMA + SQLSPACE);
		//Construct timestamp part of the select clause: "LEAST(left.timestamp, right.timestamp) as timestamp"
		sql.append(this.getTimeColumn().getFullName());
		//Now create the from part
		sql.append(SQLSPACE);
		sql.append(SQLFROM + SQLSPACE + eventName);
		//sql.append(SQLSPACE + SQLAS + SQLSPACE + this.getName());
		return sql.toString();

		
	}

}
