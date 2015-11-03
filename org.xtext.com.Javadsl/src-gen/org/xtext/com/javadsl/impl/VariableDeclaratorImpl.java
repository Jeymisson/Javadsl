/**
 */
package org.xtext.com.javadsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.VariableDeclarator;
import org.xtext.com.javadsl.VariableInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.VariableDeclaratorImpl#getVariable_initializer <em>Variable initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclaratorImpl extends MinimalEObjectImpl.Container implements VariableDeclarator
{
  /**
   * The cached value of the '{@link #getVariable_initializer() <em>Variable initializer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable_initializer()
   * @generated
   * @ordered
   */
  protected VariableInitializer variable_initializer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclaratorImpl()
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
    return JavadslPackage.Literals.VARIABLE_DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableInitializer getVariable_initializer()
  {
    return variable_initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable_initializer(VariableInitializer newVariable_initializer, NotificationChain msgs)
  {
    VariableInitializer oldVariable_initializer = variable_initializer;
    variable_initializer = newVariable_initializer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.VARIABLE_DECLARATOR__VARIABLE_INITIALIZER, oldVariable_initializer, newVariable_initializer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable_initializer(VariableInitializer newVariable_initializer)
  {
    if (newVariable_initializer != variable_initializer)
    {
      NotificationChain msgs = null;
      if (variable_initializer != null)
        msgs = ((InternalEObject)variable_initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.VARIABLE_DECLARATOR__VARIABLE_INITIALIZER, null, msgs);
      if (newVariable_initializer != null)
        msgs = ((InternalEObject)newVariable_initializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.VARIABLE_DECLARATOR__VARIABLE_INITIALIZER, null, msgs);
      msgs = basicSetVariable_initializer(newVariable_initializer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.VARIABLE_DECLARATOR__VARIABLE_INITIALIZER, newVariable_initializer, newVariable_initializer));
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
      case JavadslPackage.VARIABLE_DECLARATOR__VARIABLE_INITIALIZER:
        return basicSetVariable_initializer(null, msgs);
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
      case JavadslPackage.VARIABLE_DECLARATOR__VARIABLE_INITIALIZER:
        return getVariable_initializer();
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
      case JavadslPackage.VARIABLE_DECLARATOR__VARIABLE_INITIALIZER:
        setVariable_initializer((VariableInitializer)newValue);
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
      case JavadslPackage.VARIABLE_DECLARATOR__VARIABLE_INITIALIZER:
        setVariable_initializer((VariableInitializer)null);
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
      case JavadslPackage.VARIABLE_DECLARATOR__VARIABLE_INITIALIZER:
        return variable_initializer != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableDeclaratorImpl
