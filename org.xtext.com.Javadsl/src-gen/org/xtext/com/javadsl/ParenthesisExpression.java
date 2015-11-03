/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesis Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.ParenthesisExpression#getType_specifiers <em>Type specifiers</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.ParenthesisExpression#getParenthesis <em>Parenthesis</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getParenthesisExpression()
 * @model
 * @generated
 */
public interface ParenthesisExpression extends CreatingExpression
{
  /**
   * Returns the value of the '<em><b>Type specifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.TypeSpecifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type specifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type specifiers</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getParenthesisExpression_Type_specifiers()
   * @model containment="true"
   * @generated
   */
  EList<TypeSpecifier> getType_specifiers();

  /**
   * Returns the value of the '<em><b>Parenthesis</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.ParenthesisExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parenthesis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parenthesis</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getParenthesisExpression_Parenthesis()
   * @model containment="true"
   * @generated
   */
  EList<ParenthesisExpression> getParenthesis();

} // ParenthesisExpression
