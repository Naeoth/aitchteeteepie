/**
 */
package aitchteeteepie.tests;

import aitchteeteepie.AitchteeteepieFactory;
import aitchteeteepie.HttpHeaderItem;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Http Header Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HttpHeaderItemTest extends ItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HttpHeaderItemTest.class);
	}

	/**
	 * Constructs a new Http Header Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpHeaderItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Http Header Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HttpHeaderItem getFixture() {
		return (HttpHeaderItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AitchteeteepieFactory.eINSTANCE.createHttpHeaderItem());
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

} //HttpHeaderItemTest
