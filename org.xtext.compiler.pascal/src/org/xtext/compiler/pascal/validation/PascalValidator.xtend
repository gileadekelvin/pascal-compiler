/*
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.validation

import java.util.ArrayList
import java.util.List
import org.eclipse.xtext.validation.Check
import org.xtext.compiler.pascal.pascal.assignment_statement
import org.xtext.compiler.pascal.pascal.case_list_element
import org.xtext.compiler.pascal.pascal.case_statement
import org.xtext.compiler.pascal.pascal.constant
import org.xtext.compiler.pascal.pascal.factor
import org.xtext.compiler.pascal.pascal.formal_parameter_list
import org.xtext.compiler.pascal.pascal.formal_parameter_section
import org.xtext.compiler.pascal.pascal.function_declaration
import org.xtext.compiler.pascal.pascal.function_designator
import org.xtext.compiler.pascal.pascal.identifier
import org.xtext.compiler.pascal.pascal.identifier_list
import org.xtext.compiler.pascal.pascal.parameter_group
import org.xtext.compiler.pascal.pascal.pascal
import org.xtext.compiler.pascal.pascal.signed_factor
import org.xtext.compiler.pascal.pascal.simple_expression
import org.xtext.compiler.pascal.pascal.term
import org.xtext.compiler.pascal.pascal.type_identifier
import org.xtext.compiler.pascal.pascal.variable_declaration

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class PascalValidator extends AbstractPascalValidator {

	// Limpa as listas de variáveis e de funções
	@Check
	def restart(pascal pascal) {
		Structures.clear();
	}

	// Checa se a atribuição ocorre em uma variável não declarada
	@Check
	def checkNotDeclaredVariable(assignment_statement variable) {
		var variable_id = variable.declared_variable.variable_id;
		if (!Structures.containsVar(variable_id)) {
			var error_message = String.format("Variável '%s' não foi declarada", variable_id);
			error(error_message, null)
		}
	}

	// Checa se uma variável já foi declarada caso contrário adiciona na lista de variáveis
	@Check
	def checkVariableDeclaration(variable_declaration declared_variables) {

		var List<String> new_variables = new ArrayList<String>();
		var type = declared_variables.type_variable.simple.type;
		var names = declared_variables.list_names;

		if (names !== null && names.names !== null) {
			for (identifier id : names.names) {
				new_variables.add(id.id);
			}
		}

		for (String name : new_variables) {
			if (!Structures.containsVar(name)) {
				var Variable newVar = new Variable(name, ExpressionTypeHelper.getType(type));
				Structures.putVariable(name, newVar);
			} else {
				var error_message = String.format("Variável '%s' já foi declarada", name);
				error(error_message, null)
			}
		}
	}

	// Checa se tipos simples declarados a variáveis são boolean ou integer ou string
	@Check
	def checkTypesOfDeclaredVariables(variable_declaration declared_variables) {

		var variable_type = declared_variables.type_variable;

		if (variable_type.simple !== null) {
			var type = ExpressionTypeHelper.getType(variable_type.simple.type);
			if (!type.equals("boolean") && !type.equals("integer") && !type.equals("string")) {
				var error_message = "Tipo precisa ser boolean, integer ou string";
				error(error_message, null)
			}
		}
	}

	// Checa se uma variável usada como fator foi declarada
	@Check
	def checkTypeFactor(factor inst_factor) {
		var variable_id = inst_factor.variable.variable_id;
		if (!Structures.containsVar(variable_id)) {
			var error_message = String.format("Variável '%s' não foi declarada", variable_id);
			error(error_message, null)
		}
	}

	// Checa se um sinal (+, -) está sendo atribuído a um tipo que não é inteiro
	@Check
	def checkTypeSignedFactor(signed_factor inst_signed_factor) {
		if (inst_signed_factor.signal !== null) {
			var type_factor = ExpressionTypeHelper.getTypeFactor(inst_signed_factor.factor);

			if (!type_factor.equals("integer")) {
				var error_message = String.format("Sinal inválido para o tipo '%s' utilizado", type_factor);
				error(error_message, null);
			}
		}
	}

	// Checa se operações (and, *, /, div, mod) entre operandos de um termo são permitidas 
	@Check
	def checkTypeTerm(term inst_term) {
		var operator = inst_term.operator;

		if (operator === null) {
			return ExpressionTypeHelper.getTypeSignedFactor(inst_term.factor);
		} else {
			var factor_type = ExpressionTypeHelper.getTypeSignedFactor(inst_term.factor);
			var term2_type = ExpressionTypeHelper.getTypeTerm(inst_term.term2);

			// Se é uma operação booleana
			if (operator.equalsIgnoreCase("AND")) {
				if (!factor_type.equals("boolean") || !term2_type.equals("boolean")) {
					var error_message = "Operandos incompatíveis com a operação. A operação booleana AND exige dois operandos booleanos";
					error(error_message, null);
				}
			} else { // se é uma expressão aritmética (*, /, div, mod)
				if (!factor_type.equals("integer") || !term2_type.equals("integer")) {
					var error_message = String.format(
						"Operandos incompatíveis com a operação. Dois inteiros são necessários para a operação aritmética '%s'",
						operator);
					error(error_message, null);
				}
			}
		}
	}

	// Checa se operações (+, -, or) entre operandos de uma expressão simple são permitidas.
	@Check
	def checkTypeSimpleExpression(simple_expression inst_simple_exp) {
		var operator = inst_simple_exp.operator;

		if (operator === null) {
			return ExpressionTypeHelper.getTypeTerm(inst_simple_exp.term_exp);
		} else {
			var term1 = ExpressionTypeHelper.getTypeTerm(inst_simple_exp.term_exp);
			var simple_exp2 = ExpressionTypeHelper.getTypeSimpleExpression(inst_simple_exp.expression);

			if (operator.equalsIgnoreCase("OR")) {
				if (!term1.equals("boolean") || !simple_exp2.equals("boolean")) {
					var error_message = "Operandos incompatíveis com a operação. A operação booleana OR exige dois operandos booleanos";
					error(error_message, null);
				}
			} else if (operator.equals("+")) {
				// Se não for dois inteiros ou duas strings um erro é lançado
				if (!(term1.equals("integer") && simple_exp2.equals("integer"))) {
					var error_message = "Operandos incompatíveis com a operação. Dois inteiros são necessários para a operação arimética '+'";
					error(error_message, null);
				}
			} else {
				if (!term1.equals("integer") || !simple_exp2.equals("integer")) {
					var error_message = "Operandos incompatíveis com a operação. Dois inteiros são necessários para a operação arimética '-'";
					error(error_message, null);
				}
			}
		}
	}

	// Checa se uma expressão atribuída a uma variável é compatível com o tipo declarado da variável
	@Check
	def checkTypeAssignment(assignment_statement variable) {
		var expression_type = ExpressionTypeHelper.getTypeExpression(variable.expression);
		var id_type = Structures.getVar(variable.declared_variable.variable_id).getType();

		if (!id_type.equalsIgnoreCase(expression_type)) {
			var error_message = "Tipo da variável não condiz com o tipo da expressão atribuída";
			error(error_message, null);
		}
	}

	// Checa se o tipo da expressão do CASE é compatível com o tipo dos casos
	@Check
	def checkCaseTypeExpression(case_statement inst_case) {
		var expression_type = ExpressionTypeHelper.getTypeExpression(inst_case.exp);

		var case_list = inst_case.case_list;

		for (case_list_element case_elem : case_list) {
			if (case_elem.consts === null) {
				var error_message = "O 'case' não pode ser usado sem as cláusulas de teste";
				error(error_message, null);
			} else {
				for (constant const : case_elem.consts.constants) {
					var type = ExpressionTypeHelper.getTypeConstant(const)
					if (type !== expression_type) {
						var error_message = String.format(
							"Tipo da expressão nas cláusulas são diferentes do tipo da expressão no 'case' (%s)",
							expression_type);
						error(error_message, null);
					}
				}
			}
		}

	}

	@Check
	def checkParameterDeclaration(parameter_group parameter) {
		var names = parameter.names;
		var type = ExpressionTypeHelper.getType(parameter.types as type_identifier);
		var Variable newVar;

			var temp_names = names.names;
			for (identifier id : temp_names) {
				newVar = new Variable(id.id, type);
				Structures.putVariable(id.id, newVar);
			}

	}

	// Adiciona a variável implicita à declaração de uma função de mesmo nome e tipo que a própria função
	@Check
	def checkFunctionDeclaration(function_declaration variable) {
		var names = variable.names;
		var type = ExpressionTypeHelper.getType(variable.types as type_identifier);
		
		var Variable newVar = new Variable(names, type);
			Structures.putVariable(names, newVar);		
				
		checkParamsList(variable.parameters);
	}

	@Check
	def checkParamsList(formal_parameter_list variable) {
		for (formal_parameter_section section : variable.parameters) {
			for (parameter_group params : section.parameters) {
				checkParameterDeclaration(params);
			}

		}
	}
}
