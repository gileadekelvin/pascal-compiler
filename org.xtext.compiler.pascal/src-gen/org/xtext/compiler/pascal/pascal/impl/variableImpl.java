/**
 * generated by Xtext 2.15.0
 */
package org.xtext.compiler.pascal.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.compiler.pascal.pascal.PascalPackage;
import org.xtext.compiler.pascal.pascal.expression;
import org.xtext.compiler.pascal.pascal.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compiler.pascal.pascal.impl.variableImpl#getVariable_id <em>Variable id</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.impl.variableImpl#getIndice <em>Indice</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.impl.variableImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.compiler.pascal.pascal.impl.variableImpl#getNames_exp <em>Names exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class variableImpl extends MinimalEObjectImpl.Container implements variable
{
  /**
   * The default value of the '{@link #getVariable_id() <em>Variable id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable_id()
   * @generated
   * @ordered
   */
  protected static final String VARIABLE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVariable_id() <em>Variable id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable_id()
   * @generated
   * @ordered
   */
  protected String variable_id = VARIABLE_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getIndice() <em>Indice</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndice()
   * @generated
   * @ordered
   */
  protected EList<expression> indice;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EList<expression> expression;

  /**
   * The cached value of the '{@link #getNames_exp() <em>Names exp</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNames_exp()
   * @generated
   * @ordered
   */
  protected EList<String> names_exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variableImpl()
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
    return PascalPackage.Literals.VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVariable_id()
  {
    return variable_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable_id(String newVariable_id)
  {
    String oldVariable_id = variable_id;
    variable_id = newVariable_id;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIABLE__VARIABLE_ID, oldVariable_id, variable_id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expression> getIndice()
  {
    if (indice == null)
    {
      indice = new EObjectContainmentEList<expression>(expression.class, this, PascalPackage.VARIABLE__INDICE);
    }
    return indice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expression> getExpression()
  {
    if (expression == null)
    {
      expression = new EObjectContainmentEList<expression>(expression.class, this, PascalPackage.VARIABLE__EXPRESSION);
    }
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNames_exp()
  {
    if (names_exp == null)
    {
      names_exp = new EDataTypeEList<String>(String.class, this, PascalPackage.VARIABLE__NAMES_EXP);
    }
    return names_exp;
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
      case PascalPackage.VARIABLE__INDICE:
        return ((InternalEList<?>)getIndice()).basicRemove(otherEnd, msgs);
      case PascalPackage.VARIABLE__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.VARIABLE__VARIABLE_ID:
        return getVariable_id();
      case PascalPackage.VARIABLE__INDICE:
        return getIndice();
      case PascalPackage.VARIABLE__EXPRESSION:
        return getExpression();
      case PascalPackage.VARIABLE__NAMES_EXP:
        return getNames_exp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.VARIABLE__VARIABLE_ID:
        setVariable_id((String)newValue);
        return;
      case PascalPackage.VARIABLE__INDICE:
        getIndice().clear();
        getIndice().addAll((Collection<? extends expression>)newValue);
        return;
      case PascalPackage.VARIABLE__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends expression>)newValue);
        return;
      case PascalPackage.VARIABLE__NAMES_EXP:
        getNames_exp().clear();
        getNames_exp().addAll((Collection<? extends String>)newValue);
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
      case PascalPackage.VARIABLE__VARIABLE_ID:
        setVariable_id(VARIABLE_ID_EDEFAULT);
        return;
      case PascalPackage.VARIABLE__INDICE:
        getIndice().clear();
        return;
      case PascalPackage.VARIABLE__EXPRESSION:
        getExpression().clear();
        return;
      case PascalPackage.VARIABLE__NAMES_EXP:
        getNames_exp().clear();
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
      case PascalPackage.VARIABLE__VARIABLE_ID:
        return VARIABLE_ID_EDEFAULT == null ? variable_id != null : !VARIABLE_ID_EDEFAULT.equals(variable_id);
      case PascalPackage.VARIABLE__INDICE:
        return indice != null && !indice.isEmpty();
      case PascalPackage.VARIABLE__EXPRESSION:
        return expression != null && !expression.isEmpty();
      case PascalPackage.VARIABLE__NAMES_EXP:
        return names_exp != null && !names_exp.isEmpty();
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
    result.append(" (variable_id: ");
    result.append(variable_id);
    result.append(", names_exp: ");
    result.append(names_exp);
    result.append(')');
    return result.toString();
  }

} //variableImpl
