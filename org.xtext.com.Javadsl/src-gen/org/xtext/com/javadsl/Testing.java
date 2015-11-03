/**
 */
package org.xtext.com.javadsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.Testing#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getTesting()
 * @model
 * @generated
 */
public interface Testing extends TestingExpression
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
   * @see #setLeft(TestingExpression)
   * @see org.xtext.com.javadsl.JavadslPackage#getTesting_Left()
   * @model containment="true"
   * @generated
   */
  TestingExpression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Testing#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(TestingExpression value);

} // Testing
