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
import org.xtext.com.javadsl.Statement;
import org.xtext.com.javadsl.SwitchStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.SwitchStatementImpl#getSwitch_expression <em>Switch expression</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.SwitchStatementImpl#getCase_expressions <em>Case expressions</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.SwitchStatementImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchStatementImpl extends MinimalEObjectImpl.Container implements SwitchStatement
{
  /**
   * The cached value of the '{@link #getSwitch_expression() <em>Switch expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitch_expression()
   * @generated
   * @ordered
   */
  protected Expression switch_expression;

  /**
   * The cached value of the '{@link #getCase_expressions() <em>Case expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCase_expressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> case_expressions;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchStatementImpl()
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
    return JavadslPackage.Literals.SWITCH_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSwitch_expression()
  {
    return switch_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwitch_expression(Expression newSwitch_expression, NotificationChain msgs)
  {
    Expression oldSwitch_expression = switch_expression;
    switch_expression = newSwitch_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION, oldSwitch_expression, newSwitch_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitch_expression(Expression newSwitch_expression)
  {
    if (newSwitch_expression != switch_expression)
    {
      NotificationChain msgs = null;
      if (switch_expression != null)
        msgs = ((InternalEObject)switch_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION, null, msgs);
      if (newSwitch_expression != null)
        msgs = ((InternalEObject)newSwitch_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION, null, msgs);
      msgs = basicSetSwitch_expression(newSwitch_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION, newSwitch_expression, newSwitch_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getCase_expressions()
  {
    if (case_expressions == null)
    {
      case_expressions = new EObjectContainmentEList<Expression>(Expression.class, this, JavadslPackage.SWITCH_STATEMENT__CASE_EXPRESSIONS);
    }
    return case_expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, JavadslPackage.SWITCH_STATEMENT__STATEMENTS);
    }
    return statements;
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
      case JavadslPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION:
        return basicSetSwitch_expression(null, msgs);
      case JavadslPackage.SWITCH_STATEMENT__CASE_EXPRESSIONS:
        return ((InternalEList<?>)getCase_expressions()).basicRemove(otherEnd, msgs);
      case JavadslPackage.SWITCH_STATEMENT__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
      case JavadslPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION:
        return getSwitch_expression();
      case JavadslPackage.SWITCH_STATEMENT__CASE_EXPRESSIONS:
        return getCase_expressions();
      case JavadslPackage.SWITCH_STATEMENT__STATEMENTS:
        return getStatements();
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
      case JavadslPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION:
        setSwitch_expression((Expression)newValue);
        return;
      case JavadslPackage.SWITCH_STATEMENT__CASE_EXPRESSIONS:
        getCase_expressions().clear();
        getCase_expressions().addAll((Collection<? extends Expression>)newValue);
        return;
      case JavadslPackage.SWITCH_STATEMENT__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
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
      case JavadslPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION:
        setSwitch_expression((Expression)null);
        return;
      case JavadslPackage.SWITCH_STATEMENT__CASE_EXPRESSIONS:
        getCase_expressions().clear();
        return;
      case JavadslPackage.SWITCH_STATEMENT__STATEMENTS:
        getStatements().clear();
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
      case JavadslPackage.SWITCH_STATEMENT__SWITCH_EXPRESSION:
        return switch_expression != null;
      case JavadslPackage.SWITCH_STATEMENT__CASE_EXPRESSIONS:
        return case_expressions != null && !case_expressions.isEmpty();
      case JavadslPackage.SWITCH_STATEMENT__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SwitchStatementImpl
