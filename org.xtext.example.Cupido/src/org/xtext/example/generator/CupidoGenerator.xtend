/*
 * generated by Xtext
 */
package org.xtext.example.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.example.cupido.Commitment
import org.xtext.example.cupido.EventRelation

/**
 * Generates code from your model files on save.
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class CupidoGenerator implements IGenerator {

  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
  		fsa.generateFile('schema.sql', resource.generateRelations)
  		fsa.generateFile('commitments.algebra', resource.generateCommitments)
  }
  
  def CharSequence generateCommitments(Resource resource) {
  	var result = ""
  	for (comm: resource.allContents.toIterable.filter(Commitment)) {
	  result += "==========\n"
  	  result += '''For «comm.label», we obtain these queries:'''
	  result += comm.compileAll
	  result += "\n\n"
	}
	return result
  }
 
  def CharSequence generateRelations(Resource resource) {
  	var result = ""
  	for (sch: resource.allContents.toIterable.filter(EventRelation)) {
  		result += sch.generateRelation
  		result += "\n"
  	}
  	return result
  }  

  def CharSequence generateRelation (EventRelation s) {
	Parser.getParser().storeEventRelation(s)
    return Parser.getParser().toSQL(s)
  }

  def CharSequence compileAll(Commitment c) { 
    return compileCreated(c).toString +
    compileDetached(c).toString +
    compileExpired(c).toString +
    compileDischarged(c).toString +
    compileViolated(c).toString ;
  }
  
//  def CharSequence compileAll(Commitment c) { 
//    return compileDetached(c).toString;
//  }
//  
  def CharSequence compileDetached(Commitment c) {
  	val RelationalExpr expr = Parser.getParser().compileDetached(c) 
    return "\nDETACHED: " + expr.toSQL + ";" //+
  }
  
  def CharSequence compileCreated(Commitment c) {
  	val RelationalExpr expr = Parser.getParser().compileCreated(c) 
    return "\nCREATED: " + expr.toSQL + ";" //+
  }
  
  def CharSequence compileExpired(Commitment c) {
  	val RelationalExpr expr = Parser.getParser().compileExpired(c) 
    return "\nEXPIRED: " + expr.toSQL + ";" //+
  }
  
  def CharSequence compileDischarged(Commitment c) {
  	val RelationalExpr expr = Parser.getParser().compileDischarged(c) 
    return "\nDISCHARGED: " + expr.toSQL + ";" //+
  }
  def CharSequence compileViolated(Commitment c) {
  	val RelationalExpr expr = Parser.getParser().compileViolated(c) 
    return "\nVIOLATED: " + expr.toSQL + ";" //+
  }
  
}
