/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCML.Capability#getBuiltInType <em>Built In Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCML.GCMLPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends Shape {
	/**
	 * Returns the value of the '<em><b>Built In Type</b></em>' attribute.
	 * The literals are from the enumeration {@link GCML.BuiltInType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Built In Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Type</em>' attribute.
	 * @see GCML.BuiltInType
	 * @see #setBuiltInType(BuiltInType)
	 * @see GCML.GCMLPackage#getCapability_BuiltInType()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	BuiltInType getBuiltInType();

	/**
	 * Sets the value of the '{@link GCML.Capability#getBuiltInType <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Built In Type</em>' attribute.
	 * @see GCML.BuiltInType
	 * @see #getBuiltInType()
	 * @generated
	 */
	void setBuiltInType(BuiltInType value);

} // Capability
