package org.xtext.example.generator;

import org.xtext.example.cupido.Expr;
import org.xtext.example.cupido.impl.AExprImpl;

public class CustomAExpr extends AExprImpl {
	
	public CustomAExpr(){
		super();
	}
	
	public void setLeft(Expr e){
		left = e;
	}
	
	public void setRight(Expr e){
		 right = e;
	}

}
