/**
 */
package aitchteeteepie.tests;

import aitchteeteepie.AitchteeteepieFactory;
import aitchteeteepie.HelpFlag;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Help Flag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelpFlagTest extends FlagTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HelpFlagTest.class);
	}

	/**
	 * Constructs a new Help Flag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpFlagTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Help Flag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HelpFlag getFixture() {
		return (HelpFlag)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AitchteeteepieFactory.eINSTANCE.createHelpFlag());
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

} //HelpFlagTest
