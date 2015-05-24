package org.xtext.example.generator;

import org.xtext.example.cupido.Param;
import org.xtext.example.cupido.TimeStamp;

public class SelectExpr {

	public static final String AND = " AND ";
	public static final String IS = " IS ";
	public static final String NULL = "NULL";
	public static final String OR = " OR ";
	static String LEQ = "<=";
	static String LT = "<";
	static String GEQ = ">=";
	static String GT = ">";
// Define constants for all the relational algebra operators

	private Param lParam = null;
	private Param rParam = null;
	private TimeStamp lTime = null;
	private TimeStamp rTime = null;
	private String comparative = "";
	
	SelectExpr (Param l, String op, Param r) {
		setlParam(l);
		setrParam(r);
		setComparative(op);
	}

	public SelectExpr(TimeStamp lTime, String op, Param r) {
		setlTime(lTime);
		setrParam(r);
		setComparative(op);		
	}

	public SelectExpr(Param l, String op, TimeStamp rTime) {
		setrTime(rTime);
		setlParam(l);
		setComparative(op);		
	}

	public SelectExpr(SelectExpr lCond, String boolOp, SelectExpr rCond) {
		// TODO Auto-generated constructor stub
	}

	public Param getlParam() {
		return lParam;
	}

	public void setlParam(Param lParam) {
		this.lParam = lParam;
	}

	public Param getrParam() {
		return rParam;
	}

	public void setrParam(Param rParam) {
		this.rParam = rParam;
	}

	public String getComparative() {
		return comparative;
	}

	public void setComparative(String comparative) {
		this.comparative = comparative;
	}

	public TimeStamp getlTime() {
		return lTime;
	}

	public void setlTime(TimeStamp lTime) {
		this.lTime = lTime;
	}

	public TimeStamp getrTime() {
		return rTime;
	}

	public void setrTime(TimeStamp rTime) {
		this.rTime = rTime;
	}
}
