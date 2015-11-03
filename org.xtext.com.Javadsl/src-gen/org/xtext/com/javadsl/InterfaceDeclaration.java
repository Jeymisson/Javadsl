/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.InterfaceDeclaration#getField_declarations <em>Field declarations</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getInterfaceDeclaration()
 * @model
 * @generated
 */
public interface InterfaceDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Field declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.FieldDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field declarations</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getInterfaceDeclaration_Field_declarations()
   * @model containment="true"
   * @generated
   */
  EList<FieldDeclaration> getField_declarations();

} // InterfaceDeclaration
