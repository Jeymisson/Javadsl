/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.VariableInitializer#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.VariableInitializer#getVariable_initializer <em>Variable initializer</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.VariableInitializer#getVariable_initializers <em>Variable initializers</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getVariableInitializer()
 * @model
 * @generated
 */
public interface VariableInitializer extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see org.xtext.com.javadsl.JavadslPackage#getVariableInitializer_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.VariableInitializer#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Variable initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable initializer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable initializer</em>' containment reference.
   * @see #setVariable_initializer(VariableInitializer)
   * @see org.xtext.com.javadsl.JavadslPackage#getVariableInitializer_Variable_initializer()
   * @model containment="true"
   * @generated
   */
  VariableInitializer getVariable_initializer();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.VariableInitializer#getVariable_initializer <em>Variable initializer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable initializer</em>' containment reference.
   * @see #getVariable_initializer()
   * @generated
   */
  void setVariable_initializer(VariableInitializer value);

  /**
   * Returns the value of the '<em><b>Variable initializers</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.VariableInitializer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable initializers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable initializers</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getVariableInitializer_Variable_initializers()
   * @model containment="true"
   * @generated
   */
  EList<VariableInitializer> getVariable_initializers();

} // VariableInitializer
