/**
 */
package org.xtext.com.javadsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.com.javadsl.JavadslFactory
 * @model kind="package"
 * @generated
 */
public interface JavadslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "javadsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/com/Javadsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "javadsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JavadslPackage eINSTANCE = org.xtext.com.javadsl.impl.JavadslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.HeadImpl <em>Head</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.HeadImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getHead()
   * @generated
   */
  int HEAD = 0;

  /**
   * The feature id for the '<em><b>Java</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD__JAVA = 0;

  /**
   * The number of structural features of the '<em>Head</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEAD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.CompilationUnitImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getCompilationUnit()
   * @generated
   */
  int COMPILATION_UNIT = 1;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Type declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__TYPE_DECLARATIONS = 2;

  /**
   * The number of structural features of the '<em>Compilation Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.TypeDeclarationImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getTypeDeclaration()
   * @generated
   */
  int TYPE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Class declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__CLASS_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Interface declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__INTERFACE_DECLARATION = 1;

  /**
   * The number of structural features of the '<em>Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.ClassDeclarationImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getClassDeclaration()
   * @generated
   */
  int CLASS_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Field declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__FIELD_DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>Class Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.InterfaceDeclarationImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getInterfaceDeclaration()
   * @generated
   */
  int INTERFACE_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Field declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__FIELD_DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Interface Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.FieldDeclarationImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getFieldDeclaration()
   * @generated
   */
  int FIELD_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__DECLARATION = 0;

  /**
   * The number of structural features of the '<em>Field Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.StaticInitializerImpl <em>Static Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.StaticInitializerImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getStaticInitializer()
   * @generated
   */
  int STATIC_INITIALIZER = 6;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INITIALIZER__DECLARATION = FIELD_DECLARATION__DECLARATION;

  /**
   * The number of structural features of the '<em>Static Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INITIALIZER_FEATURE_COUNT = FIELD_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.MethodDeclarationImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getMethodDeclaration()
   * @generated
   */
  int METHOD_DECLARATION = 7;

  /**
   * The number of structural features of the '<em>Method Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.ConstructorDeclarationImpl <em>Constructor Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.ConstructorDeclarationImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getConstructorDeclaration()
   * @generated
   */
  int CONSTRUCTOR_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Statement block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK = 0;

  /**
   * The number of structural features of the '<em>Constructor Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.ParameterListImpl <em>Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.ParameterListImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getParameterList()
   * @generated
   */
  int PARAMETER_LIST = 9;

  /**
   * The feature id for the '<em><b>Statement block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__STATEMENT_BLOCK = METHOD_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = METHOD_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.ParameterImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 10;

  /**
   * The feature id for the '<em><b>Statement block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__STATEMENT_BLOCK = PARAMETER_LIST__STATEMENT_BLOCK;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PARAMETERS = PARAMETER_LIST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = PARAMETER_LIST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.StatementBlockImpl <em>Statement Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.StatementBlockImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getStatementBlock()
   * @generated
   */
  int STATEMENT_BLOCK = 11;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__DECLARATION = STATIC_INITIALIZER__DECLARATION;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__STATEMENTS = STATIC_INITIALIZER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Statement Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK_FEATURE_COUNT = STATIC_INITIALIZER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.VariableDeclarationImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Variable declarator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__VARIABLE_DECLARATOR = 1;

  /**
   * The feature id for the '<em><b>Variable declarators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__VARIABLE_DECLARATORS = 2;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.VariableDeclaratorImpl <em>Variable Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.VariableDeclaratorImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getVariableDeclarator()
   * @generated
   */
  int VARIABLE_DECLARATOR = 13;

  /**
   * The feature id for the '<em><b>Variable initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR__VARIABLE_INITIALIZER = 0;

  /**
   * The number of structural features of the '<em>Variable Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.VariableInitializerImpl <em>Variable Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.VariableInitializerImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getVariableInitializer()
   * @generated
   */
  int VARIABLE_INITIALIZER = 14;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER__EXPR = 0;

  /**
   * The feature id for the '<em><b>Variable initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER__VARIABLE_INITIALIZER = 1;

  /**
   * The feature id for the '<em><b>Variable initializers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER__VARIABLE_INITIALIZERS = 2;

  /**
   * The number of structural features of the '<em>Variable Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.TypeImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getType()
   * @generated
   */
  int TYPE = 15;

  /**
   * The feature id for the '<em><b>Statement block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__STATEMENT_BLOCK = METHOD_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__PARAMETERS = METHOD_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Specifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__SPECIFIER = METHOD_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = METHOD_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.ExpressionImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 16;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.NumericExpressionImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getNumericExpression()
   * @generated
   */
  int NUMERIC_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Numeric Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.BitExpressionImpl <em>Bit Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.BitExpressionImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getBitExpression()
   * @generated
   */
  int BIT_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_EXPRESSION__RIGHT = NUMERIC_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Bit Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_EXPRESSION_FEATURE_COUNT = NUMERIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.LogicalExpressionImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getLogicalExpression()
   * @generated
   */
  int LOGICAL_EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION__RIGHT = BIT_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Logical Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION_FEATURE_COUNT = BIT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.TestingExpressionImpl <em>Testing Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.TestingExpressionImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getTestingExpression()
   * @generated
   */
  int TESTING_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTING_EXPRESSION__RIGHT = LOGICAL_EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Testing Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTING_EXPRESSION_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.ArgsExpressionImpl <em>Args Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.ArgsExpressionImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getArgsExpression()
   * @generated
   */
  int ARGS_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGS_EXPRESSION__RIGHT = TESTING_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Arg list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGS_EXPRESSION__ARG_LIST = TESTING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Args Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGS_EXPRESSION_FEATURE_COUNT = TESTING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.ArglistImpl <em>Arglist</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.ArglistImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getArglist()
   * @generated
   */
  int ARGLIST = 22;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST__ARG = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST__ARGS = 1;

  /**
   * The number of structural features of the '<em>Arglist</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGLIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.CastingExpressionImpl <em>Casting Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.CastingExpressionImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getCastingExpression()
   * @generated
   */
  int CASTING_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTING_EXPRESSION__RIGHT = ARGS_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Arg list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTING_EXPRESSION__ARG_LIST = ARGS_EXPRESSION__ARG_LIST;

  /**
   * The number of structural features of the '<em>Casting Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTING_EXPRESSION_FEATURE_COUNT = ARGS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.CreatingExpressionImpl <em>Creating Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.CreatingExpressionImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getCreatingExpression()
   * @generated
   */
  int CREATING_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION__RIGHT = CASTING_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Arg list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION__ARG_LIST = CASTING_EXPRESSION__ARG_LIST;

  /**
   * The number of structural features of the '<em>Creating Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION_FEATURE_COUNT = CASTING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.ParenthesisExpressionImpl <em>Parenthesis Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.ParenthesisExpressionImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getParenthesisExpression()
   * @generated
   */
  int PARENTHESIS_EXPRESSION = 25;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_EXPRESSION__RIGHT = CREATING_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Arg list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_EXPRESSION__ARG_LIST = CREATING_EXPRESSION__ARG_LIST;

  /**
   * The feature id for the '<em><b>Type specifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_EXPRESSION__TYPE_SPECIFIERS = CREATING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parenthesis</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_EXPRESSION__PARENTHESIS = CREATING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parenthesis Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_EXPRESSION_FEATURE_COUNT = CREATING_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.PrimaryExpressionImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getPrimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__RIGHT = PARENTHESIS_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Arg list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__ARG_LIST = PARENTHESIS_EXPRESSION__ARG_LIST;

  /**
   * The feature id for the '<em><b>Type specifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__TYPE_SPECIFIERS = PARENTHESIS_EXPRESSION__TYPE_SPECIFIERS;

  /**
   * The feature id for the '<em><b>Parenthesis</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__PARENTHESIS = PARENTHESIS_EXPRESSION__PARENTHESIS;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__VALUE = PARENTHESIS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = PARENTHESIS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.LiteralExpressionImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getLiteralExpression()
   * @generated
   */
  int LITERAL_EXPRESSION = 27;

  /**
   * The feature id for the '<em><b>Literal value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION__LITERAL_VALUE = 0;

  /**
   * The number of structural features of the '<em>Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.TypeSpecifierImpl <em>Type Specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.TypeSpecifierImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getTypeSpecifier()
   * @generated
   */
  int TYPE_SPECIFIER = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFIER__NAME = 0;

  /**
   * The number of structural features of the '<em>Type Specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.DoStatementImpl <em>Do Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.DoStatementImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getDoStatement()
   * @generated
   */
  int DO_STATEMENT = 29;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Do Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.ForStatementImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getForStatement()
   * @generated
   */
  int FOR_STATEMENT = 30;

  /**
   * The feature id for the '<em><b>Variable declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__VARIABLE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>For expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FOR_EXPRESSION1 = 1;

  /**
   * The feature id for the '<em><b>For expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FOR_EXPRESSION2 = 2;

  /**
   * The feature id for the '<em><b>For expression3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FOR_EXPRESSION3 = 3;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__STATEMENT = 4;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.IfStatementImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 31;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>If statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__IF_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Else statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.StatementImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 32;

  /**
   * The feature id for the '<em><b>Variable declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VARIABLE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Statement expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__STATEMENT_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Statement block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__STATEMENT_BLOCK = 2;

  /**
   * The feature id for the '<em><b>If statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IF_STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Do statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__DO_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>While statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__WHILE_STATEMENT = 5;

  /**
   * The feature id for the '<em><b>For statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FOR_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Try statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__TRY_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Swith statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__SWITH_STATEMENT = 8;

  /**
   * The feature id for the '<em><b>Sync expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__SYNC_EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Sync statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__SYNC_STATEMENT = 10;

  /**
   * The feature id for the '<em><b>Return expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__RETURN_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Throw expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__THROW_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Named statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAMED_STATEMENT = 13;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.SwitchStatementImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getSwitchStatement()
   * @generated
   */
  int SWITCH_STATEMENT = 33;

  /**
   * The feature id for the '<em><b>Switch expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__SWITCH_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Case expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__CASE_EXPRESSIONS = 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__STATEMENTS = 2;

  /**
   * The number of structural features of the '<em>Switch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.TryStatementImpl <em>Try Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.TryStatementImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getTryStatement()
   * @generated
   */
  int TRY_STATEMENT = 34;

  /**
   * The feature id for the '<em><b>Try statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__TRY_STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Paramenters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__PARAMENTERS = 1;

  /**
   * The feature id for the '<em><b>Catch statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__CATCH_STATEMENTS = 2;

  /**
   * The feature id for the '<em><b>Finally statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__FINALLY_STATEMENT = 3;

  /**
   * The number of structural features of the '<em>Try Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.while_statementImpl <em>while statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.while_statementImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getwhile_statement()
   * @generated
   */
  int WHILE_STATEMENT = 35;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>while statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.NumericImpl <em>Numeric</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.NumericImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getNumeric()
   * @generated
   */
  int NUMERIC = 36;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC__RIGHT = NUMERIC_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC__LEFT = NUMERIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Numeric</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_FEATURE_COUNT = NUMERIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.BitImpl <em>Bit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.BitImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getBit()
   * @generated
   */
  int BIT = 37;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT__RIGHT = BIT_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT__LEFT = BIT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_FEATURE_COUNT = BIT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.TestingImpl <em>Testing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.TestingImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getTesting()
   * @generated
   */
  int TESTING = 38;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTING__RIGHT = TESTING_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTING__LEFT = TESTING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Testing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTING_FEATURE_COUNT = TESTING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.LogicalImpl <em>Logical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.LogicalImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getLogical()
   * @generated
   */
  int LOGICAL = 39;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL__RIGHT = LOGICAL_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL__LEFT = LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ternary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL__TERNARY = LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ternary end</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL__TERNARY_END = LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Logical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FEATURE_COUNT = LOGICAL_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.ArgsImpl <em>Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.ArgsImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getArgs()
   * @generated
   */
  int ARGS = 40;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGS__RIGHT = ARGS_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Arg list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGS__ARG_LIST = ARGS_EXPRESSION__ARG_LIST;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGS__LEFT = ARGS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGS_FEATURE_COUNT = ARGS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.com.javadsl.impl.CastingImpl <em>Casting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.com.javadsl.impl.CastingImpl
   * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getCasting()
   * @generated
   */
  int CASTING = 41;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTING__RIGHT = CASTING_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Arg list</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTING__ARG_LIST = CASTING_EXPRESSION__ARG_LIST;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTING__LEFT = CASTING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTING__TYPES = CASTING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Casting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASTING_FEATURE_COUNT = CASTING_EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.Head <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Head</em>'.
   * @see org.xtext.com.javadsl.Head
   * @generated
   */
  EClass getHead();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.Head#getJava <em>Java</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Java</em>'.
   * @see org.xtext.com.javadsl.Head#getJava()
   * @see #getHead()
   * @generated
   */
  EReference getHead_Java();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.CompilationUnit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compilation Unit</em>'.
   * @see org.xtext.com.javadsl.CompilationUnit
   * @generated
   */
  EClass getCompilationUnit();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.com.javadsl.CompilationUnit#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see org.xtext.com.javadsl.CompilationUnit#getPackage()
   * @see #getCompilationUnit()
   * @generated
   */
  EAttribute getCompilationUnit_Package();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.com.javadsl.CompilationUnit#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Imports</em>'.
   * @see org.xtext.com.javadsl.CompilationUnit#getImports()
   * @see #getCompilationUnit()
   * @generated
   */
  EAttribute getCompilationUnit_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.CompilationUnit#getType_declarations <em>Type declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type declarations</em>'.
   * @see org.xtext.com.javadsl.CompilationUnit#getType_declarations()
   * @see #getCompilationUnit()
   * @generated
   */
  EReference getCompilationUnit_Type_declarations();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.TypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Declaration</em>'.
   * @see org.xtext.com.javadsl.TypeDeclaration
   * @generated
   */
  EClass getTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.TypeDeclaration#getClass_declaration <em>Class declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class declaration</em>'.
   * @see org.xtext.com.javadsl.TypeDeclaration#getClass_declaration()
   * @see #getTypeDeclaration()
   * @generated
   */
  EReference getTypeDeclaration_Class_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.TypeDeclaration#getInterface_declaration <em>Interface declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface declaration</em>'.
   * @see org.xtext.com.javadsl.TypeDeclaration#getInterface_declaration()
   * @see #getTypeDeclaration()
   * @generated
   */
  EReference getTypeDeclaration_Interface_declaration();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Declaration</em>'.
   * @see org.xtext.com.javadsl.ClassDeclaration
   * @generated
   */
  EClass getClassDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.com.javadsl.ClassDeclaration#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.xtext.com.javadsl.ClassDeclaration#getModifiers()
   * @see #getClassDeclaration()
   * @generated
   */
  EAttribute getClassDeclaration_Modifiers();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.ClassDeclaration#getField_declarations <em>Field declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field declarations</em>'.
   * @see org.xtext.com.javadsl.ClassDeclaration#getField_declarations()
   * @see #getClassDeclaration()
   * @generated
   */
  EReference getClassDeclaration_Field_declarations();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.InterfaceDeclaration <em>Interface Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Declaration</em>'.
   * @see org.xtext.com.javadsl.InterfaceDeclaration
   * @generated
   */
  EClass getInterfaceDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.InterfaceDeclaration#getField_declarations <em>Field declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Field declarations</em>'.
   * @see org.xtext.com.javadsl.InterfaceDeclaration#getField_declarations()
   * @see #getInterfaceDeclaration()
   * @generated
   */
  EReference getInterfaceDeclaration_Field_declarations();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.FieldDeclaration <em>Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Declaration</em>'.
   * @see org.xtext.com.javadsl.FieldDeclaration
   * @generated
   */
  EClass getFieldDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.FieldDeclaration#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaration</em>'.
   * @see org.xtext.com.javadsl.FieldDeclaration#getDeclaration()
   * @see #getFieldDeclaration()
   * @generated
   */
  EReference getFieldDeclaration_Declaration();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.StaticInitializer <em>Static Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Initializer</em>'.
   * @see org.xtext.com.javadsl.StaticInitializer
   * @generated
   */
  EClass getStaticInitializer();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.MethodDeclaration <em>Method Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Declaration</em>'.
   * @see org.xtext.com.javadsl.MethodDeclaration
   * @generated
   */
  EClass getMethodDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.ConstructorDeclaration <em>Constructor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor Declaration</em>'.
   * @see org.xtext.com.javadsl.ConstructorDeclaration
   * @generated
   */
  EClass getConstructorDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.ConstructorDeclaration#getStatement_block <em>Statement block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement block</em>'.
   * @see org.xtext.com.javadsl.ConstructorDeclaration#getStatement_block()
   * @see #getConstructorDeclaration()
   * @generated
   */
  EReference getConstructorDeclaration_Statement_block();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter List</em>'.
   * @see org.xtext.com.javadsl.ParameterList
   * @generated
   */
  EClass getParameterList();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.com.javadsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.Parameter#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.com.javadsl.Parameter#getParameters()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.StatementBlock <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Block</em>'.
   * @see org.xtext.com.javadsl.StatementBlock
   * @generated
   */
  EClass getStatementBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.StatementBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.com.javadsl.StatementBlock#getStatements()
   * @see #getStatementBlock()
   * @generated
   */
  EReference getStatementBlock_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.xtext.com.javadsl.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.VariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.com.javadsl.VariableDeclaration#getType()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.VariableDeclaration#getVariable_declarator <em>Variable declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable declarator</em>'.
   * @see org.xtext.com.javadsl.VariableDeclaration#getVariable_declarator()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Variable_declarator();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.VariableDeclaration#getVariable_declarators <em>Variable declarators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable declarators</em>'.
   * @see org.xtext.com.javadsl.VariableDeclaration#getVariable_declarators()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Variable_declarators();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.VariableDeclarator <em>Variable Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declarator</em>'.
   * @see org.xtext.com.javadsl.VariableDeclarator
   * @generated
   */
  EClass getVariableDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.VariableDeclarator#getVariable_initializer <em>Variable initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable initializer</em>'.
   * @see org.xtext.com.javadsl.VariableDeclarator#getVariable_initializer()
   * @see #getVariableDeclarator()
   * @generated
   */
  EReference getVariableDeclarator_Variable_initializer();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.VariableInitializer <em>Variable Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Initializer</em>'.
   * @see org.xtext.com.javadsl.VariableInitializer
   * @generated
   */
  EClass getVariableInitializer();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.VariableInitializer#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.com.javadsl.VariableInitializer#getExpr()
   * @see #getVariableInitializer()
   * @generated
   */
  EReference getVariableInitializer_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.VariableInitializer#getVariable_initializer <em>Variable initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable initializer</em>'.
   * @see org.xtext.com.javadsl.VariableInitializer#getVariable_initializer()
   * @see #getVariableInitializer()
   * @generated
   */
  EReference getVariableInitializer_Variable_initializer();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.VariableInitializer#getVariable_initializers <em>Variable initializers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable initializers</em>'.
   * @see org.xtext.com.javadsl.VariableInitializer#getVariable_initializers()
   * @see #getVariableInitializer()
   * @generated
   */
  EReference getVariableInitializer_Variable_initializers();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.com.javadsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Type#getSpecifier <em>Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Specifier</em>'.
   * @see org.xtext.com.javadsl.Type#getSpecifier()
   * @see #getType()
   * @generated
   */
  EReference getType_Specifier();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.com.javadsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.NumericExpression <em>Numeric Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Expression</em>'.
   * @see org.xtext.com.javadsl.NumericExpression
   * @generated
   */
  EClass getNumericExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.NumericExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.com.javadsl.NumericExpression#getRight()
   * @see #getNumericExpression()
   * @generated
   */
  EReference getNumericExpression_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.BitExpression <em>Bit Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit Expression</em>'.
   * @see org.xtext.com.javadsl.BitExpression
   * @generated
   */
  EClass getBitExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.TestingExpression <em>Testing Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Testing Expression</em>'.
   * @see org.xtext.com.javadsl.TestingExpression
   * @generated
   */
  EClass getTestingExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.LogicalExpression <em>Logical Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Expression</em>'.
   * @see org.xtext.com.javadsl.LogicalExpression
   * @generated
   */
  EClass getLogicalExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.ArgsExpression <em>Args Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Args Expression</em>'.
   * @see org.xtext.com.javadsl.ArgsExpression
   * @generated
   */
  EClass getArgsExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.ArgsExpression#getArg_list <em>Arg list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arg list</em>'.
   * @see org.xtext.com.javadsl.ArgsExpression#getArg_list()
   * @see #getArgsExpression()
   * @generated
   */
  EReference getArgsExpression_Arg_list();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.Arglist <em>Arglist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arglist</em>'.
   * @see org.xtext.com.javadsl.Arglist
   * @generated
   */
  EClass getArglist();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Arglist#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see org.xtext.com.javadsl.Arglist#getArg()
   * @see #getArglist()
   * @generated
   */
  EReference getArglist_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.Arglist#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.xtext.com.javadsl.Arglist#getArgs()
   * @see #getArglist()
   * @generated
   */
  EReference getArglist_Args();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.CastingExpression <em>Casting Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Casting Expression</em>'.
   * @see org.xtext.com.javadsl.CastingExpression
   * @generated
   */
  EClass getCastingExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.CreatingExpression <em>Creating Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Creating Expression</em>'.
   * @see org.xtext.com.javadsl.CreatingExpression
   * @generated
   */
  EClass getCreatingExpression();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.ParenthesisExpression <em>Parenthesis Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesis Expression</em>'.
   * @see org.xtext.com.javadsl.ParenthesisExpression
   * @generated
   */
  EClass getParenthesisExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.ParenthesisExpression#getType_specifiers <em>Type specifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type specifiers</em>'.
   * @see org.xtext.com.javadsl.ParenthesisExpression#getType_specifiers()
   * @see #getParenthesisExpression()
   * @generated
   */
  EReference getParenthesisExpression_Type_specifiers();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.ParenthesisExpression#getParenthesis <em>Parenthesis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parenthesis</em>'.
   * @see org.xtext.com.javadsl.ParenthesisExpression#getParenthesis()
   * @see #getParenthesisExpression()
   * @generated
   */
  EReference getParenthesisExpression_Parenthesis();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see org.xtext.com.javadsl.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.PrimaryExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.com.javadsl.PrimaryExpression#getValue()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.LiteralExpression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Expression</em>'.
   * @see org.xtext.com.javadsl.LiteralExpression
   * @generated
   */
  EClass getLiteralExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.com.javadsl.LiteralExpression#getLiteral_value <em>Literal value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal value</em>'.
   * @see org.xtext.com.javadsl.LiteralExpression#getLiteral_value()
   * @see #getLiteralExpression()
   * @generated
   */
  EAttribute getLiteralExpression_Literal_value();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.TypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Specifier</em>'.
   * @see org.xtext.com.javadsl.TypeSpecifier
   * @generated
   */
  EClass getTypeSpecifier();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.com.javadsl.TypeSpecifier#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.com.javadsl.TypeSpecifier#getName()
   * @see #getTypeSpecifier()
   * @generated
   */
  EAttribute getTypeSpecifier_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.DoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Statement</em>'.
   * @see org.xtext.com.javadsl.DoStatement
   * @generated
   */
  EClass getDoStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.DoStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.com.javadsl.DoStatement#getStatement()
   * @see #getDoStatement()
   * @generated
   */
  EReference getDoStatement_Statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.DoStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.com.javadsl.DoStatement#getExpression()
   * @see #getDoStatement()
   * @generated
   */
  EReference getDoStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see org.xtext.com.javadsl.ForStatement
   * @generated
   */
  EClass getForStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.ForStatement#getVariable_declaration <em>Variable declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable declaration</em>'.
   * @see org.xtext.com.javadsl.ForStatement#getVariable_declaration()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Variable_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.ForStatement#getFor_expression1 <em>For expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For expression1</em>'.
   * @see org.xtext.com.javadsl.ForStatement#getFor_expression1()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_For_expression1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.ForStatement#getFor_expression2 <em>For expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For expression2</em>'.
   * @see org.xtext.com.javadsl.ForStatement#getFor_expression2()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_For_expression2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.ForStatement#getFor_expression3 <em>For expression3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For expression3</em>'.
   * @see org.xtext.com.javadsl.ForStatement#getFor_expression3()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_For_expression3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.ForStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.com.javadsl.ForStatement#getStatement()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see org.xtext.com.javadsl.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.IfStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.com.javadsl.IfStatement#getExpression()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.IfStatement#getIf_statement <em>If statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If statement</em>'.
   * @see org.xtext.com.javadsl.IfStatement#getIf_statement()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_If_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.IfStatement#getElse_statement <em>Else statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else statement</em>'.
   * @see org.xtext.com.javadsl.IfStatement#getElse_statement()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Else_statement();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.com.javadsl.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getVariable_declaration <em>Variable declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable declaration</em>'.
   * @see org.xtext.com.javadsl.Statement#getVariable_declaration()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Variable_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getStatement_expression <em>Statement expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement expression</em>'.
   * @see org.xtext.com.javadsl.Statement#getStatement_expression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Statement_expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getStatement_block <em>Statement block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement block</em>'.
   * @see org.xtext.com.javadsl.Statement#getStatement_block()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Statement_block();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getIf_statement <em>If statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If statement</em>'.
   * @see org.xtext.com.javadsl.Statement#getIf_statement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_If_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getDo_statement <em>Do statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Do statement</em>'.
   * @see org.xtext.com.javadsl.Statement#getDo_statement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Do_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getWhile_statement <em>While statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While statement</em>'.
   * @see org.xtext.com.javadsl.Statement#getWhile_statement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_While_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getFor_statement <em>For statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For statement</em>'.
   * @see org.xtext.com.javadsl.Statement#getFor_statement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_For_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getTry_statement <em>Try statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Try statement</em>'.
   * @see org.xtext.com.javadsl.Statement#getTry_statement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Try_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getSwith_statement <em>Swith statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Swith statement</em>'.
   * @see org.xtext.com.javadsl.Statement#getSwith_statement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Swith_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getSync_expression <em>Sync expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sync expression</em>'.
   * @see org.xtext.com.javadsl.Statement#getSync_expression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Sync_expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getSync_statement <em>Sync statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sync statement</em>'.
   * @see org.xtext.com.javadsl.Statement#getSync_statement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Sync_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getReturn_expression <em>Return expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return expression</em>'.
   * @see org.xtext.com.javadsl.Statement#getReturn_expression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Return_expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getThrow_expression <em>Throw expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Throw expression</em>'.
   * @see org.xtext.com.javadsl.Statement#getThrow_expression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Throw_expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Statement#getNamed_statement <em>Named statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Named statement</em>'.
   * @see org.xtext.com.javadsl.Statement#getNamed_statement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Named_statement();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Statement</em>'.
   * @see org.xtext.com.javadsl.SwitchStatement
   * @generated
   */
  EClass getSwitchStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.SwitchStatement#getSwitch_expression <em>Switch expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch expression</em>'.
   * @see org.xtext.com.javadsl.SwitchStatement#getSwitch_expression()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Switch_expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.SwitchStatement#getCase_expressions <em>Case expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Case expressions</em>'.
   * @see org.xtext.com.javadsl.SwitchStatement#getCase_expressions()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Case_expressions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.SwitchStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.com.javadsl.SwitchStatement#getStatements()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.TryStatement <em>Try Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Try Statement</em>'.
   * @see org.xtext.com.javadsl.TryStatement
   * @generated
   */
  EClass getTryStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.TryStatement#getTry_statement <em>Try statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Try statement</em>'.
   * @see org.xtext.com.javadsl.TryStatement#getTry_statement()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_Try_statement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.TryStatement#getParamenters <em>Paramenters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Paramenters</em>'.
   * @see org.xtext.com.javadsl.TryStatement#getParamenters()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_Paramenters();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.TryStatement#getCatch_statements <em>Catch statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Catch statements</em>'.
   * @see org.xtext.com.javadsl.TryStatement#getCatch_statements()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_Catch_statements();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.TryStatement#getFinally_statement <em>Finally statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Finally statement</em>'.
   * @see org.xtext.com.javadsl.TryStatement#getFinally_statement()
   * @see #getTryStatement()
   * @generated
   */
  EReference getTryStatement_Finally_statement();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.while_statement <em>while statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>while statement</em>'.
   * @see org.xtext.com.javadsl.while_statement
   * @generated
   */
  EClass getwhile_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.while_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.com.javadsl.while_statement#getExpression()
   * @see #getwhile_statement()
   * @generated
   */
  EReference getwhile_statement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.while_statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.com.javadsl.while_statement#getStatement()
   * @see #getwhile_statement()
   * @generated
   */
  EReference getwhile_statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.Numeric <em>Numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric</em>'.
   * @see org.xtext.com.javadsl.Numeric
   * @generated
   */
  EClass getNumeric();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Numeric#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.com.javadsl.Numeric#getLeft()
   * @see #getNumeric()
   * @generated
   */
  EReference getNumeric_Left();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.Bit <em>Bit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit</em>'.
   * @see org.xtext.com.javadsl.Bit
   * @generated
   */
  EClass getBit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Bit#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.com.javadsl.Bit#getLeft()
   * @see #getBit()
   * @generated
   */
  EReference getBit_Left();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.Testing <em>Testing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Testing</em>'.
   * @see org.xtext.com.javadsl.Testing
   * @generated
   */
  EClass getTesting();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Testing#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.com.javadsl.Testing#getLeft()
   * @see #getTesting()
   * @generated
   */
  EReference getTesting_Left();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.Logical <em>Logical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical</em>'.
   * @see org.xtext.com.javadsl.Logical
   * @generated
   */
  EClass getLogical();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Logical#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.com.javadsl.Logical#getLeft()
   * @see #getLogical()
   * @generated
   */
  EReference getLogical_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Logical#getTernary <em>Ternary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ternary</em>'.
   * @see org.xtext.com.javadsl.Logical#getTernary()
   * @see #getLogical()
   * @generated
   */
  EReference getLogical_Ternary();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Logical#getTernary_end <em>Ternary end</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ternary end</em>'.
   * @see org.xtext.com.javadsl.Logical#getTernary_end()
   * @see #getLogical()
   * @generated
   */
  EReference getLogical_Ternary_end();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.Args <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Args</em>'.
   * @see org.xtext.com.javadsl.Args
   * @generated
   */
  EClass getArgs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Args#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.com.javadsl.Args#getLeft()
   * @see #getArgs()
   * @generated
   */
  EReference getArgs_Left();

  /**
   * Returns the meta object for class '{@link org.xtext.com.javadsl.Casting <em>Casting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Casting</em>'.
   * @see org.xtext.com.javadsl.Casting
   * @generated
   */
  EClass getCasting();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.com.javadsl.Casting#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.com.javadsl.Casting#getLeft()
   * @see #getCasting()
   * @generated
   */
  EReference getCasting_Left();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.com.javadsl.Casting#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.xtext.com.javadsl.Casting#getTypes()
   * @see #getCasting()
   * @generated
   */
  EReference getCasting_Types();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JavadslFactory getJavadslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.HeadImpl <em>Head</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.HeadImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getHead()
     * @generated
     */
    EClass HEAD = eINSTANCE.getHead();

    /**
     * The meta object literal for the '<em><b>Java</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEAD__JAVA = eINSTANCE.getHead_Java();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.CompilationUnitImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getCompilationUnit()
     * @generated
     */
    EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPILATION_UNIT__PACKAGE = eINSTANCE.getCompilationUnit_Package();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPILATION_UNIT__IMPORTS = eINSTANCE.getCompilationUnit_Imports();

    /**
     * The meta object literal for the '<em><b>Type declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__TYPE_DECLARATIONS = eINSTANCE.getCompilationUnit_Type_declarations();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.TypeDeclarationImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getTypeDeclaration()
     * @generated
     */
    EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Class declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__CLASS_DECLARATION = eINSTANCE.getTypeDeclaration_Class_declaration();

    /**
     * The meta object literal for the '<em><b>Interface declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__INTERFACE_DECLARATION = eINSTANCE.getTypeDeclaration_Interface_declaration();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.ClassDeclarationImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getClassDeclaration()
     * @generated
     */
    EClass CLASS_DECLARATION = eINSTANCE.getClassDeclaration();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__MODIFIERS = eINSTANCE.getClassDeclaration_Modifiers();

    /**
     * The meta object literal for the '<em><b>Field declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__FIELD_DECLARATIONS = eINSTANCE.getClassDeclaration_Field_declarations();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.InterfaceDeclarationImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getInterfaceDeclaration()
     * @generated
     */
    EClass INTERFACE_DECLARATION = eINSTANCE.getInterfaceDeclaration();

    /**
     * The meta object literal for the '<em><b>Field declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__FIELD_DECLARATIONS = eINSTANCE.getInterfaceDeclaration_Field_declarations();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.FieldDeclarationImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getFieldDeclaration()
     * @generated
     */
    EClass FIELD_DECLARATION = eINSTANCE.getFieldDeclaration();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__DECLARATION = eINSTANCE.getFieldDeclaration_Declaration();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.StaticInitializerImpl <em>Static Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.StaticInitializerImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getStaticInitializer()
     * @generated
     */
    EClass STATIC_INITIALIZER = eINSTANCE.getStaticInitializer();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.MethodDeclarationImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getMethodDeclaration()
     * @generated
     */
    EClass METHOD_DECLARATION = eINSTANCE.getMethodDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.ConstructorDeclarationImpl <em>Constructor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.ConstructorDeclarationImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getConstructorDeclaration()
     * @generated
     */
    EClass CONSTRUCTOR_DECLARATION = eINSTANCE.getConstructorDeclaration();

    /**
     * The meta object literal for the '<em><b>Statement block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK = eINSTANCE.getConstructorDeclaration_Statement_block();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.ParameterListImpl <em>Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.ParameterListImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getParameterList()
     * @generated
     */
    EClass PARAMETER_LIST = eINSTANCE.getParameterList();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.ParameterImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__PARAMETERS = eINSTANCE.getParameter_Parameters();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.StatementBlockImpl <em>Statement Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.StatementBlockImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getStatementBlock()
     * @generated
     */
    EClass STATEMENT_BLOCK = eINSTANCE.getStatementBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_BLOCK__STATEMENTS = eINSTANCE.getStatementBlock_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.VariableDeclarationImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Variable declarator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__VARIABLE_DECLARATOR = eINSTANCE.getVariableDeclaration_Variable_declarator();

    /**
     * The meta object literal for the '<em><b>Variable declarators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__VARIABLE_DECLARATORS = eINSTANCE.getVariableDeclaration_Variable_declarators();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.VariableDeclaratorImpl <em>Variable Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.VariableDeclaratorImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getVariableDeclarator()
     * @generated
     */
    EClass VARIABLE_DECLARATOR = eINSTANCE.getVariableDeclarator();

    /**
     * The meta object literal for the '<em><b>Variable initializer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATOR__VARIABLE_INITIALIZER = eINSTANCE.getVariableDeclarator_Variable_initializer();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.VariableInitializerImpl <em>Variable Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.VariableInitializerImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getVariableInitializer()
     * @generated
     */
    EClass VARIABLE_INITIALIZER = eINSTANCE.getVariableInitializer();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_INITIALIZER__EXPR = eINSTANCE.getVariableInitializer_Expr();

    /**
     * The meta object literal for the '<em><b>Variable initializer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_INITIALIZER__VARIABLE_INITIALIZER = eINSTANCE.getVariableInitializer_Variable_initializer();

    /**
     * The meta object literal for the '<em><b>Variable initializers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_INITIALIZER__VARIABLE_INITIALIZERS = eINSTANCE.getVariableInitializer_Variable_initializers();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.TypeImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Specifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__SPECIFIER = eINSTANCE.getType_Specifier();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.ExpressionImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.NumericExpressionImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getNumericExpression()
     * @generated
     */
    EClass NUMERIC_EXPRESSION = eINSTANCE.getNumericExpression();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMERIC_EXPRESSION__RIGHT = eINSTANCE.getNumericExpression_Right();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.BitExpressionImpl <em>Bit Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.BitExpressionImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getBitExpression()
     * @generated
     */
    EClass BIT_EXPRESSION = eINSTANCE.getBitExpression();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.TestingExpressionImpl <em>Testing Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.TestingExpressionImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getTestingExpression()
     * @generated
     */
    EClass TESTING_EXPRESSION = eINSTANCE.getTestingExpression();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.LogicalExpressionImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getLogicalExpression()
     * @generated
     */
    EClass LOGICAL_EXPRESSION = eINSTANCE.getLogicalExpression();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.ArgsExpressionImpl <em>Args Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.ArgsExpressionImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getArgsExpression()
     * @generated
     */
    EClass ARGS_EXPRESSION = eINSTANCE.getArgsExpression();

    /**
     * The meta object literal for the '<em><b>Arg list</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGS_EXPRESSION__ARG_LIST = eINSTANCE.getArgsExpression_Arg_list();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.ArglistImpl <em>Arglist</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.ArglistImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getArglist()
     * @generated
     */
    EClass ARGLIST = eINSTANCE.getArglist();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGLIST__ARG = eINSTANCE.getArglist_Arg();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGLIST__ARGS = eINSTANCE.getArglist_Args();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.CastingExpressionImpl <em>Casting Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.CastingExpressionImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getCastingExpression()
     * @generated
     */
    EClass CASTING_EXPRESSION = eINSTANCE.getCastingExpression();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.CreatingExpressionImpl <em>Creating Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.CreatingExpressionImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getCreatingExpression()
     * @generated
     */
    EClass CREATING_EXPRESSION = eINSTANCE.getCreatingExpression();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.ParenthesisExpressionImpl <em>Parenthesis Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.ParenthesisExpressionImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getParenthesisExpression()
     * @generated
     */
    EClass PARENTHESIS_EXPRESSION = eINSTANCE.getParenthesisExpression();

    /**
     * The meta object literal for the '<em><b>Type specifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIS_EXPRESSION__TYPE_SPECIFIERS = eINSTANCE.getParenthesisExpression_Type_specifiers();

    /**
     * The meta object literal for the '<em><b>Parenthesis</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENTHESIS_EXPRESSION__PARENTHESIS = eINSTANCE.getParenthesisExpression_Parenthesis();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.PrimaryExpressionImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getPrimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY_EXPRESSION__VALUE = eINSTANCE.getPrimaryExpression_Value();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.LiteralExpressionImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getLiteralExpression()
     * @generated
     */
    EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Literal value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_EXPRESSION__LITERAL_VALUE = eINSTANCE.getLiteralExpression_Literal_value();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.TypeSpecifierImpl <em>Type Specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.TypeSpecifierImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getTypeSpecifier()
     * @generated
     */
    EClass TYPE_SPECIFIER = eINSTANCE.getTypeSpecifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SPECIFIER__NAME = eINSTANCE.getTypeSpecifier_Name();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.DoStatementImpl <em>Do Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.DoStatementImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getDoStatement()
     * @generated
     */
    EClass DO_STATEMENT = eINSTANCE.getDoStatement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__STATEMENT = eINSTANCE.getDoStatement_Statement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__EXPRESSION = eINSTANCE.getDoStatement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.ForStatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.ForStatementImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getForStatement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getForStatement();

    /**
     * The meta object literal for the '<em><b>Variable declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__VARIABLE_DECLARATION = eINSTANCE.getForStatement_Variable_declaration();

    /**
     * The meta object literal for the '<em><b>For expression1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FOR_EXPRESSION1 = eINSTANCE.getForStatement_For_expression1();

    /**
     * The meta object literal for the '<em><b>For expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FOR_EXPRESSION2 = eINSTANCE.getForStatement_For_expression2();

    /**
     * The meta object literal for the '<em><b>For expression3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__FOR_EXPRESSION3 = eINSTANCE.getForStatement_For_expression3();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__STATEMENT = eINSTANCE.getForStatement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.IfStatementImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__EXPRESSION = eINSTANCE.getIfStatement_Expression();

    /**
     * The meta object literal for the '<em><b>If statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__IF_STATEMENT = eINSTANCE.getIfStatement_If_statement();

    /**
     * The meta object literal for the '<em><b>Else statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE_STATEMENT = eINSTANCE.getIfStatement_Else_statement();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.StatementImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Variable declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__VARIABLE_DECLARATION = eINSTANCE.getStatement_Variable_declaration();

    /**
     * The meta object literal for the '<em><b>Statement expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__STATEMENT_EXPRESSION = eINSTANCE.getStatement_Statement_expression();

    /**
     * The meta object literal for the '<em><b>Statement block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__STATEMENT_BLOCK = eINSTANCE.getStatement_Statement_block();

    /**
     * The meta object literal for the '<em><b>If statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__IF_STATEMENT = eINSTANCE.getStatement_If_statement();

    /**
     * The meta object literal for the '<em><b>Do statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__DO_STATEMENT = eINSTANCE.getStatement_Do_statement();

    /**
     * The meta object literal for the '<em><b>While statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__WHILE_STATEMENT = eINSTANCE.getStatement_While_statement();

    /**
     * The meta object literal for the '<em><b>For statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__FOR_STATEMENT = eINSTANCE.getStatement_For_statement();

    /**
     * The meta object literal for the '<em><b>Try statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__TRY_STATEMENT = eINSTANCE.getStatement_Try_statement();

    /**
     * The meta object literal for the '<em><b>Swith statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__SWITH_STATEMENT = eINSTANCE.getStatement_Swith_statement();

    /**
     * The meta object literal for the '<em><b>Sync expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__SYNC_EXPRESSION = eINSTANCE.getStatement_Sync_expression();

    /**
     * The meta object literal for the '<em><b>Sync statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__SYNC_STATEMENT = eINSTANCE.getStatement_Sync_statement();

    /**
     * The meta object literal for the '<em><b>Return expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__RETURN_EXPRESSION = eINSTANCE.getStatement_Return_expression();

    /**
     * The meta object literal for the '<em><b>Throw expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__THROW_EXPRESSION = eINSTANCE.getStatement_Throw_expression();

    /**
     * The meta object literal for the '<em><b>Named statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__NAMED_STATEMENT = eINSTANCE.getStatement_Named_statement();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.SwitchStatementImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getSwitchStatement()
     * @generated
     */
    EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

    /**
     * The meta object literal for the '<em><b>Switch expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__SWITCH_EXPRESSION = eINSTANCE.getSwitchStatement_Switch_expression();

    /**
     * The meta object literal for the '<em><b>Case expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__CASE_EXPRESSIONS = eINSTANCE.getSwitchStatement_Case_expressions();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__STATEMENTS = eINSTANCE.getSwitchStatement_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.TryStatementImpl <em>Try Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.TryStatementImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getTryStatement()
     * @generated
     */
    EClass TRY_STATEMENT = eINSTANCE.getTryStatement();

    /**
     * The meta object literal for the '<em><b>Try statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__TRY_STATEMENT = eINSTANCE.getTryStatement_Try_statement();

    /**
     * The meta object literal for the '<em><b>Paramenters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__PARAMENTERS = eINSTANCE.getTryStatement_Paramenters();

    /**
     * The meta object literal for the '<em><b>Catch statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__CATCH_STATEMENTS = eINSTANCE.getTryStatement_Catch_statements();

    /**
     * The meta object literal for the '<em><b>Finally statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__FINALLY_STATEMENT = eINSTANCE.getTryStatement_Finally_statement();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.while_statementImpl <em>while statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.while_statementImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getwhile_statement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getwhile_statement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__EXPRESSION = eINSTANCE.getwhile_statement_Expression();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__STATEMENT = eINSTANCE.getwhile_statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.NumericImpl <em>Numeric</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.NumericImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getNumeric()
     * @generated
     */
    EClass NUMERIC = eINSTANCE.getNumeric();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMERIC__LEFT = eINSTANCE.getNumeric_Left();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.BitImpl <em>Bit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.BitImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getBit()
     * @generated
     */
    EClass BIT = eINSTANCE.getBit();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIT__LEFT = eINSTANCE.getBit_Left();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.TestingImpl <em>Testing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.TestingImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getTesting()
     * @generated
     */
    EClass TESTING = eINSTANCE.getTesting();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TESTING__LEFT = eINSTANCE.getTesting_Left();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.LogicalImpl <em>Logical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.LogicalImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getLogical()
     * @generated
     */
    EClass LOGICAL = eINSTANCE.getLogical();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL__LEFT = eINSTANCE.getLogical_Left();

    /**
     * The meta object literal for the '<em><b>Ternary</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL__TERNARY = eINSTANCE.getLogical_Ternary();

    /**
     * The meta object literal for the '<em><b>Ternary end</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL__TERNARY_END = eINSTANCE.getLogical_Ternary_end();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.ArgsImpl <em>Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.ArgsImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getArgs()
     * @generated
     */
    EClass ARGS = eINSTANCE.getArgs();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGS__LEFT = eINSTANCE.getArgs_Left();

    /**
     * The meta object literal for the '{@link org.xtext.com.javadsl.impl.CastingImpl <em>Casting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.com.javadsl.impl.CastingImpl
     * @see org.xtext.com.javadsl.impl.JavadslPackageImpl#getCasting()
     * @generated
     */
    EClass CASTING = eINSTANCE.getCasting();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASTING__LEFT = eINSTANCE.getCasting_Left();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASTING__TYPES = eINSTANCE.getCasting_Types();

  }

} //JavadslPackage
