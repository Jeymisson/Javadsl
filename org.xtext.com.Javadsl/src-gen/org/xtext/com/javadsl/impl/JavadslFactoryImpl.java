/**
 */
package org.xtext.com.javadsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.com.javadsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavadslFactoryImpl extends EFactoryImpl implements JavadslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JavadslFactory init()
  {
    try
    {
      JavadslFactory theJavadslFactory = (JavadslFactory)EPackage.Registry.INSTANCE.getEFactory(JavadslPackage.eNS_URI);
      if (theJavadslFactory != null)
      {
        return theJavadslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JavadslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavadslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JavadslPackage.HEAD: return createHead();
      case JavadslPackage.COMPILATION_UNIT: return createCompilationUnit();
      case JavadslPackage.TYPE_DECLARATION: return createTypeDeclaration();
      case JavadslPackage.CLASS_DECLARATION: return createClassDeclaration();
      case JavadslPackage.INTERFACE_DECLARATION: return createInterfaceDeclaration();
      case JavadslPackage.FIELD_DECLARATION: return createFieldDeclaration();
      case JavadslPackage.STATIC_INITIALIZER: return createStaticInitializer();
      case JavadslPackage.METHOD_DECLARATION: return createMethodDeclaration();
      case JavadslPackage.CONSTRUCTOR_DECLARATION: return createConstructorDeclaration();
      case JavadslPackage.PARAMETER_LIST: return createParameterList();
      case JavadslPackage.PARAMETER: return createParameter();
      case JavadslPackage.STATEMENT_BLOCK: return createStatementBlock();
      case JavadslPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case JavadslPackage.VARIABLE_DECLARATOR: return createVariableDeclarator();
      case JavadslPackage.VARIABLE_INITIALIZER: return createVariableInitializer();
      case JavadslPackage.TYPE: return createType();
      case JavadslPackage.EXPRESSION: return createExpression();
      case JavadslPackage.NUMERIC_EXPRESSION: return createNumericExpression();
      case JavadslPackage.BIT_EXPRESSION: return createBitExpression();
      case JavadslPackage.TESTING_EXPRESSION: return createTestingExpression();
      case JavadslPackage.LOGICAL_EXPRESSION: return createLogicalExpression();
      case JavadslPackage.ARGS_EXPRESSION: return createArgsExpression();
      case JavadslPackage.ARGLIST: return createArglist();
      case JavadslPackage.CASTING_EXPRESSION: return createCastingExpression();
      case JavadslPackage.CREATING_EXPRESSION: return createCreatingExpression();
      case JavadslPackage.PARENTHESIS_EXPRESSION: return createParenthesisExpression();
      case JavadslPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case JavadslPackage.LITERAL_EXPRESSION: return createLiteralExpression();
      case JavadslPackage.TYPE_SPECIFIER: return createTypeSpecifier();
      case JavadslPackage.DO_STATEMENT: return createDoStatement();
      case JavadslPackage.FOR_STATEMENT: return createForStatement();
      case JavadslPackage.IF_STATEMENT: return createIfStatement();
      case JavadslPackage.STATEMENT: return createStatement();
      case JavadslPackage.SWITCH_STATEMENT: return createSwitchStatement();
      case JavadslPackage.TRY_STATEMENT: return createTryStatement();
      case JavadslPackage.WHILE_STATEMENT: return createwhile_statement();
      case JavadslPackage.NUMERIC: return createNumeric();
      case JavadslPackage.BIT: return createBit();
      case JavadslPackage.TESTING: return createTesting();
      case JavadslPackage.LOGICAL: return createLogical();
      case JavadslPackage.ARGS: return createArgs();
      case JavadslPackage.CASTING: return createCasting();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Head createHead()
  {
    HeadImpl head = new HeadImpl();
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompilationUnit createCompilationUnit()
  {
    CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
    return compilationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDeclaration createTypeDeclaration()
  {
    TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
    return typeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDeclaration createClassDeclaration()
  {
    ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
    return classDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDeclaration createInterfaceDeclaration()
  {
    InterfaceDeclarationImpl interfaceDeclaration = new InterfaceDeclarationImpl();
    return interfaceDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDeclaration createFieldDeclaration()
  {
    FieldDeclarationImpl fieldDeclaration = new FieldDeclarationImpl();
    return fieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticInitializer createStaticInitializer()
  {
    StaticInitializerImpl staticInitializer = new StaticInitializerImpl();
    return staticInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDeclaration createMethodDeclaration()
  {
    MethodDeclarationImpl methodDeclaration = new MethodDeclarationImpl();
    return methodDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstructorDeclaration createConstructorDeclaration()
  {
    ConstructorDeclarationImpl constructorDeclaration = new ConstructorDeclarationImpl();
    return constructorDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList createParameterList()
  {
    ParameterListImpl parameterList = new ParameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBlock createStatementBlock()
  {
    StatementBlockImpl statementBlock = new StatementBlockImpl();
    return statementBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclarator createVariableDeclarator()
  {
    VariableDeclaratorImpl variableDeclarator = new VariableDeclaratorImpl();
    return variableDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableInitializer createVariableInitializer()
  {
    VariableInitializerImpl variableInitializer = new VariableInitializerImpl();
    return variableInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericExpression createNumericExpression()
  {
    NumericExpressionImpl numericExpression = new NumericExpressionImpl();
    return numericExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitExpression createBitExpression()
  {
    BitExpressionImpl bitExpression = new BitExpressionImpl();
    return bitExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestingExpression createTestingExpression()
  {
    TestingExpressionImpl testingExpression = new TestingExpressionImpl();
    return testingExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalExpression createLogicalExpression()
  {
    LogicalExpressionImpl logicalExpression = new LogicalExpressionImpl();
    return logicalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgsExpression createArgsExpression()
  {
    ArgsExpressionImpl argsExpression = new ArgsExpressionImpl();
    return argsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arglist createArglist()
  {
    ArglistImpl arglist = new ArglistImpl();
    return arglist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastingExpression createCastingExpression()
  {
    CastingExpressionImpl castingExpression = new CastingExpressionImpl();
    return castingExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreatingExpression createCreatingExpression()
  {
    CreatingExpressionImpl creatingExpression = new CreatingExpressionImpl();
    return creatingExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenthesisExpression createParenthesisExpression()
  {
    ParenthesisExpressionImpl parenthesisExpression = new ParenthesisExpressionImpl();
    return parenthesisExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression createLiteralExpression()
  {
    LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
    return literalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecifier createTypeSpecifier()
  {
    TypeSpecifierImpl typeSpecifier = new TypeSpecifierImpl();
    return typeSpecifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoStatement createDoStatement()
  {
    DoStatementImpl doStatement = new DoStatementImpl();
    return doStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchStatement createSwitchStatement()
  {
    SwitchStatementImpl switchStatement = new SwitchStatementImpl();
    return switchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TryStatement createTryStatement()
  {
    TryStatementImpl tryStatement = new TryStatementImpl();
    return tryStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public while_statement createwhile_statement()
  {
    while_statementImpl while_statement = new while_statementImpl();
    return while_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Numeric createNumeric()
  {
    NumericImpl numeric = new NumericImpl();
    return numeric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bit createBit()
  {
    BitImpl bit = new BitImpl();
    return bit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Testing createTesting()
  {
    TestingImpl testing = new TestingImpl();
    return testing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Logical createLogical()
  {
    LogicalImpl logical = new LogicalImpl();
    return logical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Args createArgs()
  {
    ArgsImpl args = new ArgsImpl();
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Casting createCasting()
  {
    CastingImpl casting = new CastingImpl();
    return casting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavadslPackage getJavadslPackage()
  {
    return (JavadslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JavadslPackage getPackage()
  {
    return JavadslPackage.eINSTANCE;
  }

} //JavadslFactoryImpl
