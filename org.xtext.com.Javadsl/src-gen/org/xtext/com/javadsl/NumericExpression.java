/**
 */
package org.xtext.com.javadsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.NumericExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getNumericExpression()
 * @model
 * @generated
 */
public interface NumericExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BitExpression)
   * @see org.xtext.com.javadsl.JavadslPackage#getNumericExpression_Right()
   * @model containment="true"
   * @generated
   */
  BitExpression getRight();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.NumericExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BitExpression value);

} // NumericExpression
