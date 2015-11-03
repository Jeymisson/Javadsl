/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.Parameter#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends ParameterList
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getParameter_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

} // Parameter
