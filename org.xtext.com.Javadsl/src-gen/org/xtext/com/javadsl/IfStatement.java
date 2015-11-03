/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.IfStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.IfStatement#getIf_statement <em>If statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.IfStatement#getElse_statement <em>Else statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.com.javadsl.JavadslPackage#getIfStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.IfStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>If statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If statement</em>' containment reference.
   * @see #setIf_statement(Statement)
   * @see org.xtext.com.javadsl.JavadslPackage#getIfStatement_If_statement()
   * @model containment="true"
   * @generated
   */
  Statement getIf_statement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.IfStatement#getIf_statement <em>If statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If statement</em>' containment reference.
   * @see #getIf_statement()
   * @generated
   */
  void setIf_statement(Statement value);

  /**
   * Returns the value of the '<em><b>Else statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else statement</em>' containment reference.
   * @see #setElse_statement(Statement)
   * @see org.xtext.com.javadsl.JavadslPackage#getIfStatement_Else_statement()
   * @model containment="true"
   * @generated
   */
  Statement getElse_statement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.IfStatement#getElse_statement <em>Else statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else statement</em>' containment reference.
   * @see #getElse_statement()
   * @generated
   */
  void setElse_statement(Statement value);

} // IfStatement
