/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML.impl;

import GCML.BuiltInType;
import GCML.Capability;
import GCML.Device;
import GCML.GCMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GCML.impl.CapabilityImpl#getBuiltInType <em>Built In Type</em>}</li>
 *   <li>{@link GCML.impl.CapabilityImpl#getCapabilityID <em>Capability ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityImpl extends EObjectImpl implements Capability {
	/**
	 * The default value of the '{@link #getBuiltInType() <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected static final BuiltInType BUILT_IN_TYPE_EDEFAULT = BuiltInType.SELECT_TYPE;

	/**
	 * The cached value of the '{@link #getBuiltInType() <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected BuiltInType builtInType = BUILT_IN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapabilityID() <em>Capability ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityID()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPABILITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapabilityID() <em>Capability ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityID()
	 * @generated
	 * @ordered
	 */
	protected String capabilityID = CAPABILITY_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOTgenerated
	 */
	protected CapabilityImpl() {
		super();
		capabilityID = EcoreUtil.generateUUID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCMLPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInType getBuiltInType() {
		return builtInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuiltInType(BuiltInType newBuiltInType) {
		BuiltInType oldBuiltInType = builtInType;
		builtInType = newBuiltInType == null ? BUILT_IN_TYPE_EDEFAULT : newBuiltInType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMLPackage.CAPABILITY__BUILT_IN_TYPE, oldBuiltInType, builtInType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapabilityID() {
		return capabilityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GCMLPackage.CAPABILITY__BUILT_IN_TYPE:
				return getBuiltInType();
			case GCMLPackage.CAPABILITY__CAPABILITY_ID:
				return getCapabilityID();
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
			case GCMLPackage.CAPABILITY__BUILT_IN_TYPE:
				setBuiltInType((BuiltInType)newValue);
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
			case GCMLPackage.CAPABILITY__BUILT_IN_TYPE:
				setBuiltInType(BUILT_IN_TYPE_EDEFAULT);
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
			case GCMLPackage.CAPABILITY__BUILT_IN_TYPE:
				return builtInType != BUILT_IN_TYPE_EDEFAULT;
			case GCMLPackage.CAPABILITY__CAPABILITY_ID:
				return CAPABILITY_ID_EDEFAULT == null ? capabilityID != null : !CAPABILITY_ID_EDEFAULT.equals(capabilityID);
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
		result.append(" (BuiltInType: ");
		result.append(builtInType);
		result.append(", CapabilityID: ");
		result.append(capabilityID);
		result.append(')');
		return result.toString();
	}

} //CapabilityImpl
