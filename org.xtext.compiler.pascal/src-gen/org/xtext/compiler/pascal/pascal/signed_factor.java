/**
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>signed factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compiler.pascal.pascal.signed_factor#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.signed_factor#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see org.xtext.compiler.pascal.pascal.PascalPackage#getsigned_factor()
 * @model
 * @generated
 */
public interface signed_factor extends EObject
{
  /**
   * Returns the value of the '<em><b>Signal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal</em>' attribute.
   * @see #setSignal(String)
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getsigned_factor_Signal()
   * @model
   * @generated
   */
  String getSignal();

  /**
   * Sets the value of the '{@link org.xtext.compiler.pascal.pascal.signed_factor#getSignal <em>Signal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' attribute.
   * @see #getSignal()
   * @generated
   */
  void setSignal(String value);

  /**
   * Returns the value of the '<em><b>Factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor</em>' containment reference.
   * @see #setFactor(factor)
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getsigned_factor_Factor()
   * @model containment="true"
   * @generated
   */
  factor getFactor();

  /**
   * Sets the value of the '{@link org.xtext.compiler.pascal.pascal.signed_factor#getFactor <em>Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor</em>' containment reference.
   * @see #getFactor()
   * @generated
   */
  void setFactor(factor value);

} // signed_factor
