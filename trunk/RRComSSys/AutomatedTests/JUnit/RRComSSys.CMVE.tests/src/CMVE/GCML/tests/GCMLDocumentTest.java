/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CMVE.GCML.tests;

import CMVE.GCML.GCMLDocument;
import CMVE.GCML.GCMLFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GCMLDocumentTest extends TestCase
{

	/**
	 * The fixture for this Document test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCMLDocument fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(GCMLDocumentTest.class);
	}

	/**
	 * Constructs a new Document test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCMLDocumentTest(String name)
	{
		super(name);
	}

	/**
	 * Sets the fixture for this Document test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GCMLDocument fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Document test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCMLDocument getFixture()
	{
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception
	{
		setFixture(GCMLFactory.eINSTANCE.createGCMLDocument());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception
	{
		setFixture(null);
	}

} //GCMLDocumentTest
