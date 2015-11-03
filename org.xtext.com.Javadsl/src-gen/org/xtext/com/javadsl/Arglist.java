/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arglist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.Arglist#getArg <em>Arg</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Arglist#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getArglist()
 * @model
 * @generated
 */
public interface Arglist extends EObject
{
  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(CastingExpression)
   * @see org.xtext.com.javadsl.JavadslPackage#getArglist_Arg()
   * @model containment="true"
   * @generated
   */
  CastingExpression getArg();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Arglist#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(CastingExpression value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.CastingExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getArglist_Args()
   * @model containment="true"
   * @generated
   */
  EList<CastingExpression> getArgs();

} // Arglist
