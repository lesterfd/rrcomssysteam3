/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCML.Connection#getConnectionID <em>Connection ID</em>}</li>
 *   <li>{@link GCML.Connection#getDevice <em>Device</em>}</li>
 *   <li>{@link GCML.Connection#getMedium <em>Medium</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCML.GCMLPackage#getConnection()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface Connection extends Shape {
	/**
	 * Returns the value of the '<em><b>Connection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection ID</em>' attribute.
	 * @see #setConnectionID(long)
	 * @see GCML.GCMLPackage#getConnection_ConnectionID()
	 * @model id="true" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	long getConnectionID();

	/**
	 * Sets the value of the '{@link GCML.Connection#getConnectionID <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection ID</em>' attribute.
	 * @see #getConnectionID()
	 * @generated
	 */
	void setConnectionID(long value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference list.
	 * The list contents are of type {@link GCML.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' reference list.
	 * @see GCML.GCMLPackage#getConnection_Device()
	 * @model required="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Device> getDevice();

	/**
	 * Returns the value of the '<em><b>Medium</b></em>' reference list.
	 * The list contents are of type {@link GCML.Medium}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium</em>' reference list.
	 * @see GCML.GCMLPackage#getConnection_Medium()
	 * @model extendedMetaData="name='Medium' kind='element'"
	 * @generated
	 */
	EList<Medium> getMedium();

} // Connection
