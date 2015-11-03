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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.com.javadsl.CompilationUnit;
import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.TypeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.CompilationUnitImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.CompilationUnitImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.CompilationUnitImpl#getType_declarations <em>Type declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends MinimalEObjectImpl.Container implements CompilationUnit
{
  /**
   * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected String package_ = PACKAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<String> imports;

  /**
   * The cached value of the '{@link #getType_declarations() <em>Type declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_declarations()
   * @generated
   * @ordered
   */
  protected EList<TypeDeclaration> type_declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompilationUnitImpl()
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
    return JavadslPackage.Literals.COMPILATION_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(String newPackage)
  {
    String oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.COMPILATION_UNIT__PACKAGE, oldPackage, package_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getImports()
  {
    if (imports == null)
    {
      imports = new EDataTypeEList<String>(String.class, this, JavadslPackage.COMPILATION_UNIT__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeDeclaration> getType_declarations()
  {
    if (type_declarations == null)
    {
      type_declarations = new EObjectContainmentEList<TypeDeclaration>(TypeDeclaration.class, this, JavadslPackage.COMPILATION_UNIT__TYPE_DECLARATIONS);
    }
    return type_declarations;
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
      case JavadslPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        return ((InternalEList<?>)getType_declarations()).basicRemove(otherEnd, msgs);
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
      case JavadslPackage.COMPILATION_UNIT__PACKAGE:
        return getPackage();
      case JavadslPackage.COMPILATION_UNIT__IMPORTS:
        return getImports();
      case JavadslPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        return getType_declarations();
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
      case JavadslPackage.COMPILATION_UNIT__PACKAGE:
        setPackage((String)newValue);
        return;
      case JavadslPackage.COMPILATION_UNIT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends String>)newValue);
        return;
      case JavadslPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        getType_declarations().clear();
        getType_declarations().addAll((Collection<? extends TypeDeclaration>)newValue);
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
      case JavadslPackage.COMPILATION_UNIT__PACKAGE:
        setPackage(PACKAGE_EDEFAULT);
        return;
      case JavadslPackage.COMPILATION_UNIT__IMPORTS:
        getImports().clear();
        return;
      case JavadslPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        getType_declarations().clear();
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
      case JavadslPackage.COMPILATION_UNIT__PACKAGE:
        return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
      case JavadslPackage.COMPILATION_UNIT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case JavadslPackage.COMPILATION_UNIT__TYPE_DECLARATIONS:
        return type_declarations != null && !type_declarations.isEmpty();
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
    result.append(" (package: ");
    result.append(package_);
    result.append(", imports: ");
    result.append(imports);
    result.append(')');
    return result.toString();
  }

} //CompilationUnitImpl
