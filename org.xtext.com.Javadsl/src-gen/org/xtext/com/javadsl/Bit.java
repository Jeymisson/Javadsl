/**
 */
package org.xtext.com.javadsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.Bit#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getBit()
 * @model
 * @generated
 */
public interface Bit extends BitExpression
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
   * @see #setLeft(BitExpression)
   * @see org.xtext.com.javadsl.JavadslPackage#getBit_Left()
   * @model containment="true"
   * @generated
   */
  BitExpression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Bit#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BitExpression value);

} // Bit
