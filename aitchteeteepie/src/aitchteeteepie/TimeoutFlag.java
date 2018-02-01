/**
 */
package aitchteeteepie;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timeout Flag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aitchteeteepie.TimeoutFlag#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see aitchteeteepie.AitchteeteepiePackage#getTimeoutFlag()
 * @model
 * @generated
 */
public interface TimeoutFlag extends Flag {
	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(float)
	 * @see aitchteeteepie.AitchteeteepiePackage#getTimeoutFlag_Timeout()
	 * @model
	 * @generated
	 */
	float getTimeout();

	/**
	 * Sets the value of the '{@link aitchteeteepie.TimeoutFlag#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(float value);

} // TimeoutFlag
