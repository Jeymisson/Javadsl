/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.StatementBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.com.javadsl.JavadslPackage#getStatementBlock()
 * @model
 * @generated
 */
public interface StatementBlock extends StaticInitializer
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.com.javadsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.com.javadsl.JavadslPackage#getStatementBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // StatementBlock
