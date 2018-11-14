package org.xtext.compiler.pascal.validation

import java.util.HashMap

class Structures {
	static var variables = new HashMap<String, Variable>();
	
	def static boolean containsKey(String id){
		return variables.containsKey(id);
	}	
	
	def static put(String id, Variable variable){
		variables.put(id, variable);		
	}
	
	def static clear(){
		variables.clear();
	}
	
	def static Variable get(String id){
		return variables.get(id);
	}
	
}