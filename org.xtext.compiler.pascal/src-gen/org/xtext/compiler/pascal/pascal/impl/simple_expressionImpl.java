/**
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.compiler.pascal.pascal.PascalPackage;
import org.xtext.compiler.pascal.pascal.simple_expression;
import org.xtext.compiler.pascal.pascal.term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compiler.pascal.pascal.impl.simple_expressionImpl#getTerm_exp <em>Term exp</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.impl.simple_expressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.impl.simple_expressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class simple_expressionImpl extends MinimalEObjectImpl.Container implements simple_expression
{
  /**
   * The cached value of the '{@link #getTerm_exp() <em>Term exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm_exp()
   * @generated
   * @ordered
   */
  protected term term_exp;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected simple_expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_expressionImpl()
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
    return PascalPackage.Literals.SIMPLE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public term getTerm_exp()
  {
    return term_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm_exp(term newTerm_exp, NotificationChain msgs)
  {
    term oldTerm_exp = term_exp;
    term_exp = newTerm_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_EXPRESSION__TERM_EXP, oldTerm_exp, newTerm_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm_exp(term newTerm_exp)
  {
    if (newTerm_exp != term_exp)
    {
      NotificationChain msgs = null;
      if (term_exp != null)
        msgs = ((InternalEObject)term_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_EXPRESSION__TERM_EXP, null, msgs);
      if (newTerm_exp != null)
        msgs = ((InternalEObject)newTerm_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_EXPRESSION__TERM_EXP, null, msgs);
      msgs = basicSetTerm_exp(newTerm_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_EXPRESSION__TERM_EXP, newTerm_exp, newTerm_exp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_EXPRESSION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(simple_expression newExpression, NotificationChain msgs)
  {
    simple_expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_EXPRESSION__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(simple_expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_EXPRESSION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_EXPRESSION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_EXPRESSION__EXPRESSION, newExpression, newExpression));
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
      case PascalPackage.SIMPLE_EXPRESSION__TERM_EXP:
        return basicSetTerm_exp(null, msgs);
      case PascalPackage.SIMPLE_EXPRESSION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case PascalPackage.SIMPLE_EXPRESSION__TERM_EXP:
        return getTerm_exp();
      case PascalPackage.SIMPLE_EXPRESSION__OPERATOR:
        return getOperator();
      case PascalPackage.SIMPLE_EXPRESSION__EXPRESSION:
        return getExpression();
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
      case PascalPackage.SIMPLE_EXPRESSION__TERM_EXP:
        setTerm_exp((term)newValue);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__OPERATOR:
        setOperator((String)newValue);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__EXPRESSION:
        setExpression((simple_expression)newValue);
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
      case PascalPackage.SIMPLE_EXPRESSION__TERM_EXP:
        setTerm_exp((term)null);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case PascalPackage.SIMPLE_EXPRESSION__EXPRESSION:
        setExpression((simple_expression)null);
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
      case PascalPackage.SIMPLE_EXPRESSION__TERM_EXP:
        return term_exp != null;
      case PascalPackage.SIMPLE_EXPRESSION__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case PascalPackage.SIMPLE_EXPRESSION__EXPRESSION:
        return expression != null;
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //simple_expressionImpl
