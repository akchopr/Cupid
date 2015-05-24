package org.xtext.example.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.cupido.ArithExpr;
import org.xtext.example.cupido.Attribute;
import org.xtext.example.cupido.BinaryOperator;
import org.xtext.example.cupido.Commitment;
import org.xtext.example.cupido.CupidoPackage;
import org.xtext.example.cupido.Event;
import org.xtext.example.cupido.EventRelation;
import org.xtext.example.cupido.Expr;
import org.xtext.example.cupido.GeneralExpr;
import org.xtext.example.cupido.Interval;
import org.xtext.example.cupido.Param;
import org.xtext.example.cupido.Schemata;
import org.xtext.example.cupido.TimeStamp;
import org.xtext.example.services.CupidoGrammarAccess;

@SuppressWarnings("all")
public class CupidoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CupidoGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CupidoPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CupidoPackage.ARITH_EXPR:
				if(context == grammarAccess.getArithExprRule()) {
					sequence_ArithExpr(context, (ArithExpr) semanticObject); 
					return; 
				}
				else break;
			case CupidoPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case CupidoPackage.BINARY_OPERATOR:
				if(context == grammarAccess.getBinaryOperatorRule()) {
					sequence_BinaryOperator(context, (BinaryOperator) semanticObject); 
					return; 
				}
				else break;
			case CupidoPackage.COMMITMENT:
				if(context == grammarAccess.getCommitmentRule()) {
					sequence_Commitment(context, (Commitment) semanticObject); 
					return; 
				}
				else break;
			case CupidoPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case CupidoPackage.EVENT_RELATION:
				if(context == grammarAccess.getEventRelationRule()) {
					sequence_EventRelation(context, (EventRelation) semanticObject); 
					return; 
				}
				else break;
			case CupidoPackage.EXPR:
				if(context == grammarAccess.getExprRule()) {
					sequence_Expr(context, (Expr) semanticObject); 
					return; 
				}
				else break;
			case CupidoPackage.GENERAL_EXPR:
				if(context == grammarAccess.getGeneralExprRule()) {
					sequence_GeneralExpr(context, (GeneralExpr) semanticObject); 
					return; 
				}
				else break;
			case CupidoPackage.INTERVAL:
				if(context == grammarAccess.getIntervalRule()) {
					sequence_Interval(context, (Interval) semanticObject); 
					return; 
				}
				else break;
			case CupidoPackage.PARAM:
				if(context == grammarAccess.getParamRule()) {
					sequence_Param(context, (Param) semanticObject); 
					return; 
				}
				else break;
			case CupidoPackage.SCHEMATA:
				if(context == grammarAccess.getCupidoRule()) {
					sequence_Cupido_Schemata(context, (Schemata) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSchemataRule()) {
					sequence_Schemata(context, (Schemata) semanticObject); 
					return; 
				}
				else break;
			case CupidoPackage.TIME_STAMP:
				if(context == grammarAccess.getTimeStampRule()) {
					sequence_TimeStamp(context, (TimeStamp) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (leftAttr=Attribute binOp=BinaryOperator (rightAttr=Attribute | num=INT))
	 */
	protected void sequence_ArithExpr(EObject context, ArithExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CupidoPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidoPackage.Literals.ATTRIBUTE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op=LT | op=LEQ | op=EQ | op=GT | op=GEQ)
	 */
	protected void sequence_BinaryOperator(EObject context, BinaryOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         label=ID 
	 *         debtor=ID 
	 *         creditor=ID 
	 *         trigger=GeneralExpr 
	 *         antecedent=GeneralExpr? 
	 *         consequent=GeneralExpr
	 *     )
	 */
	protected void sequence_Commitment(EObject context, Commitment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (schemata+=EventRelation+ commitments+=Commitment*)
	 */
	protected void sequence_Cupido_Schemata(EObject context, Schemata semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         event=Event 
	 *         params+=Param 
	 *         params+=Param* 
	 *         keyParams+=Param 
	 *         keyParams+=Param* 
	 *         timeParam=Param
	 *     )
	 */
	protected void sequence_EventRelation(EObject context, EventRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID | ((lifeState=CREATED | lifeState=DETACHED | lifeState=DISCHARGED | lifeState=EXPIRED | lifeState=VIOLATED) label=ID))
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interval=Interval | (left=Interval op=EventOperator right=Expr) | expr=Expr)
	 */
	protected void sequence_Expr(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expr (where=WHERE arith=ArithExpr)?)
	 */
	protected void sequence_GeneralExpr(EObject context, GeneralExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=Event | (event=Event left=TimeStamp right=TimeStamp) | (event=Event right=TimeStamp) | (event=Event left=TimeStamp) | event=Event)
	 */
	protected void sequence_Interval(EObject context, Interval semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Param(EObject context, Param semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CupidoPackage.Literals.PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidoPackage.Literals.PARAM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     schemata+=EventRelation+
	 */
	protected void sequence_Schemata(EObject context, Schemata semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (val=INT | (eventReference=ID shift=INT?))
	 */
	protected void sequence_TimeStamp(EObject context, TimeStamp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
