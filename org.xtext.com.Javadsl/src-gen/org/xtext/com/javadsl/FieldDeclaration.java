/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.FieldDeclaration#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getFieldDeclaration()
 * @model
 * @generated
 */
public interface FieldDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference.
   * @see #setDeclaration(EObject)
   * @see org.xtext.com.javadsl.JavadslPackage#getFieldDeclaration_Declaration()
   * @model containment="true"
   * @generated
   */
  EObject getDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.FieldDeclaration#getDeclaration <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' containment reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(EObject value);

} // FieldDeclaration
