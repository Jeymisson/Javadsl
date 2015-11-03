/**
 */
package org.xtext.com.javadsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.com.javadsl.ConstructorDeclaration;
import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.StatementBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.ConstructorDeclarationImpl#getStatement_block <em>Statement block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorDeclarationImpl extends MinimalEObjectImpl.Container implements ConstructorDeclaration
{
  /**
   * The cached value of the '{@link #getStatement_block() <em>Statement block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement_block()
   * @generated
   * @ordered
   */
  protected StatementBlock statement_block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstructorDeclarationImpl()
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
    return JavadslPackage.Literals.CONSTRUCTOR_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBlock getStatement_block()
  {
    return statement_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement_block(StatementBlock newStatement_block, NotificationChain msgs)
  {
    StatementBlock oldStatement_block = statement_block;
    statement_block = newStatement_block;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK, oldStatement_block, newStatement_block);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement_block(StatementBlock newStatement_block)
  {
    if (newStatement_block != statement_block)
    {
      NotificationChain msgs = null;
      if (statement_block != null)
        msgs = ((InternalEObject)statement_block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK, null, msgs);
      if (newStatement_block != null)
        msgs = ((InternalEObject)newStatement_block).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK, null, msgs);
      msgs = basicSetStatement_block(newStatement_block, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK, newStatement_block, newStatement_block));
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
      case JavadslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK:
        return basicSetStatement_block(null, msgs);
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
      case JavadslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK:
        return getStatement_block();
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
      case JavadslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK:
        setStatement_block((StatementBlock)newValue);
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
      case JavadslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK:
        setStatement_block((StatementBlock)null);
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
      case JavadslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK:
        return statement_block != null;
    }
    return super.eIsSet(featureID);
  }

} //ConstructorDeclarationImpl
