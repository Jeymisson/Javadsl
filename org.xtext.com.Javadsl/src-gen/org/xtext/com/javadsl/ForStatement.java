/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.ForStatement#getVariable_declaration <em>Variable declaration</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.ForStatement#getFor_expression1 <em>For expression1</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.ForStatement#getFor_expression2 <em>For expression2</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.ForStatement#getFor_expression3 <em>For expression3</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.ForStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends EObject
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
   * @see org.xtext.com.javadsl.JavadslPackage#getForStatement_Variable_declaration()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable_declaration();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.ForStatement#getVariable_declaration <em>Variable declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable declaration</em>' containment reference.
   * @see #getVariable_declaration()
   * @generated
   */
  void setVariable_declaration(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>For expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For expression1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For expression1</em>' containment reference.
   * @see #setFor_expression1(Expression)
   * @see org.xtext.com.javadsl.JavadslPackage#getForStatement_For_expression1()
   * @model containment="true"
   * @generated
   */
  Expression getFor_expression1();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.ForStatement#getFor_expression1 <em>For expression1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For expression1</em>' containment reference.
   * @see #getFor_expression1()
   * @generated
   */
  void setFor_expression1(Expression value);

  /**
   * Returns the value of the '<em><b>For expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For expression2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For expression2</em>' containment reference.
   * @see #setFor_expression2(Expression)
   * @see org.xtext.com.javadsl.JavadslPackage#getForStatement_For_expression2()
   * @model containment="true"
   * @generated
   */
  Expression getFor_expression2();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.ForStatement#getFor_expression2 <em>For expression2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For expression2</em>' containment reference.
   * @see #getFor_expression2()
   * @generated
   */
  void setFor_expression2(Expression value);

  /**
   * Returns the value of the '<em><b>For expression3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For expression3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For expression3</em>' containment reference.
   * @see #setFor_expression3(Expression)
   * @see org.xtext.com.javadsl.JavadslPackage#getForStatement_For_expression3()
   * @model containment="true"
   * @generated
   */
  Expression getFor_expression3();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.ForStatement#getFor_expression3 <em>For expression3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For expression3</em>' containment reference.
   * @see #getFor_expression3()
   * @generated
   */
  void setFor_expression3(Expression value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see org.xtext.com.javadsl.JavadslPackage#getForStatement_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.ForStatement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

} // ForStatement
