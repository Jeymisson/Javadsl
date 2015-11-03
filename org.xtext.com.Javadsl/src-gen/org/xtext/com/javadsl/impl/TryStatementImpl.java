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
import org.xtext.com.javadsl.Parameter;
import org.xtext.com.javadsl.Statement;
import org.xtext.com.javadsl.TryStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.TryStatementImpl#getTry_statement <em>Try statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.TryStatementImpl#getParamenters <em>Paramenters</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.TryStatementImpl#getCatch_statements <em>Catch statements</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.TryStatementImpl#getFinally_statement <em>Finally statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryStatementImpl extends MinimalEObjectImpl.Container implements TryStatement
{
  /**
   * The cached value of the '{@link #getTry_statement() <em>Try statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTry_statement()
   * @generated
   * @ordered
   */
  protected Statement try_statement;

  /**
   * The cached value of the '{@link #getParamenters() <em>Paramenters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamenters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> paramenters;

  /**
   * The cached value of the '{@link #getCatch_statements() <em>Catch statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatch_statements()
   * @generated
   * @ordered
   */
  protected EList<Statement> catch_statements;

  /**
   * The cached value of the '{@link #getFinally_statement() <em>Finally statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinally_statement()
   * @generated
   * @ordered
   */
  protected Statement finally_statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TryStatementImpl()
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
    return JavadslPackage.Literals.TRY_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getTry_statement()
  {
    return try_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTry_statement(Statement newTry_statement, NotificationChain msgs)
  {
    Statement oldTry_statement = try_statement;
    try_statement = newTry_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.TRY_STATEMENT__TRY_STATEMENT, oldTry_statement, newTry_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTry_statement(Statement newTry_statement)
  {
    if (newTry_statement != try_statement)
    {
      NotificationChain msgs = null;
      if (try_statement != null)
        msgs = ((InternalEObject)try_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.TRY_STATEMENT__TRY_STATEMENT, null, msgs);
      if (newTry_statement != null)
        msgs = ((InternalEObject)newTry_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.TRY_STATEMENT__TRY_STATEMENT, null, msgs);
      msgs = basicSetTry_statement(newTry_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.TRY_STATEMENT__TRY_STATEMENT, newTry_statement, newTry_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParamenters()
  {
    if (paramenters == null)
    {
      paramenters = new EObjectContainmentEList<Parameter>(Parameter.class, this, JavadslPackage.TRY_STATEMENT__PARAMENTERS);
    }
    return paramenters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getCatch_statements()
  {
    if (catch_statements == null)
    {
      catch_statements = new EObjectContainmentEList<Statement>(Statement.class, this, JavadslPackage.TRY_STATEMENT__CATCH_STATEMENTS);
    }
    return catch_statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getFinally_statement()
  {
    return finally_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinally_statement(Statement newFinally_statement, NotificationChain msgs)
  {
    Statement oldFinally_statement = finally_statement;
    finally_statement = newFinally_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.TRY_STATEMENT__FINALLY_STATEMENT, oldFinally_statement, newFinally_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinally_statement(Statement newFinally_statement)
  {
    if (newFinally_statement != finally_statement)
    {
      NotificationChain msgs = null;
      if (finally_statement != null)
        msgs = ((InternalEObject)finally_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.TRY_STATEMENT__FINALLY_STATEMENT, null, msgs);
      if (newFinally_statement != null)
        msgs = ((InternalEObject)newFinally_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.TRY_STATEMENT__FINALLY_STATEMENT, null, msgs);
      msgs = basicSetFinally_statement(newFinally_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.TRY_STATEMENT__FINALLY_STATEMENT, newFinally_statement, newFinally_statement));
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
      case JavadslPackage.TRY_STATEMENT__TRY_STATEMENT:
        return basicSetTry_statement(null, msgs);
      case JavadslPackage.TRY_STATEMENT__PARAMENTERS:
        return ((InternalEList<?>)getParamenters()).basicRemove(otherEnd, msgs);
      case JavadslPackage.TRY_STATEMENT__CATCH_STATEMENTS:
        return ((InternalEList<?>)getCatch_statements()).basicRemove(otherEnd, msgs);
      case JavadslPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        return basicSetFinally_statement(null, msgs);
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
      case JavadslPackage.TRY_STATEMENT__TRY_STATEMENT:
        return getTry_statement();
      case JavadslPackage.TRY_STATEMENT__PARAMENTERS:
        return getParamenters();
      case JavadslPackage.TRY_STATEMENT__CATCH_STATEMENTS:
        return getCatch_statements();
      case JavadslPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        return getFinally_statement();
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
      case JavadslPackage.TRY_STATEMENT__TRY_STATEMENT:
        setTry_statement((Statement)newValue);
        return;
      case JavadslPackage.TRY_STATEMENT__PARAMENTERS:
        getParamenters().clear();
        getParamenters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case JavadslPackage.TRY_STATEMENT__CATCH_STATEMENTS:
        getCatch_statements().clear();
        getCatch_statements().addAll((Collection<? extends Statement>)newValue);
        return;
      case JavadslPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        setFinally_statement((Statement)newValue);
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
      case JavadslPackage.TRY_STATEMENT__TRY_STATEMENT:
        setTry_statement((Statement)null);
        return;
      case JavadslPackage.TRY_STATEMENT__PARAMENTERS:
        getParamenters().clear();
        return;
      case JavadslPackage.TRY_STATEMENT__CATCH_STATEMENTS:
        getCatch_statements().clear();
        return;
      case JavadslPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        setFinally_statement((Statement)null);
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
      case JavadslPackage.TRY_STATEMENT__TRY_STATEMENT:
        return try_statement != null;
      case JavadslPackage.TRY_STATEMENT__PARAMENTERS:
        return paramenters != null && !paramenters.isEmpty();
      case JavadslPackage.TRY_STATEMENT__CATCH_STATEMENTS:
        return catch_statements != null && !catch_statements.isEmpty();
      case JavadslPackage.TRY_STATEMENT__FINALLY_STATEMENT:
        return finally_statement != null;
    }
    return super.eIsSet(featureID);
  }

} //TryStatementImpl
