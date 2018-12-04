package org.xtext.compiler.pascal.validation

import org.xtext.compiler.pascal.pascal.type;
import java.util.HashMap
import java.util.List
import java.util.Set
import java.util.HashSet

class Structures {

	static HashMap<String, Variable> variables = null;
	static HashMap<String, Function> functions = null;
	static HashMap<String, Procedure> procedures = null;
	static HashMap<String,type> types = null;

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

	def static HashMap<String,type> getTypesInstance() {
		if (types === null) {
			types = new HashMap<String,type>();
		}
		return types;
	}

	def static clear() {
		getVarsInstance().clear();
		getFunsInstance().clear();
		getProcInstance().clear();
		getTypesInstance().clear();
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
		var function = new Function(id, type, parameters);
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

// Type related methods
	def static boolean containsType(String type) {
		return getTypesInstance().containsKey(type);
	}

	def static putType(String name, type t) {
		getTypesInstance().put(name,t);
	}
	
	def static getType(String name) {
		return getTypesInstance().get(name);
	}
	

}
