/**
 */
package pt.ipp.isep.mei.enorm.pam.cr2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.Comment#getCommentType <em>Comment Type</em>}</li>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.Comment#isReply <em>Reply</em>}</li>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.Comment#isModeration <em>Moderation</em>}</li>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.Comment#getModerationprocess <em>Moderationprocess</em>}</li>
 * </ul>
 *
 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getComment()
 * @model
 * @generated
 */
public interface Comment extends UserFeedback {
	/**
	 * Returns the value of the '<em><b>Comment Type</b></em>' attribute.
	 * The literals are from the enumeration {@link pt.ipp.isep.mei.enorm.pam.cr2.CommentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment Type</em>' attribute.
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.CommentType
	 * @see #setCommentType(CommentType)
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getComment_CommentType()
	 * @model required="true"
	 * @generated
	 */
	CommentType getCommentType();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mei.enorm.pam.cr2.Comment#getCommentType <em>Comment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Type</em>' attribute.
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.CommentType
	 * @see #getCommentType()
	 * @generated
	 */
	void setCommentType(CommentType value);

	/**
	 * Returns the value of the '<em><b>Reply</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply</em>' attribute.
	 * @see #setReply(boolean)
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getComment_Reply()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isReply();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mei.enorm.pam.cr2.Comment#isReply <em>Reply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply</em>' attribute.
	 * @see #isReply()
	 * @generated
	 */
	void setReply(boolean value);

	/**
	 * Returns the value of the '<em><b>Moderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderation</em>' attribute.
	 * @see #setModeration(boolean)
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getComment_Moderation()
	 * @model required="true"
	 * @generated
	 */
	boolean isModeration();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mei.enorm.pam.cr2.Comment#isModeration <em>Moderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moderation</em>' attribute.
	 * @see #isModeration()
	 * @generated
	 */
	void setModeration(boolean value);

	/**
	 * Returns the value of the '<em><b>Moderationprocess</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderationprocess</em>' containment reference.
	 * @see #setModerationprocess(ModerationProcess)
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#getComment_Moderationprocess()
	 * @model containment="true"
	 * @generated
	 */
	ModerationProcess getModerationprocess();

	/**
	 * Sets the value of the '{@link pt.ipp.isep.mei.enorm.pam.cr2.Comment#getModerationprocess <em>Moderationprocess</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moderationprocess</em>' containment reference.
	 * @see #getModerationprocess()
	 * @generated
	 */
	void setModerationprocess(ModerationProcess value);

} // Comment
