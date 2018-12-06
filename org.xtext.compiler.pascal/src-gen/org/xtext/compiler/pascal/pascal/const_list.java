/**
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>const list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compiler.pascal.pascal.const_list#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see org.xtext.compiler.pascal.pascal.PascalPackage#getconst_list()
 * @model
 * @generated
 */
public interface const_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compiler.pascal.pascal.constant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getconst_list_Constants()
   * @model containment="true"
   * @generated
   */
  EList<constant> getConstants();

} // const_list
