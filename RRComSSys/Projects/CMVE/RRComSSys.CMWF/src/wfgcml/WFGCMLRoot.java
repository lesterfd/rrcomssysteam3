/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package wfgcml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WFGCML Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wfgcml.WFGCMLRoot#getStart <em>Start</em>}</li>
 *   <li>{@link wfgcml.WFGCMLRoot#getGCML <em>GCML</em>}</li>
 *   <li>{@link wfgcml.WFGCMLRoot#getFinal <em>Final</em>}</li>
 *   <li>{@link wfgcml.WFGCMLRoot#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see wfgcml.WfgcmlPackage#getWFGCMLRoot()
 * @model
 * @generated
 */
public interface WFGCMLRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Start)
	 * @see wfgcml.WfgcmlPackage#getWFGCMLRoot_Start()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	Start getStart();

	/**
	 * Sets the value of the '{@link wfgcml.WFGCMLRoot#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

	/**
	 * Returns the value of the '<em><b>GCML</b></em>' containment reference list.
	 * The list contents are of type {@link wfgcml.GCMLInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GCML</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GCML</em>' containment reference list.
	 * @see wfgcml.WfgcmlPackage#getWFGCMLRoot_GCML()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<GCMLInstance> getGCML();

	/**
	 * Returns the value of the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' containment reference.
	 * @see #setFinal(Final)
	 * @see wfgcml.WfgcmlPackage#getWFGCMLRoot_Final()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	Final getFinal();

	/**
	 * Sets the value of the '{@link wfgcml.WFGCMLRoot#getFinal <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' containment reference.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(Final value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link wfgcml.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see wfgcml.WfgcmlPackage#getWFGCMLRoot_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Condition> getCondition();

} // WFGCMLRoot
