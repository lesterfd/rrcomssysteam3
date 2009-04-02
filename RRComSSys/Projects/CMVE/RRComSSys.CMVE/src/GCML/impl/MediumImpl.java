/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML.impl;

import GCML.Action;
import GCML.BuiltInType;
import GCML.Connection;
import GCML.GCMLPackage;
import GCML.Medium;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medium</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GCML.impl.MediumImpl#getMediumURL <em>Medium URL</em>}</li>
 *   <li>{@link GCML.impl.MediumImpl#getBuiltInType <em>Built In Type</em>}</li>
 *   <li>{@link GCML.impl.MediumImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediumImpl extends ShapeImpl implements Medium {
	/**
	 * The default value of the '{@link #getMediumURL() <em>Medium URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumURL()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIUM_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediumURL() <em>Medium URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumURL()
	 * @generated
	 * @ordered
	 */
	protected String mediumURL = MEDIUM_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuiltInType() <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuiltInType()
	 * @generated
	 * @ordered
	 */
	protected static final BuiltInType BUILT_IN_TYPE_EDEFAULT = BuiltInType.TEXT;

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
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Action ACTION_EDEFAULT = Action.SEND;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action = ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCMLPackage.Literals.MEDIUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMediumURL() {
		return mediumURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumURL(String newMediumURL) {
		String oldMediumURL = mediumURL;
		mediumURL = newMediumURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMLPackage.MEDIUM__MEDIUM_URL, oldMediumURL, mediumURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GCMLPackage.MEDIUM__BUILT_IN_TYPE, oldBuiltInType, builtInType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMLPackage.MEDIUM__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GCMLPackage.MEDIUM__MEDIUM_URL:
				return getMediumURL();
			case GCMLPackage.MEDIUM__BUILT_IN_TYPE:
				return getBuiltInType();
			case GCMLPackage.MEDIUM__ACTION:
				return getAction();
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
			case GCMLPackage.MEDIUM__MEDIUM_URL:
				setMediumURL((String)newValue);
				return;
			case GCMLPackage.MEDIUM__BUILT_IN_TYPE:
				setBuiltInType((BuiltInType)newValue);
				return;
			case GCMLPackage.MEDIUM__ACTION:
				setAction((Action)newValue);
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
			case GCMLPackage.MEDIUM__MEDIUM_URL:
				setMediumURL(MEDIUM_URL_EDEFAULT);
				return;
			case GCMLPackage.MEDIUM__BUILT_IN_TYPE:
				setBuiltInType(BUILT_IN_TYPE_EDEFAULT);
				return;
			case GCMLPackage.MEDIUM__ACTION:
				setAction(ACTION_EDEFAULT);
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
			case GCMLPackage.MEDIUM__MEDIUM_URL:
				return MEDIUM_URL_EDEFAULT == null ? mediumURL != null : !MEDIUM_URL_EDEFAULT.equals(mediumURL);
			case GCMLPackage.MEDIUM__BUILT_IN_TYPE:
				return builtInType != BUILT_IN_TYPE_EDEFAULT;
			case GCMLPackage.MEDIUM__ACTION:
				return action != ACTION_EDEFAULT;
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
		result.append(" (MediumURL: ");
		result.append(mediumURL);
		result.append(", BuiltInType: ");
		result.append(builtInType);
		result.append(", Action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //MediumImpl
