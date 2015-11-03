/**
 */
package org.xtext.com.javadsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.ParenthesisExpression;
import org.xtext.com.javadsl.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parenthesis Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.ParenthesisExpressionImpl#getType_specifiers <em>Type specifiers</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.ParenthesisExpressionImpl#getParenthesis <em>Parenthesis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParenthesisExpressionImpl extends CreatingExpressionImpl implements ParenthesisExpression
{
  /**
   * The cached value of the '{@link #getType_specifiers() <em>Type specifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_specifiers()
   * @generated
   * @ordered
   */
  protected EList<TypeSpecifier> type_specifiers;

  /**
   * The cached value of the '{@link #getParenthesis() <em>Parenthesis</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParenthesis()
   * @generated
   * @ordered
   */
  protected EList<ParenthesisExpression> parenthesis;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParenthesisExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JavadslPackage.Literals.PARENTHESIS_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeSpecifier> getType_specifiers()
  {
    if (type_specifiers == null)
    {
      type_specifiers = new EObjectContainmentEList<TypeSpecifier>(TypeSpecifier.class, this, JavadslPackage.PARENTHESIS_EXPRESSION__TYPE_SPECIFIERS);
    }
    return type_specifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParenthesisExpression> getParenthesis()
  {
    if (parenthesis == null)
    {
      parenthesis = new EObjectContainmentEList<ParenthesisExpression>(ParenthesisExpression.class, this, JavadslPackage.PARENTHESIS_EXPRESSION__PARENTHESIS);
    }
    return parenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JavadslPackage.PARENTHESIS_EXPRESSION__TYPE_SPECIFIERS:
        return ((InternalEList<?>)getType_specifiers()).basicRemove(otherEnd, msgs);
      case JavadslPackage.PARENTHESIS_EXPRESSION__PARENTHESIS:
        return ((InternalEList<?>)getParenthesis()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JavadslPackage.PARENTHESIS_EXPRESSION__TYPE_SPECIFIERS:
        return getType_specifiers();
      case JavadslPackage.PARENTHESIS_EXPRESSION__PARENTHESIS:
        return getParenthesis();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JavadslPackage.PARENTHESIS_EXPRESSION__TYPE_SPECIFIERS:
        getType_specifiers().clear();
        getType_specifiers().addAll((Collection<? extends TypeSpecifier>)newValue);
        return;
      case JavadslPackage.PARENTHESIS_EXPRESSION__PARENTHESIS:
        getParenthesis().clear();
        getParenthesis().addAll((Collection<? extends ParenthesisExpression>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JavadslPackage.PARENTHESIS_EXPRESSION__TYPE_SPECIFIERS:
        getType_specifiers().clear();
        return;
      case JavadslPackage.PARENTHESIS_EXPRESSION__PARENTHESIS:
        getParenthesis().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JavadslPackage.PARENTHESIS_EXPRESSION__TYPE_SPECIFIERS:
        return type_specifiers != null && !type_specifiers.isEmpty();
      case JavadslPackage.PARENTHESIS_EXPRESSION__PARENTHESIS:
        return parenthesis != null && !parenthesis.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ParenthesisExpressionImpl
