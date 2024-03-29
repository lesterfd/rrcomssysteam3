/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see GCML.GCMLPackage#getAction()
 * @model
 * @generated
 */
public enum Action implements Enumerator {
	/**
	 * The '<em><b>SELECT TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	SELECT_TYPE(0, "SELECT_TYPE", "<Select Type>"), /**
	 * The '<em><b>Send</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEND_VALUE
	 * @generated
	 * @ordered
	 */
	SEND(1, "Send", "Send"),

	/**
	 * The '<em><b>Do Not Send</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DO_NOT_SEND_VALUE
	 * @generated
	 * @ordered
	 */
	DO_NOT_SEND(2, "DoNotSend", "DoNotSend"),

	/**
	 * The '<em><b>Start Application</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_APPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	START_APPLICATION(3, "StartApplication", "StartApplication");

	/**
	 * The '<em><b>SELECT TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SELECT TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECT_TYPE
	 * @model literal="<Select Type>"
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_TYPE_VALUE = 0;

	/**
	 * The '<em><b>Send</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Send</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEND
	 * @model name="Send"
	 * @generated
	 * @ordered
	 */
	public static final int SEND_VALUE = 1;

	/**
	 * The '<em><b>Do Not Send</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Do Not Send</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DO_NOT_SEND
	 * @model name="DoNotSend"
	 * @generated
	 * @ordered
	 */
	public static final int DO_NOT_SEND_VALUE = 2;

	/**
	 * The '<em><b>Start Application</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start Application</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_APPLICATION
	 * @model name="StartApplication"
	 * @generated
	 * @ordered
	 */
	public static final int START_APPLICATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Action[] VALUES_ARRAY =
		new Action[] {
			SELECT_TYPE,
			SEND,
			DO_NOT_SEND,
			START_APPLICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Action> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Action get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Action result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Action getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Action result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Action get(int value) {
		switch (value) {
			case SELECT_TYPE_VALUE: return SELECT_TYPE;
			case SEND_VALUE: return SEND;
			case DO_NOT_SEND_VALUE: return DO_NOT_SEND;
			case START_APPLICATION_VALUE: return START_APPLICATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Action(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Action
