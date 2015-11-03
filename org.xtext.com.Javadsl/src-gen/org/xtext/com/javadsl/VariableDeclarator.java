/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.VariableDeclarator#getVariable_initializer <em>Variable initializer</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getVariableDeclarator()
 * @model
 * @generated
 */
public interface VariableDeclarator extends EObject
{
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
   * @see org.xtext.com.javadsl.JavadslPackage#getVariableDeclarator_Variable_initializer()
   * @model containment="true"
   * @generated
   */
  VariableInitializer getVariable_initializer();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.VariableDeclarator#getVariable_initializer <em>Variable initializer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable initializer</em>' containment reference.
   * @see #getVariable_initializer()
   * @generated
   */
  void setVariable_initializer(VariableInitializer value);

} // VariableDeclarator
