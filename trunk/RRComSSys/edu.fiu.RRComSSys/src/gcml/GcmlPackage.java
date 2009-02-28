/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see gcml.GcmlFactory
 * @model kind="package"
 * @generated
 */
public interface GcmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gcml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gcml/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gcml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GcmlPackage eINSTANCE = gcml.impl.GcmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link gcml.impl.UserSchemaImpl <em>User Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.UserSchemaImpl
	 * @see gcml.impl.GcmlPackageImpl#getUserSchema()
	 * @generated
	 */
	int USER_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Contains Shapes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SCHEMA__CONTAINS_SHAPES = 0;

	/**
	 * The number of structural features of the '<em>User Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_SCHEMA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link gcml.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.ShapeImpl
	 * @see gcml.impl.GcmlPackageImpl#getShape()
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
	 * The meta object id for the '{@link gcml.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.PersonImpl
	 * @see gcml.impl.GcmlPackageImpl#getPerson()
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
	 * The meta object id for the '{@link gcml.impl.IsAttachedImpl <em>Is Attached</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.IsAttachedImpl
	 * @see gcml.impl.GcmlPackageImpl#getIsAttached()
	 * @generated
	 */
	int IS_ATTACHED = 2;

	/**
	 * The feature id for the '<em><b>Connect To Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTACHED__CONNECT_TO_DEVICE = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connect To Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTACHED__CONNECT_TO_PERSON = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Is Attached</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ATTACHED_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link gcml.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.DeviceImpl
	 * @see gcml.impl.GcmlPackageImpl#getDevice()
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
	 * The feature id for the '<em><b>Capabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CAPABILITIES = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link gcml.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.CapabilityImpl
	 * @see gcml.impl.GcmlPackageImpl#getCapability()
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
	 * The meta object id for the '{@link gcml.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gcml.impl.ConnectionImpl
	 * @see gcml.impl.GcmlPackageImpl#getConnection()
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
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DEVICES = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link gcml.UserSchema <em>User Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Schema</em>'.
	 * @see gcml.UserSchema
	 * @generated
	 */
	EClass getUserSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link gcml.UserSchema#getContainsShapes <em>Contains Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Shapes</em>'.
	 * @see gcml.UserSchema#getContainsShapes()
	 * @see #getUserSchema()
	 * @generated
	 */
	EReference getUserSchema_ContainsShapes();

	/**
	 * Returns the meta object for class '{@link gcml.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see gcml.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Person#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Name</em>'.
	 * @see gcml.Person#getPersonName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonName();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Person#getPersonID <em>Person ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person ID</em>'.
	 * @see gcml.Person#getPersonID()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonID();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Person#getPersonRole <em>Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Role</em>'.
	 * @see gcml.Person#getPersonRole()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonRole();

	/**
	 * Returns the meta object for class '{@link gcml.IsAttached <em>Is Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Attached</em>'.
	 * @see gcml.IsAttached
	 * @generated
	 */
	EClass getIsAttached();

	/**
	 * Returns the meta object for the reference '{@link gcml.IsAttached#getConnectToDevice <em>Connect To Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connect To Device</em>'.
	 * @see gcml.IsAttached#getConnectToDevice()
	 * @see #getIsAttached()
	 * @generated
	 */
	EReference getIsAttached_ConnectToDevice();

	/**
	 * Returns the meta object for the reference '{@link gcml.IsAttached#getConnectToPerson <em>Connect To Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connect To Person</em>'.
	 * @see gcml.IsAttached#getConnectToPerson()
	 * @see #getIsAttached()
	 * @generated
	 */
	EReference getIsAttached_ConnectToPerson();

	/**
	 * Returns the meta object for class '{@link gcml.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see gcml.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Device#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see gcml.Device#getDeviceID()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DeviceID();

	/**
	 * Returns the meta object for the reference list '{@link gcml.Device#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capabilities</em>'.
	 * @see gcml.Device#getCapabilities()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Capabilities();

	/**
	 * Returns the meta object for class '{@link gcml.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see gcml.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for class '{@link gcml.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see gcml.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Capability#getBuiltInType <em>Built In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Built In Type</em>'.
	 * @see gcml.Capability#getBuiltInType()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_BuiltInType();

	/**
	 * Returns the meta object for class '{@link gcml.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see gcml.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link gcml.Connection#getConnectionID <em>Connection ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection ID</em>'.
	 * @see gcml.Connection#getConnectionID()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnectionID();

	/**
	 * Returns the meta object for the reference list '{@link gcml.Connection#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices</em>'.
	 * @see gcml.Connection#getDevices()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Devices();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GcmlFactory getGcmlFactory();

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
		 * The meta object literal for the '{@link gcml.impl.UserSchemaImpl <em>User Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.UserSchemaImpl
		 * @see gcml.impl.GcmlPackageImpl#getUserSchema()
		 * @generated
		 */
		EClass USER_SCHEMA = eINSTANCE.getUserSchema();

		/**
		 * The meta object literal for the '<em><b>Contains Shapes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_SCHEMA__CONTAINS_SHAPES = eINSTANCE.getUserSchema_ContainsShapes();

		/**
		 * The meta object literal for the '{@link gcml.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.PersonImpl
		 * @see gcml.impl.GcmlPackageImpl#getPerson()
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
		 * The meta object literal for the '{@link gcml.impl.IsAttachedImpl <em>Is Attached</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.IsAttachedImpl
		 * @see gcml.impl.GcmlPackageImpl#getIsAttached()
		 * @generated
		 */
		EClass IS_ATTACHED = eINSTANCE.getIsAttached();

		/**
		 * The meta object literal for the '<em><b>Connect To Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ATTACHED__CONNECT_TO_DEVICE = eINSTANCE.getIsAttached_ConnectToDevice();

		/**
		 * The meta object literal for the '<em><b>Connect To Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ATTACHED__CONNECT_TO_PERSON = eINSTANCE.getIsAttached_ConnectToPerson();

		/**
		 * The meta object literal for the '{@link gcml.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.DeviceImpl
		 * @see gcml.impl.GcmlPackageImpl#getDevice()
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
		 * The meta object literal for the '<em><b>Capabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__CAPABILITIES = eINSTANCE.getDevice_Capabilities();

		/**
		 * The meta object literal for the '{@link gcml.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.ShapeImpl
		 * @see gcml.impl.GcmlPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link gcml.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.CapabilityImpl
		 * @see gcml.impl.GcmlPackageImpl#getCapability()
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
		 * The meta object literal for the '{@link gcml.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gcml.impl.ConnectionImpl
		 * @see gcml.impl.GcmlPackageImpl#getConnection()
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
		 * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__DEVICES = eINSTANCE.getConnection_Devices();

	}

} //GcmlPackage
