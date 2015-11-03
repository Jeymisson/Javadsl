/**
 */
package org.xtext.com.javadsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.com.javadsl.ConstructorDeclaration;
import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.Parameter;
import org.xtext.com.javadsl.ParameterList;
import org.xtext.com.javadsl.StatementBlock;
import org.xtext.com.javadsl.Type;
import org.xtext.com.javadsl.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.TypeImpl#getStatement_block <em>Statement block</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.TypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.TypeImpl#getSpecifier <em>Specifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends MethodDeclarationImpl implements Type
{
  /**
   * The cached value of the '{@link #getStatement_block() <em>Statement block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement_block()
   * @generated
   * @ordered
   */
  protected StatementBlock statement_block;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * The cached value of the '{@link #getSpecifier() <em>Specifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecifier()
   * @generated
   * @ordered
   */
  protected TypeSpecifier specifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return JavadslPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBlock getStatement_block()
  {
    return statement_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement_block(StatementBlock newStatement_block, NotificationChain msgs)
  {
    StatementBlock oldStatement_block = statement_block;
    statement_block = newStatement_block;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.TYPE__STATEMENT_BLOCK, oldStatement_block, newStatement_block);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement_block(StatementBlock newStatement_block)
  {
    if (newStatement_block != statement_block)
    {
      NotificationChain msgs = null;
      if (statement_block != null)
        msgs = ((InternalEObject)statement_block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.TYPE__STATEMENT_BLOCK, null, msgs);
      if (newStatement_block != null)
        msgs = ((InternalEObject)newStatement_block).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.TYPE__STATEMENT_BLOCK, null, msgs);
      msgs = basicSetStatement_block(newStatement_block, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.TYPE__STATEMENT_BLOCK, newStatement_block, newStatement_block));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, JavadslPackage.TYPE__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecifier getSpecifier()
  {
    return specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpecifier(TypeSpecifier newSpecifier, NotificationChain msgs)
  {
    TypeSpecifier oldSpecifier = specifier;
    specifier = newSpecifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.TYPE__SPECIFIER, oldSpecifier, newSpecifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecifier(TypeSpecifier newSpecifier)
  {
    if (newSpecifier != specifier)
    {
      NotificationChain msgs = null;
      if (specifier != null)
        msgs = ((InternalEObject)specifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.TYPE__SPECIFIER, null, msgs);
      if (newSpecifier != null)
        msgs = ((InternalEObject)newSpecifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.TYPE__SPECIFIER, null, msgs);
      msgs = basicSetSpecifier(newSpecifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.TYPE__SPECIFIER, newSpecifier, newSpecifier));
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
      case JavadslPackage.TYPE__STATEMENT_BLOCK:
        return basicSetStatement_block(null, msgs);
      case JavadslPackage.TYPE__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case JavadslPackage.TYPE__SPECIFIER:
        return basicSetSpecifier(null, msgs);
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
      case JavadslPackage.TYPE__STATEMENT_BLOCK:
        return getStatement_block();
      case JavadslPackage.TYPE__PARAMETERS:
        return getParameters();
      case JavadslPackage.TYPE__SPECIFIER:
        return getSpecifier();
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
      case JavadslPackage.TYPE__STATEMENT_BLOCK:
        setStatement_block((StatementBlock)newValue);
        return;
      case JavadslPackage.TYPE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case JavadslPackage.TYPE__SPECIFIER:
        setSpecifier((TypeSpecifier)newValue);
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
      case JavadslPackage.TYPE__STATEMENT_BLOCK:
        setStatement_block((StatementBlock)null);
        return;
      case JavadslPackage.TYPE__PARAMETERS:
        getParameters().clear();
        return;
      case JavadslPackage.TYPE__SPECIFIER:
        setSpecifier((TypeSpecifier)null);
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
      case JavadslPackage.TYPE__STATEMENT_BLOCK:
        return statement_block != null;
      case JavadslPackage.TYPE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case JavadslPackage.TYPE__SPECIFIER:
        return specifier != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == ConstructorDeclaration.class)
    {
      switch (derivedFeatureID)
      {
        case JavadslPackage.TYPE__STATEMENT_BLOCK: return JavadslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK;
        default: return -1;
      }
    }
    if (baseClass == ParameterList.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Parameter.class)
    {
      switch (derivedFeatureID)
      {
        case JavadslPackage.TYPE__PARAMETERS: return JavadslPackage.PARAMETER__PARAMETERS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == ConstructorDeclaration.class)
    {
      switch (baseFeatureID)
      {
        case JavadslPackage.CONSTRUCTOR_DECLARATION__STATEMENT_BLOCK: return JavadslPackage.TYPE__STATEMENT_BLOCK;
        default: return -1;
      }
    }
    if (baseClass == ParameterList.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Parameter.class)
    {
      switch (baseFeatureID)
      {
        case JavadslPackage.PARAMETER__PARAMETERS: return JavadslPackage.TYPE__PARAMETERS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //TypeImpl
