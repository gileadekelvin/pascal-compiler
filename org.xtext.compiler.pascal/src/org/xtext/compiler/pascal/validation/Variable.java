package org.xtext.compiler.pascal.validation;

import java.util.List;

public class Variable {
	
	private List<String> list_names;
	private String type;
	
	Variable(List<String> list_names, String type) {
		this.list_names = list_names;
		this.type = type;
	}
	
	public List<String> getList_names() {
		return list_names;
	}
	public void setList_names(List<String> list_names) {
		this.list_names = list_names;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		String text = "Variable [list_names=[";
		
		for(int i = 0; i < list_names.size(); i++) {
			if (i == list_names.size() -1) {
				text += list_names.get(i) + "]";
			}
			else {
				text += list_names.get(i) + ",";				
			}
		}
		text = text + ", type=" + type + "]";
		return text ;
	}
	
	

}
