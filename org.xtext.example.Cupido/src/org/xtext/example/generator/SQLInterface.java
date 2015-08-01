package org.xtext.example.generator;

import java.util.Set;

public interface SQLInterface {
	public static final String SQLFROM = "FROM";
	public static final String SQLAS = "AS";
	public static final String SQLTABLE = "TABLE";

	public static final String SQLINTERSECTION = "";
	public static final String SQLUNION = "UNION";
	public static final String SQLNOTIN = "NOT IN"; // FOR diff
	public static final String SQLCROSSJOIN = "CROSS JOIN";
	public static final String SQLWHERE = "WHERE";
	public static final String SQLSELECT = "SELECT";
	
	public static final String SQLJOIN = "NATURAL JOIN";
	public static final String SQLLEFTOUTERJOIN = "NATURAL LEFT OUTER JOIN";
	public static final String SQLUSING = "USING";
	
	public static final String SQLPRIMARYKEY = "PRIMARY KEY";
	public static final String SQLDATETIME = "DATETIME";
	public static final String SQLVARCHAR_10 = "VARCHAR(10)";
	public static final String SQLCREATE_TABLE = "CREATE TABLE";
	public static final String SQLSPACE = " ";
	public static final String SQLLPAREN = "(";
	public static final String SQLRPAREN = ")";
	public static final String SQLCOMMA = ",";
	public static final String SQLAND = "AND";
	public static final String SQLOR = "OR";
	
	public static final String SQLGREATEST = "GREATEST";
	public static final String SQLLEAST = "LEAST";
	public static final String SQLCOALESCE = "COALESCE";
	public static final String SQLDOT = ".";
	
	public static String SQLLEQ = "<=";
	public static String SQLLT = "<";
	public static String SQLGEQ = ">=";
	public static String SQLGT = ">";
	
	public static final String SQLPLUS = "+";
	
	
	public String toSQL();
}
