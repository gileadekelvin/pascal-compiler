package org.xtext.compiler.pascal.validation

import java.util.HashMap

class Structures {

	private static HashMap<String, Variable> variables = null;

	def public static HashMap<String, Variable> getInstance() {

		if (variables == null) {
			variables = new HashMap<String, Variable>();
		}
		return variables;
	}

	def static boolean containsKey(String id) {
		return getInstance().containsKey(id);
	}

	def static put(String id, Variable variable) {
		getInstance().put(id, variable);
	}

	def static clear() {
		getInstance().clear();
	}

	def static Variable get(String id) {
		return getInstance().get(id);
	}

}
