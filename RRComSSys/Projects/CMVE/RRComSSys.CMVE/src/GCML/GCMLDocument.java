/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCML.GCMLDocument#getPerson <em>Person</em>}</li>
 *   <li>{@link GCML.GCMLDocument#getIsAttached <em>Is Attached</em>}</li>
 *   <li>{@link GCML.GCMLDocument#getDevice <em>Device</em>}</li>
 *   <li>{@link GCML.GCMLDocument#getCapability <em>Capability</em>}</li>
 *   <li>{@link GCML.GCMLDocument#getMedium <em>Medium</em>}</li>
 *   <li>{@link GCML.GCMLDocument#getConnection <em>Connection</em>}</li>
 *   <li>{@link GCML.GCMLDocument#getCommunicationID <em>Communication ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCML.GCMLPackage#getGCMLDocument()
 * @model extendedMetaData="kind='mixed' name='GCML'"
 * @generated
 */
public interface GCMLDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link GCML.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see GCML.GCMLPackage#getGCMLDocument_Person()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Is Attached</b></em>' containment reference list.
	 * The list contents are of type {@link GCML.IsAttached}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Attached</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attached</em>' containment reference list.
	 * @see GCML.GCMLPackage#getGCMLDocument_IsAttached()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<IsAttached> getIsAttached();

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link GCML.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see GCML.GCMLPackage#getGCMLDocument_Device()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Device> getDevice();

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link GCML.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see GCML.GCMLPackage#getGCMLDocument_Capability()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Capability> getCapability();

	/**
	 * Returns the value of the '<em><b>Medium</b></em>' containment reference list.
	 * The list contents are of type {@link GCML.Medium}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium</em>' containment reference list.
	 * @see GCML.GCMLPackage#getGCMLDocument_Medium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Medium> getMedium();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link GCML.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see GCML.GCMLPackage#getGCMLDocument_Connection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Communication ID</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication ID</em>' attribute.
	 * @see GCML.GCMLPackage#getGCMLDocument_CommunicationID()
	 * @model default="" required="true" changeable="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getCommunicationID();

} // GCMLDocument
