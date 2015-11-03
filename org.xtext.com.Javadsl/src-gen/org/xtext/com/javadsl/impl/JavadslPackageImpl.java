/**
 */
package org.xtext.com.javadsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.com.javadsl.Arglist;
import org.xtext.com.javadsl.Args;
import org.xtext.com.javadsl.ArgsExpression;
import org.xtext.com.javadsl.Bit;
import org.xtext.com.javadsl.BitExpression;
import org.xtext.com.javadsl.Casting;
import org.xtext.com.javadsl.CastingExpression;
import org.xtext.com.javadsl.ClassDeclaration;
import org.xtext.com.javadsl.CompilationUnit;
import org.xtext.com.javadsl.ConstructorDeclaration;
import org.xtext.com.javadsl.CreatingExpression;
import org.xtext.com.javadsl.DoStatement;
import org.xtext.com.javadsl.Expression;
import org.xtext.com.javadsl.FieldDeclaration;
import org.xtext.com.javadsl.ForStatement;
import org.xtext.com.javadsl.Head;
import org.xtext.com.javadsl.IfStatement;
import org.xtext.com.javadsl.InterfaceDeclaration;
import org.xtext.com.javadsl.JavadslFactory;
import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.LiteralExpression;
import org.xtext.com.javadsl.Logical;
import org.xtext.com.javadsl.LogicalExpression;
import org.xtext.com.javadsl.MethodDeclaration;
import org.xtext.com.javadsl.Numeric;
import org.xtext.com.javadsl.NumericExpression;
import org.xtext.com.javadsl.Parameter;
import org.xtext.com.javadsl.ParameterList;
import org.xtext.com.javadsl.ParenthesisExpression;
import org.xtext.com.javadsl.PrimaryExpression;
import org.xtext.com.javadsl.Statement;
import org.xtext.com.javadsl.StatementBlock;
import org.xtext.com.javadsl.StaticInitializer;
import org.xtext.com.javadsl.SwitchStatement;
import org.xtext.com.javadsl.Testing;
import org.xtext.com.javadsl.TestingExpression;
import org.xtext.com.javadsl.TryStatement;
import org.xtext.com.javadsl.Type;
import org.xtext.com.javadsl.TypeDeclaration;
import org.xtext.com.javadsl.TypeSpecifier;
import org.xtext.com.javadsl.VariableDeclaration;
import org.xtext.com.javadsl.VariableDeclarator;
import org.xtext.com.javadsl.VariableInitializer;
import org.xtext.com.javadsl.while_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavadslPackageImpl extends EPackageImpl implements JavadslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compilationUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testingExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argsExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arglistEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass castingExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass creatingExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parenthesisExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeSpecifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tryStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass while_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass castingEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.com.javadsl.JavadslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JavadslPackageImpl()
  {
    super(eNS_URI, JavadslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link JavadslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JavadslPackage init()
  {
    if (isInited) return (JavadslPackage)EPackage.Registry.INSTANCE.getEPackage(JavadslPackage.eNS_URI);

    // Obtain or create and register package
    JavadslPackageImpl theJavadslPackage = (JavadslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JavadslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JavadslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theJavadslPackage.createPackageContents();

    // Initialize created meta-data
    theJavadslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJavadslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JavadslPackage.eNS_URI, theJavadslPackage);
    return theJavadslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHead()
  {
    return headEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHead_Java()
  {
    return (EReference)headEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompilationUnit()
  {
    return compilationUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompilationUnit_Package()
  {
    return (EAttribute)compilationUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompilationUnit_Imports()
  {
    return (EAttribute)compilationUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilationUnit_Type_declarations()
  {
    return (EReference)compilationUnitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDeclaration()
  {
    return typeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDeclaration_Class_declaration()
  {
    return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDeclaration_Interface_declaration()
  {
    return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassDeclaration()
  {
    return classDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDeclaration_Modifiers()
  {
    return (EAttribute)classDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDeclaration_Field_declarations()
  {
    return (EReference)classDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceDeclaration()
  {
    return interfaceDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceDeclaration_Field_declarations()
  {
    return (EReference)interfaceDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldDeclaration()
  {
    return fieldDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDeclaration_Declaration()
  {
    return (EReference)fieldDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticInitializer()
  {
    return staticInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodDeclaration()
  {
    return methodDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructorDeclaration()
  {
    return constructorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorDeclaration_Statement_block()
  {
    return (EReference)constructorDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterList()
  {
    return parameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Parameters()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatementBlock()
  {
    return statementBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementBlock_Statements()
  {
    return (EReference)statementBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_Type()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_Variable_declarator()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclaration_Variable_declarators()
  {
    return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclarator()
  {
    return variableDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableDeclarator_Variable_initializer()
  {
    return (EReference)variableDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableInitializer()
  {
    return variableInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableInitializer_Expr()
  {
    return (EReference)variableInitializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableInitializer_Variable_initializer()
  {
    return (EReference)variableInitializerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableInitializer_Variable_initializers()
  {
    return (EReference)variableInitializerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Specifier()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericExpression()
  {
    return numericExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericExpression_Right()
  {
    return (EReference)numericExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitExpression()
  {
    return bitExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestingExpression()
  {
    return testingExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalExpression()
  {
    return logicalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgsExpression()
  {
    return argsExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgsExpression_Arg_list()
  {
    return (EReference)argsExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArglist()
  {
    return arglistEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArglist_Arg()
  {
    return (EReference)arglistEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArglist_Args()
  {
    return (EReference)arglistEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCastingExpression()
  {
    return castingExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreatingExpression()
  {
    return creatingExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParenthesisExpression()
  {
    return parenthesisExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParenthesisExpression_Type_specifiers()
  {
    return (EReference)parenthesisExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParenthesisExpression_Parenthesis()
  {
    return (EReference)parenthesisExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryExpression()
  {
    return primaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_Value()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralExpression()
  {
    return literalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralExpression_Literal_value()
  {
    return (EAttribute)literalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeSpecifier()
  {
    return typeSpecifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeSpecifier_Name()
  {
    return (EAttribute)typeSpecifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoStatement()
  {
    return doStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoStatement_Statement()
  {
    return (EReference)doStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDoStatement_Expression()
  {
    return (EReference)doStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForStatement()
  {
    return forStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Variable_declaration()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_For_expression1()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_For_expression2()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_For_expression3()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_Statement()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStatement()
  {
    return ifStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_Expression()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_If_statement()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_Else_statement()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Variable_declaration()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Statement_expression()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Statement_block()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_If_statement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Do_statement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_While_statement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_For_statement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Try_statement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Swith_statement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Sync_expression()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Sync_statement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Return_expression()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Throw_expression()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Named_statement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchStatement()
  {
    return switchStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchStatement_Switch_expression()
  {
    return (EReference)switchStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchStatement_Case_expressions()
  {
    return (EReference)switchStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchStatement_Statements()
  {
    return (EReference)switchStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTryStatement()
  {
    return tryStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTryStatement_Try_statement()
  {
    return (EReference)tryStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTryStatement_Paramenters()
  {
    return (EReference)tryStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTryStatement_Catch_statements()
  {
    return (EReference)tryStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTryStatement_Finally_statement()
  {
    return (EReference)tryStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getwhile_statement()
  {
    return while_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhile_statement_Expression()
  {
    return (EReference)while_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getwhile_statement_Statement()
  {
    return (EReference)while_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumeric()
  {
    return numericEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumeric_Left()
  {
    return (EReference)numericEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBit()
  {
    return bitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBit_Left()
  {
    return (EReference)bitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTesting()
  {
    return testingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTesting_Left()
  {
    return (EReference)testingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogical()
  {
    return logicalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogical_Left()
  {
    return (EReference)logicalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogical_Ternary()
  {
    return (EReference)logicalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogical_Ternary_end()
  {
    return (EReference)logicalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgs()
  {
    return argsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgs_Left()
  {
    return (EReference)argsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCasting()
  {
    return castingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCasting_Left()
  {
    return (EReference)castingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCasting_Types()
  {
    return (EReference)castingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavadslFactory getJavadslFactory()
  {
    return (JavadslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    headEClass = createEClass(HEAD);
    createEReference(headEClass, HEAD__JAVA);

    compilationUnitEClass = createEClass(COMPILATION_UNIT);
    createEAttribute(compilationUnitEClass, COMPILATION_UNIT__PACKAGE);
    createEAttribute(compilationUnitEClass, COMPILATION_UNIT__IMPORTS);
    createEReference(compilationUnitEClass, COMPILATION_UNIT__TYPE_DECLARATIONS);

    typeDeclarationEClass = createEClass(TYPE_DECLARATION);
    createEReference(typeDeclarationEClass, TYPE_DECLARATION__CLASS_DECLARATION);
    createEReference(typeDeclarationEClass, TYPE_DECLARATION__INTERFACE_DECLARATION);

    classDeclarationEClass = createEClass(CLASS_DECLARATION);
    createEAttribute(classDeclarationEClass, CLASS_DECLARATION__MODIFIERS);
    createEReference(classDeclarationEClass, CLASS_DECLARATION__FIELD_DECLARATIONS);

    interfaceDeclarationEClass = createEClass(INTERFACE_DECLARATION);
    createEReference(interfaceDeclarationEClass, INTERFACE_DECLARATION__FIELD_DECLARATIONS);

    fieldDeclarationEClass = createEClass(FIELD_DECLARATION);
    createEReference(fieldDeclarationEClass, FIELD_DECLARATION__DECLARATION);

    staticInitializerEClass = createEClass(STATIC_INITIALIZER);

    methodDeclarationEClass = createEClass(METHOD_DECLARATION);

    constructorDeclarationEClass = createEClass(CONSTRUCTOR_DECLARATION);
    createEReference(constructorDeclarationEClass, CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK);

    parameterListEClass = createEClass(PARAMETER_LIST);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__PARAMETERS);

    statementBlockEClass = createEClass(STATEMENT_BLOCK);
    createEReference(statementBlockEClass, STATEMENT_BLOCK__STATEMENTS);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__TYPE);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__VARIABLE_DECLARATOR);
    createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__VARIABLE_DECLARATORS);

    variableDeclaratorEClass = createEClass(VARIABLE_DECLARATOR);
    createEReference(variableDeclaratorEClass, VARIABLE_DECLARATOR__VARIABLE_INITIALIZER);

    variableInitializerEClass = createEClass(VARIABLE_INITIALIZER);
    createEReference(variableInitializerEClass, VARIABLE_INITIALIZER__EXPR);
    createEReference(variableInitializerEClass, VARIABLE_INITIALIZER__VARIABLE_INITIALIZER);
    createEReference(variableInitializerEClass, VARIABLE_INITIALIZER__VARIABLE_INITIALIZERS);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__SPECIFIER);

    expressionEClass = createEClass(EXPRESSION);

    numericExpressionEClass = createEClass(NUMERIC_EXPRESSION);
    createEReference(numericExpressionEClass, NUMERIC_EXPRESSION__RIGHT);

    bitExpressionEClass = createEClass(BIT_EXPRESSION);

    testingExpressionEClass = createEClass(TESTING_EXPRESSION);

    logicalExpressionEClass = createEClass(LOGICAL_EXPRESSION);

    argsExpressionEClass = createEClass(ARGS_EXPRESSION);
    createEReference(argsExpressionEClass, ARGS_EXPRESSION__ARG_LIST);

    arglistEClass = createEClass(ARGLIST);
    createEReference(arglistEClass, ARGLIST__ARG);
    createEReference(arglistEClass, ARGLIST__ARGS);

    castingExpressionEClass = createEClass(CASTING_EXPRESSION);

    creatingExpressionEClass = createEClass(CREATING_EXPRESSION);

    parenthesisExpressionEClass = createEClass(PARENTHESIS_EXPRESSION);
    createEReference(parenthesisExpressionEClass, PARENTHESIS_EXPRESSION__TYPE_SPECIFIERS);
    createEReference(parenthesisExpressionEClass, PARENTHESIS_EXPRESSION__PARENTHESIS);

    primaryExpressionEClass = createEClass(PRIMARY_EXPRESSION);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__VALUE);

    literalExpressionEClass = createEClass(LITERAL_EXPRESSION);
    createEAttribute(literalExpressionEClass, LITERAL_EXPRESSION__LITERAL_VALUE);

    typeSpecifierEClass = createEClass(TYPE_SPECIFIER);
    createEAttribute(typeSpecifierEClass, TYPE_SPECIFIER__NAME);

    doStatementEClass = createEClass(DO_STATEMENT);
    createEReference(doStatementEClass, DO_STATEMENT__STATEMENT);
    createEReference(doStatementEClass, DO_STATEMENT__EXPRESSION);

    forStatementEClass = createEClass(FOR_STATEMENT);
    createEReference(forStatementEClass, FOR_STATEMENT__VARIABLE_DECLARATION);
    createEReference(forStatementEClass, FOR_STATEMENT__FOR_EXPRESSION1);
    createEReference(forStatementEClass, FOR_STATEMENT__FOR_EXPRESSION2);
    createEReference(forStatementEClass, FOR_STATEMENT__FOR_EXPRESSION3);
    createEReference(forStatementEClass, FOR_STATEMENT__STATEMENT);

    ifStatementEClass = createEClass(IF_STATEMENT);
    createEReference(ifStatementEClass, IF_STATEMENT__EXPRESSION);
    createEReference(ifStatementEClass, IF_STATEMENT__IF_STATEMENT);
    createEReference(ifStatementEClass, IF_STATEMENT__ELSE_STATEMENT);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__VARIABLE_DECLARATION);
    createEReference(statementEClass, STATEMENT__STATEMENT_EXPRESSION);
    createEReference(statementEClass, STATEMENT__STATEMENT_BLOCK);
    createEReference(statementEClass, STATEMENT__IF_STATEMENT);
    createEReference(statementEClass, STATEMENT__DO_STATEMENT);
    createEReference(statementEClass, STATEMENT__WHILE_STATEMENT);
    createEReference(statementEClass, STATEMENT__FOR_STATEMENT);
    createEReference(statementEClass, STATEMENT__TRY_STATEMENT);
    createEReference(statementEClass, STATEMENT__SWITH_STATEMENT);
    createEReference(statementEClass, STATEMENT__SYNC_EXPRESSION);
    createEReference(statementEClass, STATEMENT__SYNC_STATEMENT);
    createEReference(statementEClass, STATEMENT__RETURN_EXPRESSION);
    createEReference(statementEClass, STATEMENT__THROW_EXPRESSION);
    createEReference(statementEClass, STATEMENT__NAMED_STATEMENT);

    switchStatementEClass = createEClass(SWITCH_STATEMENT);
    createEReference(switchStatementEClass, SWITCH_STATEMENT__SWITCH_EXPRESSION);
    createEReference(switchStatementEClass, SWITCH_STATEMENT__CASE_EXPRESSIONS);
    createEReference(switchStatementEClass, SWITCH_STATEMENT__STATEMENTS);

    tryStatementEClass = createEClass(TRY_STATEMENT);
    createEReference(tryStatementEClass, TRY_STATEMENT__TRY_STATEMENT);
    createEReference(tryStatementEClass, TRY_STATEMENT__PARAMENTERS);
    createEReference(tryStatementEClass, TRY_STATEMENT__CATCH_STATEMENTS);
    createEReference(tryStatementEClass, TRY_STATEMENT__FINALLY_STATEMENT);

    while_statementEClass = createEClass(WHILE_STATEMENT);
    createEReference(while_statementEClass, WHILE_STATEMENT__EXPRESSION);
    createEReference(while_statementEClass, WHILE_STATEMENT__STATEMENT);

    numericEClass = createEClass(NUMERIC);
    createEReference(numericEClass, NUMERIC__LEFT);

    bitEClass = createEClass(BIT);
    createEReference(bitEClass, BIT__LEFT);

    testingEClass = createEClass(TESTING);
    createEReference(testingEClass, TESTING__LEFT);

    logicalEClass = createEClass(LOGICAL);
    createEReference(logicalEClass, LOGICAL__LEFT);
    createEReference(logicalEClass, LOGICAL__TERNARY);
    createEReference(logicalEClass, LOGICAL__TERNARY_END);

    argsEClass = createEClass(ARGS);
    createEReference(argsEClass, ARGS__LEFT);

    castingEClass = createEClass(CASTING);
    createEReference(castingEClass, CASTING__LEFT);
    createEReference(castingEClass, CASTING__TYPES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    staticInitializerEClass.getESuperTypes().add(this.getFieldDeclaration());
    parameterListEClass.getESuperTypes().add(this.getMethodDeclaration());
    parameterListEClass.getESuperTypes().add(this.getConstructorDeclaration());
    parameterEClass.getESuperTypes().add(this.getParameterList());
    statementBlockEClass.getESuperTypes().add(this.getStaticInitializer());
    typeEClass.getESuperTypes().add(this.getMethodDeclaration());
    typeEClass.getESuperTypes().add(this.getParameter());
    numericExpressionEClass.getESuperTypes().add(this.getExpression());
    bitExpressionEClass.getESuperTypes().add(this.getNumericExpression());
    testingExpressionEClass.getESuperTypes().add(this.getLogicalExpression());
    logicalExpressionEClass.getESuperTypes().add(this.getBitExpression());
    argsExpressionEClass.getESuperTypes().add(this.getTestingExpression());
    castingExpressionEClass.getESuperTypes().add(this.getArgsExpression());
    creatingExpressionEClass.getESuperTypes().add(this.getCastingExpression());
    parenthesisExpressionEClass.getESuperTypes().add(this.getCreatingExpression());
    primaryExpressionEClass.getESuperTypes().add(this.getParenthesisExpression());
    numericEClass.getESuperTypes().add(this.getNumericExpression());
    bitEClass.getESuperTypes().add(this.getBitExpression());
    testingEClass.getESuperTypes().add(this.getTestingExpression());
    logicalEClass.getESuperTypes().add(this.getLogicalExpression());
    argsEClass.getESuperTypes().add(this.getArgsExpression());
    castingEClass.getESuperTypes().add(this.getCastingExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(headEClass, Head.class, "Head", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHead_Java(), this.getCompilationUnit(), null, "java", null, 0, -1, Head.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompilationUnit_Package(), ecorePackage.getEString(), "package", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCompilationUnit_Imports(), ecorePackage.getEString(), "imports", null, 0, -1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilationUnit_Type_declarations(), this.getTypeDeclaration(), null, "type_declarations", null, 0, -1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeDeclaration_Class_declaration(), this.getClassDeclaration(), null, "class_declaration", null, 0, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeDeclaration_Interface_declaration(), this.getInterfaceDeclaration(), null, "interface_declaration", null, 0, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classDeclarationEClass, ClassDeclaration.class, "ClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassDeclaration_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassDeclaration_Field_declarations(), this.getFieldDeclaration(), null, "field_declarations", null, 0, -1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceDeclarationEClass, InterfaceDeclaration.class, "InterfaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceDeclaration_Field_declarations(), this.getFieldDeclaration(), null, "field_declarations", null, 0, -1, InterfaceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldDeclarationEClass, FieldDeclaration.class, "FieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFieldDeclaration_Declaration(), ecorePackage.getEObject(), null, "declaration", null, 0, 1, FieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(staticInitializerEClass, StaticInitializer.class, "StaticInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(methodDeclarationEClass, MethodDeclaration.class, "MethodDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constructorDeclarationEClass, ConstructorDeclaration.class, "ConstructorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstructorDeclaration_Statement_block(), this.getStatementBlock(), null, "statement_block", null, 0, 1, ConstructorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementBlockEClass, StatementBlock.class, "StatementBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatementBlock_Statements(), this.getStatement(), null, "statements", null, 0, -1, StatementBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDeclaration_Type(), this.getType(), null, "type", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclaration_Variable_declarator(), this.getVariableDeclarator(), null, "variable_declarator", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableDeclaration_Variable_declarators(), this.getVariableDeclarator(), null, "variable_declarators", null, 0, -1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclaratorEClass, VariableDeclarator.class, "VariableDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableDeclarator_Variable_initializer(), this.getVariableInitializer(), null, "variable_initializer", null, 0, 1, VariableDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableInitializerEClass, VariableInitializer.class, "VariableInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableInitializer_Expr(), this.getExpression(), null, "expr", null, 0, 1, VariableInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableInitializer_Variable_initializer(), this.getVariableInitializer(), null, "variable_initializer", null, 0, 1, VariableInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableInitializer_Variable_initializers(), this.getVariableInitializer(), null, "variable_initializers", null, 0, -1, VariableInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_Specifier(), this.getTypeSpecifier(), null, "specifier", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numericExpressionEClass, NumericExpression.class, "NumericExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumericExpression_Right(), this.getBitExpression(), null, "right", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bitExpressionEClass, BitExpression.class, "BitExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(testingExpressionEClass, TestingExpression.class, "TestingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(logicalExpressionEClass, LogicalExpression.class, "LogicalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(argsExpressionEClass, ArgsExpression.class, "ArgsExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgsExpression_Arg_list(), this.getArglist(), null, "arg_list", null, 0, -1, ArgsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arglistEClass, Arglist.class, "Arglist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArglist_Arg(), this.getCastingExpression(), null, "arg", null, 0, 1, Arglist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArglist_Args(), this.getCastingExpression(), null, "args", null, 0, -1, Arglist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(castingExpressionEClass, CastingExpression.class, "CastingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(creatingExpressionEClass, CreatingExpression.class, "CreatingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parenthesisExpressionEClass, ParenthesisExpression.class, "ParenthesisExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParenthesisExpression_Type_specifiers(), this.getTypeSpecifier(), null, "type_specifiers", null, 0, -1, ParenthesisExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParenthesisExpression_Parenthesis(), this.getParenthesisExpression(), null, "parenthesis", null, 0, -1, ParenthesisExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryExpressionEClass, PrimaryExpression.class, "PrimaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimaryExpression_Value(), this.getLiteralExpression(), null, "value", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralExpression_Literal_value(), ecorePackage.getEString(), "literal_value", null, 0, 1, LiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeSpecifierEClass, TypeSpecifier.class, "TypeSpecifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeSpecifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doStatementEClass, DoStatement.class, "DoStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDoStatement_Statement(), this.getStatement(), null, "statement", null, 0, 1, DoStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDoStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, DoStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forStatementEClass, ForStatement.class, "ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForStatement_Variable_declaration(), this.getVariableDeclaration(), null, "variable_declaration", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_For_expression1(), this.getExpression(), null, "for_expression1", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_For_expression2(), this.getExpression(), null, "for_expression2", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_For_expression3(), this.getExpression(), null, "for_expression3", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_Statement(), this.getStatement(), null, "statement", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_If_statement(), this.getStatement(), null, "if_statement", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_Else_statement(), this.getStatement(), null, "else_statement", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatement_Variable_declaration(), this.getVariableDeclaration(), null, "variable_declaration", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Statement_expression(), this.getExpression(), null, "statement_expression", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Statement_block(), this.getStatementBlock(), null, "statement_block", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_If_statement(), this.getIfStatement(), null, "if_statement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Do_statement(), this.getDoStatement(), null, "do_statement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_While_statement(), this.getwhile_statement(), null, "while_statement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_For_statement(), this.getForStatement(), null, "for_statement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Try_statement(), this.getTryStatement(), null, "try_statement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Swith_statement(), this.getSwitchStatement(), null, "swith_statement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Sync_expression(), this.getExpression(), null, "sync_expression", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Sync_statement(), this.getStatement(), null, "sync_statement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Return_expression(), this.getExpression(), null, "return_expression", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Throw_expression(), this.getExpression(), null, "throw_expression", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Named_statement(), this.getStatement(), null, "named_statement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchStatementEClass, SwitchStatement.class, "SwitchStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitchStatement_Switch_expression(), this.getExpression(), null, "switch_expression", null, 0, 1, SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitchStatement_Case_expressions(), this.getExpression(), null, "case_expressions", null, 0, -1, SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitchStatement_Statements(), this.getStatement(), null, "statements", null, 0, -1, SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tryStatementEClass, TryStatement.class, "TryStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTryStatement_Try_statement(), this.getStatement(), null, "try_statement", null, 0, 1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTryStatement_Paramenters(), this.getParameter(), null, "paramenters", null, 0, -1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTryStatement_Catch_statements(), this.getStatement(), null, "catch_statements", null, 0, -1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTryStatement_Finally_statement(), this.getStatement(), null, "finally_statement", null, 0, 1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(while_statementEClass, while_statement.class, "while_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getwhile_statement_Expression(), this.getExpression(), null, "expression", null, 0, 1, while_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getwhile_statement_Statement(), this.getStatement(), null, "statement", null, 0, 1, while_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericEClass, Numeric.class, "Numeric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumeric_Left(), this.getNumericExpression(), null, "left", null, 0, 1, Numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bitEClass, Bit.class, "Bit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBit_Left(), this.getBitExpression(), null, "left", null, 0, 1, Bit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testingEClass, Testing.class, "Testing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTesting_Left(), this.getTestingExpression(), null, "left", null, 0, 1, Testing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalEClass, Logical.class, "Logical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogical_Left(), this.getLogicalExpression(), null, "left", null, 0, 1, Logical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogical_Ternary(), this.getLogical(), null, "ternary", null, 0, 1, Logical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogical_Ternary_end(), this.getTestingExpression(), null, "ternary_end", null, 0, 1, Logical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argsEClass, Args.class, "Args", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgs_Left(), this.getArgsExpression(), null, "left", null, 0, 1, Args.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(castingEClass, Casting.class, "Casting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCasting_Left(), this.getCastingExpression(), null, "left", null, 0, 1, Casting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCasting_Types(), this.getType(), null, "types", null, 0, -1, Casting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //JavadslPackageImpl
