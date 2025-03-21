/**
 */
package pt.ipp.isep.mei.enorm.pam.cr2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package;
import pt.ipp.isep.mei.enorm.pam.cr2.Feature;
import pt.ipp.isep.mei.enorm.pam.cr2.Subject;
import pt.ipp.isep.mei.enorm.pam.cr2.UserFeedback;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.impl.SubjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.impl.SubjectImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.impl.SubjectImpl#getUserfeedback <em>Userfeedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubjectImpl extends MinimalEObjectImpl.Container implements Subject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * The cached value of the '{@link #getUserfeedback() <em>Userfeedback</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserfeedback()
	 * @generated
	 * @ordered
	 */
	protected EList<UserFeedback> userfeedback;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cr2Package.Literals.SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.SUBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectContainmentEList<Feature>(Feature.class, this, Cr2Package.SUBJECT__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserFeedback> getUserfeedback() {
		if (userfeedback == null) {
			userfeedback = new EObjectContainmentWithInverseEList<UserFeedback>(UserFeedback.class, this,
					Cr2Package.SUBJECT__USERFEEDBACK, Cr2Package.USER_FEEDBACK__SUBJECT);
		}
		return userfeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Cr2Package.SUBJECT__USERFEEDBACK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUserfeedback()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Cr2Package.SUBJECT__FEATURE:
			return ((InternalEList<?>) getFeature()).basicRemove(otherEnd, msgs);
		case Cr2Package.SUBJECT__USERFEEDBACK:
			return ((InternalEList<?>) getUserfeedback()).basicRemove(otherEnd, msgs);
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
		case Cr2Package.SUBJECT__NAME:
			return getName();
		case Cr2Package.SUBJECT__FEATURE:
			return getFeature();
		case Cr2Package.SUBJECT__USERFEEDBACK:
			return getUserfeedback();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Cr2Package.SUBJECT__NAME:
			setName((String) newValue);
			return;
		case Cr2Package.SUBJECT__FEATURE:
			getFeature().clear();
			getFeature().addAll((Collection<? extends Feature>) newValue);
			return;
		case Cr2Package.SUBJECT__USERFEEDBACK:
			getUserfeedback().clear();
			getUserfeedback().addAll((Collection<? extends UserFeedback>) newValue);
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
		case Cr2Package.SUBJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Cr2Package.SUBJECT__FEATURE:
			getFeature().clear();
			return;
		case Cr2Package.SUBJECT__USERFEEDBACK:
			getUserfeedback().clear();
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
		case Cr2Package.SUBJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Cr2Package.SUBJECT__FEATURE:
			return feature != null && !feature.isEmpty();
		case Cr2Package.SUBJECT__USERFEEDBACK:
			return userfeedback != null && !userfeedback.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SubjectImpl
