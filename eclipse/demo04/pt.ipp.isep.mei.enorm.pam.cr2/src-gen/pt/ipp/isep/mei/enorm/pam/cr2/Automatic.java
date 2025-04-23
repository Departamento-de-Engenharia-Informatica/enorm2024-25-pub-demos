/**
 */
package pt.ipp.isep.mei.enorm.pam.cr2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automatic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.Automatic#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getAutomatic()
 * @model
 * @generated
 */
public interface Automatic extends ValidationStep {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getAutomatic_Method()
	 * @model required="true"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mei.enorm.pam.cr2.Automatic#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

} // Automatic
