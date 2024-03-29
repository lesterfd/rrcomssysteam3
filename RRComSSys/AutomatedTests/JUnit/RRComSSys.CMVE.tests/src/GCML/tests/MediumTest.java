/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML.tests;

import GCML.GCMLFactory;
import GCML.Medium;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Medium</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MediumTest extends ShapeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MediumTest.class);
	}

	/**
	 * Constructs a new Medium test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediumTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Medium test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Medium getFixture() {
		return (Medium)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GCMLFactory.eINSTANCE.createMedium());
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

} //MediumTest
