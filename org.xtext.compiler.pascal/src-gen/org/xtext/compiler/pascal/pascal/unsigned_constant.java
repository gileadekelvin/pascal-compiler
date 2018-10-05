/**
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unsigned constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compiler.pascal.pascal.unsigned_constant#getNumber <em>Number</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.unsigned_constant#getChar <em>Char</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.unsigned_constant#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.unsigned_constant#getNil <em>Nil</em>}</li>
 * </ul>
 *
 * @see org.xtext.compiler.pascal.pascal.PascalPackage#getunsigned_constant()
 * @model
 * @generated
 */
public interface unsigned_constant extends EObject
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compiler.pascal.pascal.unsigned_number}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' containment reference list.
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getunsigned_constant_Number()
   * @model containment="true"
   * @generated
   */
  EList<unsigned_number> getNumber();

  /**
   * Returns the value of the '<em><b>Char</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.compiler.pascal.pascal.constant_chr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Char</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Char</em>' containment reference list.
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getunsigned_constant_Char()
   * @model containment="true"
   * @generated
   */
  EList<constant_chr> getChar();

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute list.
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getunsigned_constant_String()
   * @model unique="false"
   * @generated
   */
  EList<String> getString();

  /**
   * Returns the value of the '<em><b>Nil</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nil</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nil</em>' attribute list.
   * @see org.xtext.compiler.pascal.pascal.PascalPackage#getunsigned_constant_Nil()
   * @model unique="false"
   * @generated
   */
  EList<String> getNil();

} // unsigned_constant
