/**
 */
package pt.ipp.isep.mei.enorm.pam.cr2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.Review#getGradeType <em>Grade Type</em>}</li>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.Review#getReviewType <em>Review Type</em>}</li>
 * </ul>
 *
 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getReview()
 * @model
 * @generated
 */
public interface Review extends UserFeedback {
	/**
	 * Returns the value of the '<em><b>Grade Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.ipp.isep.mei.enorm.pam.cr2.GradeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade Type</em>' attribute.
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.GradeType
	 * @see #setGradeType(GradeType)
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getReview_GradeType()
	 * @model required="true"
	 * @generated
	 */
	GradeType getGradeType();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mei.enorm.pam.cr2.Review#getGradeType <em>Grade Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade Type</em>' attribute.
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.GradeType
	 * @see #getGradeType()
	 * @generated
	 */
	void setGradeType(GradeType value);

	/**
	 * Returns the value of the '<em><b>Review Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.ipp.isep.mei.enorm.pam.cr2.ReviewType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review Type</em>' attribute.
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.ReviewType
	 * @see #setReviewType(ReviewType)
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getReview_ReviewType()
	 * @model required="true"
	 * @generated
	 */
	ReviewType getReviewType();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mei.enorm.pam.cr2.Review#getReviewType <em>Review Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Type</em>' attribute.
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.ReviewType
	 * @see #getReviewType()
	 * @generated
	 */
	void setReviewType(ReviewType value);

} // Review
