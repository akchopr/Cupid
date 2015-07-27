package org.xtext.example.generator;

import org.xtext.example.cupido.Event;
import org.xtext.example.cupido.Expr;
import org.xtext.example.cupido.TimeStamp;
import org.xtext.example.cupido.impl.OExprImpl;

public class CustomOExpr extends OExprImpl {
	
	public CustomOExpr(){
		super();
	}
	
	public void setLeft(Expr e){
		left = e;
	}
	
	public void setRight(Expr e){
		 right = e;
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
