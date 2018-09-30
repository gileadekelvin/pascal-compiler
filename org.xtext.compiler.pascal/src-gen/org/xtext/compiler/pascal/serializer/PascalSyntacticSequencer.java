/*
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.compiler.pascal.services.PascalGrammarAccess;

@SuppressWarnings("all")
public class PascalSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PascalGrammarAccess grammarAccess;
	protected AbstractElementAlias match_constant_SignParserRuleCall_1_0_q;
	protected AbstractElementAlias match_variable_CircumflexAccentKeyword_1_3_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PascalGrammarAccess) access;
		match_constant_SignParserRuleCall_1_0_q = new TokenAlias(false, true, grammarAccess.getConstantAccess().getSignParserRuleCall_1_0());
		match_variable_CircumflexAccentKeyword_1_3_a = new TokenAlias(true, true, grammarAccess.getVariableAccess().getCircumflexAccentKeyword_1_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getASSIGNRule())
			return getASSIGNToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOTDOTRule())
			return getDOTDOTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEQUALRule())
			return getEQUALToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNOTRule())
			return getNOTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSignRule())
			return getsignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ASSIGN: 
	 * 	':='
	 * ;
	 */
	protected String getASSIGNToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":=";
	}
	
	/**
	 * terminal DOTDOT:
	 * 	'..'
	 * ;
	 */
	protected String getDOTDOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "..";
	}
	
	/**
	 * terminal EQUAL: 
	 * 	'='
	 * ;
	 */
	protected String getEQUALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal NOT:
	 * 	'not'
	 * ;
	 */
	protected String getNOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "not";
	}
	
	/**
	 * sign: 
	 * 	 PLUS
	 *    | MINUS
	 * ;
	 */
	protected String getsignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_constant_SignParserRuleCall_1_0_q.equals(syntax))
				emit_constant_SignParserRuleCall_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_variable_CircumflexAccentKeyword_1_3_a.equals(syntax))
				emit_variable_CircumflexAccentKeyword_1_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     sign?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) numbers+=unsigned_integer
	 *     (rule start) (ambiguity) numbers+=unsigned_real
	 *     name=ID EQUAL (ambiguity) numbers+=unsigned_integer
	 *     name=ID EQUAL (ambiguity) numbers+=unsigned_real
	 */
	protected void emit_constant_SignParserRuleCall_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '^'*
	 *
	 * This ambiguous syntax occurs at:
	 *     expression+=expression '.)' (ambiguity) '(.' expression+=expression
	 *     expression+=expression '.)' (ambiguity) '.' names+=ID
	 *     expression+=expression '.)' (ambiguity) '[' expression+=expression
	 *     expression+=expression '.)' (ambiguity) (rule end)
	 *     expression+=expression ']' (ambiguity) '(.' expression+=expression
	 *     expression+=expression ']' (ambiguity) '.' names+=ID
	 *     expression+=expression ']' (ambiguity) '[' expression+=expression
	 *     expression+=expression ']' (ambiguity) (rule end)
	 *     names+=ID (ambiguity) '(.' expression+=expression
	 *     names+=ID (ambiguity) '.' names+=ID
	 *     names+=ID (ambiguity) '[' expression+=expression
	 *     names+=ID (ambiguity) (rule end)
	 */
	protected void emit_variable_CircumflexAccentKeyword_1_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
