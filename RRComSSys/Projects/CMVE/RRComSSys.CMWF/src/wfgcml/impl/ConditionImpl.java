/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package wfgcml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import wfgcml.Condition;
import wfgcml.IsNext;
import wfgcml.WfgcmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wfgcml.impl.ConditionImpl#getNext <em>Next</em>}</li>
 *   <li>{@link wfgcml.impl.ConditionImpl#getAltnext <em>Altnext</em>}</li>
 *   <li>{@link wfgcml.impl.ConditionImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends EObjectImpl implements Condition {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected IsNext next;

	/**
	 * The cached value of the '{@link #getAltnext() <em>Altnext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltnext()
	 * @generated
	 * @ordered
	 */
	protected IsNext altnext;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOTgenerated
	 */
	protected ConditionImpl() {
		super();
		id = EcoreUtil.generateUUID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfgcmlPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsNext getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (IsNext)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfgcmlPackage.CONDITION__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsNext basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(IsNext newNext) {
		IsNext oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfgcmlPackage.CONDITION__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsNext getAltnext() {
		if (altnext != null && altnext.eIsProxy()) {
			InternalEObject oldAltnext = (InternalEObject)altnext;
			altnext = (IsNext)eResolveProxy(oldAltnext);
			if (altnext != oldAltnext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfgcmlPackage.CONDITION__ALTNEXT, oldAltnext, altnext));
			}
		}
		return altnext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsNext basicGetAltnext() {
		return altnext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltnext(IsNext newAltnext) {
		IsNext oldAltnext = altnext;
		altnext = newAltnext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfgcmlPackage.CONDITION__ALTNEXT, oldAltnext, altnext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WfgcmlPackage.CONDITION__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case WfgcmlPackage.CONDITION__ALTNEXT:
				if (resolve) return getAltnext();
				return basicGetAltnext();
			case WfgcmlPackage.CONDITION__ID:
				return getID();
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
			case WfgcmlPackage.CONDITION__NEXT:
				setNext((IsNext)newValue);
				return;
			case WfgcmlPackage.CONDITION__ALTNEXT:
				setAltnext((IsNext)newValue);
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
			case WfgcmlPackage.CONDITION__NEXT:
				setNext((IsNext)null);
				return;
			case WfgcmlPackage.CONDITION__ALTNEXT:
				setAltnext((IsNext)null);
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
			case WfgcmlPackage.CONDITION__NEXT:
				return next != null;
			case WfgcmlPackage.CONDITION__ALTNEXT:
				return altnext != null;
			case WfgcmlPackage.CONDITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
