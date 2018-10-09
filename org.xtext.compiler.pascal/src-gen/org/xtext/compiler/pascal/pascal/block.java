/**
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compiler.pascal.pascal.block#getConstantpart <em>Constantpart</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.block#getVariablepart <em>Variablepart</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.block#getProcedure_function_part <em>Procedure function part</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.block#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.compiler.pascal.pascal.PascalPackage#getblock()
 * @model
 * @generated
 */
public interface block extends EObject
{
  /**
   * Returns the value of the '<em><b>Constantpart</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compiler.pascal.pascal.constant_definition_part}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constantpart</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constantpart</em>' containment reference list.
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getblock_Constantpart()
   * @model containment="true"
   * @generated
   */
  EList<constant_definition_part> getConstantpart();

  /**
   * Returns the value of the '<em><b>Variablepart</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compiler.pascal.pascal.variable_declaration_part}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variablepart</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variablepart</em>' containment reference list.
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getblock_Variablepart()
   * @model containment="true"
   * @generated
   */
  EList<variable_declaration_part> getVariablepart();

  /**
   * Returns the value of the '<em><b>Procedure function part</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compiler.pascal.pascal.procedure_and_function_declaration_part}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure function part</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure function part</em>' containment reference list.
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getblock_Procedure_function_part()
   * @model containment="true"
   * @generated
   */
  EList<procedure_and_function_declaration_part> getProcedure_function_part();

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(compound_statement)
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getblock_Statement()
   * @model containment="true"
   * @generated
   */
  compound_statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.compiler.pascal.pascal.block#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(compound_statement value);

} // block
