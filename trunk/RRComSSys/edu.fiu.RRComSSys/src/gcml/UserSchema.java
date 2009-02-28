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
 * A representation of the model object '<em><b>User Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.UserSchema#getContainsShapes <em>Contains Shapes</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getUserSchema()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface UserSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Shapes</b></em>' containment reference list.
	 * The list contents are of type {@link gcml.Shape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Shapes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Shapes</em>' containment reference list.
	 * @see gcml.GcmlPackage#getUserSchema_ContainsShapes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Shape> getContainsShapes();

} // UserSchema
