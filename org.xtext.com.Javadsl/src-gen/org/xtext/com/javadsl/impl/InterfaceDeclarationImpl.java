/**
 */
package org.xtext.com.javadsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.com.javadsl.FieldDeclaration;
import org.xtext.com.javadsl.InterfaceDeclaration;
import org.xtext.com.javadsl.JavadslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.InterfaceDeclarationImpl#getField_declarations <em>Field declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceDeclarationImpl extends MinimalEObjectImpl.Container implements InterfaceDeclaration
{
  /**
   * The cached value of the '{@link #getField_declarations() <em>Field declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField_declarations()
   * @generated
   * @ordered
   */
  protected EList<FieldDeclaration> field_declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceDeclarationImpl()
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
    return JavadslPackage.Literals.INTERFACE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldDeclaration> getField_declarations()
  {
    if (field_declarations == null)
    {
      field_declarations = new EObjectContainmentEList<FieldDeclaration>(FieldDeclaration.class, this, JavadslPackage.INTERFACE_DECLARATION__FIELD_DECLARATIONS);
    }
    return field_declarations;
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
      case JavadslPackage.INTERFACE_DECLARATION__FIELD_DECLARATIONS:
        return ((InternalEList<?>)getField_declarations()).basicRemove(otherEnd, msgs);
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
      case JavadslPackage.INTERFACE_DECLARATION__FIELD_DECLARATIONS:
        return getField_declarations();
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
      case JavadslPackage.INTERFACE_DECLARATION__FIELD_DECLARATIONS:
        getField_declarations().clear();
        getField_declarations().addAll((Collection<? extends FieldDeclaration>)newValue);
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
      case JavadslPackage.INTERFACE_DECLARATION__FIELD_DECLARATIONS:
        getField_declarations().clear();
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
      case JavadslPackage.INTERFACE_DECLARATION__FIELD_DECLARATIONS:
        return field_declarations != null && !field_declarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InterfaceDeclarationImpl
