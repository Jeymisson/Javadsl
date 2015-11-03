/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.TryStatement#getTry_statement <em>Try statement</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.TryStatement#getParamenters <em>Paramenters</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.TryStatement#getCatch_statements <em>Catch statements</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.TryStatement#getFinally_statement <em>Finally statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getTryStatement()
 * @model
 * @generated
 */
public interface TryStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Try statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Try statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Try statement</em>' containment reference.
   * @see #setTry_statement(Statement)
   * @see org.xtext.com.javadsl.JavadslPackage#getTryStatement_Try_statement()
   * @model containment="true"
   * @generated
   */
  Statement getTry_statement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.TryStatement#getTry_statement <em>Try statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Try statement</em>' containment reference.
   * @see #getTry_statement()
   * @generated
   */
  void setTry_statement(Statement value);

  /**
   * Returns the value of the '<em><b>Paramenters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paramenters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paramenters</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getTryStatement_Paramenters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParamenters();

  /**
   * Returns the value of the '<em><b>Catch statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catch statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catch statements</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getTryStatement_Catch_statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getCatch_statements();

  /**
   * Returns the value of the '<em><b>Finally statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finally statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finally statement</em>' containment reference.
   * @see #setFinally_statement(Statement)
   * @see org.xtext.com.javadsl.JavadslPackage#getTryStatement_Finally_statement()
   * @model containment="true"
   * @generated
   */
  Statement getFinally_statement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.TryStatement#getFinally_statement <em>Finally statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finally statement</em>' containment reference.
   * @see #getFinally_statement()
   * @generated
   */
  void setFinally_statement(Statement value);

} // TryStatement
