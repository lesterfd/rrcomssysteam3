/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Device;
import gcml.GcmlPackage;
import gcml.IsAttached;
import gcml.Person;

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
 *   <li>{@link gcml.impl.IsAttachedImpl#getConnectToDevice <em>Connect To Device</em>}</li>
 *   <li>{@link gcml.impl.IsAttachedImpl#getConnectToPerson <em>Connect To Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsAttachedImpl extends ShapeImpl implements IsAttached {
	/**
	 * The cached value of the '{@link #getConnectToDevice() <em>Connect To Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectToDevice()
	 * @generated
	 * @ordered
	 */
	protected Device connectToDevice;

	/**
	 * The cached value of the '{@link #getConnectToPerson() <em>Connect To Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectToPerson()
	 * @generated
	 * @ordered
	 */
	protected Person connectToPerson;

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
		return GcmlPackage.Literals.IS_ATTACHED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getConnectToDevice() {
		if (connectToDevice != null && connectToDevice.eIsProxy()) {
			InternalEObject oldConnectToDevice = (InternalEObject)connectToDevice;
			connectToDevice = (Device)eResolveProxy(oldConnectToDevice);
			if (connectToDevice != oldConnectToDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcmlPackage.IS_ATTACHED__CONNECT_TO_DEVICE, oldConnectToDevice, connectToDevice));
			}
		}
		return connectToDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetConnectToDevice() {
		return connectToDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectToDevice(Device newConnectToDevice) {
		Device oldConnectToDevice = connectToDevice;
		connectToDevice = newConnectToDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.IS_ATTACHED__CONNECT_TO_DEVICE, oldConnectToDevice, connectToDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getConnectToPerson() {
		if (connectToPerson != null && connectToPerson.eIsProxy()) {
			InternalEObject oldConnectToPerson = (InternalEObject)connectToPerson;
			connectToPerson = (Person)eResolveProxy(oldConnectToPerson);
			if (connectToPerson != oldConnectToPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GcmlPackage.IS_ATTACHED__CONNECT_TO_PERSON, oldConnectToPerson, connectToPerson));
			}
		}
		return connectToPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetConnectToPerson() {
		return connectToPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectToPerson(Person newConnectToPerson) {
		Person oldConnectToPerson = connectToPerson;
		connectToPerson = newConnectToPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.IS_ATTACHED__CONNECT_TO_PERSON, oldConnectToPerson, connectToPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcmlPackage.IS_ATTACHED__CONNECT_TO_DEVICE:
				if (resolve) return getConnectToDevice();
				return basicGetConnectToDevice();
			case GcmlPackage.IS_ATTACHED__CONNECT_TO_PERSON:
				if (resolve) return getConnectToPerson();
				return basicGetConnectToPerson();
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
			case GcmlPackage.IS_ATTACHED__CONNECT_TO_DEVICE:
				setConnectToDevice((Device)newValue);
				return;
			case GcmlPackage.IS_ATTACHED__CONNECT_TO_PERSON:
				setConnectToPerson((Person)newValue);
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
			case GcmlPackage.IS_ATTACHED__CONNECT_TO_DEVICE:
				setConnectToDevice((Device)null);
				return;
			case GcmlPackage.IS_ATTACHED__CONNECT_TO_PERSON:
				setConnectToPerson((Person)null);
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
			case GcmlPackage.IS_ATTACHED__CONNECT_TO_DEVICE:
				return connectToDevice != null;
			case GcmlPackage.IS_ATTACHED__CONNECT_TO_PERSON:
				return connectToPerson != null;
		}
		return super.eIsSet(featureID);
	}

} //IsAttachedImpl
