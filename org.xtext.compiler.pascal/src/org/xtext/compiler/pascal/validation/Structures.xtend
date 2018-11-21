package org.xtext.compiler.pascal.validation

import java.util.HashMap
import java.util.List

class Structures {

	static HashMap<String, Variable> variables = null;
	static HashMap<String, Function> functions = null;
	static HashMap<String, Procedure> procedures = null;

// Constructors

	def static HashMap<String, Variable> getVarsInstance() {

		if (variables === null) {
			variables = new HashMap<String, Variable>();
		}
		return variables;
	}

	def static HashMap<String, Function> getFunsInstance() {

		if (functions === null) {
			functions = new HashMap<String, Function>();
		}
		return functions;
	}
	
	def static HashMap<String, Procedure> getProcInstance() {

		if (procedures === null) {
			procedures = new HashMap<String, Procedure>();
		}
		return procedures;
	}
	
	def static clear() {
		getVarsInstance().clear();
		getFunsInstance().clear();
		getProcInstance().clear();

	}
	
// Variable related methods

	def static boolean containsVar(String id) {
		return getVarsInstance().containsKey(id);
	}

	def static putVariable(String id, Variable variable) {
		getVarsInstance().put(id, variable);
	}

	def static Variable getVar(String id) {
		return getVarsInstance().get(id);
	}

// Functions related methods

	def static boolean containsFunc(String id) {
		return getFunsInstance().containsKey(id);
	}

	def static putFunc(String id, String type, List<Variable> parameters) {
		var function = new Function(id, type,parameters);
		getFunsInstance().put(id, function);
	}

	def static Function getFunc(String id) {
		return getFunsInstance().get(id);
	}
	
// Procedure related methods

	def static boolean containsProc(String id) {
		return getProcInstance().containsKey(id);
	}

	def static putProc(String id, List<Variable> parameters) {
		var procedure = new Procedure(id, parameters);
		getProcInstance().put(id, procedure);
	}

	def static Procedure getProc(String id) {
		return getProcInstance().get(id);
	}


}
