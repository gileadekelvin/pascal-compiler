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
import org.xtext.compiler.pascal.pascal.structured_type;
import org.xtext.compiler.pascal.pascal.unpacked_structured_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>structured type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.compiler.pascal.pascal.impl.structured_typeImpl#getUnpacked <em>Unpacked</em>}</li>
 * </ul>
 *
 * @generated
 */
public class structured_typeImpl extends MinimalEObjectImpl.Container implements structured_type
{
  /**
   * The cached value of the '{@link #getUnpacked() <em>Unpacked</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnpacked()
   * @generated
   * @ordered
   */
  protected unpacked_structured_type unpacked;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected structured_typeImpl()
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
    return PascalPackage.Literals.STRUCTURED_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unpacked_structured_type getUnpacked()
  {
    return unpacked;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnpacked(unpacked_structured_type newUnpacked, NotificationChain msgs)
  {
    unpacked_structured_type oldUnpacked = unpacked;
    unpacked = newUnpacked;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_TYPE__UNPACKED, oldUnpacked, newUnpacked);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnpacked(unpacked_structured_type newUnpacked)
  {
    if (newUnpacked != unpacked)
    {
      NotificationChain msgs = null;
      if (unpacked != null)
        msgs = ((InternalEObject)unpacked).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_TYPE__UNPACKED, null, msgs);
      if (newUnpacked != null)
        msgs = ((InternalEObject)newUnpacked).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_TYPE__UNPACKED, null, msgs);
      msgs = basicSetUnpacked(newUnpacked, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_TYPE__UNPACKED, newUnpacked, newUnpacked));
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED:
        return basicSetUnpacked(null, msgs);
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED:
        return getUnpacked();
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED:
        setUnpacked((unpacked_structured_type)newValue);
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED:
        setUnpacked((unpacked_structured_type)null);
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED:
        return unpacked != null;
    }
    return super.eIsSet(featureID);
  }

} //structured_typeImpl
