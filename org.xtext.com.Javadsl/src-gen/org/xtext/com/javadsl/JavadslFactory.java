/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.com.javadsl.JavadslPackage
 * @generated
 */
public interface JavadslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JavadslFactory eINSTANCE = org.xtext.com.javadsl.impl.JavadslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Head</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Head</em>'.
   * @generated
   */
  Head createHead();

  /**
   * Returns a new object of class '<em>Compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compilation Unit</em>'.
   * @generated
   */
  CompilationUnit createCompilationUnit();

  /**
   * Returns a new object of class '<em>Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Declaration</em>'.
   * @generated
   */
  TypeDeclaration createTypeDeclaration();

  /**
   * Returns a new object of class '<em>Class Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Declaration</em>'.
   * @generated
   */
  ClassDeclaration createClassDeclaration();

  /**
   * Returns a new object of class '<em>Interface Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Declaration</em>'.
   * @generated
   */
  InterfaceDeclaration createInterfaceDeclaration();

  /**
   * Returns a new object of class '<em>Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Declaration</em>'.
   * @generated
   */
  FieldDeclaration createFieldDeclaration();

  /**
   * Returns a new object of class '<em>Static Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Initializer</em>'.
   * @generated
   */
  StaticInitializer createStaticInitializer();

  /**
   * Returns a new object of class '<em>Method Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Declaration</em>'.
   * @generated
   */
  MethodDeclaration createMethodDeclaration();

  /**
   * Returns a new object of class '<em>Constructor Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor Declaration</em>'.
   * @generated
   */
  ConstructorDeclaration createConstructorDeclaration();

  /**
   * Returns a new object of class '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter List</em>'.
   * @generated
   */
  ParameterList createParameterList();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Statement Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement Block</em>'.
   * @generated
   */
  StatementBlock createStatementBlock();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Variable Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declarator</em>'.
   * @generated
   */
  VariableDeclarator createVariableDeclarator();

  /**
   * Returns a new object of class '<em>Variable Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Initializer</em>'.
   * @generated
   */
  VariableInitializer createVariableInitializer();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Numeric Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Expression</em>'.
   * @generated
   */
  NumericExpression createNumericExpression();

  /**
   * Returns a new object of class '<em>Bit Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit Expression</em>'.
   * @generated
   */
  BitExpression createBitExpression();

  /**
   * Returns a new object of class '<em>Testing Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Testing Expression</em>'.
   * @generated
   */
  TestingExpression createTestingExpression();

  /**
   * Returns a new object of class '<em>Logical Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Expression</em>'.
   * @generated
   */
  LogicalExpression createLogicalExpression();

  /**
   * Returns a new object of class '<em>Args Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Args Expression</em>'.
   * @generated
   */
  ArgsExpression createArgsExpression();

  /**
   * Returns a new object of class '<em>Arglist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arglist</em>'.
   * @generated
   */
  Arglist createArglist();

  /**
   * Returns a new object of class '<em>Casting Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Casting Expression</em>'.
   * @generated
   */
  CastingExpression createCastingExpression();

  /**
   * Returns a new object of class '<em>Creating Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Creating Expression</em>'.
   * @generated
   */
  CreatingExpression createCreatingExpression();

  /**
   * Returns a new object of class '<em>Parenthesis Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parenthesis Expression</em>'.
   * @generated
   */
  ParenthesisExpression createParenthesisExpression();

  /**
   * Returns a new object of class '<em>Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Expression</em>'.
   * @generated
   */
  PrimaryExpression createPrimaryExpression();

  /**
   * Returns a new object of class '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Expression</em>'.
   * @generated
   */
  LiteralExpression createLiteralExpression();

  /**
   * Returns a new object of class '<em>Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Specifier</em>'.
   * @generated
   */
  TypeSpecifier createTypeSpecifier();

  /**
   * Returns a new object of class '<em>Do Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do Statement</em>'.
   * @generated
   */
  DoStatement createDoStatement();

  /**
   * Returns a new object of class '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Statement</em>'.
   * @generated
   */
  ForStatement createForStatement();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Statement</em>'.
   * @generated
   */
  SwitchStatement createSwitchStatement();

  /**
   * Returns a new object of class '<em>Try Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Try Statement</em>'.
   * @generated
   */
  TryStatement createTryStatement();

  /**
   * Returns a new object of class '<em>while statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>while statement</em>'.
   * @generated
   */
  while_statement createwhile_statement();

  /**
   * Returns a new object of class '<em>Numeric</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric</em>'.
   * @generated
   */
  Numeric createNumeric();

  /**
   * Returns a new object of class '<em>Bit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit</em>'.
   * @generated
   */
  Bit createBit();

  /**
   * Returns a new object of class '<em>Testing</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Testing</em>'.
   * @generated
   */
  Testing createTesting();

  /**
   * Returns a new object of class '<em>Logical</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical</em>'.
   * @generated
   */
  Logical createLogical();

  /**
   * Returns a new object of class '<em>Args</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Args</em>'.
   * @generated
   */
  Args createArgs();

  /**
   * Returns a new object of class '<em>Casting</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Casting</em>'.
   * @generated
   */
  Casting createCasting();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JavadslPackage getJavadslPackage();

} //JavadslFactory
