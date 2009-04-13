/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML.impl;

import GCML.Action;
import GCML.BuiltInType;
import GCML.Capability;
import GCML.Connection;
import GCML.Device;
import GCML.GCMLDocument;
import GCML.GCMLFactory;
import GCML.GCMLPackage;
import GCML.IsAttached;
import GCML.Medium;
import GCML.Person;
import GCML.Shape;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GCMLPackageImpl extends EPackageImpl implements GCMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gcmlDocumentEClass = null;

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
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum builtInTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionEEnum = null;

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
	 * @see GCML.GCMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GCMLPackageImpl() {
		super(eNS_URI, GCMLFactory.eINSTANCE);
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
	public static GCMLPackage init() {
		if (isInited) return (GCMLPackage)EPackage.Registry.INSTANCE.getEPackage(GCMLPackage.eNS_URI);

		// Obtain or create and register package
		GCMLPackageImpl theGCMLPackage = (GCMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof GCMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new GCMLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGCMLPackage.createPackageContents();

		// Initialize created meta-data
		theGCMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGCMLPackage.freeze();

		return theGCMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGCMLDocument() {
		return gcmlDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGCMLDocument_Person() {
		return (EReference)gcmlDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGCMLDocument_IsAttached() {
		return (EReference)gcmlDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGCMLDocument_Device() {
		return (EReference)gcmlDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGCMLDocument_Capability() {
		return (EReference)gcmlDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGCMLDocument_Medium() {
		return (EReference)gcmlDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGCMLDocument_Connection() {
		return (EReference)gcmlDocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGCMLDocument_CommunicationID() {
		return (EAttribute)gcmlDocumentEClass.getEStructuralFeatures().get(6);
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
	public EReference getIsAttached_DeviceID() {
		return (EReference)isAttachedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsAttached_PersonID() {
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
	public EReference getDevice_Capability() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getCapability_CapabilityID() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
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
	public EReference getConnection_Device() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Medium() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedium() {
		return mediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_MediumURL() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_BuiltInType() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_Action() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedium_MediumID() {
		return (EAttribute)mediumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBuiltInType() {
		return builtInTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAction() {
		return actionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCMLFactory getGCMLFactory() {
		return (GCMLFactory)getEFactoryInstance();
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
		gcmlDocumentEClass = createEClass(GCML_DOCUMENT);
		createEReference(gcmlDocumentEClass, GCML_DOCUMENT__PERSON);
		createEReference(gcmlDocumentEClass, GCML_DOCUMENT__IS_ATTACHED);
		createEReference(gcmlDocumentEClass, GCML_DOCUMENT__DEVICE);
		createEReference(gcmlDocumentEClass, GCML_DOCUMENT__CAPABILITY);
		createEReference(gcmlDocumentEClass, GCML_DOCUMENT__MEDIUM);
		createEReference(gcmlDocumentEClass, GCML_DOCUMENT__CONNECTION);
		createEAttribute(gcmlDocumentEClass, GCML_DOCUMENT__COMMUNICATION_ID);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__PERSON_NAME);
		createEAttribute(personEClass, PERSON__PERSON_ID);
		createEAttribute(personEClass, PERSON__PERSON_ROLE);

		isAttachedEClass = createEClass(IS_ATTACHED);
		createEReference(isAttachedEClass, IS_ATTACHED__DEVICE_ID);
		createEReference(isAttachedEClass, IS_ATTACHED__PERSON_ID);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__DEVICE_ID);
		createEReference(deviceEClass, DEVICE__CAPABILITY);

		capabilityEClass = createEClass(CAPABILITY);
		createEAttribute(capabilityEClass, CAPABILITY__BUILT_IN_TYPE);
		createEAttribute(capabilityEClass, CAPABILITY__CAPABILITY_ID);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__CONNECTION_ID);
		createEReference(connectionEClass, CONNECTION__DEVICE);
		createEReference(connectionEClass, CONNECTION__MEDIUM);

		mediumEClass = createEClass(MEDIUM);
		createEAttribute(mediumEClass, MEDIUM__MEDIUM_URL);
		createEAttribute(mediumEClass, MEDIUM__BUILT_IN_TYPE);
		createEAttribute(mediumEClass, MEDIUM__ACTION);
		createEAttribute(mediumEClass, MEDIUM__MEDIUM_ID);

		// Create enums
		builtInTypeEEnum = createEEnum(BUILT_IN_TYPE);
		actionEEnum = createEEnum(ACTION);
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

		// Initialize classes and features; add operations and parameters
		initEClass(gcmlDocumentEClass, GCMLDocument.class, "GCMLDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGCMLDocument_Person(), this.getPerson(), null, "person", null, 2, -1, GCMLDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGCMLDocument_IsAttached(), this.getIsAttached(), null, "isAttached", null, 2, -1, GCMLDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGCMLDocument_Device(), this.getDevice(), null, "device", null, 2, -1, GCMLDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGCMLDocument_Capability(), this.getCapability(), null, "capability", null, 1, -1, GCMLDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGCMLDocument_Medium(), this.getMedium(), null, "medium", null, 0, -1, GCMLDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGCMLDocument_Connection(), this.getConnection(), null, "connection", null, 1, -1, GCMLDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGCMLDocument_CommunicationID(), ecorePackage.getEString(), "CommunicationID", "", 1, 1, GCMLDocument.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_PersonName(), ecorePackage.getEString(), "PersonName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PersonID(), ecorePackage.getEString(), "PersonID", "", 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PersonRole(), ecorePackage.getEString(), "PersonRole", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isAttachedEClass, IsAttached.class, "IsAttached", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsAttached_DeviceID(), this.getDevice(), null, "DeviceID", null, 1, 1, IsAttached.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIsAttached_PersonID(), this.getPerson(), null, "PersonID", null, 1, 1, IsAttached.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_DeviceID(), ecorePackage.getEString(), "DeviceID", null, 1, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Capability(), this.getCapability(), null, "Capability", null, 1, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapability_BuiltInType(), this.getBuiltInType(), "BuiltInType", null, 1, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_CapabilityID(), ecorePackage.getEString(), "CapabilityID", null, 1, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_ConnectionID(), ecorePackage.getEString(), "ConnectionID", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Device(), this.getDevice(), null, "Device", null, 1, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Medium(), this.getMedium(), null, "Medium", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediumEClass, Medium.class, "Medium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedium_MediumURL(), ecorePackage.getEString(), "MediumURL", null, 0, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedium_BuiltInType(), this.getBuiltInType(), "BuiltInType", null, 0, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedium_Action(), this.getAction(), "Action", null, 0, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedium_MediumID(), ecorePackage.getEString(), "MediumID", "", 1, 1, Medium.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(builtInTypeEEnum, BuiltInType.class, "BuiltInType");
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.SELECT_TYPE);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.TEXT);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.TEXT_FILE);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.BINARY_FILE);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.STREAM_FILE);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.AUDIO_FILE);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.VIDEO_FILE);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.AUDIO_VIDEO_FILE);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.NON_STREAM_FILE);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.LIVE_STREAM);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.LIVE_AUDIO);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.LIVE_VIDEO);
		addEEnumLiteral(builtInTypeEEnum, BuiltInType.LIVE_AUDIO_VIDEO);

		initEEnum(actionEEnum, Action.class, "Action");
		addEEnumLiteral(actionEEnum, Action.SELECT_TYPE);
		addEEnumLiteral(actionEEnum, Action.SEND);
		addEEnumLiteral(actionEEnum, Action.DO_NOT_SEND);
		addEEnumLiteral(actionEEnum, Action.START_APPLICATION);

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
		  (gcmlDocumentEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed",
			 "name", "GCML"
		   });		
		addAnnotation
		  (getGCMLDocument_Person(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getGCMLDocument_IsAttached(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getGCMLDocument_Device(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getGCMLDocument_Capability(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getGCMLDocument_Medium(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getGCMLDocument_Connection(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getGCMLDocument_CommunicationID(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
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
		  (getIsAttached_DeviceID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DeviceID",
			 "namespace", ""
		   });		
		addAnnotation
		  (getIsAttached_PersonID(), 
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
		  (getDevice_Capability(), 
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
		  (getCapability_CapabilityID(), 
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
		  (getConnection_Device(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getConnection_Medium(), 
		   source, 
		   new String[] {
			 "name", "Medium",
			 "kind", "element"
		   });		
		addAnnotation
		  (mediumEClass, 
		   source, 
		   new String[] {
			 "kind", "simple"
		   });		
		addAnnotation
		  (getMedium_MediumID(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });
	}

} //GCMLPackageImpl
