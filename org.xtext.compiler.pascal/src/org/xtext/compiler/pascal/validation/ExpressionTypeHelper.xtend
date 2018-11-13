package org.xtext.compiler.pascal.validation


import org.xtext.compiler.pascal.pascal.factor;
import org.xtext.compiler.pascal.pascal.signed_factor;
import org.xtext.compiler.pascal.pascal.simple_expression;
import org.xtext.compiler.pascal.pascal.expression;
import org.xtext.compiler.pascal.pascal.term;
import org.xtext.compiler.pascal.pascal.unsigned_constant;
import org.xtext.compiler.pascal.pascal.type_identifier;


class ExpressionTypeHelper {
	
	 def static getType(type_identifier lit) {
		if (lit.boolean !== null) {
			return "boolean"
		} else if (lit.integer !== null) {
			return "integer"
		} else if (lit.string !== null) {
			return "string"
		} else {
			return lit.id;
		}
	}

		
	def static String getTypeExpression(expression inst_expression) {
		return getTypeSimpleExpression(inst_expression.simple);
	}
	
	def static String getTypeUnsConstant(unsigned_constant inst_constant) {
		if (inst_constant.number !== null) {
			return "integer";
		} else if (inst_constant.string !== null) {
			return "string";
		} else {
			return "nil";
		}
	}
	
	def static String getTypeFactor(factor inst_factor) {
		if(inst_factor.bool_factor !== null) {
			return "boolean";
		} else if (inst_factor.constant !== null) {
			return getTypeUnsConstant(inst_factor.constant);
		} else if (inst_factor.not_factor !== null){
			return("boolean");
		} else if (inst_factor.variable !== null) {
			var id_type = getType(Structures.variables.get(inst_factor.variable.variable_id).type_variable.simple.type);
			return(id_type);			
		} else if (inst_factor.expression !== null) {
			var expression_type = getTypeExpression(inst_factor.expression);
			return expression_type;
		}
		// TODO regras para function
	}
	
	def static String getTypeSignedFactor(signed_factor inst_signed_factor) {
		return getTypeFactor(inst_signed_factor.factor);
	}
	
	def static String getTypeTerm(term inst_term) {
		var operator = inst_term.operator;		
		
		if (operator === null) {
			return getTypeSignedFactor(inst_term.factor);
		} else {
			var factor_type = getTypeSignedFactor(inst_term.factor);
			var term2_type = getTypeTerm(inst_term.term2);				
			
			// Se é uma operação booleana
			if (operator.equalsIgnoreCase("AND")) {
				if (!factor_type.equals("boolean") || !term2_type.equals("boolean")) {					
					return "erro_tipo";	
				} else {
					return "boolean"
				} 					
			} else { // se é uma expressão aritmética (*, /, div, mod)
				if (!factor_type.equals("integer") || !term2_type.equals("integer")) {					
					return "erro_tipo";	
				} else {
					return "integer";
				} 	
			}
		}
	}
		
	def static String getTypeSimpleExpression(simple_expression inst_simple_exp) {
		var operator = inst_simple_exp.operator;
		
		if (operator === null) {
			return getTypeTerm(inst_simple_exp.term_exp);
		} else {
			var term1 = getTypeTerm(inst_simple_exp.term_exp);
			var simple_exp2 = getTypeSimpleExpression(inst_simple_exp.expression);			
			
			if (operator.equalsIgnoreCase("OR")) {
				if (!term1.equals("boolean") || !simple_exp2.equals("boolean")) {				
					return "erro_tipo";	
				} else {
					return "boolean"
				} 	
			} else if (operator.equals("+")) {
				if (term1.equals("integer") && simple_exp2.equals("integer")) {
					return "integer";
				} else {					
					return "erro_tipo";					
				}
			} else {
				if (term1.equals("integer") && simple_exp2.equals("integer")) {
					return "integer";
				} else {					
					return "erro_tipo";						
				}
			}
		} 
	}	
}
