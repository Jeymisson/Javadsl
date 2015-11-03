/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.CompilationUnit#getPackage <em>Package</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.CompilationUnit#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.CompilationUnit#getType_declarations <em>Type declarations</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see org.xtext.com.javadsl.JavadslPackage#getCompilationUnit_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.CompilationUnit#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' attribute list.
   * @see org.xtext.com.javadsl.JavadslPackage#getCompilationUnit_Imports()
   * @model unique="false"
   * @generated
   */
  EList<String> getImports();

  /**
   * Returns the value of the '<em><b>Type declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.TypeDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type declarations</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getCompilationUnit_Type_declarations()
   * @model containment="true"
   * @generated
   */
  EList<TypeDeclaration> getType_declarations();

} // CompilationUnit
