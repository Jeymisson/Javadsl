/**
 */
package org.xtext.com.javadsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.com.javadsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.com.javadsl.JavadslPackage
 * @generated
 */
public class JavadslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JavadslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavadslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JavadslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case JavadslPackage.HEAD:
      {
        Head head = (Head)theEObject;
        T result = caseHead(head);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.COMPILATION_UNIT:
      {
        CompilationUnit compilationUnit = (CompilationUnit)theEObject;
        T result = caseCompilationUnit(compilationUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.TYPE_DECLARATION:
      {
        TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
        T result = caseTypeDeclaration(typeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.CLASS_DECLARATION:
      {
        ClassDeclaration classDeclaration = (ClassDeclaration)theEObject;
        T result = caseClassDeclaration(classDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.INTERFACE_DECLARATION:
      {
        InterfaceDeclaration interfaceDeclaration = (InterfaceDeclaration)theEObject;
        T result = caseInterfaceDeclaration(interfaceDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.FIELD_DECLARATION:
      {
        FieldDeclaration fieldDeclaration = (FieldDeclaration)theEObject;
        T result = caseFieldDeclaration(fieldDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.STATIC_INITIALIZER:
      {
        StaticInitializer staticInitializer = (StaticInitializer)theEObject;
        T result = caseStaticInitializer(staticInitializer);
        if (result == null) result = caseFieldDeclaration(staticInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.METHOD_DECLARATION:
      {
        MethodDeclaration methodDeclaration = (MethodDeclaration)theEObject;
        T result = caseMethodDeclaration(methodDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.CONSTRUCTOR_DECLARATION:
      {
        ConstructorDeclaration constructorDeclaration = (ConstructorDeclaration)theEObject;
        T result = caseConstructorDeclaration(constructorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.PARAMETER_LIST:
      {
        ParameterList parameterList = (ParameterList)theEObject;
        T result = caseParameterList(parameterList);
        if (result == null) result = caseMethodDeclaration(parameterList);
        if (result == null) result = caseConstructorDeclaration(parameterList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseParameterList(parameter);
        if (result == null) result = caseMethodDeclaration(parameter);
        if (result == null) result = caseConstructorDeclaration(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.STATEMENT_BLOCK:
      {
        StatementBlock statementBlock = (StatementBlock)theEObject;
        T result = caseStatementBlock(statementBlock);
        if (result == null) result = caseStaticInitializer(statementBlock);
        if (result == null) result = caseFieldDeclaration(statementBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.VARIABLE_DECLARATOR:
      {
        VariableDeclarator variableDeclarator = (VariableDeclarator)theEObject;
        T result = caseVariableDeclarator(variableDeclarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.VARIABLE_INITIALIZER:
      {
        VariableInitializer variableInitializer = (VariableInitializer)theEObject;
        T result = caseVariableInitializer(variableInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseParameter(type);
        if (result == null) result = caseParameterList(type);
        if (result == null) result = caseMethodDeclaration(type);
        if (result == null) result = caseConstructorDeclaration(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.NUMERIC_EXPRESSION:
      {
        NumericExpression numericExpression = (NumericExpression)theEObject;
        T result = caseNumericExpression(numericExpression);
        if (result == null) result = caseExpression(numericExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.BIT_EXPRESSION:
      {
        BitExpression bitExpression = (BitExpression)theEObject;
        T result = caseBitExpression(bitExpression);
        if (result == null) result = caseNumericExpression(bitExpression);
        if (result == null) result = caseExpression(bitExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.TESTING_EXPRESSION:
      {
        TestingExpression testingExpression = (TestingExpression)theEObject;
        T result = caseTestingExpression(testingExpression);
        if (result == null) result = caseLogicalExpression(testingExpression);
        if (result == null) result = caseBitExpression(testingExpression);
        if (result == null) result = caseNumericExpression(testingExpression);
        if (result == null) result = caseExpression(testingExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.LOGICAL_EXPRESSION:
      {
        LogicalExpression logicalExpression = (LogicalExpression)theEObject;
        T result = caseLogicalExpression(logicalExpression);
        if (result == null) result = caseBitExpression(logicalExpression);
        if (result == null) result = caseNumericExpression(logicalExpression);
        if (result == null) result = caseExpression(logicalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.ARGS_EXPRESSION:
      {
        ArgsExpression argsExpression = (ArgsExpression)theEObject;
        T result = caseArgsExpression(argsExpression);
        if (result == null) result = caseTestingExpression(argsExpression);
        if (result == null) result = caseLogicalExpression(argsExpression);
        if (result == null) result = caseBitExpression(argsExpression);
        if (result == null) result = caseNumericExpression(argsExpression);
        if (result == null) result = caseExpression(argsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.ARGLIST:
      {
        Arglist arglist = (Arglist)theEObject;
        T result = caseArglist(arglist);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.CASTING_EXPRESSION:
      {
        CastingExpression castingExpression = (CastingExpression)theEObject;
        T result = caseCastingExpression(castingExpression);
        if (result == null) result = caseArgsExpression(castingExpression);
        if (result == null) result = caseTestingExpression(castingExpression);
        if (result == null) result = caseLogicalExpression(castingExpression);
        if (result == null) result = caseBitExpression(castingExpression);
        if (result == null) result = caseNumericExpression(castingExpression);
        if (result == null) result = caseExpression(castingExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.CREATING_EXPRESSION:
      {
        CreatingExpression creatingExpression = (CreatingExpression)theEObject;
        T result = caseCreatingExpression(creatingExpression);
        if (result == null) result = caseCastingExpression(creatingExpression);
        if (result == null) result = caseArgsExpression(creatingExpression);
        if (result == null) result = caseTestingExpression(creatingExpression);
        if (result == null) result = caseLogicalExpression(creatingExpression);
        if (result == null) result = caseBitExpression(creatingExpression);
        if (result == null) result = caseNumericExpression(creatingExpression);
        if (result == null) result = caseExpression(creatingExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.PARENTHESIS_EXPRESSION:
      {
        ParenthesisExpression parenthesisExpression = (ParenthesisExpression)theEObject;
        T result = caseParenthesisExpression(parenthesisExpression);
        if (result == null) result = caseCreatingExpression(parenthesisExpression);
        if (result == null) result = caseCastingExpression(parenthesisExpression);
        if (result == null) result = caseArgsExpression(parenthesisExpression);
        if (result == null) result = caseTestingExpression(parenthesisExpression);
        if (result == null) result = caseLogicalExpression(parenthesisExpression);
        if (result == null) result = caseBitExpression(parenthesisExpression);
        if (result == null) result = caseNumericExpression(parenthesisExpression);
        if (result == null) result = caseExpression(parenthesisExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.PRIMARY_EXPRESSION:
      {
        PrimaryExpression primaryExpression = (PrimaryExpression)theEObject;
        T result = casePrimaryExpression(primaryExpression);
        if (result == null) result = caseParenthesisExpression(primaryExpression);
        if (result == null) result = caseCreatingExpression(primaryExpression);
        if (result == null) result = caseCastingExpression(primaryExpression);
        if (result == null) result = caseArgsExpression(primaryExpression);
        if (result == null) result = caseTestingExpression(primaryExpression);
        if (result == null) result = caseLogicalExpression(primaryExpression);
        if (result == null) result = caseBitExpression(primaryExpression);
        if (result == null) result = caseNumericExpression(primaryExpression);
        if (result == null) result = caseExpression(primaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.LITERAL_EXPRESSION:
      {
        LiteralExpression literalExpression = (LiteralExpression)theEObject;
        T result = caseLiteralExpression(literalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.TYPE_SPECIFIER:
      {
        TypeSpecifier typeSpecifier = (TypeSpecifier)theEObject;
        T result = caseTypeSpecifier(typeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.DO_STATEMENT:
      {
        DoStatement doStatement = (DoStatement)theEObject;
        T result = caseDoStatement(doStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.FOR_STATEMENT:
      {
        ForStatement forStatement = (ForStatement)theEObject;
        T result = caseForStatement(forStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.IF_STATEMENT:
      {
        IfStatement ifStatement = (IfStatement)theEObject;
        T result = caseIfStatement(ifStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.SWITCH_STATEMENT:
      {
        SwitchStatement switchStatement = (SwitchStatement)theEObject;
        T result = caseSwitchStatement(switchStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.TRY_STATEMENT:
      {
        TryStatement tryStatement = (TryStatement)theEObject;
        T result = caseTryStatement(tryStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.WHILE_STATEMENT:
      {
        while_statement while_statement = (while_statement)theEObject;
        T result = casewhile_statement(while_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.NUMERIC:
      {
        Numeric numeric = (Numeric)theEObject;
        T result = caseNumeric(numeric);
        if (result == null) result = caseNumericExpression(numeric);
        if (result == null) result = caseExpression(numeric);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.BIT:
      {
        Bit bit = (Bit)theEObject;
        T result = caseBit(bit);
        if (result == null) result = caseBitExpression(bit);
        if (result == null) result = caseNumericExpression(bit);
        if (result == null) result = caseExpression(bit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.TESTING:
      {
        Testing testing = (Testing)theEObject;
        T result = caseTesting(testing);
        if (result == null) result = caseTestingExpression(testing);
        if (result == null) result = caseLogicalExpression(testing);
        if (result == null) result = caseBitExpression(testing);
        if (result == null) result = caseNumericExpression(testing);
        if (result == null) result = caseExpression(testing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.LOGICAL:
      {
        Logical logical = (Logical)theEObject;
        T result = caseLogical(logical);
        if (result == null) result = caseLogicalExpression(logical);
        if (result == null) result = caseBitExpression(logical);
        if (result == null) result = caseNumericExpression(logical);
        if (result == null) result = caseExpression(logical);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.ARGS:
      {
        Args args = (Args)theEObject;
        T result = caseArgs(args);
        if (result == null) result = caseArgsExpression(args);
        if (result == null) result = caseTestingExpression(args);
        if (result == null) result = caseLogicalExpression(args);
        if (result == null) result = caseBitExpression(args);
        if (result == null) result = caseNumericExpression(args);
        if (result == null) result = caseExpression(args);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JavadslPackage.CASTING:
      {
        Casting casting = (Casting)theEObject;
        T result = caseCasting(casting);
        if (result == null) result = caseCastingExpression(casting);
        if (result == null) result = caseArgsExpression(casting);
        if (result == null) result = caseTestingExpression(casting);
        if (result == null) result = caseLogicalExpression(casting);
        if (result == null) result = caseBitExpression(casting);
        if (result == null) result = caseNumericExpression(casting);
        if (result == null) result = caseExpression(casting);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Head</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Head</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHead(Head object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompilationUnit(CompilationUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDeclaration(TypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDeclaration(ClassDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceDeclaration(InterfaceDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldDeclaration(FieldDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticInitializer(StaticInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodDeclaration(MethodDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructorDeclaration(ConstructorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterList(ParameterList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatementBlock(StatementBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclarator(VariableDeclarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableInitializer(VariableInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericExpression(NumericExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bit Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bit Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitExpression(BitExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Testing Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Testing Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestingExpression(TestingExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicalExpression(LogicalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Args Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Args Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgsExpression(ArgsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arglist</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arglist</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArglist(Arglist object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Casting Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Casting Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastingExpression(CastingExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Creating Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Creating Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreatingExpression(CreatingExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthesis Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthesis Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthesisExpression(ParenthesisExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryExpression(PrimaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralExpression(LiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeSpecifier(TypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoStatement(DoStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForStatement(ForStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStatement(IfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchStatement(SwitchStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Try Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Try Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTryStatement(TryStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>while statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>while statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewhile_statement(while_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumeric(Numeric object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBit(Bit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Testing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Testing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTesting(Testing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogical(Logical object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Args</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Args</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgs(Args object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Casting</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Casting</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCasting(Casting object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //JavadslSwitch
