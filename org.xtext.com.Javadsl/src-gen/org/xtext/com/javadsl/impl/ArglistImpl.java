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

import org.xtext.com.javadsl.Arglist;
import org.xtext.com.javadsl.CastingExpression;
import org.xtext.com.javadsl.JavadslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arglist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.ArglistImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.ArglistImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArglistImpl extends MinimalEObjectImpl.Container implements Arglist
{
  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected CastingExpression arg;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<CastingExpression> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArglistImpl()
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
    return JavadslPackage.Literals.ARGLIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastingExpression getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg(CastingExpression newArg, NotificationChain msgs)
  {
    CastingExpression oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.ARGLIST__ARG, oldArg, newArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(CastingExpression newArg)
  {
    if (newArg != arg)
    {
      NotificationChain msgs = null;
      if (arg != null)
        msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.ARGLIST__ARG, null, msgs);
      if (newArg != null)
        msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.ARGLIST__ARG, null, msgs);
      msgs = basicSetArg(newArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.ARGLIST__ARG, newArg, newArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CastingExpression> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<CastingExpression>(CastingExpression.class, this, JavadslPackage.ARGLIST__ARGS);
    }
    return args;
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
      case JavadslPackage.ARGLIST__ARG:
        return basicSetArg(null, msgs);
      case JavadslPackage.ARGLIST__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
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
      case JavadslPackage.ARGLIST__ARG:
        return getArg();
      case JavadslPackage.ARGLIST__ARGS:
        return getArgs();
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
      case JavadslPackage.ARGLIST__ARG:
        setArg((CastingExpression)newValue);
        return;
      case JavadslPackage.ARGLIST__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends CastingExpression>)newValue);
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
      case JavadslPackage.ARGLIST__ARG:
        setArg((CastingExpression)null);
        return;
      case JavadslPackage.ARGLIST__ARGS:
        getArgs().clear();
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
      case JavadslPackage.ARGLIST__ARG:
        return arg != null;
      case JavadslPackage.ARGLIST__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArglistImpl
