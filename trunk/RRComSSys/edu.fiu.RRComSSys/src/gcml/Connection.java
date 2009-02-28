/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Connection#getConnectionID <em>Connection ID</em>}</li>
 *   <li>{@link gcml.Connection#getDevices <em>Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getConnection()
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
	 * @see gcml.GcmlPackage#getConnection_ConnectionID()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	long getConnectionID();

	/**
	 * Sets the value of the '{@link gcml.Connection#getConnectionID <em>Connection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection ID</em>' attribute.
	 * @see #getConnectionID()
	 * @generated
	 */
	void setConnectionID(long value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link gcml.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see gcml.GcmlPackage#getConnection_Devices()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	EList<Device> getDevices();

} // Connection
