/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML.tests;

import GCML.GCMLFactory;
import GCML.IsAttached;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Is Attached</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IsAttachedTest extends ShapeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IsAttachedTest.class);
	}

	/**
	 * Constructs a new Is Attached test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAttachedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Is Attached test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IsAttached getFixture() {
		return (IsAttached)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GCMLFactory.eINSTANCE.createIsAttached());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IsAttachedTest
