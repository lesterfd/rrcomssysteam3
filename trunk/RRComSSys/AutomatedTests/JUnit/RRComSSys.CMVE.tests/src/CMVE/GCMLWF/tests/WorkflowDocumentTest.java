/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CMVE.GCMLWF.tests;

import CMVE.GCMLWF.GCMLWFFactory;
import CMVE.GCMLWF.WorkflowDocument;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Workflow Document</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowDocumentTest extends TestCase
{

	/**
	 * The fixture for this Workflow Document test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowDocument fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args)
	{
		TestRunner.run(WorkflowDocumentTest.class);
	}

	/**
	 * Constructs a new Workflow Document test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowDocumentTest(String name)
	{
		super(name);
	}

	/**
	 * Sets the fixture for this Workflow Document test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WorkflowDocument fixture)
	{
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Workflow Document test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowDocument getFixture()
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
		setFixture(GCMLWFFactory.eINSTANCE.createWorkflowDocument());
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

} //WorkflowDocumentTest
