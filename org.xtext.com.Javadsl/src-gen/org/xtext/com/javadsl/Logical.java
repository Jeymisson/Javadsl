/**
 */
package org.xtext.com.javadsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.Logical#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Logical#getTernary <em>Ternary</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.Logical#getTernary_end <em>Ternary end</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getLogical()
 * @model
 * @generated
 */
public interface Logical extends LogicalExpression
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
   * @see #setLeft(LogicalExpression)
   * @see org.xtext.com.javadsl.JavadslPackage#getLogical_Left()
   * @model containment="true"
   * @generated
   */
  LogicalExpression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Logical#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LogicalExpression value);

  /**
   * Returns the value of the '<em><b>Ternary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ternary</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ternary</em>' containment reference.
   * @see #setTernary(Logical)
   * @see org.xtext.com.javadsl.JavadslPackage#getLogical_Ternary()
   * @model containment="true"
   * @generated
   */
  Logical getTernary();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Logical#getTernary <em>Ternary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ternary</em>' containment reference.
   * @see #getTernary()
   * @generated
   */
  void setTernary(Logical value);

  /**
   * Returns the value of the '<em><b>Ternary end</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ternary end</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ternary end</em>' containment reference.
   * @see #setTernary_end(TestingExpression)
   * @see org.xtext.com.javadsl.JavadslPackage#getLogical_Ternary_end()
   * @model containment="true"
   * @generated
   */
  TestingExpression getTernary_end();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Logical#getTernary_end <em>Ternary end</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ternary end</em>' containment reference.
   * @see #getTernary_end()
   * @generated
   */
  void setTernary_end(TestingExpression value);

} // Logical
