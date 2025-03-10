/**
 */
package pt.ipp.isep.mei.enorm.pam.cr2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moderation Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.ModerationProcess#getName <em>Name</em>}</li>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.ModerationProcess#getStep <em>Step</em>}</li>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.ModerationProcess#getInitialStep <em>Initial Step</em>}</li>
 * </ul>
 *
 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getModerationProcess()
 * @model
 * @generated
 */
public interface ModerationProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getModerationProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mei.enorm.pam.cr2.ModerationProcess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link pt.ipp.isep.mei.enorm.pam.cr2.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getModerationProcess_Step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>Initial Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Step</em>' reference.
	 * @see #setInitialStep(ValidationStep)
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getModerationProcess_InitialStep()
	 * @model required="true"
	 * @generated
	 */
	ValidationStep getInitialStep();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mei.enorm.pam.cr2.ModerationProcess#getInitialStep <em>Initial Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Step</em>' reference.
	 * @see #getInitialStep()
	 * @generated
	 */
	void setInitialStep(ValidationStep value);

} // ModerationProcess
