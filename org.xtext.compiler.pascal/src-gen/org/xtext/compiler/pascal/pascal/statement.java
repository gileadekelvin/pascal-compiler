/**
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compiler.pascal.pascal.statement#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.statement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.compiler.pascal.pascal.PascalPackage#getstatement()
 * @model
 * @generated
 */
public interface statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(label)
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getstatement_Label()
   * @model containment="true"
   * @generated
   */
  label getLabel();

  /**
   * Sets the value of the '{@link org.xtext.compiler.pascal.pascal.statement#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(label value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compiler.pascal.pascal.unlabelled_statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference list.
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getstatement_Statement()
   * @model containment="true"
   * @generated
   */
  EList<unlabelled_statement> getStatement();

} // statement
