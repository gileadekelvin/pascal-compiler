package org.xtext.compiler.pascal.validation

import org.xtext.compiler.pascal.pascal.variable_declaration;
import java.util.HashMap

class Structures {
	static var variables = new HashMap<String, variable_declaration>();
	
	def static boolean containsKey(String id){
		return variables.containsKey(id);
	}	
	
	def static put(String id, variable_declaration variable){
		variables.put(id, variable);		
	}
	
	def static clear(){
		variables.clear();
	}
	
	def static variable_declaration get(String id){
		return variables.get(id);
	}
	
}