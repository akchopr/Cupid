package org.xtext.example.generator.query;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.xtext.example.cupido.Param;
import org.xtext.example.generator.Column;
import org.xtext.example.generator.RelationalExpr;

public abstract class Query implements SQLInterface{
	
	private static final String QUERY = "Query"; 
	/*
	 * Name of the query (In base case, name of base relation; otherwise a generated name)
	 */
	String name;
	

	/**
	 * The columns produced by the query, including the keys but not the timestamp
	 */
	Set<Column> allColumns = null;
	
	/**
	 * The keys produced by the query 
	 */
	Set<Column> keyColumns = null;
	/**
	 * The timestamp produced by the query
	 */
	Column timeColumn = null;
	
	Query right;
	Query left;
	
	private static int queryCounter = 0;
	
	static String getNewQueryName(){
		return QUERY + queryCounter++;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void initializeColumns() {
		allColumns = new LinkedHashSet<Column>();
	}
	
	public Set<Column> getAllColumns() {
		return allColumns;
	}
	public void setAllColumns(Set<Column> allColumns) {
		this.allColumns = allColumns;
	}
	
	
	public void addNewColumns(Set<Column> columns) {
		Set<Column> newCols = new LinkedHashSet<Column>();
		for(Column a: columns){
			boolean found = false;
			for(Column p: this.allColumns){
				if(a.getFullName().equalsIgnoreCase(p.getFullName())){
					found = true;
					break;
				}
			}
			if(false == found)
				newCols.add(a);
		}
		insertColumns(newCols);
	}
	
	void insertColumns(Set<Column> list) {
		for (Column p : list) 
			allColumns.add(p);
	}

	void insertColumns(Collection<Param> list) {
		for (Param p : list) 
			allColumns.add(Column.getColumn(p.getName()));			
	}
	
	void removeColumns(Set<Column> columns) {
		allColumns.removeAll(columns);		
	}

	void initializeKeyColumns() {
		keyColumns = new LinkedHashSet<Column>();		
	}

	void insertKeyColumns(Set<Column> set) {
		for (Column p : set)
			keyColumns.add(p);
	}

	void insertKeyColumns(Collection<Param> list) {
		for (Param p : list) 
			keyColumns.add(Column.getColumn(p.getName()));
	}

	void removeKeyColumns(Set<Column> columns) {
		keyColumns.removeAll(columns);		
	}
	
	public Set<Column> getKeyColumns() {
		return keyColumns;
	}
	public void setKeyColumns(Set<Column> keyColumns) {
		this.keyColumns = keyColumns;
	}
	public Column getTimeColumn() {
		return timeColumn;
	}
	public void setTimeColumn(Column timeColumn) {
		this.timeColumn = timeColumn;
	}
	public Query getRight() {
		return right;
	}
	public void setRight(Query right) {
		this.right = right;
	}
	public Query getLeft() {
		return left;
	}
	public void setLeft(Query left) {
		this.left = left;
	}
	
	public String getColumnsAsString() {
		StringBuffer b = new StringBuffer();
		int i=1;
		for(Column c: this.allColumns){
			b.append(c.getFullName());
			if(i<allColumns.size()){
				b.append(SQLCOMMA + SQLSPACE);
				i++;
			}
		}
		return b.toString();
	}
	
	public String getKeysAsString() {
		StringBuffer b = new StringBuffer();
		int i=1;
		for(Column k: this.keyColumns){
			b.append(k.getFullName());
			if(i<keyColumns.size()){
				b.append(SQLCOMMA + SQLSPACE);
				i++;
			}
		}
		return b.toString();
	}
	
	public String getFullTimeStampName() {
		StringBuffer b = new StringBuffer();
		b.append(getName() + SQLDOT + getTimeColumn().getFullName());
		return b.toString();
	}
	
	public String getFullTimeStampName(String colName) {
		StringBuffer b = new StringBuffer();
		b.append(getName() + SQLDOT + colName);
		return b.toString();
	}
	
	public Set<Column> getCommonColumns(Set<Column> with){
		Set<Column> common = new LinkedHashSet<Column>();
		//For each col in this, see if it is present in with
		for(Column c: this.allColumns){
			for(Column w: with){
				if(c.getFullName().equalsIgnoreCase(w.getFullName()))
					common.add(w);
			}
		}
		return common;
	}
	
	public static String getColumnsAsString(Set<Column> cols){
		StringBuffer b = new StringBuffer();
		int i=1;
		for(Column c: cols){
			b.append(c.getFullName());
			if(i<cols.size()){
				b.append(SQLCOMMA + SQLSPACE);
				i++;
			}
		}
		return b.toString();
		
	}
	public static Set<Column> getCommonKeys(Query left, Query right){
		Set<Column> common = new LinkedHashSet<Column>();
		//If left key appears in right, add it
		for(Column lKey: left.getKeyColumns())
			for(Column rCol: right.getAllColumns())
				if(lKey.getFullName().equalsIgnoreCase(rCol.getFullName()))
					common.add(lKey);
		//If right key appears in left, add it
		for(Column rKey: right.getKeyColumns())
			for(Column lCol: left.getAllColumns())
				if(rKey.getFullName().equalsIgnoreCase(lCol.getFullName()))
					common.add(rKey);
		return common;
	}
	
	public Set<Column> getCommonKeysWith(Query with) {
		Set<Column> withCols = with.getAllColumns();
		Set<Column> thisCols = this.getAllColumns();
		Set<Column> common = new LinkedHashSet<Column>();
		for(Column c: thisCols)
			if(withCols.contains(c))
				common.add(c);
		return common;
	}

	
}
