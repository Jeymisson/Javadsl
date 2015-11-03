/**
 */
package org.xtext.com.javadsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.com.javadsl.DoStatement;
import org.xtext.com.javadsl.Expression;
import org.xtext.com.javadsl.ForStatement;
import org.xtext.com.javadsl.IfStatement;
import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.Statement;
import org.xtext.com.javadsl.StatementBlock;
import org.xtext.com.javadsl.SwitchStatement;
import org.xtext.com.javadsl.TryStatement;
import org.xtext.com.javadsl.VariableDeclaration;
import org.xtext.com.javadsl.while_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getVariable_declaration <em>Variable declaration</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getStatement_expression <em>Statement expression</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getStatement_block <em>Statement block</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getIf_statement <em>If statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getDo_statement <em>Do statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getWhile_statement <em>While statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getFor_statement <em>For statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getTry_statement <em>Try statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getSwith_statement <em>Swith statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getSync_expression <em>Sync expression</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getSync_statement <em>Sync statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getReturn_expression <em>Return expression</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getThrow_expression <em>Throw expression</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.StatementImpl#getNamed_statement <em>Named statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
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
   * The cached value of the '{@link #getStatement_expression() <em>Statement expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement_expression()
   * @generated
   * @ordered
   */
  protected Expression statement_expression;

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
   * The cached value of the '{@link #getIf_statement() <em>If statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_statement()
   * @generated
   * @ordered
   */
  protected IfStatement if_statement;

  /**
   * The cached value of the '{@link #getDo_statement() <em>Do statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDo_statement()
   * @generated
   * @ordered
   */
  protected DoStatement do_statement;

  /**
   * The cached value of the '{@link #getWhile_statement() <em>While statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhile_statement()
   * @generated
   * @ordered
   */
  protected while_statement while_statement;

  /**
   * The cached value of the '{@link #getFor_statement() <em>For statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFor_statement()
   * @generated
   * @ordered
   */
  protected ForStatement for_statement;

  /**
   * The cached value of the '{@link #getTry_statement() <em>Try statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTry_statement()
   * @generated
   * @ordered
   */
  protected TryStatement try_statement;

  /**
   * The cached value of the '{@link #getSwith_statement() <em>Swith statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwith_statement()
   * @generated
   * @ordered
   */
  protected SwitchStatement swith_statement;

  /**
   * The cached value of the '{@link #getSync_expression() <em>Sync expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSync_expression()
   * @generated
   * @ordered
   */
  protected Expression sync_expression;

  /**
   * The cached value of the '{@link #getSync_statement() <em>Sync statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSync_statement()
   * @generated
   * @ordered
   */
  protected Statement sync_statement;

  /**
   * The cached value of the '{@link #getReturn_expression() <em>Return expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn_expression()
   * @generated
   * @ordered
   */
  protected Expression return_expression;

  /**
   * The cached value of the '{@link #getThrow_expression() <em>Throw expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThrow_expression()
   * @generated
   * @ordered
   */
  protected Expression throw_expression;

  /**
   * The cached value of the '{@link #getNamed_statement() <em>Named statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamed_statement()
   * @generated
   * @ordered
   */
  protected Statement named_statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return JavadslPackage.Literals.STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__VARIABLE_DECLARATION, oldVariable_declaration, newVariable_declaration);
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
        msgs = ((InternalEObject)variable_declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__VARIABLE_DECLARATION, null, msgs);
      if (newVariable_declaration != null)
        msgs = ((InternalEObject)newVariable_declaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__VARIABLE_DECLARATION, null, msgs);
      msgs = basicSetVariable_declaration(newVariable_declaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__VARIABLE_DECLARATION, newVariable_declaration, newVariable_declaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getStatement_expression()
  {
    return statement_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement_expression(Expression newStatement_expression, NotificationChain msgs)
  {
    Expression oldStatement_expression = statement_expression;
    statement_expression = newStatement_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__STATEMENT_EXPRESSION, oldStatement_expression, newStatement_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement_expression(Expression newStatement_expression)
  {
    if (newStatement_expression != statement_expression)
    {
      NotificationChain msgs = null;
      if (statement_expression != null)
        msgs = ((InternalEObject)statement_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__STATEMENT_EXPRESSION, null, msgs);
      if (newStatement_expression != null)
        msgs = ((InternalEObject)newStatement_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__STATEMENT_EXPRESSION, null, msgs);
      msgs = basicSetStatement_expression(newStatement_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__STATEMENT_EXPRESSION, newStatement_expression, newStatement_expression));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__STATEMENT_BLOCK, oldStatement_block, newStatement_block);
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
        msgs = ((InternalEObject)statement_block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__STATEMENT_BLOCK, null, msgs);
      if (newStatement_block != null)
        msgs = ((InternalEObject)newStatement_block).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__STATEMENT_BLOCK, null, msgs);
      msgs = basicSetStatement_block(newStatement_block, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__STATEMENT_BLOCK, newStatement_block, newStatement_block));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement getIf_statement()
  {
    return if_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf_statement(IfStatement newIf_statement, NotificationChain msgs)
  {
    IfStatement oldIf_statement = if_statement;
    if_statement = newIf_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__IF_STATEMENT, oldIf_statement, newIf_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIf_statement(IfStatement newIf_statement)
  {
    if (newIf_statement != if_statement)
    {
      NotificationChain msgs = null;
      if (if_statement != null)
        msgs = ((InternalEObject)if_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__IF_STATEMENT, null, msgs);
      if (newIf_statement != null)
        msgs = ((InternalEObject)newIf_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__IF_STATEMENT, null, msgs);
      msgs = basicSetIf_statement(newIf_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__IF_STATEMENT, newIf_statement, newIf_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoStatement getDo_statement()
  {
    return do_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDo_statement(DoStatement newDo_statement, NotificationChain msgs)
  {
    DoStatement oldDo_statement = do_statement;
    do_statement = newDo_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__DO_STATEMENT, oldDo_statement, newDo_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDo_statement(DoStatement newDo_statement)
  {
    if (newDo_statement != do_statement)
    {
      NotificationChain msgs = null;
      if (do_statement != null)
        msgs = ((InternalEObject)do_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__DO_STATEMENT, null, msgs);
      if (newDo_statement != null)
        msgs = ((InternalEObject)newDo_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__DO_STATEMENT, null, msgs);
      msgs = basicSetDo_statement(newDo_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__DO_STATEMENT, newDo_statement, newDo_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public while_statement getWhile_statement()
  {
    return while_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhile_statement(while_statement newWhile_statement, NotificationChain msgs)
  {
    while_statement oldWhile_statement = while_statement;
    while_statement = newWhile_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__WHILE_STATEMENT, oldWhile_statement, newWhile_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhile_statement(while_statement newWhile_statement)
  {
    if (newWhile_statement != while_statement)
    {
      NotificationChain msgs = null;
      if (while_statement != null)
        msgs = ((InternalEObject)while_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__WHILE_STATEMENT, null, msgs);
      if (newWhile_statement != null)
        msgs = ((InternalEObject)newWhile_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__WHILE_STATEMENT, null, msgs);
      msgs = basicSetWhile_statement(newWhile_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__WHILE_STATEMENT, newWhile_statement, newWhile_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement getFor_statement()
  {
    return for_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFor_statement(ForStatement newFor_statement, NotificationChain msgs)
  {
    ForStatement oldFor_statement = for_statement;
    for_statement = newFor_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__FOR_STATEMENT, oldFor_statement, newFor_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFor_statement(ForStatement newFor_statement)
  {
    if (newFor_statement != for_statement)
    {
      NotificationChain msgs = null;
      if (for_statement != null)
        msgs = ((InternalEObject)for_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__FOR_STATEMENT, null, msgs);
      if (newFor_statement != null)
        msgs = ((InternalEObject)newFor_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__FOR_STATEMENT, null, msgs);
      msgs = basicSetFor_statement(newFor_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__FOR_STATEMENT, newFor_statement, newFor_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TryStatement getTry_statement()
  {
    return try_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTry_statement(TryStatement newTry_statement, NotificationChain msgs)
  {
    TryStatement oldTry_statement = try_statement;
    try_statement = newTry_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__TRY_STATEMENT, oldTry_statement, newTry_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTry_statement(TryStatement newTry_statement)
  {
    if (newTry_statement != try_statement)
    {
      NotificationChain msgs = null;
      if (try_statement != null)
        msgs = ((InternalEObject)try_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__TRY_STATEMENT, null, msgs);
      if (newTry_statement != null)
        msgs = ((InternalEObject)newTry_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__TRY_STATEMENT, null, msgs);
      msgs = basicSetTry_statement(newTry_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__TRY_STATEMENT, newTry_statement, newTry_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchStatement getSwith_statement()
  {
    return swith_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwith_statement(SwitchStatement newSwith_statement, NotificationChain msgs)
  {
    SwitchStatement oldSwith_statement = swith_statement;
    swith_statement = newSwith_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__SWITH_STATEMENT, oldSwith_statement, newSwith_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwith_statement(SwitchStatement newSwith_statement)
  {
    if (newSwith_statement != swith_statement)
    {
      NotificationChain msgs = null;
      if (swith_statement != null)
        msgs = ((InternalEObject)swith_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__SWITH_STATEMENT, null, msgs);
      if (newSwith_statement != null)
        msgs = ((InternalEObject)newSwith_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__SWITH_STATEMENT, null, msgs);
      msgs = basicSetSwith_statement(newSwith_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__SWITH_STATEMENT, newSwith_statement, newSwith_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSync_expression()
  {
    return sync_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSync_expression(Expression newSync_expression, NotificationChain msgs)
  {
    Expression oldSync_expression = sync_expression;
    sync_expression = newSync_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__SYNC_EXPRESSION, oldSync_expression, newSync_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSync_expression(Expression newSync_expression)
  {
    if (newSync_expression != sync_expression)
    {
      NotificationChain msgs = null;
      if (sync_expression != null)
        msgs = ((InternalEObject)sync_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__SYNC_EXPRESSION, null, msgs);
      if (newSync_expression != null)
        msgs = ((InternalEObject)newSync_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__SYNC_EXPRESSION, null, msgs);
      msgs = basicSetSync_expression(newSync_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__SYNC_EXPRESSION, newSync_expression, newSync_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getSync_statement()
  {
    return sync_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSync_statement(Statement newSync_statement, NotificationChain msgs)
  {
    Statement oldSync_statement = sync_statement;
    sync_statement = newSync_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__SYNC_STATEMENT, oldSync_statement, newSync_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSync_statement(Statement newSync_statement)
  {
    if (newSync_statement != sync_statement)
    {
      NotificationChain msgs = null;
      if (sync_statement != null)
        msgs = ((InternalEObject)sync_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__SYNC_STATEMENT, null, msgs);
      if (newSync_statement != null)
        msgs = ((InternalEObject)newSync_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__SYNC_STATEMENT, null, msgs);
      msgs = basicSetSync_statement(newSync_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__SYNC_STATEMENT, newSync_statement, newSync_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getReturn_expression()
  {
    return return_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturn_expression(Expression newReturn_expression, NotificationChain msgs)
  {
    Expression oldReturn_expression = return_expression;
    return_expression = newReturn_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__RETURN_EXPRESSION, oldReturn_expression, newReturn_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn_expression(Expression newReturn_expression)
  {
    if (newReturn_expression != return_expression)
    {
      NotificationChain msgs = null;
      if (return_expression != null)
        msgs = ((InternalEObject)return_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__RETURN_EXPRESSION, null, msgs);
      if (newReturn_expression != null)
        msgs = ((InternalEObject)newReturn_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__RETURN_EXPRESSION, null, msgs);
      msgs = basicSetReturn_expression(newReturn_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__RETURN_EXPRESSION, newReturn_expression, newReturn_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getThrow_expression()
  {
    return throw_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThrow_expression(Expression newThrow_expression, NotificationChain msgs)
  {
    Expression oldThrow_expression = throw_expression;
    throw_expression = newThrow_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__THROW_EXPRESSION, oldThrow_expression, newThrow_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThrow_expression(Expression newThrow_expression)
  {
    if (newThrow_expression != throw_expression)
    {
      NotificationChain msgs = null;
      if (throw_expression != null)
        msgs = ((InternalEObject)throw_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__THROW_EXPRESSION, null, msgs);
      if (newThrow_expression != null)
        msgs = ((InternalEObject)newThrow_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__THROW_EXPRESSION, null, msgs);
      msgs = basicSetThrow_expression(newThrow_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__THROW_EXPRESSION, newThrow_expression, newThrow_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getNamed_statement()
  {
    return named_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamed_statement(Statement newNamed_statement, NotificationChain msgs)
  {
    Statement oldNamed_statement = named_statement;
    named_statement = newNamed_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__NAMED_STATEMENT, oldNamed_statement, newNamed_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamed_statement(Statement newNamed_statement)
  {
    if (newNamed_statement != named_statement)
    {
      NotificationChain msgs = null;
      if (named_statement != null)
        msgs = ((InternalEObject)named_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__NAMED_STATEMENT, null, msgs);
      if (newNamed_statement != null)
        msgs = ((InternalEObject)newNamed_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.STATEMENT__NAMED_STATEMENT, null, msgs);
      msgs = basicSetNamed_statement(newNamed_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.STATEMENT__NAMED_STATEMENT, newNamed_statement, newNamed_statement));
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
      case JavadslPackage.STATEMENT__VARIABLE_DECLARATION:
        return basicSetVariable_declaration(null, msgs);
      case JavadslPackage.STATEMENT__STATEMENT_EXPRESSION:
        return basicSetStatement_expression(null, msgs);
      case JavadslPackage.STATEMENT__STATEMENT_BLOCK:
        return basicSetStatement_block(null, msgs);
      case JavadslPackage.STATEMENT__IF_STATEMENT:
        return basicSetIf_statement(null, msgs);
      case JavadslPackage.STATEMENT__DO_STATEMENT:
        return basicSetDo_statement(null, msgs);
      case JavadslPackage.STATEMENT__WHILE_STATEMENT:
        return basicSetWhile_statement(null, msgs);
      case JavadslPackage.STATEMENT__FOR_STATEMENT:
        return basicSetFor_statement(null, msgs);
      case JavadslPackage.STATEMENT__TRY_STATEMENT:
        return basicSetTry_statement(null, msgs);
      case JavadslPackage.STATEMENT__SWITH_STATEMENT:
        return basicSetSwith_statement(null, msgs);
      case JavadslPackage.STATEMENT__SYNC_EXPRESSION:
        return basicSetSync_expression(null, msgs);
      case JavadslPackage.STATEMENT__SYNC_STATEMENT:
        return basicSetSync_statement(null, msgs);
      case JavadslPackage.STATEMENT__RETURN_EXPRESSION:
        return basicSetReturn_expression(null, msgs);
      case JavadslPackage.STATEMENT__THROW_EXPRESSION:
        return basicSetThrow_expression(null, msgs);
      case JavadslPackage.STATEMENT__NAMED_STATEMENT:
        return basicSetNamed_statement(null, msgs);
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
      case JavadslPackage.STATEMENT__VARIABLE_DECLARATION:
        return getVariable_declaration();
      case JavadslPackage.STATEMENT__STATEMENT_EXPRESSION:
        return getStatement_expression();
      case JavadslPackage.STATEMENT__STATEMENT_BLOCK:
        return getStatement_block();
      case JavadslPackage.STATEMENT__IF_STATEMENT:
        return getIf_statement();
      case JavadslPackage.STATEMENT__DO_STATEMENT:
        return getDo_statement();
      case JavadslPackage.STATEMENT__WHILE_STATEMENT:
        return getWhile_statement();
      case JavadslPackage.STATEMENT__FOR_STATEMENT:
        return getFor_statement();
      case JavadslPackage.STATEMENT__TRY_STATEMENT:
        return getTry_statement();
      case JavadslPackage.STATEMENT__SWITH_STATEMENT:
        return getSwith_statement();
      case JavadslPackage.STATEMENT__SYNC_EXPRESSION:
        return getSync_expression();
      case JavadslPackage.STATEMENT__SYNC_STATEMENT:
        return getSync_statement();
      case JavadslPackage.STATEMENT__RETURN_EXPRESSION:
        return getReturn_expression();
      case JavadslPackage.STATEMENT__THROW_EXPRESSION:
        return getThrow_expression();
      case JavadslPackage.STATEMENT__NAMED_STATEMENT:
        return getNamed_statement();
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
      case JavadslPackage.STATEMENT__VARIABLE_DECLARATION:
        setVariable_declaration((VariableDeclaration)newValue);
        return;
      case JavadslPackage.STATEMENT__STATEMENT_EXPRESSION:
        setStatement_expression((Expression)newValue);
        return;
      case JavadslPackage.STATEMENT__STATEMENT_BLOCK:
        setStatement_block((StatementBlock)newValue);
        return;
      case JavadslPackage.STATEMENT__IF_STATEMENT:
        setIf_statement((IfStatement)newValue);
        return;
      case JavadslPackage.STATEMENT__DO_STATEMENT:
        setDo_statement((DoStatement)newValue);
        return;
      case JavadslPackage.STATEMENT__WHILE_STATEMENT:
        setWhile_statement((while_statement)newValue);
        return;
      case JavadslPackage.STATEMENT__FOR_STATEMENT:
        setFor_statement((ForStatement)newValue);
        return;
      case JavadslPackage.STATEMENT__TRY_STATEMENT:
        setTry_statement((TryStatement)newValue);
        return;
      case JavadslPackage.STATEMENT__SWITH_STATEMENT:
        setSwith_statement((SwitchStatement)newValue);
        return;
      case JavadslPackage.STATEMENT__SYNC_EXPRESSION:
        setSync_expression((Expression)newValue);
        return;
      case JavadslPackage.STATEMENT__SYNC_STATEMENT:
        setSync_statement((Statement)newValue);
        return;
      case JavadslPackage.STATEMENT__RETURN_EXPRESSION:
        setReturn_expression((Expression)newValue);
        return;
      case JavadslPackage.STATEMENT__THROW_EXPRESSION:
        setThrow_expression((Expression)newValue);
        return;
      case JavadslPackage.STATEMENT__NAMED_STATEMENT:
        setNamed_statement((Statement)newValue);
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
      case JavadslPackage.STATEMENT__VARIABLE_DECLARATION:
        setVariable_declaration((VariableDeclaration)null);
        return;
      case JavadslPackage.STATEMENT__STATEMENT_EXPRESSION:
        setStatement_expression((Expression)null);
        return;
      case JavadslPackage.STATEMENT__STATEMENT_BLOCK:
        setStatement_block((StatementBlock)null);
        return;
      case JavadslPackage.STATEMENT__IF_STATEMENT:
        setIf_statement((IfStatement)null);
        return;
      case JavadslPackage.STATEMENT__DO_STATEMENT:
        setDo_statement((DoStatement)null);
        return;
      case JavadslPackage.STATEMENT__WHILE_STATEMENT:
        setWhile_statement((while_statement)null);
        return;
      case JavadslPackage.STATEMENT__FOR_STATEMENT:
        setFor_statement((ForStatement)null);
        return;
      case JavadslPackage.STATEMENT__TRY_STATEMENT:
        setTry_statement((TryStatement)null);
        return;
      case JavadslPackage.STATEMENT__SWITH_STATEMENT:
        setSwith_statement((SwitchStatement)null);
        return;
      case JavadslPackage.STATEMENT__SYNC_EXPRESSION:
        setSync_expression((Expression)null);
        return;
      case JavadslPackage.STATEMENT__SYNC_STATEMENT:
        setSync_statement((Statement)null);
        return;
      case JavadslPackage.STATEMENT__RETURN_EXPRESSION:
        setReturn_expression((Expression)null);
        return;
      case JavadslPackage.STATEMENT__THROW_EXPRESSION:
        setThrow_expression((Expression)null);
        return;
      case JavadslPackage.STATEMENT__NAMED_STATEMENT:
        setNamed_statement((Statement)null);
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
      case JavadslPackage.STATEMENT__VARIABLE_DECLARATION:
        return variable_declaration != null;
      case JavadslPackage.STATEMENT__STATEMENT_EXPRESSION:
        return statement_expression != null;
      case JavadslPackage.STATEMENT__STATEMENT_BLOCK:
        return statement_block != null;
      case JavadslPackage.STATEMENT__IF_STATEMENT:
        return if_statement != null;
      case JavadslPackage.STATEMENT__DO_STATEMENT:
        return do_statement != null;
      case JavadslPackage.STATEMENT__WHILE_STATEMENT:
        return while_statement != null;
      case JavadslPackage.STATEMENT__FOR_STATEMENT:
        return for_statement != null;
      case JavadslPackage.STATEMENT__TRY_STATEMENT:
        return try_statement != null;
      case JavadslPackage.STATEMENT__SWITH_STATEMENT:
        return swith_statement != null;
      case JavadslPackage.STATEMENT__SYNC_EXPRESSION:
        return sync_expression != null;
      case JavadslPackage.STATEMENT__SYNC_STATEMENT:
        return sync_statement != null;
      case JavadslPackage.STATEMENT__RETURN_EXPRESSION:
        return return_expression != null;
      case JavadslPackage.STATEMENT__THROW_EXPRESSION:
        return throw_expression != null;
      case JavadslPackage.STATEMENT__NAMED_STATEMENT:
        return named_statement != null;
    }
    return super.eIsSet(featureID);
  }

} //StatementImpl
