/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package wfgcml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import wfgcml.Condition;
import wfgcml.Final;
import wfgcml.GCMLInstance;
import wfgcml.HasNext;
import wfgcml.IsNext;
import wfgcml.Start;
import wfgcml.WFGCMLRoot;
import wfgcml.WfgcmlFactory;
import wfgcml.WfgcmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WfgcmlPackageImpl extends EPackageImpl implements WfgcmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wfgcmlRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gcmlInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasNextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isNextEClass = null;

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
	 * @see wfgcml.WfgcmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WfgcmlPackageImpl() {
		super(eNS_URI, WfgcmlFactory.eINSTANCE);
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
	public static WfgcmlPackage init() {
		if (isInited) return (WfgcmlPackage)EPackage.Registry.INSTANCE.getEPackage(WfgcmlPackage.eNS_URI);

		// Obtain or create and register package
		WfgcmlPackageImpl theWfgcmlPackage = (WfgcmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof WfgcmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new WfgcmlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWfgcmlPackage.createPackageContents();

		// Initialize created meta-data
		theWfgcmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWfgcmlPackage.freeze();

		return theWfgcmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWFGCMLRoot() {
		return wfgcmlRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWFGCMLRoot_Start() {
		return (EReference)wfgcmlRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWFGCMLRoot_GCML() {
		return (EReference)wfgcmlRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWFGCMLRoot_Final() {
		return (EReference)wfgcmlRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWFGCMLRoot_Condition() {
		return (EReference)wfgcmlRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGCMLInstance() {
		return gcmlInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGCMLInstance_GCMLLoc() {
		return (EAttribute)gcmlInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinal() {
		return finalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Altnext() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasNext() {
		return hasNextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasNext_Next() {
		return (EReference)hasNextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsNext() {
		return isNextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfgcmlFactory getWfgcmlFactory() {
		return (WfgcmlFactory)getEFactoryInstance();
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
		wfgcmlRootEClass = createEClass(WFGCML_ROOT);
		createEReference(wfgcmlRootEClass, WFGCML_ROOT__START);
		createEReference(wfgcmlRootEClass, WFGCML_ROOT__GCML);
		createEReference(wfgcmlRootEClass, WFGCML_ROOT__FINAL);
		createEReference(wfgcmlRootEClass, WFGCML_ROOT__CONDITION);

		gcmlInstanceEClass = createEClass(GCML_INSTANCE);
		createEAttribute(gcmlInstanceEClass, GCML_INSTANCE__GCML_LOC);

		startEClass = createEClass(START);

		finalEClass = createEClass(FINAL);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__ALTNEXT);

		hasNextEClass = createEClass(HAS_NEXT);
		createEReference(hasNextEClass, HAS_NEXT__NEXT);

		isNextEClass = createEClass(IS_NEXT);
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
		gcmlInstanceEClass.getESuperTypes().add(this.getHasNext());
		gcmlInstanceEClass.getESuperTypes().add(this.getIsNext());
		startEClass.getESuperTypes().add(this.getHasNext());
		finalEClass.getESuperTypes().add(this.getIsNext());
		conditionEClass.getESuperTypes().add(this.getHasNext());
		conditionEClass.getESuperTypes().add(this.getIsNext());

		// Initialize classes and features; add operations and parameters
		initEClass(wfgcmlRootEClass, WFGCMLRoot.class, "WFGCMLRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWFGCMLRoot_Start(), this.getStart(), null, "start", null, 1, 1, WFGCMLRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWFGCMLRoot_GCML(), this.getGCMLInstance(), null, "GCML", null, 1, -1, WFGCMLRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWFGCMLRoot_Final(), this.getFinal(), null, "final", null, 1, 1, WFGCMLRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWFGCMLRoot_Condition(), this.getCondition(), null, "condition", null, 0, -1, WFGCMLRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gcmlInstanceEClass, GCMLInstance.class, "GCMLInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGCMLInstance_GCMLLoc(), ecorePackage.getEString(), "GCMLLoc", "", 1, 1, GCMLInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalEClass, Final.class, "Final", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Altnext(), this.getIsNext(), null, "altnext", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasNextEClass, HasNext.class, "HasNext", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasNext_Next(), this.getIsNext(), null, "next", null, 1, 1, HasNext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isNextEClass, IsNext.class, "IsNext", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (getWFGCMLRoot_Start(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getWFGCMLRoot_GCML(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getWFGCMLRoot_Final(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (getWFGCMLRoot_Condition(), 
		   source, 
		   new String[] {
			 "kind", "element"
		   });		
		addAnnotation
		  (gcmlInstanceEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGCMLInstance_GCMLLoc(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });		
		addAnnotation
		  (startEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (finalEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (conditionEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCondition_Altnext(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });		
		addAnnotation
		  (getHasNext_Next(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });
	}

} //WfgcmlPackageImpl
