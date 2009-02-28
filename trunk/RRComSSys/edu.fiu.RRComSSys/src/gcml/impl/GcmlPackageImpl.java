/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml.impl;

import gcml.Capability;
import gcml.Connection;
import gcml.Device;
import gcml.GcmlFactory;
import gcml.GcmlPackage;
import gcml.IsAttached;
import gcml.Person;
import gcml.Shape;
import gcml.UserSchema;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GcmlPackageImpl extends EPackageImpl implements GcmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isAttachedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gcml.GcmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GcmlPackageImpl() {
		super(eNS_URI, GcmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GcmlPackage init() {
		if (isInited) return (GcmlPackage)EPackage.Registry.INSTANCE.getEPackage(GcmlPackage.eNS_URI);

		// Obtain or create and register package
		GcmlPackageImpl theGcmlPackage = (GcmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof GcmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new GcmlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGcmlPackage.createPackageContents();

		// Initialize created meta-data
		theGcmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGcmlPackage.freeze();

		return theGcmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserSchema() {
		return userSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSchema_ContainsShapes() {
		return (EReference)userSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PersonName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PersonID() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PersonRole() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsAttached() {
		return isAttachedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsAttached_ConnectToDevice() {
		return (EReference)isAttachedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsAttached_ConnectToPerson() {
		return (EReference)isAttachedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_DeviceID() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Capabilities() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_BuiltInType() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_ConnectionID() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Devices() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GcmlFactory getGcmlFactory() {
		return (GcmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		userSchemaEClass = createEClass(USER_SCHEMA);
		createEReference(userSchemaEClass, USER_SCHEMA__CONTAINS_SHAPES);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__PERSON_NAME);
		createEAttribute(personEClass, PERSON__PERSON_ID);
		createEAttribute(personEClass, PERSON__PERSON_ROLE);

		isAttachedEClass = createEClass(IS_ATTACHED);
		createEReference(isAttachedEClass, IS_ATTACHED__CONNECT_TO_DEVICE);
		createEReference(isAttachedEClass, IS_ATTACHED__CONNECT_TO_PERSON);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__DEVICE_ID);
		createEReference(deviceEClass, DEVICE__CAPABILITIES);

		shapeEClass = createEClass(SHAPE);

		capabilityEClass = createEClass(CAPABILITY);
		createEAttribute(capabilityEClass, CAPABILITY__BUILT_IN_TYPE);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__CONNECTION_ID);
		createEReference(connectionEClass, CONNECTION__DEVICES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		personEClass.getESuperTypes().add(this.getShape());
		isAttachedEClass.getESuperTypes().add(this.getShape());
		deviceEClass.getESuperTypes().add(this.getShape());
		capabilityEClass.getESuperTypes().add(this.getShape());
		connectionEClass.getESuperTypes().add(this.getShape());

		// Initialize classes and features; add operations and parameters
		initEClass(userSchemaEClass, UserSchema.class, "UserSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserSchema_ContainsShapes(), this.getShape(), null, "ContainsShapes", null, 0, -1, UserSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_PersonName(), ecorePackage.getEString(), "PersonName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PersonID(), ecorePackage.getEString(), "PersonID", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PersonRole(), ecorePackage.getEString(), "PersonRole", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isAttachedEClass, IsAttached.class, "IsAttached", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsAttached_ConnectToDevice(), this.getDevice(), null, "ConnectToDevice", null, 1, 1, IsAttached.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsAttached_ConnectToPerson(), this.getPerson(), null, "ConnectToPerson", null, 1, 1, IsAttached.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_DeviceID(), ecorePackage.getELong(), "DeviceID", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Capabilities(), this.getCapability(), null, "Capabilities", null, 1, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapability_BuiltInType(), ecorePackage.getEString(), "BuiltInType", null, 1, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_ConnectionID(), ecorePackage.getELong(), "ConnectionID", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Devices(), this.getDevice(), null, "Devices", null, 1, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (userSchemaEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUserSchema_ContainsShapes(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPerson_PersonName(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });		
		addAnnotation
		  (getPerson_PersonID(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });		
		addAnnotation
		  (getPerson_PersonRole(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });		
		addAnnotation
		  (isAttachedEClass, 
		   source, 
		   new String[] {
			 "kind", "empty"
		   });		
		addAnnotation
		  (getIsAttached_ConnectToDevice(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DeviceID",
			 "namespace", ""
		   });		
		addAnnotation
		  (getIsAttached_ConnectToPerson(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PersonID"
		   });		
		addAnnotation
		  (deviceEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDevice_DeviceID(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });		
		addAnnotation
		  (getDevice_Capabilities(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Capabilities",
			 "namespace", ""
		   });		
		addAnnotation
		  (getCapability_BuiltInType(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });		
		addAnnotation
		  (connectionEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getConnection_ConnectionID(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });		
		addAnnotation
		  (getConnection_Devices(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });
	}

} //GcmlPackageImpl
