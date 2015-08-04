package org.xtext.example.generator;

import org.xtext.example.cupido.Event;
import org.xtext.example.cupido.Expr;
import org.xtext.example.cupido.TimeStamp;
import org.xtext.example.cupido.impl.WExprImpl;

public class CustomWExpr extends WExprImpl{

	public CustomWExpr() {
		// TODO Auto-generated constructor stub
	}
	
	public void setLeft(Expr e){
		left = e;
	}
	
	public void setRight(String cond){
		 right = cond;
	}
	
	public void setLTime(TimeStamp t){
		lTime = t;
	}
	
	public void setRTime(TimeStamp t){
		rTime = t;
	}
	
	public void setEvent(Event ev){
		event = ev;
	}


}
