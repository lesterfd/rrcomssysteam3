/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML.impl;

import GCML.Capability;
import GCML.Connection;
import GCML.Device;
import GCML.GCMLDocument;
import GCML.GCMLPackage;
import GCML.IsAttached;
import GCML.Medium;
import GCML.Person;
import GCML.Shape;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GCML.impl.GCMLDocumentImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link GCML.impl.GCMLDocumentImpl#getIsAttached <em>Is Attached</em>}</li>
 *   <li>{@link GCML.impl.GCMLDocumentImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link GCML.impl.GCMLDocumentImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link GCML.impl.GCMLDocumentImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link GCML.impl.GCMLDocumentImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link GCML.impl.GCMLDocumentImpl#getCommunicationID <em>Communication ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GCMLDocumentImpl extends EObjectImpl implements GCMLDocument {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> person;
	/**
	 * The cached value of the '{@link #getIsAttached() <em>Is Attached</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAttached()
	 * @generated
	 * @ordered
	 */
	protected EList<IsAttached> isAttached;
	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> device;
	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capability;
	/**
	 * The cached value of the '{@link #getMedium() <em>Medium</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected EList<Medium> medium;
	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;
	/**
	 * The default value of the '{@link #getCommunicationID() <em>Communication ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationID()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_ID_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getCommunicationID() <em>Communication ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationID()
	 * @generated
	 * @ordered
	 */
	protected String communicationID = COMMUNICATION_ID_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOTgenerated
	 */
	protected GCMLDocumentImpl() {
		super();
		communicationID = EcoreUtil.generateUUID();
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
	public EList<Person> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<Person>(Person.class, this, GCMLPackage.GCML_DOCUMENT__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IsAttached> getIsAttached() {
		if (isAttached == null) {
			isAttached = new EObjectContainmentEList<IsAttached>(IsAttached.class, this, GCMLPackage.GCML_DOCUMENT__IS_ATTACHED);
		}
		return isAttached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<Device>(Device.class, this, GCMLPackage.GCML_DOCUMENT__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapability() {
		if (capability == null) {
			capability = new EObjectContainmentEList<Capability>(Capability.class, this, GCMLPackage.GCML_DOCUMENT__CAPABILITY);
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Medium> getMedium() {
		if (medium == null) {
			medium = new EObjectContainmentEList<Medium>(Medium.class, this, GCMLPackage.GCML_DOCUMENT__MEDIUM);
		}
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this, GCMLPackage.GCML_DOCUMENT__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommunicationID() {
		return communicationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GCMLPackage.GCML_DOCUMENT__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case GCMLPackage.GCML_DOCUMENT__IS_ATTACHED:
				return ((InternalEList<?>)getIsAttached()).basicRemove(otherEnd, msgs);
			case GCMLPackage.GCML_DOCUMENT__DEVICE:
				return ((InternalEList<?>)getDevice()).basicRemove(otherEnd, msgs);
			case GCMLPackage.GCML_DOCUMENT__CAPABILITY:
				return ((InternalEList<?>)getCapability()).basicRemove(otherEnd, msgs);
			case GCMLPackage.GCML_DOCUMENT__MEDIUM:
				return ((InternalEList<?>)getMedium()).basicRemove(otherEnd, msgs);
			case GCMLPackage.GCML_DOCUMENT__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
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
			case GCMLPackage.GCML_DOCUMENT__PERSON:
				return getPerson();
			case GCMLPackage.GCML_DOCUMENT__IS_ATTACHED:
				return getIsAttached();
			case GCMLPackage.GCML_DOCUMENT__DEVICE:
				return getDevice();
			case GCMLPackage.GCML_DOCUMENT__CAPABILITY:
				return getCapability();
			case GCMLPackage.GCML_DOCUMENT__MEDIUM:
				return getMedium();
			case GCMLPackage.GCML_DOCUMENT__CONNECTION:
				return getConnection();
			case GCMLPackage.GCML_DOCUMENT__COMMUNICATION_ID:
				return getCommunicationID();
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
			case GCMLPackage.GCML_DOCUMENT__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends Person>)newValue);
				return;
			case GCMLPackage.GCML_DOCUMENT__IS_ATTACHED:
				getIsAttached().clear();
				getIsAttached().addAll((Collection<? extends IsAttached>)newValue);
				return;
			case GCMLPackage.GCML_DOCUMENT__DEVICE:
				getDevice().clear();
				getDevice().addAll((Collection<? extends Device>)newValue);
				return;
			case GCMLPackage.GCML_DOCUMENT__CAPABILITY:
				getCapability().clear();
				getCapability().addAll((Collection<? extends Capability>)newValue);
				return;
			case GCMLPackage.GCML_DOCUMENT__MEDIUM:
				getMedium().clear();
				getMedium().addAll((Collection<? extends Medium>)newValue);
				return;
			case GCMLPackage.GCML_DOCUMENT__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
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
			case GCMLPackage.GCML_DOCUMENT__PERSON:
				getPerson().clear();
				return;
			case GCMLPackage.GCML_DOCUMENT__IS_ATTACHED:
				getIsAttached().clear();
				return;
			case GCMLPackage.GCML_DOCUMENT__DEVICE:
				getDevice().clear();
				return;
			case GCMLPackage.GCML_DOCUMENT__CAPABILITY:
				getCapability().clear();
				return;
			case GCMLPackage.GCML_DOCUMENT__MEDIUM:
				getMedium().clear();
				return;
			case GCMLPackage.GCML_DOCUMENT__CONNECTION:
				getConnection().clear();
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
			case GCMLPackage.GCML_DOCUMENT__PERSON:
				return person != null && !person.isEmpty();
			case GCMLPackage.GCML_DOCUMENT__IS_ATTACHED:
				return isAttached != null && !isAttached.isEmpty();
			case GCMLPackage.GCML_DOCUMENT__DEVICE:
				return device != null && !device.isEmpty();
			case GCMLPackage.GCML_DOCUMENT__CAPABILITY:
				return capability != null && !capability.isEmpty();
			case GCMLPackage.GCML_DOCUMENT__MEDIUM:
				return medium != null && !medium.isEmpty();
			case GCMLPackage.GCML_DOCUMENT__CONNECTION:
				return connection != null && !connection.isEmpty();
			case GCMLPackage.GCML_DOCUMENT__COMMUNICATION_ID:
				return COMMUNICATION_ID_EDEFAULT == null ? communicationID != null : !COMMUNICATION_ID_EDEFAULT.equals(communicationID);
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
		result.append(" (CommunicationID: ");
		result.append(communicationID);
		result.append(')');
		return result.toString();
	}

} //GCMLDocumentImpl
