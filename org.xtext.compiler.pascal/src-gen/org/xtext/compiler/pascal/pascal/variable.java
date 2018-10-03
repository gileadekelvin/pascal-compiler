/**
 * generated by Xtext 2.14.0.RC1
 */
package org.xtext.compiler.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compiler.pascal.pascal.variable#getNames <em>Names</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.variable#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.compiler.pascal.pascal.PascalPackage#getvariable()
 * @model
 * @generated
 */
public interface variable extends EObject
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
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getvariable_Names()
   * @model unique="false"
   * @generated
   */
  EList<String> getNames();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compiler.pascal.pascal.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getvariable_Expression()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExpression();

} // variable
