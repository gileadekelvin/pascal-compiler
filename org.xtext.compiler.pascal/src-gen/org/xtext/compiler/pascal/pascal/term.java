/**
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compiler.pascal.pascal.term#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.term#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.term#getTerm2 <em>Term2</em>}</li>
 * </ul>
 *
 * @see org.xtext.compiler.pascal.pascal.PascalPackage#getterm()
 * @model
 * @generated
 */
public interface term extends EObject
{
  /**
   * Returns the value of the '<em><b>Factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor</em>' containment reference.
   * @see #setFactor(signed_factor)
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getterm_Factor()
   * @model containment="true"
   * @generated
   */
  signed_factor getFactor();

  /**
   * Sets the value of the '{@link org.xtext.compiler.pascal.pascal.term#getFactor <em>Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor</em>' containment reference.
   * @see #getFactor()
   * @generated
   */
  void setFactor(signed_factor value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getterm_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.xtext.compiler.pascal.pascal.term#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Term2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term2</em>' containment reference.
   * @see #setTerm2(term)
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getterm_Term2()
   * @model containment="true"
   * @generated
   */
  term getTerm2();

  /**
   * Sets the value of the '{@link org.xtext.compiler.pascal.pascal.term#getTerm2 <em>Term2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term2</em>' containment reference.
   * @see #getTerm2()
   * @generated
   */
  void setTerm2(term value);

} // term
