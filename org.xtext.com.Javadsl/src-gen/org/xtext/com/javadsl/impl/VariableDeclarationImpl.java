/**
 */
package org.xtext.com.javadsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.Type;
import org.xtext.com.javadsl.VariableDeclaration;
import org.xtext.com.javadsl.VariableDeclarator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.VariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.VariableDeclarationImpl#getVariable_declarator <em>Variable declarator</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.VariableDeclarationImpl#getVariable_declarators <em>Variable declarators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationImpl extends MinimalEObjectImpl.Container implements VariableDeclaration
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getVariable_declarator() <em>Variable declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable_declarator()
   * @generated
   * @ordered
   */
  protected VariableDeclarator variable_declarator;

  /**
   * The cached value of the '{@link #getVariable_declarators() <em>Variable declarators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable_declarators()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclarator> variable_declarators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationImpl()
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
    return JavadslPackage.Literals.VARIABLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.VARIABLE_DECLARATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.VARIABLE_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.VARIABLE_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.VARIABLE_DECLARATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclarator getVariable_declarator()
  {
    return variable_declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable_declarator(VariableDeclarator newVariable_declarator, NotificationChain msgs)
  {
    VariableDeclarator oldVariable_declarator = variable_declarator;
    variable_declarator = newVariable_declarator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATOR, oldVariable_declarator, newVariable_declarator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable_declarator(VariableDeclarator newVariable_declarator)
  {
    if (newVariable_declarator != variable_declarator)
    {
      NotificationChain msgs = null;
      if (variable_declarator != null)
        msgs = ((InternalEObject)variable_declarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATOR, null, msgs);
      if (newVariable_declarator != null)
        msgs = ((InternalEObject)newVariable_declarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATOR, null, msgs);
      msgs = basicSetVariable_declarator(newVariable_declarator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATOR, newVariable_declarator, newVariable_declarator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclarator> getVariable_declarators()
  {
    if (variable_declarators == null)
    {
      variable_declarators = new EObjectContainmentEList<VariableDeclarator>(VariableDeclarator.class, this, JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATORS);
    }
    return variable_declarators;
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
      case JavadslPackage.VARIABLE_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATOR:
        return basicSetVariable_declarator(null, msgs);
      case JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATORS:
        return ((InternalEList<?>)getVariable_declarators()).basicRemove(otherEnd, msgs);
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
      case JavadslPackage.VARIABLE_DECLARATION__TYPE:
        return getType();
      case JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATOR:
        return getVariable_declarator();
      case JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATORS:
        return getVariable_declarators();
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
      case JavadslPackage.VARIABLE_DECLARATION__TYPE:
        setType((Type)newValue);
        return;
      case JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATOR:
        setVariable_declarator((VariableDeclarator)newValue);
        return;
      case JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATORS:
        getVariable_declarators().clear();
        getVariable_declarators().addAll((Collection<? extends VariableDeclarator>)newValue);
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
      case JavadslPackage.VARIABLE_DECLARATION__TYPE:
        setType((Type)null);
        return;
      case JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATOR:
        setVariable_declarator((VariableDeclarator)null);
        return;
      case JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATORS:
        getVariable_declarators().clear();
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
      case JavadslPackage.VARIABLE_DECLARATION__TYPE:
        return type != null;
      case JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATOR:
        return variable_declarator != null;
      case JavadslPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATORS:
        return variable_declarators != null && !variable_declarators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VariableDeclarationImpl
