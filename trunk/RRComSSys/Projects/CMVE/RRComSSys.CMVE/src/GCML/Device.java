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
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCML.Device#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link GCML.Device#getCapability <em>Capability</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCML.GCMLPackage#getDevice()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device ID</em>' attribute.
	 * @see GCML.GCMLPackage#getDevice_DeviceID()
	 * @model id="true" required="true" changeable="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getDeviceID();

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference list.
	 * The list contents are of type {@link GCML.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' reference list.
	 * @see GCML.GCMLPackage#getDevice_Capability()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='Capabilities' namespace=''"
	 * @generated
	 */
	EList<Capability> getCapability();

} // Device
