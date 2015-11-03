/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.LiteralExpression#getLiteral_value <em>Literal value</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getLiteralExpression()
 * @model
 * @generated
 */
public interface LiteralExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Literal value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal value</em>' attribute.
   * @see #setLiteral_value(String)
   * @see org.xtext.com.javadsl.JavadslPackage#getLiteralExpression_Literal_value()
   * @model
   * @generated
   */
  String getLiteral_value();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.LiteralExpression#getLiteral_value <em>Literal value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal value</em>' attribute.
   * @see #getLiteral_value()
   * @generated
   */
  void setLiteral_value(String value);

} // LiteralExpression
