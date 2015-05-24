package org.xtext.example.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.services.CupidoGrammarAccess;

@SuppressWarnings("all")
public class CupidoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CupidoGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CupidoGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMITRule())
			return getCOMMITToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCREATERule())
			return getCREATEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDETACHRule())
			return getDETACHToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDISCHARGERule())
			return getDISCHARGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getKEYRule())
			return getKEYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLBRACKETRule())
			return getLBRACKETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLPARENRule())
			return getLPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPLUSRule())
			return getPLUSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRBRACKETRule())
			return getRBRACKETToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRPARENRule())
			return getRPARENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSCHEMARule())
			return getSCHEMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTIMERule())
			return getTIMEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTORule())
			return getTOToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal COMMA: ',';
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal COMMIT: 'commitment';
	 */
	protected String getCOMMITToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "commitment";
	}
	
	/**
	 * terminal CREATE: 'create';
	 */
	protected String getCREATEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "create";
	}
	
	/**
	 * terminal DETACH: 'detach';
	 */
	protected String getDETACHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "detach";
	}
	
	/**
	 * terminal DISCHARGE: 'discharge';
	 */
	protected String getDISCHARGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "discharge";
	}
	
	/**
	 * terminal KEY: 'key';
	 */
	protected String getKEYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "key";
	}
	
	/**
	 * terminal LBRACKET: '[';
	 */
	protected String getLBRACKETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
	}
	
	/**
	 * terminal LPAREN: '(';
	 */
	protected String getLPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal PLUS: '+';
	 */
	protected String getPLUSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * terminal RBRACKET: ']';
	 */
	protected String getRBRACKETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * terminal RPAREN: ')';
	 */
	protected String getRPARENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal SCHEMA: 'schema';
	 */
	protected String getSCHEMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "schema";
	}
	
	/**
	 * terminal TIME: 'time';
	 */
	protected String getTIMEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "time";
	}
	
	/**
	 * terminal TO: 'to';
	 */
	protected String getTOToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "to";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
