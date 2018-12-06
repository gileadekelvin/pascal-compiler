package org.xtext.compiler.pascal.validation;

import java.util.HashMap;
import java.util.List;
import org.xtext.compiler.pascal.pascal.type;
import org.xtext.compiler.pascal.validation.Function;
import org.xtext.compiler.pascal.validation.Procedure;
import org.xtext.compiler.pascal.validation.Variable;

@SuppressWarnings("all")
public class Structures {
  private static HashMap<String, Variable> variables = null;
  
  private static HashMap<String, Function> functions = null;
  
  private static HashMap<String, Procedure> procedures = null;
  
  private static HashMap<String, List<Integer>> arrays = null;
  
  private static HashMap<String, type> types = null;
  
  public static HashMap<String, Variable> getVarsInstance() {
    if ((Structures.variables == null)) {
      HashMap<String, Variable> _hashMap = new HashMap<String, Variable>();
      Structures.variables = _hashMap;
    }
    return Structures.variables;
  }
  
  public static HashMap<String, Function> getFunsInstance() {
    if ((Structures.functions == null)) {
      HashMap<String, Function> _hashMap = new HashMap<String, Function>();
      Structures.functions = _hashMap;
    }
    return Structures.functions;
  }
  
  public static HashMap<String, Procedure> getProcInstance() {
    if ((Structures.procedures == null)) {
      HashMap<String, Procedure> _hashMap = new HashMap<String, Procedure>();
      Structures.procedures = _hashMap;
    }
    return Structures.procedures;
  }
  
  public static HashMap<String, type> getTypesInstance() {
    if ((Structures.types == null)) {
      HashMap<String, type> _hashMap = new HashMap<String, type>();
      Structures.types = _hashMap;
    }
    return Structures.types;
  }
  
  public static HashMap<String, List<Integer>> getArraysInstance() {
    if ((Structures.arrays == null)) {
      HashMap<String, List<Integer>> _hashMap = new HashMap<String, List<Integer>>();
      Structures.arrays = _hashMap;
    }
    return Structures.arrays;
  }
  
  public static void clear() {
    Structures.getVarsInstance().clear();
    Structures.getFunsInstance().clear();
    Structures.getProcInstance().clear();
    Structures.getTypesInstance().clear();
    Structures.getArraysInstance().clear();
  }
  
  public static boolean containsVar(final String id) {
    return Structures.getVarsInstance().containsKey(id);
  }
  
  public static Variable putVariable(final String id, final Variable variable) {
    return Structures.getVarsInstance().put(id, variable);
  }
  
  public static Variable getVar(final String id) {
    return Structures.getVarsInstance().get(id);
  }
  
  public static boolean containsFunc(final String id) {
    return Structures.getFunsInstance().containsKey(id);
  }
  
  public static Function putFunc(final String id, final String type, final List<Variable> parameters) {
    Function _xblockexpression = null;
    {
      Function function = new Function(id, type, parameters);
      _xblockexpression = Structures.getFunsInstance().put(id, function);
    }
    return _xblockexpression;
  }
  
  public static Function getFunc(final String id) {
    return Structures.getFunsInstance().get(id);
  }
  
  public static boolean containsProc(final String id) {
    return Structures.getProcInstance().containsKey(id);
  }
  
  public static Procedure putProc(final String id, final List<Variable> parameters) {
    Procedure _xblockexpression = null;
    {
      Procedure procedure = new Procedure(id, parameters);
      _xblockexpression = Structures.getProcInstance().put(id, procedure);
    }
    return _xblockexpression;
  }
  
  public static Procedure getProc(final String id) {
    return Structures.getProcInstance().get(id);
  }
  
  public static boolean containsType(final String type) {
    return Structures.getTypesInstance().containsKey(type);
  }
  
  public static type putType(final String name, final type t) {
    return Structures.getTypesInstance().put(name, t);
  }
  
  public static type getType(final String name) {
    return Structures.getTypesInstance().get(name);
  }
  
  public static boolean containsArray(final String variable) {
    return Structures.getArraysInstance().containsKey(variable);
  }
  
  public static List<Integer> putArray(final String variable, final List<Integer> dimensions) {
    return Structures.getArraysInstance().put(variable, dimensions);
  }
  
  public static List<Integer> getDimensions(final String variable) {
    return Structures.getArraysInstance().get(variable);
  }
}
