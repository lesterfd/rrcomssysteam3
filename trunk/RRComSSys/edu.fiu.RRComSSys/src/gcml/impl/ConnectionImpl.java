/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Connection;
import gcml.Device;
import gcml.GcmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.ConnectionImpl#getConnectionID <em>Connection ID</em>}</li>
 *   <li>{@link gcml.impl.ConnectionImpl#getDevices <em>Devices</em>}</li>
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
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

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
		return GcmlPackage.Literals.CONNECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.CONNECTION__CONNECTION_ID, oldConnectionID, connectionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectResolvingEList<Device>(Device.class, this, GcmlPackage.CONNECTION__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcmlPackage.CONNECTION__CONNECTION_ID:
				return new Long(getConnectionID());
			case GcmlPackage.CONNECTION__DEVICES:
				return getDevices();
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
			case GcmlPackage.CONNECTION__CONNECTION_ID:
				setConnectionID(((Long)newValue).longValue());
				return;
			case GcmlPackage.CONNECTION__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
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
			case GcmlPackage.CONNECTION__CONNECTION_ID:
				setConnectionID(CONNECTION_ID_EDEFAULT);
				return;
			case GcmlPackage.CONNECTION__DEVICES:
				getDevices().clear();
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
			case GcmlPackage.CONNECTION__CONNECTION_ID:
				return connectionID != CONNECTION_ID_EDEFAULT;
			case GcmlPackage.CONNECTION__DEVICES:
				return devices != null && !devices.isEmpty();
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
