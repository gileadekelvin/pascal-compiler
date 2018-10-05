/**
 * generated by Xtext 2.14.0.RC1
 */
package org.xtext.compiler.pascal.pascal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>procedure or function declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compiler.pascal.pascal.procedure_or_function_declaration#getNames <em>Names</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.procedure_or_function_declaration#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.xtext.compiler.pascal.pascal.PascalPackage#getprocedure_or_function_declaration()
 * @model
 * @generated
 */
public interface procedure_or_function_declaration extends procedure_and_function_declaration_part
{
  /**
   * Returns the value of the '<em><b>Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute list.
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getprocedure_or_function_declaration_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(block)
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getprocedure_or_function_declaration_Block()
   * @model containment="true"
   * @generated
   */
  block getBlock();

  /**
   * Sets the value of the '{@link org.xtext.compiler.pascal.pascal.procedure_or_function_declaration#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(block value);

} // procedure_or_function_declaration
