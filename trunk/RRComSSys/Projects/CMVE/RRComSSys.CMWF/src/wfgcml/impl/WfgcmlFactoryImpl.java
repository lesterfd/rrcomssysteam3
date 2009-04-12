/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package wfgcml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wfgcml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WfgcmlFactoryImpl extends EFactoryImpl implements WfgcmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WfgcmlFactory init() {
		try {
			WfgcmlFactory theWfgcmlFactory = (WfgcmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://wfgcml/1.0"); 
			if (theWfgcmlFactory != null) {
				return theWfgcmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WfgcmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfgcmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WfgcmlPackage.WFGCML_ROOT: return createWFGCMLRoot();
			case WfgcmlPackage.GCML_INSTANCE: return createGCMLInstance();
			case WfgcmlPackage.START: return createStart();
			case WfgcmlPackage.FINAL: return createFinal();
			case WfgcmlPackage.CONDITION: return createCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WFGCMLRoot createWFGCMLRoot() {
		WFGCMLRootImpl wfgcmlRoot = new WFGCMLRootImpl();
		return wfgcmlRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCMLInstance createGCMLInstance() {
		GCMLInstanceImpl gcmlInstance = new GCMLInstanceImpl();
		return gcmlInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Final createFinal() {
		FinalImpl final_ = new FinalImpl();
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfgcmlPackage getWfgcmlPackage() {
		return (WfgcmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WfgcmlPackage getPackage() {
		return WfgcmlPackage.eINSTANCE;
	}

} //WfgcmlFactoryImpl
