/*
 * generated by Xtext
 */
package org.xtext.example.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.example.cupido.Commitment
import org.xtext.example.cupido.EventRelation
import org.xtext.example.generator.query.Query

/**
 * Generates code from your model files on save.
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class CupidoGenerator implements IGenerator {

  override void doGenerate(Resource resource, IFileSystemAccess fsa) {
  		fsa.generateFile('schema.sql', resource.generateRelations)
  		fsa.generateFile('commitments.sql', resource.generateCommitments)		 		
  }
  
  def CharSequence generateCommitments(Resource resource) {
  	var result = ""
  	for (comm: resource.allContents.toIterable.filter(Commitment)) {
	  //result += "==========\n"
  	  result += '''/*For «comm.label», we obtain these queries:*/'''
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
    compileViolated(c).toString;
  }
  
//  def CharSequence compileAll(Commitment c) { 
//    return compileDetached(c).toString;
//  }
//  
  
  def CharSequence compileDetached(Commitment c) {
  	val Query expr = Parser.getParser().compileDetached(c) 
    return "\n\n/*DETACHED*/\n\n" + expr.toSQL + ";" //+
  }
  
  def CharSequence compileCreated(Commitment c) {
  	val Query expr = Parser.getParser().compileCreated(c) 
    return "\n\n/*CREATED*/\n\n" + expr.toSQL + ";" //+
  }
  
   def CharSequence compileDischarged(Commitment c) {
  	val Query expr = Parser.getParser().compileDischarged(c) 
    return "\n\n/*DISCHARGED*/\n\n" + expr.toSQL + ";" //+
  }
  
  def CharSequence compileExpired(Commitment c) {
  	val Query expr = Parser.getParser().compileExpired(c) 
    return "\n\n/*EXPIRED*/\n\n" + expr.toSQL + ";" //+
  }
  
  def CharSequence compileViolated(Commitment c) {
  	val Query expr = Parser.getParser().compileViolated(c) 
    return "\n\n/*VIOLATED*/\n\n" + expr.toSQL + ";" //+
  }
}
