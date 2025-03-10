/**
 */
package pt.ipp.isep.mei.enorm.pam.cr2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pt.ipp.isep.mei.enorm.pam.cr2.Comment;
import pt.ipp.isep.mei.enorm.pam.cr2.CommentType;
import pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package;
import pt.ipp.isep.mei.enorm.pam.cr2.ModerationProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.impl.CommentImpl#getCommentType <em>Comment Type</em>}</li>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.impl.CommentImpl#isReply <em>Reply</em>}</li>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.impl.CommentImpl#isModeration <em>Moderation</em>}</li>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.impl.CommentImpl#getModerationprocess <em>Moderationprocess</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends UserFeedbackImpl implements Comment {
	/**
	 * The default value of the '{@link #getCommentType() <em>Comment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentType()
	 * @generated
	 * @ordered
	 */
	protected static final CommentType COMMENT_TYPE_EDEFAULT = CommentType.SIMPLE;

	/**
	 * The cached value of the '{@link #getCommentType() <em>Comment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentType()
	 * @generated
	 * @ordered
	 */
	protected CommentType commentType = COMMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReply() <em>Reply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReply()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReply() <em>Reply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReply()
	 * @generated
	 * @ordered
	 */
	protected boolean reply = REPLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isModeration() <em>Moderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModeration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MODERATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModeration() <em>Moderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModeration()
	 * @generated
	 * @ordered
	 */
	protected boolean moderation = MODERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModerationprocess() <em>Moderationprocess</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModerationprocess()
	 * @generated
	 * @ordered
	 */
	protected ModerationProcess moderationprocess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cr2Package.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentType getCommentType() {
		return commentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentType(CommentType newCommentType) {
		CommentType oldCommentType = commentType;
		commentType = newCommentType == null ? COMMENT_TYPE_EDEFAULT : newCommentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.COMMENT__COMMENT_TYPE, oldCommentType,
					commentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReply() {
		return reply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReply(boolean newReply) {
		boolean oldReply = reply;
		reply = newReply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.COMMENT__REPLY, oldReply, reply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isModeration() {
		return moderation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModeration(boolean newModeration) {
		boolean oldModeration = moderation;
		moderation = newModeration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.COMMENT__MODERATION, oldModeration,
					moderation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModerationProcess getModerationprocess() {
		return moderationprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModerationprocess(ModerationProcess newModerationprocess, NotificationChain msgs) {
		ModerationProcess oldModerationprocess = moderationprocess;
		moderationprocess = newModerationprocess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Cr2Package.COMMENT__MODERATIONPROCESS, oldModerationprocess, newModerationprocess);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModerationprocess(ModerationProcess newModerationprocess) {
		if (newModerationprocess != moderationprocess) {
			NotificationChain msgs = null;
			if (moderationprocess != null)
				msgs = ((InternalEObject) moderationprocess).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Cr2Package.COMMENT__MODERATIONPROCESS, null, msgs);
			if (newModerationprocess != null)
				msgs = ((InternalEObject) newModerationprocess).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Cr2Package.COMMENT__MODERATIONPROCESS, null, msgs);
			msgs = basicSetModerationprocess(newModerationprocess, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.COMMENT__MODERATIONPROCESS,
					newModerationprocess, newModerationprocess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Cr2Package.COMMENT__MODERATIONPROCESS:
			return basicSetModerationprocess(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Cr2Package.COMMENT__COMMENT_TYPE:
			return getCommentType();
		case Cr2Package.COMMENT__REPLY:
			return isReply();
		case Cr2Package.COMMENT__MODERATION:
			return isModeration();
		case Cr2Package.COMMENT__MODERATIONPROCESS:
			return getModerationprocess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Cr2Package.COMMENT__COMMENT_TYPE:
			setCommentType((CommentType) newValue);
			return;
		case Cr2Package.COMMENT__REPLY:
			setReply((Boolean) newValue);
			return;
		case Cr2Package.COMMENT__MODERATION:
			setModeration((Boolean) newValue);
			return;
		case Cr2Package.COMMENT__MODERATIONPROCESS:
			setModerationprocess((ModerationProcess) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Cr2Package.COMMENT__COMMENT_TYPE:
			setCommentType(COMMENT_TYPE_EDEFAULT);
			return;
		case Cr2Package.COMMENT__REPLY:
			setReply(REPLY_EDEFAULT);
			return;
		case Cr2Package.COMMENT__MODERATION:
			setModeration(MODERATION_EDEFAULT);
			return;
		case Cr2Package.COMMENT__MODERATIONPROCESS:
			setModerationprocess((ModerationProcess) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Cr2Package.COMMENT__COMMENT_TYPE:
			return commentType != COMMENT_TYPE_EDEFAULT;
		case Cr2Package.COMMENT__REPLY:
			return reply != REPLY_EDEFAULT;
		case Cr2Package.COMMENT__MODERATION:
			return moderation != MODERATION_EDEFAULT;
		case Cr2Package.COMMENT__MODERATIONPROCESS:
			return moderationprocess != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (commentType: ");
		result.append(commentType);
		result.append(", reply: ");
		result.append(reply);
		result.append(", moderation: ");
		result.append(moderation);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
