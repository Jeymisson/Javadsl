/**
 */
package org.xtext.com.javadsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.Type#getSpecifier <em>Specifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getType()
 * @model
 * @generated
 */
public interface Type extends MethodDeclaration, Parameter
{
  /**
   * Returns the value of the '<em><b>Specifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifier</em>' containment reference.
   * @see #setSpecifier(TypeSpecifier)
   * @see org.xtext.com.javadsl.JavadslPackage#getType_Specifier()
   * @model containment="true"
   * @generated
   */
  TypeSpecifier getSpecifier();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.Type#getSpecifier <em>Specifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specifier</em>' containment reference.
   * @see #getSpecifier()
   * @generated
   */
  void setSpecifier(TypeSpecifier value);

} // Type
