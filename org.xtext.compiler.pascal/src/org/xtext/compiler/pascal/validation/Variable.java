package org.xtext.compiler.pascal.validation;

import java.util.List;

public class Variable {

	private String name;
	private String type;

	Variable(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getList_names() {
		return name;
	}

	public void setList_names(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Variable [name=" + name + ", type=" + type + "]";
	}

}
