/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GCML.GCMLFactory
 * @model kind="package"
 * @generated
 */
public interface GCMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GCML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://GCML/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GCML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GCMLPackage eINSTANCE = GCML.impl.GCMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link GCML.impl.GCMLDocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCML.impl.GCMLDocumentImpl
	 * @see GCML.impl.GCMLPackageImpl#getGCMLDocument()
	 * @generated
	 */
	int GCML_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCML_DOCUMENT__SHAPE = 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCML_DOCUMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link GCML.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCML.impl.ShapeImpl
	 * @see GCML.impl.GCMLPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 4;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link GCML.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCML.impl.PersonImpl
	 * @see GCML.impl.GCMLPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_NAME = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_ID = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Person Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_ROLE = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link GCML.impl.IsAttachedImpl <em>Is Attached</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCML.impl.IsAttachedImpl
	 * @see GCML.impl.GCMLPackageImpl#getIsAttached()
	 * @generated
	 */
	int IS_ATTACHED = 2;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTACHED__DEVICE_ID = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Person ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTACHED__PERSON_ID = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Is Attached</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTACHED_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link GCML.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCML.impl.DeviceImpl
	 * @see GCML.impl.GCMLPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 3;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICE_ID = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CAPABILITY = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link GCML.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCML.impl.CapabilityImpl
	 * @see GCML.impl.GCMLPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 5;

	/**
	 * The feature id for the '<em><b>Built In Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__BUILT_IN_TYPE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GCML.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCML.impl.ConnectionImpl
	 * @see GCML.impl.GCMLPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Connection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_ID = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DEVICE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Medium</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__MEDIUM = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link GCML.impl.MediumImpl <em>Medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCML.impl.MediumImpl
	 * @see GCML.impl.GCMLPackageImpl#getMedium()
	 * @generated
	 */
	int MEDIUM = 7;

	/**
	 * The feature id for the '<em><b>Medium URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__MEDIUM_URL = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Built In Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__BUILT_IN_TYPE = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM__ACTION = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link GCML.BuiltInType <em>Built In Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCML.BuiltInType
	 * @see GCML.impl.GCMLPackageImpl#getBuiltInType()
	 * @generated
	 */
	int BUILT_IN_TYPE = 8;

	/**
	 * The meta object id for the '{@link GCML.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GCML.Action
	 * @see GCML.impl.GCMLPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;


	/**
	 * Returns the meta object for class '{@link GCML.GCMLDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see GCML.GCMLDocument
	 * @generated
	 */
	EClass getGCMLDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link GCML.GCMLDocument#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shape</em>'.
	 * @see GCML.GCMLDocument#getShape()
	 * @see #getGCMLDocument()
	 * @generated
	 */
	EReference getGCMLDocument_Shape();

	/**
	 * Returns the meta object for class '{@link GCML.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see GCML.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link GCML.Person#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Name</em>'.
	 * @see GCML.Person#getPersonName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonName();

	/**
	 * Returns the meta object for the attribute '{@link GCML.Person#getPersonID <em>Person ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person ID</em>'.
	 * @see GCML.Person#getPersonID()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonID();

	/**
	 * Returns the meta object for the attribute '{@link GCML.Person#getPersonRole <em>Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Role</em>'.
	 * @see GCML.Person#getPersonRole()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonRole();

	/**
	 * Returns the meta object for class '{@link GCML.IsAttached <em>Is Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Attached</em>'.
	 * @see GCML.IsAttached
	 * @generated
	 */
	EClass getIsAttached();

	/**
	 * Returns the meta object for the reference '{@link GCML.IsAttached#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device ID</em>'.
	 * @see GCML.IsAttached#getDeviceID()
	 * @see #getIsAttached()
	 * @generated
	 */
	EReference getIsAttached_DeviceID();

	/**
	 * Returns the meta object for the reference '{@link GCML.IsAttached#getPersonID <em>Person ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person ID</em>'.
	 * @see GCML.IsAttached#getPersonID()
	 * @see #getIsAttached()
	 * @generated
	 */
	EReference getIsAttached_PersonID();

	/**
	 * Returns the meta object for class '{@link GCML.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see GCML.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link GCML.Device#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see GCML.Device#getDeviceID()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DeviceID();

	/**
	 * Returns the meta object for the reference list '{@link GCML.Device#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capability</em>'.
	 * @see GCML.Device#getCapability()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Capability();

	/**
	 * Returns the meta object for class '{@link GCML.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see GCML.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for class '{@link GCML.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see GCML.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the attribute '{@link GCML.Capability#getBuiltInType <em>Built In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Built In Type</em>'.
	 * @see GCML.Capability#getBuiltInType()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_BuiltInType();

	/**
	 * Returns the meta object for class '{@link GCML.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see GCML.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link GCML.Connection#getConnectionID <em>Connection ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection ID</em>'.
	 * @see GCML.Connection#getConnectionID()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnectionID();

	/**
	 * Returns the meta object for the reference list '{@link GCML.Connection#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Device</em>'.
	 * @see GCML.Connection#getDevice()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Device();

	/**
	 * Returns the meta object for the reference list '{@link GCML.Connection#getMedium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Medium</em>'.
	 * @see GCML.Connection#getMedium()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Medium();

	/**
	 * Returns the meta object for class '{@link GCML.Medium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medium</em>'.
	 * @see GCML.Medium
	 * @generated
	 */
	EClass getMedium();

	/**
	 * Returns the meta object for the attribute '{@link GCML.Medium#getMediumURL <em>Medium URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium URL</em>'.
	 * @see GCML.Medium#getMediumURL()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_MediumURL();

	/**
	 * Returns the meta object for the attribute '{@link GCML.Medium#getBuiltInType <em>Built In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Built In Type</em>'.
	 * @see GCML.Medium#getBuiltInType()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_BuiltInType();

	/**
	 * Returns the meta object for the attribute '{@link GCML.Medium#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see GCML.Medium#getAction()
	 * @see #getMedium()
	 * @generated
	 */
	EAttribute getMedium_Action();

	/**
	 * Returns the meta object for enum '{@link GCML.BuiltInType <em>Built In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Built In Type</em>'.
	 * @see GCML.BuiltInType
	 * @generated
	 */
	EEnum getBuiltInType();

	/**
	 * Returns the meta object for enum '{@link GCML.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see GCML.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GCMLFactory getGCMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GCML.impl.GCMLDocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCML.impl.GCMLDocumentImpl
		 * @see GCML.impl.GCMLPackageImpl#getGCMLDocument()
		 * @generated
		 */
		EClass GCML_DOCUMENT = eINSTANCE.getGCMLDocument();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GCML_DOCUMENT__SHAPE = eINSTANCE.getGCMLDocument_Shape();

		/**
		 * The meta object literal for the '{@link GCML.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCML.impl.PersonImpl
		 * @see GCML.impl.GCMLPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Person Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSON_NAME = eINSTANCE.getPerson_PersonName();

		/**
		 * The meta object literal for the '<em><b>Person ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSON_ID = eINSTANCE.getPerson_PersonID();

		/**
		 * The meta object literal for the '<em><b>Person Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSON_ROLE = eINSTANCE.getPerson_PersonRole();

		/**
		 * The meta object literal for the '{@link GCML.impl.IsAttachedImpl <em>Is Attached</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCML.impl.IsAttachedImpl
		 * @see GCML.impl.GCMLPackageImpl#getIsAttached()
		 * @generated
		 */
		EClass IS_ATTACHED = eINSTANCE.getIsAttached();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ATTACHED__DEVICE_ID = eINSTANCE.getIsAttached_DeviceID();

		/**
		 * The meta object literal for the '<em><b>Person ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ATTACHED__PERSON_ID = eINSTANCE.getIsAttached_PersonID();

		/**
		 * The meta object literal for the '{@link GCML.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCML.impl.DeviceImpl
		 * @see GCML.impl.GCMLPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DEVICE_ID = eINSTANCE.getDevice_DeviceID();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__CAPABILITY = eINSTANCE.getDevice_Capability();

		/**
		 * The meta object literal for the '{@link GCML.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCML.impl.ShapeImpl
		 * @see GCML.impl.GCMLPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link GCML.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCML.impl.CapabilityImpl
		 * @see GCML.impl.GCMLPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Built In Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__BUILT_IN_TYPE = eINSTANCE.getCapability_BuiltInType();

		/**
		 * The meta object literal for the '{@link GCML.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCML.impl.ConnectionImpl
		 * @see GCML.impl.GCMLPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Connection ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONNECTION_ID = eINSTANCE.getConnection_ConnectionID();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__DEVICE = eINSTANCE.getConnection_Device();

		/**
		 * The meta object literal for the '<em><b>Medium</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__MEDIUM = eINSTANCE.getConnection_Medium();

		/**
		 * The meta object literal for the '{@link GCML.impl.MediumImpl <em>Medium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCML.impl.MediumImpl
		 * @see GCML.impl.GCMLPackageImpl#getMedium()
		 * @generated
		 */
		EClass MEDIUM = eINSTANCE.getMedium();

		/**
		 * The meta object literal for the '<em><b>Medium URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__MEDIUM_URL = eINSTANCE.getMedium_MediumURL();

		/**
		 * The meta object literal for the '<em><b>Built In Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__BUILT_IN_TYPE = eINSTANCE.getMedium_BuiltInType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIUM__ACTION = eINSTANCE.getMedium_Action();

		/**
		 * The meta object literal for the '{@link GCML.BuiltInType <em>Built In Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCML.BuiltInType
		 * @see GCML.impl.GCMLPackageImpl#getBuiltInType()
		 * @generated
		 */
		EEnum BUILT_IN_TYPE = eINSTANCE.getBuiltInType();

		/**
		 * The meta object literal for the '{@link GCML.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GCML.Action
		 * @see GCML.impl.GCMLPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

	}

} //GCMLPackage
