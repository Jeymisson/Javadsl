/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Casting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.Casting#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Casting#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getCasting()
 * @model
 * @generated
 */
public interface Casting extends CastingExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(CastingExpression)
   * @see org.xtext.com.javadsl.JavadslPackage#getCasting_Left()
   * @model containment="true"
   * @generated
   */
  CastingExpression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Casting#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(CastingExpression value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getCasting_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

} // Casting
