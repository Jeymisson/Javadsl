/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.Head#getJava <em>Java</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getHead()
 * @model
 * @generated
 */
public interface Head extends EObject
{
  /**
   * Returns the value of the '<em><b>Java</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.CompilationUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getHead_Java()
   * @model containment="true"
   * @generated
   */
  EList<CompilationUnit> getJava();

} // Head
