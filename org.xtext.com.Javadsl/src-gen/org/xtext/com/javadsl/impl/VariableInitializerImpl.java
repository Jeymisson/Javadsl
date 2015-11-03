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

import org.xtext.com.javadsl.Expression;
import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.VariableInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.VariableInitializerImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.VariableInitializerImpl#getVariable_initializer <em>Variable initializer</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.VariableInitializerImpl#getVariable_initializers <em>Variable initializers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableInitializerImpl extends MinimalEObjectImpl.Container implements VariableInitializer
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

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
   * The cached value of the '{@link #getVariable_initializers() <em>Variable initializers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable_initializers()
   * @generated
   * @ordered
   */
  protected EList<VariableInitializer> variable_initializers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableInitializerImpl()
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
    return JavadslPackage.Literals.VARIABLE_INITIALIZER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.VARIABLE_INITIALIZER__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.VARIABLE_INITIALIZER__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.VARIABLE_INITIALIZER__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.VARIABLE_INITIALIZER__EXPR, newExpr, newExpr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER, oldVariable_initializer, newVariable_initializer);
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
        msgs = ((InternalEObject)variable_initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER, null, msgs);
      if (newVariable_initializer != null)
        msgs = ((InternalEObject)newVariable_initializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER, null, msgs);
      msgs = basicSetVariable_initializer(newVariable_initializer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER, newVariable_initializer, newVariable_initializer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableInitializer> getVariable_initializers()
  {
    if (variable_initializers == null)
    {
      variable_initializers = new EObjectContainmentEList<VariableInitializer>(VariableInitializer.class, this, JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZERS);
    }
    return variable_initializers;
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
      case JavadslPackage.VARIABLE_INITIALIZER__EXPR:
        return basicSetExpr(null, msgs);
      case JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER:
        return basicSetVariable_initializer(null, msgs);
      case JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZERS:
        return ((InternalEList<?>)getVariable_initializers()).basicRemove(otherEnd, msgs);
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
      case JavadslPackage.VARIABLE_INITIALIZER__EXPR:
        return getExpr();
      case JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER:
        return getVariable_initializer();
      case JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZERS:
        return getVariable_initializers();
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
      case JavadslPackage.VARIABLE_INITIALIZER__EXPR:
        setExpr((Expression)newValue);
        return;
      case JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER:
        setVariable_initializer((VariableInitializer)newValue);
        return;
      case JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZERS:
        getVariable_initializers().clear();
        getVariable_initializers().addAll((Collection<? extends VariableInitializer>)newValue);
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
      case JavadslPackage.VARIABLE_INITIALIZER__EXPR:
        setExpr((Expression)null);
        return;
      case JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER:
        setVariable_initializer((VariableInitializer)null);
        return;
      case JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZERS:
        getVariable_initializers().clear();
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
      case JavadslPackage.VARIABLE_INITIALIZER__EXPR:
        return expr != null;
      case JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZER:
        return variable_initializer != null;
      case JavadslPackage.VARIABLE_INITIALIZER__VARIABLE_INITIALIZERS:
        return variable_initializers != null && !variable_initializers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VariableInitializerImpl
