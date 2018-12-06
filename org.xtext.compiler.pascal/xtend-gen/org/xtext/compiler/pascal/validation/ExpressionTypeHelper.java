package org.xtext.compiler.pascal.validation;

import org.xtext.compiler.pascal.pascal.constant;
import org.xtext.compiler.pascal.pascal.expression;
import org.xtext.compiler.pascal.pascal.factor;
import org.xtext.compiler.pascal.pascal.function_designator;
import org.xtext.compiler.pascal.pascal.signed_factor;
import org.xtext.compiler.pascal.pascal.simple_expression;
import org.xtext.compiler.pascal.pascal.term;
import org.xtext.compiler.pascal.pascal.type_identifier;
import org.xtext.compiler.pascal.pascal.unsigned_constant;
import org.xtext.compiler.pascal.pascal.unsigned_number;
import org.xtext.compiler.pascal.pascal.variable;
import org.xtext.compiler.pascal.validation.Structures;

@SuppressWarnings("all")
public class ExpressionTypeHelper {
  public static String getType(final type_identifier lit) {
    String _boolean = lit.getBoolean();
    boolean _tripleNotEquals = (_boolean != null);
    if (_tripleNotEquals) {
      return "boolean";
    } else {
      String _integer = lit.getInteger();
      boolean _tripleNotEquals_1 = (_integer != null);
      if (_tripleNotEquals_1) {
        return "integer";
      } else {
        String _string = lit.getString();
        boolean _tripleNotEquals_2 = (_string != null);
        if (_tripleNotEquals_2) {
          return "string";
        } else {
          return lit.getId();
        }
      }
    }
  }
  
  public static String getTypeExpression(final expression inst_expression) {
    return ExpressionTypeHelper.getTypeSimpleExpression(inst_expression.getSimple());
  }
  
  public static String getTypeUnsConstant(final unsigned_constant inst_constant) {
    unsigned_number _number = inst_constant.getNumber();
    boolean _tripleNotEquals = (_number != null);
    if (_tripleNotEquals) {
      return "integer";
    } else {
      String _string = inst_constant.getString();
      boolean _tripleNotEquals_1 = (_string != null);
      if (_tripleNotEquals_1) {
        return "string";
      } else {
        return "nil";
      }
    }
  }
  
  public static String getTypeFactor(final factor inst_factor) {
    String _bool_factor = inst_factor.getBool_factor();
    boolean _tripleNotEquals = (_bool_factor != null);
    if (_tripleNotEquals) {
      return "boolean";
    } else {
      unsigned_constant _constant = inst_factor.getConstant();
      boolean _tripleNotEquals_1 = (_constant != null);
      if (_tripleNotEquals_1) {
        return ExpressionTypeHelper.getTypeUnsConstant(inst_factor.getConstant());
      } else {
        factor _not_factor = inst_factor.getNot_factor();
        boolean _tripleNotEquals_2 = (_not_factor != null);
        if (_tripleNotEquals_2) {
          return "boolean";
        } else {
          variable _variable = inst_factor.getVariable();
          boolean _tripleNotEquals_3 = (_variable != null);
          if (_tripleNotEquals_3) {
            String id_type = Structures.getVar(inst_factor.getVariable().getVariable_id()).getType();
            return id_type;
          } else {
            expression _expression = inst_factor.getExpression();
            boolean _tripleNotEquals_4 = (_expression != null);
            if (_tripleNotEquals_4) {
              String expression_type = ExpressionTypeHelper.getTypeExpression(inst_factor.getExpression());
              return expression_type;
            } else {
              function_designator _function = inst_factor.getFunction();
              boolean _tripleNotEquals_5 = (_function != null);
              if (_tripleNotEquals_5) {
                String function_type = Structures.getVar(inst_factor.getFunction().getName_function()).getType();
                return function_type;
              }
            }
          }
        }
      }
    }
    return null;
  }
  
  public static String getTypeSignedFactor(final signed_factor inst_signed_factor) {
    return ExpressionTypeHelper.getTypeFactor(inst_signed_factor.getFactor());
  }
  
  public static String getTypeTerm(final term inst_term) {
    String operator = inst_term.getOperator();
    if ((operator == null)) {
      return ExpressionTypeHelper.getTypeSignedFactor(inst_term.getFactor());
    } else {
      String factor_type = ExpressionTypeHelper.getTypeSignedFactor(inst_term.getFactor());
      String term2_type = ExpressionTypeHelper.getTypeTerm(inst_term.getTerm2());
      boolean _equalsIgnoreCase = operator.equalsIgnoreCase("AND");
      if (_equalsIgnoreCase) {
        if (((!factor_type.equals("boolean")) || (!term2_type.equals("boolean")))) {
          return "erro_tipo";
        } else {
          return "boolean";
        }
      } else {
        if (((!factor_type.equals("integer")) || (!term2_type.equals("integer")))) {
          return "erro_tipo";
        } else {
          return "integer";
        }
      }
    }
  }
  
  public static String getTypeSimpleExpression(final simple_expression inst_simple_exp) {
    String operator = inst_simple_exp.getOperator();
    if ((operator == null)) {
      return ExpressionTypeHelper.getTypeTerm(inst_simple_exp.getTerm_exp());
    } else {
      String term1 = ExpressionTypeHelper.getTypeTerm(inst_simple_exp.getTerm_exp());
      String simple_exp2 = ExpressionTypeHelper.getTypeSimpleExpression(inst_simple_exp.getExpression());
      boolean _equalsIgnoreCase = operator.equalsIgnoreCase("OR");
      if (_equalsIgnoreCase) {
        if (((!term1.equals("boolean")) || (!simple_exp2.equals("boolean")))) {
          return "erro_tipo";
        } else {
          return "boolean";
        }
      } else {
        boolean _equals = operator.equals("+");
        if (_equals) {
          if ((term1.equals("integer") && simple_exp2.equals("integer"))) {
            return "integer";
          } else {
            return "erro_tipo";
          }
        } else {
          if ((term1.equals("integer") && simple_exp2.equals("integer"))) {
            return "integer";
          } else {
            return "erro_tipo";
          }
        }
      }
    }
  }
  
  public static String getTypeConstant(final constant inst_constant) {
    unsigned_number _uns_number = inst_constant.getUns_number();
    boolean _tripleNotEquals = (_uns_number != null);
    if (_tripleNotEquals) {
      return "integer";
    } else {
      unsigned_number _sig_number = inst_constant.getSig_number();
      boolean _tripleNotEquals_1 = (_sig_number != null);
      if (_tripleNotEquals_1) {
        return "integer";
      } else {
        String _string = inst_constant.getString();
        boolean _tripleNotEquals_2 = (_string != null);
        if (_tripleNotEquals_2) {
          return "string";
        } else {
          String _booltype = inst_constant.getBooltype();
          boolean _tripleNotEquals_3 = (_booltype != null);
          if (_tripleNotEquals_3) {
            return "boolean";
          } else {
            unsigned_number _uns_number_1 = inst_constant.getUns_number();
            boolean _tripleNotEquals_4 = (_uns_number_1 != null);
            if (_tripleNotEquals_4) {
              String variable_id = inst_constant.getName_id();
              boolean _containsVar = Structures.containsVar(variable_id);
              boolean _not = (!_containsVar);
              if (_not) {
                return "erro_tipo";
              } else {
                String id_type = Structures.getVar(variable_id).getType();
                return id_type;
              }
            } else {
              String _sig_name_id = inst_constant.getSig_name_id();
              boolean _tripleNotEquals_5 = (_sig_name_id != null);
              if (_tripleNotEquals_5) {
                String variable_id_1 = inst_constant.getSig_name_id();
                boolean _containsVar_1 = Structures.containsVar(variable_id_1);
                boolean _not_1 = (!_containsVar_1);
                if (_not_1) {
                  return "erro_tipo";
                } else {
                  String id_type_1 = Structures.getVar(variable_id_1).getType();
                  boolean _equals = id_type_1.equals("integer");
                  boolean _not_2 = (!_equals);
                  if (_not_2) {
                    return "erro_tipo";
                  } else {
                    return "integer";
                  }
                }
              }
            }
          }
        }
      }
    }
    return "erro_tipo";
  }
}
