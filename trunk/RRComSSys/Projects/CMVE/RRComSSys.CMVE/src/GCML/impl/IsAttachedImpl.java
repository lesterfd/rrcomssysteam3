/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML.impl;

import GCML.Device;
import GCML.GCMLPackage;
import GCML.IsAttached;
import GCML.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Attached</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GCML.impl.IsAttachedImpl#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link GCML.impl.IsAttachedImpl#getPersonID <em>Person ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsAttachedImpl extends ShapeImpl implements IsAttached {
	/**
	 * The cached value of the '{@link #getDeviceID() <em>Device ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected Device deviceID;

	/**
	 * The cached value of the '{@link #getPersonID() <em>Person ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonID()
	 * @generated
	 * @ordered
	 */
	protected Person personID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsAttachedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCMLPackage.Literals.IS_ATTACHED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDeviceID() {
		if (deviceID != null && deviceID.eIsProxy()) {
			InternalEObject oldDeviceID = (InternalEObject)deviceID;
			deviceID = (Device)eResolveProxy(oldDeviceID);
			if (deviceID != oldDeviceID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GCMLPackage.IS_ATTACHED__DEVICE_ID, oldDeviceID, deviceID));
			}
		}
		return deviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetDeviceID() {
		return deviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceID(Device newDeviceID) {
		Device oldDeviceID = deviceID;
		deviceID = newDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMLPackage.IS_ATTACHED__DEVICE_ID, oldDeviceID, deviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPersonID() {
		if (personID != null && personID.eIsProxy()) {
			InternalEObject oldPersonID = (InternalEObject)personID;
			personID = (Person)eResolveProxy(oldPersonID);
			if (personID != oldPersonID) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GCMLPackage.IS_ATTACHED__PERSON_ID, oldPersonID, personID));
			}
		}
		return personID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPersonID() {
		return personID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonID(Person newPersonID) {
		Person oldPersonID = personID;
		personID = newPersonID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMLPackage.IS_ATTACHED__PERSON_ID, oldPersonID, personID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GCMLPackage.IS_ATTACHED__DEVICE_ID:
				if (resolve) return getDeviceID();
				return basicGetDeviceID();
			case GCMLPackage.IS_ATTACHED__PERSON_ID:
				if (resolve) return getPersonID();
				return basicGetPersonID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GCMLPackage.IS_ATTACHED__DEVICE_ID:
				setDeviceID((Device)newValue);
				return;
			case GCMLPackage.IS_ATTACHED__PERSON_ID:
				setPersonID((Person)newValue);
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
			case GCMLPackage.IS_ATTACHED__DEVICE_ID:
				setDeviceID((Device)null);
				return;
			case GCMLPackage.IS_ATTACHED__PERSON_ID:
				setPersonID((Person)null);
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
			case GCMLPackage.IS_ATTACHED__DEVICE_ID:
				return deviceID != null;
			case GCMLPackage.IS_ATTACHED__PERSON_ID:
				return personID != null;
		}
		return super.eIsSet(featureID);
	}

} //IsAttachedImpl
