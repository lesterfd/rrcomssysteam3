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
 *   <li>{@link GCML.GCMLDocument#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCML.GCMLPackage#getGCMLDocument()
 * @model extendedMetaData="kind='mixed' name='GCML'"
 * @generated
 */
public interface GCMLDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference list.
	 * The list contents are of type {@link GCML.Shape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference list.
	 * @see GCML.GCMLPackage#getGCMLDocument_Shape()
	 * @model containment="true"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Shape> getShape();

} // GCMLDocument
