package org.xtext.compiler.pascal.validation;

import java.util.ArrayList;
import java.util.List;

public class Function {

	private String name;
	private String return_type;
	private List<Variable> parameters;

	public Function(String name, String return_type, List<Variable> parameters) {
		this.name = name;
		this.return_type = return_type;
		this.parameters = parameters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReturn_type() {
		return return_type;
	}

	public void setReturn_type(String return_type) {
		this.return_type = return_type;
	}

	public List<Variable> getParameters() {
		return parameters;
	}

	public void setParameters(List<Variable> parameters) {
		this.parameters = parameters;
	}

	@Override
	public String toString() {
		return "Function [name=" + name + ", return_type=" + return_type + ", parameters=" + parameters + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parameters == null) ? 0 : parameters.hashCode());
		result = prime * result + ((return_type == null) ? 0 : return_type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Function other = (Function) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parameters == null) {
			if (other.parameters != null)
				return false;
		} else if (!parameters.equals(other.parameters))
			return false;
		if (return_type == null) {
			if (other.return_type != null)
				return false;
		} else if (!return_type.equals(other.return_type))
			return false;
		return true;
	}
}
