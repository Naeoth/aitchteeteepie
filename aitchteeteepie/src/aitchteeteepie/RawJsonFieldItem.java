/**
 */
package aitchteeteepie;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raw Json Field Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aitchteeteepie.RawJsonFieldItem#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see aitchteeteepie.AitchteeteepiePackage#getRawJsonFieldItem()
 * @model
 * @generated
 */
public interface RawJsonFieldItem extends Item {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(JsonType)
	 * @see aitchteeteepie.AitchteeteepiePackage#getRawJsonFieldItem_Value()
	 * @model
	 * @generated
	 */
	JsonType getValue();

	/**
	 * Sets the value of the '{@link aitchteeteepie.RawJsonFieldItem#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(JsonType value);

} // RawJsonFieldItem
