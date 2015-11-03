/**
 */
package org.xtext.com.javadsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.com.javadsl.ClassDeclaration;
import org.xtext.com.javadsl.InterfaceDeclaration;
import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.TypeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.TypeDeclarationImpl#getClass_declaration <em>Class declaration</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.TypeDeclarationImpl#getInterface_declaration <em>Interface declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeDeclarationImpl extends MinimalEObjectImpl.Container implements TypeDeclaration
{
  /**
   * The cached value of the '{@link #getClass_declaration() <em>Class declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_declaration()
   * @generated
   * @ordered
   */
  protected ClassDeclaration class_declaration;

  /**
   * The cached value of the '{@link #getInterface_declaration() <em>Interface declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterface_declaration()
   * @generated
   * @ordered
   */
  protected InterfaceDeclaration interface_declaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDeclarationImpl()
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
    return JavadslPackage.Literals.TYPE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDeclaration getClass_declaration()
  {
    return class_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass_declaration(ClassDeclaration newClass_declaration, NotificationChain msgs)
  {
    ClassDeclaration oldClass_declaration = class_declaration;
    class_declaration = newClass_declaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.TYPE_DECLARATION__CLASS_DECLARATION, oldClass_declaration, newClass_declaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass_declaration(ClassDeclaration newClass_declaration)
  {
    if (newClass_declaration != class_declaration)
    {
      NotificationChain msgs = null;
      if (class_declaration != null)
        msgs = ((InternalEObject)class_declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.TYPE_DECLARATION__CLASS_DECLARATION, null, msgs);
      if (newClass_declaration != null)
        msgs = ((InternalEObject)newClass_declaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.TYPE_DECLARATION__CLASS_DECLARATION, null, msgs);
      msgs = basicSetClass_declaration(newClass_declaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.TYPE_DECLARATION__CLASS_DECLARATION, newClass_declaration, newClass_declaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDeclaration getInterface_declaration()
  {
    return interface_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterface_declaration(InterfaceDeclaration newInterface_declaration, NotificationChain msgs)
  {
    InterfaceDeclaration oldInterface_declaration = interface_declaration;
    interface_declaration = newInterface_declaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.TYPE_DECLARATION__INTERFACE_DECLARATION, oldInterface_declaration, newInterface_declaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface_declaration(InterfaceDeclaration newInterface_declaration)
  {
    if (newInterface_declaration != interface_declaration)
    {
      NotificationChain msgs = null;
      if (interface_declaration != null)
        msgs = ((InternalEObject)interface_declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.TYPE_DECLARATION__INTERFACE_DECLARATION, null, msgs);
      if (newInterface_declaration != null)
        msgs = ((InternalEObject)newInterface_declaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.TYPE_DECLARATION__INTERFACE_DECLARATION, null, msgs);
      msgs = basicSetInterface_declaration(newInterface_declaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.TYPE_DECLARATION__INTERFACE_DECLARATION, newInterface_declaration, newInterface_declaration));
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
      case JavadslPackage.TYPE_DECLARATION__CLASS_DECLARATION:
        return basicSetClass_declaration(null, msgs);
      case JavadslPackage.TYPE_DECLARATION__INTERFACE_DECLARATION:
        return basicSetInterface_declaration(null, msgs);
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
      case JavadslPackage.TYPE_DECLARATION__CLASS_DECLARATION:
        return getClass_declaration();
      case JavadslPackage.TYPE_DECLARATION__INTERFACE_DECLARATION:
        return getInterface_declaration();
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
      case JavadslPackage.TYPE_DECLARATION__CLASS_DECLARATION:
        setClass_declaration((ClassDeclaration)newValue);
        return;
      case JavadslPackage.TYPE_DECLARATION__INTERFACE_DECLARATION:
        setInterface_declaration((InterfaceDeclaration)newValue);
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
      case JavadslPackage.TYPE_DECLARATION__CLASS_DECLARATION:
        setClass_declaration((ClassDeclaration)null);
        return;
      case JavadslPackage.TYPE_DECLARATION__INTERFACE_DECLARATION:
        setInterface_declaration((InterfaceDeclaration)null);
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
      case JavadslPackage.TYPE_DECLARATION__CLASS_DECLARATION:
        return class_declaration != null;
      case JavadslPackage.TYPE_DECLARATION__INTERFACE_DECLARATION:
        return interface_declaration != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeDeclarationImpl
