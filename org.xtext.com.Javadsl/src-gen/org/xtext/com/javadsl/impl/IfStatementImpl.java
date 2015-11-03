/**
 */
package org.xtext.com.javadsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.com.javadsl.Expression;
import org.xtext.com.javadsl.IfStatement;
import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.IfStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.IfStatementImpl#getIf_statement <em>If statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.IfStatementImpl#getElse_statement <em>Else statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatementImpl extends MinimalEObjectImpl.Container implements IfStatement
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getIf_statement() <em>If statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_statement()
   * @generated
   * @ordered
   */
  protected Statement if_statement;

  /**
   * The cached value of the '{@link #getElse_statement() <em>Else statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse_statement()
   * @generated
   * @ordered
   */
  protected Statement else_statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStatementImpl()
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
    return JavadslPackage.Literals.IF_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.IF_STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.IF_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.IF_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.IF_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getIf_statement()
  {
    return if_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf_statement(Statement newIf_statement, NotificationChain msgs)
  {
    Statement oldIf_statement = if_statement;
    if_statement = newIf_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.IF_STATEMENT__IF_STATEMENT, oldIf_statement, newIf_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIf_statement(Statement newIf_statement)
  {
    if (newIf_statement != if_statement)
    {
      NotificationChain msgs = null;
      if (if_statement != null)
        msgs = ((InternalEObject)if_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.IF_STATEMENT__IF_STATEMENT, null, msgs);
      if (newIf_statement != null)
        msgs = ((InternalEObject)newIf_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.IF_STATEMENT__IF_STATEMENT, null, msgs);
      msgs = basicSetIf_statement(newIf_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.IF_STATEMENT__IF_STATEMENT, newIf_statement, newIf_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getElse_statement()
  {
    return else_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse_statement(Statement newElse_statement, NotificationChain msgs)
  {
    Statement oldElse_statement = else_statement;
    else_statement = newElse_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.IF_STATEMENT__ELSE_STATEMENT, oldElse_statement, newElse_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse_statement(Statement newElse_statement)
  {
    if (newElse_statement != else_statement)
    {
      NotificationChain msgs = null;
      if (else_statement != null)
        msgs = ((InternalEObject)else_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.IF_STATEMENT__ELSE_STATEMENT, null, msgs);
      if (newElse_statement != null)
        msgs = ((InternalEObject)newElse_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.IF_STATEMENT__ELSE_STATEMENT, null, msgs);
      msgs = basicSetElse_statement(newElse_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.IF_STATEMENT__ELSE_STATEMENT, newElse_statement, newElse_statement));
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
      case JavadslPackage.IF_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case JavadslPackage.IF_STATEMENT__IF_STATEMENT:
        return basicSetIf_statement(null, msgs);
      case JavadslPackage.IF_STATEMENT__ELSE_STATEMENT:
        return basicSetElse_statement(null, msgs);
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
      case JavadslPackage.IF_STATEMENT__EXPRESSION:
        return getExpression();
      case JavadslPackage.IF_STATEMENT__IF_STATEMENT:
        return getIf_statement();
      case JavadslPackage.IF_STATEMENT__ELSE_STATEMENT:
        return getElse_statement();
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
      case JavadslPackage.IF_STATEMENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case JavadslPackage.IF_STATEMENT__IF_STATEMENT:
        setIf_statement((Statement)newValue);
        return;
      case JavadslPackage.IF_STATEMENT__ELSE_STATEMENT:
        setElse_statement((Statement)newValue);
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
      case JavadslPackage.IF_STATEMENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case JavadslPackage.IF_STATEMENT__IF_STATEMENT:
        setIf_statement((Statement)null);
        return;
      case JavadslPackage.IF_STATEMENT__ELSE_STATEMENT:
        setElse_statement((Statement)null);
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
      case JavadslPackage.IF_STATEMENT__EXPRESSION:
        return expression != null;
      case JavadslPackage.IF_STATEMENT__IF_STATEMENT:
        return if_statement != null;
      case JavadslPackage.IF_STATEMENT__ELSE_STATEMENT:
        return else_statement != null;
    }
    return super.eIsSet(featureID);
  }

} //IfStatementImpl
