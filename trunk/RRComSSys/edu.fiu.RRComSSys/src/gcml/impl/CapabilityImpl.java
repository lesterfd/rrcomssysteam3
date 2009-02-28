/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Capability;
import gcml.GcmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gcml.impl.CapabilityImpl#getBuiltInType <em>Built In Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityImpl extends ShapeImpl implements Capability {
	/**
	 * The default value of the '{@link #getBuiltInType() <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILT_IN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuiltInType() <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected String builtInType = BUILT_IN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GcmlPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuiltInType() {
		return builtInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuiltInType(String newBuiltInType) {
		String oldBuiltInType = builtInType;
		builtInType = newBuiltInType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GcmlPackage.CAPABILITY__BUILT_IN_TYPE, oldBuiltInType, builtInType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GcmlPackage.CAPABILITY__BUILT_IN_TYPE:
				return getBuiltInType();
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
			case GcmlPackage.CAPABILITY__BUILT_IN_TYPE:
				setBuiltInType((String)newValue);
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
			case GcmlPackage.CAPABILITY__BUILT_IN_TYPE:
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
			case GcmlPackage.CAPABILITY__BUILT_IN_TYPE:
				return BUILT_IN_TYPE_EDEFAULT == null ? builtInType != null : !BUILT_IN_TYPE_EDEFAULT.equals(builtInType);
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
		result.append(')');
		return result.toString();
	}

} //CapabilityImpl
