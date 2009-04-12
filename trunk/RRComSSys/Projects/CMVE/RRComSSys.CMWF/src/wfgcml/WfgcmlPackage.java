/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package wfgcml;

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
 * @see wfgcml.WfgcmlFactory
 * @model kind="package"
 * @generated
 */
public interface WfgcmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wfgcml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://wfgcml/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wfgcml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WfgcmlPackage eINSTANCE = wfgcml.impl.WfgcmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link wfgcml.impl.WFGCMLRootImpl <em>WFGCML Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfgcml.impl.WFGCMLRootImpl
	 * @see wfgcml.impl.WfgcmlPackageImpl#getWFGCMLRoot()
	 * @generated
	 */
	int WFGCML_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFGCML_ROOT__START = 0;

	/**
	 * The feature id for the '<em><b>GCML</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFGCML_ROOT__GCML = 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFGCML_ROOT__FINAL = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFGCML_ROOT__CONDITION = 3;

	/**
	 * The number of structural features of the '<em>WFGCML Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFGCML_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link wfgcml.HasNext <em>Has Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfgcml.HasNext
	 * @see wfgcml.impl.WfgcmlPackageImpl#getHasNext()
	 * @generated
	 */
	int HAS_NEXT = 5;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NEXT__NEXT = 0;

	/**
	 * The number of structural features of the '<em>Has Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NEXT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link wfgcml.impl.GCMLInstanceImpl <em>GCML Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfgcml.impl.GCMLInstanceImpl
	 * @see wfgcml.impl.WfgcmlPackageImpl#getGCMLInstance()
	 * @generated
	 */
	int GCML_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCML_INSTANCE__NEXT = HAS_NEXT__NEXT;

	/**
	 * The feature id for the '<em><b>GCML Loc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCML_INSTANCE__GCML_LOC = HAS_NEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GCML Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCML_INSTANCE_FEATURE_COUNT = HAS_NEXT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link wfgcml.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfgcml.impl.StartImpl
	 * @see wfgcml.impl.WfgcmlPackageImpl#getStart()
	 * @generated
	 */
	int START = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NEXT = HAS_NEXT__NEXT;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = HAS_NEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfgcml.IsNext <em>Is Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfgcml.IsNext
	 * @see wfgcml.impl.WfgcmlPackageImpl#getIsNext()
	 * @generated
	 */
	int IS_NEXT = 6;

	/**
	 * The number of structural features of the '<em>Is Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_NEXT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link wfgcml.impl.FinalImpl <em>Final</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfgcml.impl.FinalImpl
	 * @see wfgcml.impl.WfgcmlPackageImpl#getFinal()
	 * @generated
	 */
	int FINAL = 3;

	/**
	 * The number of structural features of the '<em>Final</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_FEATURE_COUNT = IS_NEXT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link wfgcml.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wfgcml.impl.ConditionImpl
	 * @see wfgcml.impl.WfgcmlPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NEXT = HAS_NEXT__NEXT;

	/**
	 * The feature id for the '<em><b>Altnext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ALTNEXT = HAS_NEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = HAS_NEXT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link wfgcml.WFGCMLRoot <em>WFGCML Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WFGCML Root</em>'.
	 * @see wfgcml.WFGCMLRoot
	 * @generated
	 */
	EClass getWFGCMLRoot();

	/**
	 * Returns the meta object for the containment reference '{@link wfgcml.WFGCMLRoot#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see wfgcml.WFGCMLRoot#getStart()
	 * @see #getWFGCMLRoot()
	 * @generated
	 */
	EReference getWFGCMLRoot_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link wfgcml.WFGCMLRoot#getGCML <em>GCML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GCML</em>'.
	 * @see wfgcml.WFGCMLRoot#getGCML()
	 * @see #getWFGCMLRoot()
	 * @generated
	 */
	EReference getWFGCMLRoot_GCML();

	/**
	 * Returns the meta object for the containment reference '{@link wfgcml.WFGCMLRoot#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final</em>'.
	 * @see wfgcml.WFGCMLRoot#getFinal()
	 * @see #getWFGCMLRoot()
	 * @generated
	 */
	EReference getWFGCMLRoot_Final();

	/**
	 * Returns the meta object for the containment reference list '{@link wfgcml.WFGCMLRoot#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see wfgcml.WFGCMLRoot#getCondition()
	 * @see #getWFGCMLRoot()
	 * @generated
	 */
	EReference getWFGCMLRoot_Condition();

	/**
	 * Returns the meta object for class '{@link wfgcml.GCMLInstance <em>GCML Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GCML Instance</em>'.
	 * @see wfgcml.GCMLInstance
	 * @generated
	 */
	EClass getGCMLInstance();

	/**
	 * Returns the meta object for the attribute '{@link wfgcml.GCMLInstance#getGCMLLoc <em>GCML Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GCML Loc</em>'.
	 * @see wfgcml.GCMLInstance#getGCMLLoc()
	 * @see #getGCMLInstance()
	 * @generated
	 */
	EAttribute getGCMLInstance_GCMLLoc();

	/**
	 * Returns the meta object for class '{@link wfgcml.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see wfgcml.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link wfgcml.Final <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final</em>'.
	 * @see wfgcml.Final
	 * @generated
	 */
	EClass getFinal();

	/**
	 * Returns the meta object for class '{@link wfgcml.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see wfgcml.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link wfgcml.Condition#getAltnext <em>Altnext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Altnext</em>'.
	 * @see wfgcml.Condition#getAltnext()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Altnext();

	/**
	 * Returns the meta object for class '{@link wfgcml.HasNext <em>Has Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Next</em>'.
	 * @see wfgcml.HasNext
	 * @generated
	 */
	EClass getHasNext();

	/**
	 * Returns the meta object for the reference '{@link wfgcml.HasNext#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see wfgcml.HasNext#getNext()
	 * @see #getHasNext()
	 * @generated
	 */
	EReference getHasNext_Next();

	/**
	 * Returns the meta object for class '{@link wfgcml.IsNext <em>Is Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Next</em>'.
	 * @see wfgcml.IsNext
	 * @generated
	 */
	EClass getIsNext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WfgcmlFactory getWfgcmlFactory();

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
		 * The meta object literal for the '{@link wfgcml.impl.WFGCMLRootImpl <em>WFGCML Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfgcml.impl.WFGCMLRootImpl
		 * @see wfgcml.impl.WfgcmlPackageImpl#getWFGCMLRoot()
		 * @generated
		 */
		EClass WFGCML_ROOT = eINSTANCE.getWFGCMLRoot();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFGCML_ROOT__START = eINSTANCE.getWFGCMLRoot_Start();

		/**
		 * The meta object literal for the '<em><b>GCML</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFGCML_ROOT__GCML = eINSTANCE.getWFGCMLRoot_GCML();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFGCML_ROOT__FINAL = eINSTANCE.getWFGCMLRoot_Final();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFGCML_ROOT__CONDITION = eINSTANCE.getWFGCMLRoot_Condition();

		/**
		 * The meta object literal for the '{@link wfgcml.impl.GCMLInstanceImpl <em>GCML Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfgcml.impl.GCMLInstanceImpl
		 * @see wfgcml.impl.WfgcmlPackageImpl#getGCMLInstance()
		 * @generated
		 */
		EClass GCML_INSTANCE = eINSTANCE.getGCMLInstance();

		/**
		 * The meta object literal for the '<em><b>GCML Loc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GCML_INSTANCE__GCML_LOC = eINSTANCE.getGCMLInstance_GCMLLoc();

		/**
		 * The meta object literal for the '{@link wfgcml.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfgcml.impl.StartImpl
		 * @see wfgcml.impl.WfgcmlPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link wfgcml.impl.FinalImpl <em>Final</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfgcml.impl.FinalImpl
		 * @see wfgcml.impl.WfgcmlPackageImpl#getFinal()
		 * @generated
		 */
		EClass FINAL = eINSTANCE.getFinal();

		/**
		 * The meta object literal for the '{@link wfgcml.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfgcml.impl.ConditionImpl
		 * @see wfgcml.impl.WfgcmlPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Altnext</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ALTNEXT = eINSTANCE.getCondition_Altnext();

		/**
		 * The meta object literal for the '{@link wfgcml.HasNext <em>Has Next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfgcml.HasNext
		 * @see wfgcml.impl.WfgcmlPackageImpl#getHasNext()
		 * @generated
		 */
		EClass HAS_NEXT = eINSTANCE.getHasNext();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_NEXT__NEXT = eINSTANCE.getHasNext_Next();

		/**
		 * The meta object literal for the '{@link wfgcml.IsNext <em>Is Next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wfgcml.IsNext
		 * @see wfgcml.impl.WfgcmlPackageImpl#getIsNext()
		 * @generated
		 */
		EClass IS_NEXT = eINSTANCE.getIsNext();

	}

} //WfgcmlPackage
