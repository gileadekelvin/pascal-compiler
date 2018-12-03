package org.xtext.compiler.pascal.generator;

public class AddressVariable {
	
	public static final String NO_SUBROUTINE = "main";
	
	private String name;
	private String subRoutine;
	
	public AddressVariable(	String name, String subRoutine) {
		this.name = name;
		this.subRoutine = subRoutine;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubRoutine() {
		return subRoutine;
	}
	public void setSubRoutine(String subRoutine) {
		this.subRoutine = subRoutine;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((subRoutine == null) ? 0 : subRoutine.hashCode());
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
		AddressVariable other = (AddressVariable) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subRoutine == null) {
			if (other.subRoutine != null)
				return false;
		} else if (!subRoutine.equals(other.subRoutine))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Variable[name=" + name + ", subRoutine=" + subRoutine + "]";
	}

}
