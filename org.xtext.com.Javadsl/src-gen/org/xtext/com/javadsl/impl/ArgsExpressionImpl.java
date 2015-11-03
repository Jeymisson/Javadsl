/**
 */
package org.xtext.com.javadsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.com.javadsl.Arglist;
import org.xtext.com.javadsl.ArgsExpression;
import org.xtext.com.javadsl.JavadslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Args Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.ArgsExpressionImpl#getArg_list <em>Arg list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgsExpressionImpl extends TestingExpressionImpl implements ArgsExpression
{
  /**
   * The cached value of the '{@link #getArg_list() <em>Arg list</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg_list()
   * @generated
   * @ordered
   */
  protected EList<Arglist> arg_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgsExpressionImpl()
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
    return JavadslPackage.Literals.ARGS_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Arglist> getArg_list()
  {
    if (arg_list == null)
    {
      arg_list = new EObjectContainmentEList<Arglist>(Arglist.class, this, JavadslPackage.ARGS_EXPRESSION__ARG_LIST);
    }
    return arg_list;
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
      case JavadslPackage.ARGS_EXPRESSION__ARG_LIST:
        return ((InternalEList<?>)getArg_list()).basicRemove(otherEnd, msgs);
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
      case JavadslPackage.ARGS_EXPRESSION__ARG_LIST:
        return getArg_list();
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
      case JavadslPackage.ARGS_EXPRESSION__ARG_LIST:
        getArg_list().clear();
        getArg_list().addAll((Collection<? extends Arglist>)newValue);
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
      case JavadslPackage.ARGS_EXPRESSION__ARG_LIST:
        getArg_list().clear();
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
      case JavadslPackage.ARGS_EXPRESSION__ARG_LIST:
        return arg_list != null && !arg_list.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArgsExpressionImpl
