/**
 */
package org.xtext.com.javadsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.LiteralExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.LiteralExpressionImpl#getLiteral_value <em>Literal value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralExpressionImpl extends MinimalEObjectImpl.Container implements LiteralExpression
{
  /**
   * The default value of the '{@link #getLiteral_value() <em>Literal value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral_value()
   * @generated
   * @ordered
   */
  protected static final String LITERAL_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLiteral_value() <em>Literal value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral_value()
   * @generated
   * @ordered
   */
  protected String literal_value = LITERAL_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralExpressionImpl()
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
    return JavadslPackage.Literals.LITERAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral_value()
  {
    return literal_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral_value(String newLiteral_value)
  {
    String oldLiteral_value = literal_value;
    literal_value = newLiteral_value;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.LITERAL_EXPRESSION__LITERAL_VALUE, oldLiteral_value, literal_value));
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
      case JavadslPackage.LITERAL_EXPRESSION__LITERAL_VALUE:
        return getLiteral_value();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JavadslPackage.LITERAL_EXPRESSION__LITERAL_VALUE:
        setLiteral_value((String)newValue);
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
      case JavadslPackage.LITERAL_EXPRESSION__LITERAL_VALUE:
        setLiteral_value(LITERAL_VALUE_EDEFAULT);
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
      case JavadslPackage.LITERAL_EXPRESSION__LITERAL_VALUE:
        return LITERAL_VALUE_EDEFAULT == null ? literal_value != null : !LITERAL_VALUE_EDEFAULT.equals(literal_value);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (literal_value: ");
    result.append(literal_value);
    result.append(')');
    return result.toString();
  }

} //LiteralExpressionImpl
