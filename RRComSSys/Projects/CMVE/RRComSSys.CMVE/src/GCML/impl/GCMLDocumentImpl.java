/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML.impl;

import GCML.GCMLDocument;
import GCML.GCMLPackage;
import GCML.Shape;

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
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GCML.impl.GCMLDocumentImpl#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GCMLDocumentImpl extends EObjectImpl implements GCMLDocument {
	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected EList<Shape> shape;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCMLDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCMLPackage.Literals.GCML_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shape> getShape() {
		if (shape == null) {
			shape = new EObjectContainmentEList<Shape>(Shape.class, this, GCMLPackage.GCML_DOCUMENT__SHAPE);
		}
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCMLPackage.GCML_DOCUMENT__SHAPE:
				return ((InternalEList<?>)getShape()).basicRemove(otherEnd, msgs);
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
			case GCMLPackage.GCML_DOCUMENT__SHAPE:
				return getShape();
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
			case GCMLPackage.GCML_DOCUMENT__SHAPE:
				getShape().clear();
				getShape().addAll((Collection<? extends Shape>)newValue);
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
			case GCMLPackage.GCML_DOCUMENT__SHAPE:
				getShape().clear();
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
			case GCMLPackage.GCML_DOCUMENT__SHAPE:
				return shape != null && !shape.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GCMLDocumentImpl
