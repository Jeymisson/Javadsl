/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.VariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.VariableDeclaration#getVariable_declarator <em>Variable declarator</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.VariableDeclaration#getVariable_declarators <em>Variable declarators</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.xtext.com.javadsl.JavadslPackage#getVariableDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.VariableDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Variable declarator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable declarator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable declarator</em>' containment reference.
   * @see #setVariable_declarator(VariableDeclarator)
   * @see org.xtext.com.javadsl.JavadslPackage#getVariableDeclaration_Variable_declarator()
   * @model containment="true"
   * @generated
   */
  VariableDeclarator getVariable_declarator();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.VariableDeclaration#getVariable_declarator <em>Variable declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable declarator</em>' containment reference.
   * @see #getVariable_declarator()
   * @generated
   */
  void setVariable_declarator(VariableDeclarator value);

  /**
   * Returns the value of the '<em><b>Variable declarators</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.VariableDeclarator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable declarators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable declarators</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getVariableDeclaration_Variable_declarators()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclarator> getVariable_declarators();

} // VariableDeclaration
