/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.Statement#getVariable_declaration <em>Variable declaration</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getStatement_expression <em>Statement expression</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getStatement_block <em>Statement block</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getIf_statement <em>If statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getDo_statement <em>Do statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getWhile_statement <em>While statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getFor_statement <em>For statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getTry_statement <em>Try statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getSwith_statement <em>Swith statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getSync_expression <em>Sync expression</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getSync_statement <em>Sync statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getReturn_expression <em>Return expression</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getThrow_expression <em>Throw expression</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Statement#getNamed_statement <em>Named statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable declaration</em>' containment reference.
   * @see #setVariable_declaration(VariableDeclaration)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_Variable_declaration()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable_declaration();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getVariable_declaration <em>Variable declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable declaration</em>' containment reference.
   * @see #getVariable_declaration()
   * @generated
   */
  void setVariable_declaration(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Statement expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement expression</em>' containment reference.
   * @see #setStatement_expression(Expression)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_Statement_expression()
   * @model containment="true"
   * @generated
   */
  Expression getStatement_expression();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getStatement_expression <em>Statement expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement expression</em>' containment reference.
   * @see #getStatement_expression()
   * @generated
   */
  void setStatement_expression(Expression value);

  /**
   * Returns the value of the '<em><b>Statement block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement block</em>' containment reference.
   * @see #setStatement_block(StatementBlock)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_Statement_block()
   * @model containment="true"
   * @generated
   */
  StatementBlock getStatement_block();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getStatement_block <em>Statement block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement block</em>' containment reference.
   * @see #getStatement_block()
   * @generated
   */
  void setStatement_block(StatementBlock value);

  /**
   * Returns the value of the '<em><b>If statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If statement</em>' containment reference.
   * @see #setIf_statement(IfStatement)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_If_statement()
   * @model containment="true"
   * @generated
   */
  IfStatement getIf_statement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getIf_statement <em>If statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If statement</em>' containment reference.
   * @see #getIf_statement()
   * @generated
   */
  void setIf_statement(IfStatement value);

  /**
   * Returns the value of the '<em><b>Do statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do statement</em>' containment reference.
   * @see #setDo_statement(DoStatement)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_Do_statement()
   * @model containment="true"
   * @generated
   */
  DoStatement getDo_statement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getDo_statement <em>Do statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do statement</em>' containment reference.
   * @see #getDo_statement()
   * @generated
   */
  void setDo_statement(DoStatement value);

  /**
   * Returns the value of the '<em><b>While statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>While statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>While statement</em>' containment reference.
   * @see #setWhile_statement(while_statement)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_While_statement()
   * @model containment="true"
   * @generated
   */
  while_statement getWhile_statement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getWhile_statement <em>While statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>While statement</em>' containment reference.
   * @see #getWhile_statement()
   * @generated
   */
  void setWhile_statement(while_statement value);

  /**
   * Returns the value of the '<em><b>For statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For statement</em>' containment reference.
   * @see #setFor_statement(ForStatement)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_For_statement()
   * @model containment="true"
   * @generated
   */
  ForStatement getFor_statement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getFor_statement <em>For statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For statement</em>' containment reference.
   * @see #getFor_statement()
   * @generated
   */
  void setFor_statement(ForStatement value);

  /**
   * Returns the value of the '<em><b>Try statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Try statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Try statement</em>' containment reference.
   * @see #setTry_statement(TryStatement)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_Try_statement()
   * @model containment="true"
   * @generated
   */
  TryStatement getTry_statement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getTry_statement <em>Try statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Try statement</em>' containment reference.
   * @see #getTry_statement()
   * @generated
   */
  void setTry_statement(TryStatement value);

  /**
   * Returns the value of the '<em><b>Swith statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Swith statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Swith statement</em>' containment reference.
   * @see #setSwith_statement(SwitchStatement)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_Swith_statement()
   * @model containment="true"
   * @generated
   */
  SwitchStatement getSwith_statement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getSwith_statement <em>Swith statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Swith statement</em>' containment reference.
   * @see #getSwith_statement()
   * @generated
   */
  void setSwith_statement(SwitchStatement value);

  /**
   * Returns the value of the '<em><b>Sync expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sync expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sync expression</em>' containment reference.
   * @see #setSync_expression(Expression)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_Sync_expression()
   * @model containment="true"
   * @generated
   */
  Expression getSync_expression();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getSync_expression <em>Sync expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sync expression</em>' containment reference.
   * @see #getSync_expression()
   * @generated
   */
  void setSync_expression(Expression value);

  /**
   * Returns the value of the '<em><b>Sync statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sync statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sync statement</em>' containment reference.
   * @see #setSync_statement(Statement)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_Sync_statement()
   * @model containment="true"
   * @generated
   */
  Statement getSync_statement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getSync_statement <em>Sync statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sync statement</em>' containment reference.
   * @see #getSync_statement()
   * @generated
   */
  void setSync_statement(Statement value);

  /**
   * Returns the value of the '<em><b>Return expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return expression</em>' containment reference.
   * @see #setReturn_expression(Expression)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_Return_expression()
   * @model containment="true"
   * @generated
   */
  Expression getReturn_expression();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getReturn_expression <em>Return expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return expression</em>' containment reference.
   * @see #getReturn_expression()
   * @generated
   */
  void setReturn_expression(Expression value);

  /**
   * Returns the value of the '<em><b>Throw expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Throw expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Throw expression</em>' containment reference.
   * @see #setThrow_expression(Expression)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_Throw_expression()
   * @model containment="true"
   * @generated
   */
  Expression getThrow_expression();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getThrow_expression <em>Throw expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Throw expression</em>' containment reference.
   * @see #getThrow_expression()
   * @generated
   */
  void setThrow_expression(Expression value);

  /**
   * Returns the value of the '<em><b>Named statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Named statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Named statement</em>' containment reference.
   * @see #setNamed_statement(Statement)
   * @see org.xtext.com.javadsl.JavadslPackage#getStatement_Named_statement()
   * @model containment="true"
   * @generated
   */
  Statement getNamed_statement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Statement#getNamed_statement <em>Named statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Named statement</em>' containment reference.
   * @see #getNamed_statement()
   * @generated
   */
  void setNamed_statement(Statement value);

} // Statement
