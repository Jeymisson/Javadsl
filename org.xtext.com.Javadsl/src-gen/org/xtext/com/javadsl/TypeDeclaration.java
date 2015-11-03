/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.TypeDeclaration#getClass_declaration <em>Class declaration</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.TypeDeclaration#getInterface_declaration <em>Interface declaration</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getTypeDeclaration()
 * @model
 * @generated
 */
public interface TypeDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Class declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class declaration</em>' containment reference.
   * @see #setClass_declaration(ClassDeclaration)
   * @see org.xtext.com.javadsl.JavadslPackage#getTypeDeclaration_Class_declaration()
   * @model containment="true"
   * @generated
   */
  ClassDeclaration getClass_declaration();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.TypeDeclaration#getClass_declaration <em>Class declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class declaration</em>' containment reference.
   * @see #getClass_declaration()
   * @generated
   */
  void setClass_declaration(ClassDeclaration value);

  /**
   * Returns the value of the '<em><b>Interface declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface declaration</em>' containment reference.
   * @see #setInterface_declaration(InterfaceDeclaration)
   * @see org.xtext.com.javadsl.JavadslPackage#getTypeDeclaration_Interface_declaration()
   * @model containment="true"
   * @generated
   */
  InterfaceDeclaration getInterface_declaration();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.TypeDeclaration#getInterface_declaration <em>Interface declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface declaration</em>' containment reference.
   * @see #getInterface_declaration()
   * @generated
   */
  void setInterface_declaration(InterfaceDeclaration value);

} // TypeDeclaration
