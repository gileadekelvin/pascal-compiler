/*
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.validation

import java.util.HashMap
import org.xtext.compiler.pascal.pascal.variable_declaration;
import org.xtext.compiler.pascal.pascal.function_declaration;
import org.xtext.compiler.pascal.pascal.type_identifier;
import org.xtext.compiler.pascal.pascal.pascal;
import org.xtext.compiler.pascal.pascal.assignment_statement;
import org.xtext.compiler.pascal.pascal.identifier;
import org.eclipse.xtext.validation.Check
import java.util.Arrays
import java.util.ArrayList
import java.util.List

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class PascalValidator extends AbstractPascalValidator {
		
	private var variables = new HashMap<String, variable_declaration>();
	
	private var functions = <String, function_declaration>newHashMap();
 	
 	def getType(type_identifier lit) {
		if (lit.boolean !== null) {
			return "boolean"
		} else if (lit.integer !== null) {
			return "integer"
		} else {
			return "string"
		}
	}
	
	@Check
	def restart(pascal pascal) {
		variables.clear();
		functions.clear();
	}
	
	@Check
	def checkNotDeclaredVariable(assignment_statement variable) {
		var variable_id = variable.declared_variable.variable_id;
		if (!variables.containsKey(variable_id)) {
			var error_message = String.format("Variável '%s' não foi declarada", variable_id);  			
			error(error_message, null)
		}
	}
	
	@Check
	def checkVariableDeclaration(variable_declaration declared_variables) {
		
		var List<String> new_variables = new ArrayList<String>();
		var names = declared_variables.list_names;
		
		if(names !== null && names.names !== null){
			for(identifier id : names.names){
				new_variables.add(id.id);
			}
		}
		
		for(String name : new_variables) {
			if (!variables.containsKey(name)) {						
				variables.put(name, declared_variables);
			} else {
				var error_message = String.format("Variável '%s' já foi declarada", name);  
				error(error_message, null)
			}
		}
				
	}
		
}
