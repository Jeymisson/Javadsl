/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.ConstructorDeclaration#getStatement_block <em>Statement block</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getConstructorDeclaration()
 * @model
 * @generated
 */
public interface ConstructorDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Statement block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement block</em>' containment reference.
   * @see #setStatement_block(StatementBlock)
   * @see org.xtext.com.javadsl.JavadslPackage#getConstructorDeclaration_Statement_block()
   * @model containment="true"
   * @generated
   */
  StatementBlock getStatement_block();

  /**
   * Sets the value of the '{@link org.xtext.com.javadsl.ConstructorDeclaration#getStatement_block <em>Statement block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement block</em>' containment reference.
   * @see #getStatement_block()
   * @generated
   */
  void setStatement_block(StatementBlock value);

} // ConstructorDeclaration
