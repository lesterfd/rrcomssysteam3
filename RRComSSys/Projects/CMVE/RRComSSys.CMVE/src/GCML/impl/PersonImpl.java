/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML.impl;

import GCML.GCMLPackage;
import GCML.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GCML.impl.PersonImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link GCML.impl.PersonImpl#getPersonID <em>Person ID</em>}</li>
 *   <li>{@link GCML.impl.PersonImpl#getPersonRole <em>Person Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends ShapeImpl implements Person {
	/**
	 * The default value of the '{@link #getPersonName() <em>Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonName()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonName() <em>Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonName()
	 * @generated
	 * @ordered
	 */
	protected String personName = PERSON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersonID() <em>Person ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonID()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonID() <em>Person ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonID()
	 * @generated
	 * @ordered
	 */
	protected String personID = PERSON_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersonRole() <em>Person Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonRole()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonRole() <em>Person Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonRole()
	 * @generated
	 * @ordered
	 */
	protected String personRole = PERSON_ROLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GCMLPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonName(String newPersonName) {
		String oldPersonName = personName;
		personName = newPersonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMLPackage.PERSON__PERSON_NAME, oldPersonName, personName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonID() {
		return personID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonID(String newPersonID) {
		String oldPersonID = personID;
		personID = newPersonID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMLPackage.PERSON__PERSON_ID, oldPersonID, personID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonRole() {
		return personRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonRole(String newPersonRole) {
		String oldPersonRole = personRole;
		personRole = newPersonRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GCMLPackage.PERSON__PERSON_ROLE, oldPersonRole, personRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GCMLPackage.PERSON__PERSON_NAME:
				return getPersonName();
			case GCMLPackage.PERSON__PERSON_ID:
				return getPersonID();
			case GCMLPackage.PERSON__PERSON_ROLE:
				return getPersonRole();
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
			case GCMLPackage.PERSON__PERSON_NAME:
				setPersonName((String)newValue);
				return;
			case GCMLPackage.PERSON__PERSON_ID:
				setPersonID((String)newValue);
				return;
			case GCMLPackage.PERSON__PERSON_ROLE:
				setPersonRole((String)newValue);
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
			case GCMLPackage.PERSON__PERSON_NAME:
				setPersonName(PERSON_NAME_EDEFAULT);
				return;
			case GCMLPackage.PERSON__PERSON_ID:
				setPersonID(PERSON_ID_EDEFAULT);
				return;
			case GCMLPackage.PERSON__PERSON_ROLE:
				setPersonRole(PERSON_ROLE_EDEFAULT);
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
			case GCMLPackage.PERSON__PERSON_NAME:
				return PERSON_NAME_EDEFAULT == null ? personName != null : !PERSON_NAME_EDEFAULT.equals(personName);
			case GCMLPackage.PERSON__PERSON_ID:
				return PERSON_ID_EDEFAULT == null ? personID != null : !PERSON_ID_EDEFAULT.equals(personID);
			case GCMLPackage.PERSON__PERSON_ROLE:
				return PERSON_ROLE_EDEFAULT == null ? personRole != null : !PERSON_ROLE_EDEFAULT.equals(personRole);
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
		result.append(" (PersonName: ");
		result.append(personName);
		result.append(", PersonID: ");
		result.append(personID);
		result.append(", PersonRole: ");
		result.append(personRole);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
