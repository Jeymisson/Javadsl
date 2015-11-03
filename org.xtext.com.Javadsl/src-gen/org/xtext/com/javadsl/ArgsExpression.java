/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Args Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.ArgsExpression#getArg_list <em>Arg list</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getArgsExpression()
 * @model
 * @generated
 */
public interface ArgsExpression extends TestingExpression
{
  /**
   * Returns the value of the '<em><b>Arg list</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.Arglist}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg list</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg list</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getArgsExpression_Arg_list()
   * @model containment="true"
   * @generated
   */
  EList<Arglist> getArg_list();

} // ArgsExpression
