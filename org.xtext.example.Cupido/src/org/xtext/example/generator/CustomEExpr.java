package org.xtext.example.generator;

import org.xtext.example.cupido.Expr;
import org.xtext.example.cupido.impl.EExprImpl;

public class CustomEExpr extends EExprImpl {
	
	public CustomEExpr(){
		super();
	}
	
	public void setLeft(Expr e){
		left = e;
	}
	
	public void setRight(Expr e){
		 right = e;
	}

}
