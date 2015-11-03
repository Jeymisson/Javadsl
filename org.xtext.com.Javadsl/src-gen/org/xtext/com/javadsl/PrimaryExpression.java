/**
 */
package org.xtext.com.javadsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.PrimaryExpression#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getPrimaryExpression()
 * @model
 * @generated
 */
public interface PrimaryExpression extends ParenthesisExpression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(LiteralExpression)
   * @see org.xtext.com.javadsl.JavadslPackage#getPrimaryExpression_Value()
   * @model containment="true"
   * @generated
   */
  LiteralExpression getValue();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.PrimaryExpression#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(LiteralExpression value);

} // PrimaryExpression
