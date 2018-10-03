/**
 * generated by Xtext 2.14.0.RC1
 */
package org.xtext.compiler.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.compiler.pascal.pascal.PascalPackage;
import org.xtext.compiler.pascal.pascal.simple_statement;
import org.xtext.compiler.pascal.pascal.unlabelled_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unlabelled statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compiler.pascal.pascal.impl.unlabelled_statementImpl#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.impl.unlabelled_statementImpl#getStructured <em>Structured</em>}</li>
 * </ul>
 *
 * @generated
 */
public class unlabelled_statementImpl extends MinimalEObjectImpl.Container implements unlabelled_statement
{
  /**
   * The cached value of the '{@link #getSimple() <em>Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimple()
   * @generated
   * @ordered
   */
  protected simple_statement simple;

  /**
   * The default value of the '{@link #getStructured() <em>Structured</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructured()
   * @generated
   * @ordered
   */
  protected static final String STRUCTURED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStructured() <em>Structured</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructured()
   * @generated
   * @ordered
   */
  protected String structured = STRUCTURED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unlabelled_statementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.UNLABELLED_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_statement getSimple()
  {
    return simple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimple(simple_statement newSimple, NotificationChain msgs)
  {
    simple_statement oldSimple = simple;
    simple = newSimple;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNLABELLED_STATEMENT__SIMPLE, oldSimple, newSimple);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimple(simple_statement newSimple)
  {
    if (newSimple != simple)
    {
      NotificationChain msgs = null;
      if (simple != null)
        msgs = ((InternalEObject)simple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNLABELLED_STATEMENT__SIMPLE, null, msgs);
      if (newSimple != null)
        msgs = ((InternalEObject)newSimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNLABELLED_STATEMENT__SIMPLE, null, msgs);
      msgs = basicSetSimple(newSimple, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNLABELLED_STATEMENT__SIMPLE, newSimple, newSimple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStructured()
  {
    return structured;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructured(String newStructured)
  {
    String oldStructured = structured;
    structured = newStructured;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNLABELLED_STATEMENT__STRUCTURED, oldStructured, structured));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.UNLABELLED_STATEMENT__SIMPLE:
        return basicSetSimple(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.UNLABELLED_STATEMENT__SIMPLE:
        return getSimple();
      case PascalPackage.UNLABELLED_STATEMENT__STRUCTURED:
        return getStructured();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.UNLABELLED_STATEMENT__SIMPLE:
        setSimple((simple_statement)newValue);
        return;
      case PascalPackage.UNLABELLED_STATEMENT__STRUCTURED:
        setStructured((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.UNLABELLED_STATEMENT__SIMPLE:
        setSimple((simple_statement)null);
        return;
      case PascalPackage.UNLABELLED_STATEMENT__STRUCTURED:
        setStructured(STRUCTURED_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.UNLABELLED_STATEMENT__SIMPLE:
        return simple != null;
      case PascalPackage.UNLABELLED_STATEMENT__STRUCTURED:
        return STRUCTURED_EDEFAULT == null ? structured != null : !STRUCTURED_EDEFAULT.equals(structured);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (structured: ");
    result.append(structured);
    result.append(')');
    return result.toString();
  }

} //unlabelled_statementImpl
