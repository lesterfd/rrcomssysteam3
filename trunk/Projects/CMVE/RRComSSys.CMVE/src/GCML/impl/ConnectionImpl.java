/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML.impl;

import GCML.Connection;
import GCML.Device;
import GCML.GCMLPackage;
import GCML.Medium;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GCML.impl.ConnectionImpl#getConnectionID <em>Connection ID</em>}</li>
 *   <li>{@link GCML.impl.ConnectionImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link GCML.impl.ConnectionImpl#getMedium <em>Medium</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends ShapeImpl implements Connection {
	/**
	 * The default value of the '{@link #getConnectionID() <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionID()
	 * @generated
	 * @ordered
	 */
	protected static final long CONNECTION_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConnectionID() <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionID()
	 * @generated
	 * @ordered
	 */
	protected long connectionID = CONNECTION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> device;

	/**
	 * The cached value of the '{@link #getMedium() <em>Medium</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected EList<Medium> medium;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCMLPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getConnectionID() {
		return connectionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionID(long newConnectionID) {
		long oldConnectionID = connectionID;
		connectionID = newConnectionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMLPackage.CONNECTION__CONNECTION_ID, oldConnectionID, connectionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevice() {
		if (device == null) {
			device = new EObjectResolvingEList<Device>(Device.class, this, GCMLPackage.CONNECTION__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Medium> getMedium() {
		if (medium == null) {
			medium = new EObjectResolvingEList<Medium>(Medium.class, this, GCMLPackage.CONNECTION__MEDIUM);
		}
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GCMLPackage.CONNECTION__CONNECTION_ID:
				return new Long(getConnectionID());
			case GCMLPackage.CONNECTION__DEVICE:
				return getDevice();
			case GCMLPackage.CONNECTION__MEDIUM:
				return getMedium();
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
			case GCMLPackage.CONNECTION__CONNECTION_ID:
				setConnectionID(((Long)newValue).longValue());
				return;
			case GCMLPackage.CONNECTION__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends Device>)newValue);
				return;
			case GCMLPackage.CONNECTION__MEDIUM:
				getMedium().clear();
				getMedium().addAll((Collection<? extends Medium>)newValue);
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
			case GCMLPackage.CONNECTION__CONNECTION_ID:
				setConnectionID(CONNECTION_ID_EDEFAULT);
				return;
			case GCMLPackage.CONNECTION__DEVICE:
				getDevice().clear();
				return;
			case GCMLPackage.CONNECTION__MEDIUM:
				getMedium().clear();
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
			case GCMLPackage.CONNECTION__CONNECTION_ID:
				return connectionID != CONNECTION_ID_EDEFAULT;
			case GCMLPackage.CONNECTION__DEVICE:
				return device != null && !device.isEmpty();
			case GCMLPackage.CONNECTION__MEDIUM:
				return medium != null && !medium.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ConnectionID: ");
		result.append(connectionID);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
