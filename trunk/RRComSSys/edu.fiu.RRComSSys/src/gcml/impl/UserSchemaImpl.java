/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.GcmlPackage;
import gcml.Shape;
import gcml.UserSchema;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.UserSchemaImpl#getContainsShapes <em>Contains Shapes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserSchemaImpl extends EObjectImpl implements UserSchema {
	/**
	 * The cached value of the '{@link #getContainsShapes() <em>Contains Shapes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsShapes()
	 * @generated
	 * @ordered
	 */
	protected EList<Shape> containsShapes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.USER_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shape> getContainsShapes() {
		if (containsShapes == null) {
			containsShapes = new EObjectContainmentEList<Shape>(Shape.class, this, GcmlPackage.USER_SCHEMA__CONTAINS_SHAPES);
		}
		return containsShapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GcmlPackage.USER_SCHEMA__CONTAINS_SHAPES:
				return ((InternalEList<?>)getContainsShapes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcmlPackage.USER_SCHEMA__CONTAINS_SHAPES:
				return getContainsShapes();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GcmlPackage.USER_SCHEMA__CONTAINS_SHAPES:
				getContainsShapes().clear();
				getContainsShapes().addAll((Collection<? extends Shape>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GcmlPackage.USER_SCHEMA__CONTAINS_SHAPES:
				getContainsShapes().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GcmlPackage.USER_SCHEMA__CONTAINS_SHAPES:
				return containsShapes != null && !containsShapes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserSchemaImpl
