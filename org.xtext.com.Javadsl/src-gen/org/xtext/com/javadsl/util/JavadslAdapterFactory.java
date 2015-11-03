/**
 */
package org.xtext.com.javadsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.com.javadsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.com.javadsl.JavadslPackage
 * @generated
 */
public class JavadslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JavadslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavadslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JavadslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JavadslSwitch<Adapter> modelSwitch =
    new JavadslSwitch<Adapter>()
    {
      @Override
      public Adapter caseHead(Head object)
      {
        return createHeadAdapter();
      }
      @Override
      public Adapter caseCompilationUnit(CompilationUnit object)
      {
        return createCompilationUnitAdapter();
      }
      @Override
      public Adapter caseTypeDeclaration(TypeDeclaration object)
      {
        return createTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseClassDeclaration(ClassDeclaration object)
      {
        return createClassDeclarationAdapter();
      }
      @Override
      public Adapter caseInterfaceDeclaration(InterfaceDeclaration object)
      {
        return createInterfaceDeclarationAdapter();
      }
      @Override
      public Adapter caseFieldDeclaration(FieldDeclaration object)
      {
        return createFieldDeclarationAdapter();
      }
      @Override
      public Adapter caseStaticInitializer(StaticInitializer object)
      {
        return createStaticInitializerAdapter();
      }
      @Override
      public Adapter caseMethodDeclaration(MethodDeclaration object)
      {
        return createMethodDeclarationAdapter();
      }
      @Override
      public Adapter caseConstructorDeclaration(ConstructorDeclaration object)
      {
        return createConstructorDeclarationAdapter();
      }
      @Override
      public Adapter caseParameterList(ParameterList object)
      {
        return createParameterListAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseStatementBlock(StatementBlock object)
      {
        return createStatementBlockAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseVariableDeclarator(VariableDeclarator object)
      {
        return createVariableDeclaratorAdapter();
      }
      @Override
      public Adapter caseVariableInitializer(VariableInitializer object)
      {
        return createVariableInitializerAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseNumericExpression(NumericExpression object)
      {
        return createNumericExpressionAdapter();
      }
      @Override
      public Adapter caseBitExpression(BitExpression object)
      {
        return createBitExpressionAdapter();
      }
      @Override
      public Adapter caseTestingExpression(TestingExpression object)
      {
        return createTestingExpressionAdapter();
      }
      @Override
      public Adapter caseLogicalExpression(LogicalExpression object)
      {
        return createLogicalExpressionAdapter();
      }
      @Override
      public Adapter caseArgsExpression(ArgsExpression object)
      {
        return createArgsExpressionAdapter();
      }
      @Override
      public Adapter caseArglist(Arglist object)
      {
        return createArglistAdapter();
      }
      @Override
      public Adapter caseCastingExpression(CastingExpression object)
      {
        return createCastingExpressionAdapter();
      }
      @Override
      public Adapter caseCreatingExpression(CreatingExpression object)
      {
        return createCreatingExpressionAdapter();
      }
      @Override
      public Adapter caseParenthesisExpression(ParenthesisExpression object)
      {
        return createParenthesisExpressionAdapter();
      }
      @Override
      public Adapter casePrimaryExpression(PrimaryExpression object)
      {
        return createPrimaryExpressionAdapter();
      }
      @Override
      public Adapter caseLiteralExpression(LiteralExpression object)
      {
        return createLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseTypeSpecifier(TypeSpecifier object)
      {
        return createTypeSpecifierAdapter();
      }
      @Override
      public Adapter caseDoStatement(DoStatement object)
      {
        return createDoStatementAdapter();
      }
      @Override
      public Adapter caseForStatement(ForStatement object)
      {
        return createForStatementAdapter();
      }
      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
        return createIfStatementAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseSwitchStatement(SwitchStatement object)
      {
        return createSwitchStatementAdapter();
      }
      @Override
      public Adapter caseTryStatement(TryStatement object)
      {
        return createTryStatementAdapter();
      }
      @Override
      public Adapter casewhile_statement(while_statement object)
      {
        return createwhile_statementAdapter();
      }
      @Override
      public Adapter caseNumeric(Numeric object)
      {
        return createNumericAdapter();
      }
      @Override
      public Adapter caseBit(Bit object)
      {
        return createBitAdapter();
      }
      @Override
      public Adapter caseTesting(Testing object)
      {
        return createTestingAdapter();
      }
      @Override
      public Adapter caseLogical(Logical object)
      {
        return createLogicalAdapter();
      }
      @Override
      public Adapter caseArgs(Args object)
      {
        return createArgsAdapter();
      }
      @Override
      public Adapter caseCasting(Casting object)
      {
        return createCastingAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.Head <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.Head
   * @generated
   */
  public Adapter createHeadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.CompilationUnit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.CompilationUnit
   * @generated
   */
  public Adapter createCompilationUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.TypeDeclaration <em>Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.TypeDeclaration
   * @generated
   */
  public Adapter createTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.ClassDeclaration
   * @generated
   */
  public Adapter createClassDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.InterfaceDeclaration <em>Interface Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.InterfaceDeclaration
   * @generated
   */
  public Adapter createInterfaceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.FieldDeclaration <em>Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.FieldDeclaration
   * @generated
   */
  public Adapter createFieldDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.StaticInitializer <em>Static Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.StaticInitializer
   * @generated
   */
  public Adapter createStaticInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.MethodDeclaration <em>Method Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.MethodDeclaration
   * @generated
   */
  public Adapter createMethodDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.ConstructorDeclaration <em>Constructor Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.ConstructorDeclaration
   * @generated
   */
  public Adapter createConstructorDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.ParameterList
   * @generated
   */
  public Adapter createParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.StatementBlock <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.StatementBlock
   * @generated
   */
  public Adapter createStatementBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.VariableDeclarator <em>Variable Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.VariableDeclarator
   * @generated
   */
  public Adapter createVariableDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.VariableInitializer <em>Variable Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.VariableInitializer
   * @generated
   */
  public Adapter createVariableInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.NumericExpression <em>Numeric Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.NumericExpression
   * @generated
   */
  public Adapter createNumericExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.BitExpression <em>Bit Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.BitExpression
   * @generated
   */
  public Adapter createBitExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.TestingExpression <em>Testing Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.TestingExpression
   * @generated
   */
  public Adapter createTestingExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.LogicalExpression <em>Logical Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.LogicalExpression
   * @generated
   */
  public Adapter createLogicalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.ArgsExpression <em>Args Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.ArgsExpression
   * @generated
   */
  public Adapter createArgsExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.Arglist <em>Arglist</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.Arglist
   * @generated
   */
  public Adapter createArglistAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.CastingExpression <em>Casting Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.CastingExpression
   * @generated
   */
  public Adapter createCastingExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.CreatingExpression <em>Creating Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.CreatingExpression
   * @generated
   */
  public Adapter createCreatingExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.ParenthesisExpression <em>Parenthesis Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.ParenthesisExpression
   * @generated
   */
  public Adapter createParenthesisExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.PrimaryExpression
   * @generated
   */
  public Adapter createPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.LiteralExpression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.LiteralExpression
   * @generated
   */
  public Adapter createLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.TypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.TypeSpecifier
   * @generated
   */
  public Adapter createTypeSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.DoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.DoStatement
   * @generated
   */
  public Adapter createDoStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.ForStatement
   * @generated
   */
  public Adapter createForStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.IfStatement
   * @generated
   */
  public Adapter createIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.SwitchStatement
   * @generated
   */
  public Adapter createSwitchStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.TryStatement <em>Try Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.TryStatement
   * @generated
   */
  public Adapter createTryStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.while_statement <em>while statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.while_statement
   * @generated
   */
  public Adapter createwhile_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.Numeric <em>Numeric</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.Numeric
   * @generated
   */
  public Adapter createNumericAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.Bit <em>Bit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.Bit
   * @generated
   */
  public Adapter createBitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.Testing <em>Testing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.Testing
   * @generated
   */
  public Adapter createTestingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.Logical <em>Logical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.Logical
   * @generated
   */
  public Adapter createLogicalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.Args <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.Args
   * @generated
   */
  public Adapter createArgsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.com.javadsl.Casting <em>Casting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.com.javadsl.Casting
   * @generated
   */
  public Adapter createCastingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JavadslAdapterFactory
