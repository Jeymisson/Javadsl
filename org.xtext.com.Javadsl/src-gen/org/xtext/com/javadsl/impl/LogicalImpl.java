/**
 */
package org.xtext.com.javadsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.com.javadsl.JavadslPackage;
import org.xtext.com.javadsl.Logical;
import org.xtext.com.javadsl.LogicalExpression;
import org.xtext.com.javadsl.TestingExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.com.javadsl.impl.LogicalImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.LogicalImpl#getTernary <em>Ternary</em>}</li>
 *   <li>{@link org.xtext.com.javadsl.impl.LogicalImpl#getTernary_end <em>Ternary end</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalImpl extends LogicalExpressionImpl implements Logical
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected LogicalExpression left;

  /**
   * The cached value of the '{@link #getTernary() <em>Ternary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTernary()
   * @generated
   * @ordered
   */
  protected Logical ternary;

  /**
   * The cached value of the '{@link #getTernary_end() <em>Ternary end</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTernary_end()
   * @generated
   * @ordered
   */
  protected TestingExpression ternary_end;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalImpl()
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
    return JavadslPackage.Literals.LOGICAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalExpression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(LogicalExpression newLeft, NotificationChain msgs)
  {
    LogicalExpression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.LOGICAL__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(LogicalExpression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.LOGICAL__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.LOGICAL__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.LOGICAL__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Logical getTernary()
  {
    return ternary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTernary(Logical newTernary, NotificationChain msgs)
  {
    Logical oldTernary = ternary;
    ternary = newTernary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.LOGICAL__TERNARY, oldTernary, newTernary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTernary(Logical newTernary)
  {
    if (newTernary != ternary)
    {
      NotificationChain msgs = null;
      if (ternary != null)
        msgs = ((InternalEObject)ternary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.LOGICAL__TERNARY, null, msgs);
      if (newTernary != null)
        msgs = ((InternalEObject)newTernary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.LOGICAL__TERNARY, null, msgs);
      msgs = basicSetTernary(newTernary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.LOGICAL__TERNARY, newTernary, newTernary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestingExpression getTernary_end()
  {
    return ternary_end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTernary_end(TestingExpression newTernary_end, NotificationChain msgs)
  {
    TestingExpression oldTernary_end = ternary_end;
    ternary_end = newTernary_end;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavadslPackage.LOGICAL__TERNARY_END, oldTernary_end, newTernary_end);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTernary_end(TestingExpression newTernary_end)
  {
    if (newTernary_end != ternary_end)
    {
      NotificationChain msgs = null;
      if (ternary_end != null)
        msgs = ((InternalEObject)ternary_end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.LOGICAL__TERNARY_END, null, msgs);
      if (newTernary_end != null)
        msgs = ((InternalEObject)newTernary_end).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavadslPackage.LOGICAL__TERNARY_END, null, msgs);
      msgs = basicSetTernary_end(newTernary_end, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JavadslPackage.LOGICAL__TERNARY_END, newTernary_end, newTernary_end));
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
      case JavadslPackage.LOGICAL__LEFT:
        return basicSetLeft(null, msgs);
      case JavadslPackage.LOGICAL__TERNARY:
        return basicSetTernary(null, msgs);
      case JavadslPackage.LOGICAL__TERNARY_END:
        return basicSetTernary_end(null, msgs);
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
      case JavadslPackage.LOGICAL__LEFT:
        return getLeft();
      case JavadslPackage.LOGICAL__TERNARY:
        return getTernary();
      case JavadslPackage.LOGICAL__TERNARY_END:
        return getTernary_end();
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
      case JavadslPackage.LOGICAL__LEFT:
        setLeft((LogicalExpression)newValue);
        return;
      case JavadslPackage.LOGICAL__TERNARY:
        setTernary((Logical)newValue);
        return;
      case JavadslPackage.LOGICAL__TERNARY_END:
        setTernary_end((TestingExpression)newValue);
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
      case JavadslPackage.LOGICAL__LEFT:
        setLeft((LogicalExpression)null);
        return;
      case JavadslPackage.LOGICAL__TERNARY:
        setTernary((Logical)null);
        return;
      case JavadslPackage.LOGICAL__TERNARY_END:
        setTernary_end((TestingExpression)null);
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
      case JavadslPackage.LOGICAL__LEFT:
        return left != null;
      case JavadslPackage.LOGICAL__TERNARY:
        return ternary != null;
      case JavadslPackage.LOGICAL__TERNARY_END:
        return ternary_end != null;
    }
    return super.eIsSet(featureID);
  }

} //LogicalImpl
