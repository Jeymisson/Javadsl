/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.SwitchStatement#getSwitch_expression <em>Switch expression</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.SwitchStatement#getCase_expressions <em>Case expressions</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.SwitchStatement#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getSwitchStatement()
 * @model
 * @generated
 */
public interface SwitchStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Switch expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch expression</em>' containment reference.
   * @see #setSwitch_expression(Expression)
   * @see org.xtext.com.javadsl.JavadslPackage#getSwitchStatement_Switch_expression()
   * @model containment="true"
   * @generated
   */
  Expression getSwitch_expression();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.SwitchStatement#getSwitch_expression <em>Switch expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch expression</em>' containment reference.
   * @see #getSwitch_expression()
   * @generated
   */
  void setSwitch_expression(Expression value);

  /**
   * Returns the value of the '<em><b>Case expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case expressions</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getSwitchStatement_Case_expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getCase_expressions();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getSwitchStatement_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // SwitchStatement
