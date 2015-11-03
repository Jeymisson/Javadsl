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
import org.xtext.com.javadsl.ForStatement;
import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.Statement;
import org.xtext.com.javadsl.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.ForStatementImpl#getVariable_declaration <em>Variable declaration</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.ForStatementImpl#getFor_expression1 <em>For expression1</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.ForStatementImpl#getFor_expression2 <em>For expression2</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.ForStatementImpl#getFor_expression3 <em>For expression3</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.ForStatementImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStatementImpl extends MinimalEObjectImpl.Container implements ForStatement
{
  /**
   * The cached value of the '{@link #getVariable_declaration() <em>Variable declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable_declaration()
   * @generated
   * @ordered
   */
  protected VariableDeclaration variable_declaration;

  /**
   * The cached value of the '{@link #getFor_expression1() <em>For expression1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor_expression1()
   * @generated
   * @ordered
   */
  protected Expression for_expression1;

  /**
   * The cached value of the '{@link #getFor_expression2() <em>For expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor_expression2()
   * @generated
   * @ordered
   */
  protected Expression for_expression2;

  /**
   * The cached value of the '{@link #getFor_expression3() <em>For expression3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor_expression3()
   * @generated
   * @ordered
   */
  protected Expression for_expression3;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected Statement statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForStatementImpl()
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
    return JavadslPackage.Literals.FOR_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration getVariable_declaration()
  {
    return variable_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable_declaration(VariableDeclaration newVariable_declaration, NotificationChain msgs)
  {
    VariableDeclaration oldVariable_declaration = variable_declaration;
    variable_declaration = newVariable_declaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.FOR_STATEMENT__VARIABLE_DECLARATION, oldVariable_declaration, newVariable_declaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable_declaration(VariableDeclaration newVariable_declaration)
  {
    if (newVariable_declaration != variable_declaration)
    {
      NotificationChain msgs = null;
      if (variable_declaration != null)
        msgs = ((InternalEObject)variable_declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.FOR_STATEMENT__VARIABLE_DECLARATION, null, msgs);
      if (newVariable_declaration != null)
        msgs = ((InternalEObject)newVariable_declaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.FOR_STATEMENT__VARIABLE_DECLARATION, null, msgs);
      msgs = basicSetVariable_declaration(newVariable_declaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.FOR_STATEMENT__VARIABLE_DECLARATION, newVariable_declaration, newVariable_declaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFor_expression1()
  {
    return for_expression1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFor_expression1(Expression newFor_expression1, NotificationChain msgs)
  {
    Expression oldFor_expression1 = for_expression1;
    for_expression1 = newFor_expression1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION1, oldFor_expression1, newFor_expression1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor_expression1(Expression newFor_expression1)
  {
    if (newFor_expression1 != for_expression1)
    {
      NotificationChain msgs = null;
      if (for_expression1 != null)
        msgs = ((InternalEObject)for_expression1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION1, null, msgs);
      if (newFor_expression1 != null)
        msgs = ((InternalEObject)newFor_expression1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION1, null, msgs);
      msgs = basicSetFor_expression1(newFor_expression1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION1, newFor_expression1, newFor_expression1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFor_expression2()
  {
    return for_expression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFor_expression2(Expression newFor_expression2, NotificationChain msgs)
  {
    Expression oldFor_expression2 = for_expression2;
    for_expression2 = newFor_expression2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION2, oldFor_expression2, newFor_expression2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor_expression2(Expression newFor_expression2)
  {
    if (newFor_expression2 != for_expression2)
    {
      NotificationChain msgs = null;
      if (for_expression2 != null)
        msgs = ((InternalEObject)for_expression2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION2, null, msgs);
      if (newFor_expression2 != null)
        msgs = ((InternalEObject)newFor_expression2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION2, null, msgs);
      msgs = basicSetFor_expression2(newFor_expression2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION2, newFor_expression2, newFor_expression2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFor_expression3()
  {
    return for_expression3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFor_expression3(Expression newFor_expression3, NotificationChain msgs)
  {
    Expression oldFor_expression3 = for_expression3;
    for_expression3 = newFor_expression3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION3, oldFor_expression3, newFor_expression3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor_expression3(Expression newFor_expression3)
  {
    if (newFor_expression3 != for_expression3)
    {
      NotificationChain msgs = null;
      if (for_expression3 != null)
        msgs = ((InternalEObject)for_expression3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION3, null, msgs);
      if (newFor_expression3 != null)
        msgs = ((InternalEObject)newFor_expression3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION3, null, msgs);
      msgs = basicSetFor_expression3(newFor_expression3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION3, newFor_expression3, newFor_expression3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs)
  {
    Statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.FOR_STATEMENT__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(Statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.FOR_STATEMENT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.FOR_STATEMENT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.FOR_STATEMENT__STATEMENT, newStatement, newStatement));
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
      case JavadslPackage.FOR_STATEMENT__VARIABLE_DECLARATION:
        return basicSetVariable_declaration(null, msgs);
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION1:
        return basicSetFor_expression1(null, msgs);
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION2:
        return basicSetFor_expression2(null, msgs);
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION3:
        return basicSetFor_expression3(null, msgs);
      case JavadslPackage.FOR_STATEMENT__STATEMENT:
        return basicSetStatement(null, msgs);
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
      case JavadslPackage.FOR_STATEMENT__VARIABLE_DECLARATION:
        return getVariable_declaration();
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION1:
        return getFor_expression1();
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION2:
        return getFor_expression2();
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION3:
        return getFor_expression3();
      case JavadslPackage.FOR_STATEMENT__STATEMENT:
        return getStatement();
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
      case JavadslPackage.FOR_STATEMENT__VARIABLE_DECLARATION:
        setVariable_declaration((VariableDeclaration)newValue);
        return;
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION1:
        setFor_expression1((Expression)newValue);
        return;
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION2:
        setFor_expression2((Expression)newValue);
        return;
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION3:
        setFor_expression3((Expression)newValue);
        return;
      case JavadslPackage.FOR_STATEMENT__STATEMENT:
        setStatement((Statement)newValue);
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
      case JavadslPackage.FOR_STATEMENT__VARIABLE_DECLARATION:
        setVariable_declaration((VariableDeclaration)null);
        return;
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION1:
        setFor_expression1((Expression)null);
        return;
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION2:
        setFor_expression2((Expression)null);
        return;
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION3:
        setFor_expression3((Expression)null);
        return;
      case JavadslPackage.FOR_STATEMENT__STATEMENT:
        setStatement((Statement)null);
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
      case JavadslPackage.FOR_STATEMENT__VARIABLE_DECLARATION:
        return variable_declaration != null;
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION1:
        return for_expression1 != null;
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION2:
        return for_expression2 != null;
      case JavadslPackage.FOR_STATEMENT__FOR_EXPRESSION3:
        return for_expression3 != null;
      case JavadslPackage.FOR_STATEMENT__STATEMENT:
        return statement != null;
    }
    return super.eIsSet(featureID);
  }

} //ForStatementImpl
