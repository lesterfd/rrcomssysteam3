/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medium</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCML.Medium#getMediumURL <em>Medium URL</em>}</li>
 *   <li>{@link GCML.Medium#getBuiltInType <em>Built In Type</em>}</li>
 *   <li>{@link GCML.Medium#getAction <em>Action</em>}</li>
 *   <li>{@link GCML.Medium#getMediumID <em>Medium ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCML.GCMLPackage#getMedium()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface Medium extends EObject {
	/**
	 * Returns the value of the '<em><b>Medium URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium URL</em>' attribute.
	 * @see #setMediumURL(String)
	 * @see GCML.GCMLPackage#getMedium_MediumURL()
	 * @model unique="false"
	 * @generated
	 */
	String getMediumURL();

	/**
	 * Sets the value of the '{@link GCML.Medium#getMediumURL <em>Medium URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium URL</em>' attribute.
	 * @see #getMediumURL()
	 * @generated
	 */
	void setMediumURL(String value);

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
	 * @see GCML.GCMLPackage#getMedium_BuiltInType()
	 * @model unique="false"
	 * @generated
	 */
	BuiltInType getBuiltInType();

	/**
	 * Sets the value of the '{@link GCML.Medium#getBuiltInType <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Built In Type</em>' attribute.
	 * @see GCML.BuiltInType
	 * @see #getBuiltInType()
	 * @generated
	 */
	void setBuiltInType(BuiltInType value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link GCML.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see GCML.Action
	 * @see #setAction(Action)
	 * @see GCML.GCMLPackage#getMedium_Action()
	 * @model unique="false"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link GCML.Medium#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see GCML.Action
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Medium ID</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium ID</em>' attribute.
	 * @see GCML.GCMLPackage#getMedium_MediumID()
	 * @model default="" id="true" required="true" changeable="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getMediumID();

} // Medium
