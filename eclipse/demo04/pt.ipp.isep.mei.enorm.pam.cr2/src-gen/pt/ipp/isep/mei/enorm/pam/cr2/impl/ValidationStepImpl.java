/**
 */
package pt.ipp.isep.mei.enorm.pam.cr2.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package;
import pt.ipp.isep.mei.enorm.pam.cr2.Cr2Tables;
import pt.ipp.isep.mei.enorm.pam.cr2.Step;
import pt.ipp.isep.mei.enorm.pam.cr2.ValidationStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.impl.ValidationStepImpl#getNextApprove <em>Next Approve</em>}</li>
 *   <li>{@link pt.ipp.isep.mei.enorm.pam.cr2.impl.ValidationStepImpl#getNextReject <em>Next Reject</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValidationStepImpl extends StepImpl implements ValidationStep {
	/**
	 * The cached value of the '{@link #getNextApprove() <em>Next Approve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextApprove()
	 * @generated
	 * @ordered
	 */
	protected Step nextApprove;

	/**
	 * The cached value of the '{@link #getNextReject() <em>Next Reject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextReject()
	 * @generated
	 * @ordered
	 */
	protected Step nextReject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cr2Package.Literals.VALIDATION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getNextApprove() {
		if (nextApprove != null && nextApprove.eIsProxy()) {
			InternalEObject oldNextApprove = (InternalEObject) nextApprove;
			nextApprove = (Step) eResolveProxy(oldNextApprove);
			if (nextApprove != oldNextApprove) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cr2Package.VALIDATION_STEP__NEXT_APPROVE,
							oldNextApprove, nextApprove));
			}
		}
		return nextApprove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetNextApprove() {
		return nextApprove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextApprove(Step newNextApprove) {
		Step oldNextApprove = nextApprove;
		nextApprove = newNextApprove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.VALIDATION_STEP__NEXT_APPROVE,
					oldNextApprove, nextApprove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getNextReject() {
		if (nextReject != null && nextReject.eIsProxy()) {
			InternalEObject oldNextReject = (InternalEObject) nextReject;
			nextReject = (Step) eResolveProxy(oldNextReject);
			if (nextReject != oldNextReject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cr2Package.VALIDATION_STEP__NEXT_REJECT,
							oldNextReject, nextReject));
			}
		}
		return nextReject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetNextReject() {
		return nextReject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextReject(Step newNextReject) {
		Step oldNextReject = nextReject;
		nextReject = newNextReject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cr2Package.VALIDATION_STEP__NEXT_REJECT,
					oldNextReject, nextReject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean mustHaveDiffererentStepsExceptForEnd(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "ValidationStep::mustHaveDiffererentStepsExceptForEnd";
		try {
			/**
			 *
			 * inv mustHaveDiffererentStepsExceptForEnd:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.nextApprove = self.nextReject implies
			 *         self.nextApprove.oclIsTypeOf(End)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Cr2Package.Literals.VALIDATION_STEP___MUST_HAVE_DIFFERERENT_STEPS_EXCEPT_FOR_END__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Cr2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cr2_c_c_End_0 = idResolver
						.getClass(Cr2Tables.CLSSid_End, null);
				final /*@NonInvalid*/ Step nextApprove_0 = this.getNextApprove();
				final /*@NonInvalid*/ Step nextReject = this.getNextReject();
				final /*@NonInvalid*/ boolean eq = nextApprove_0.equals(nextReject);
				final /*@NonInvalid*/ Boolean result;
				if (!eq) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, nextApprove_0, TYP_cr2_c_c_End_0).booleanValue();
					if (oclIsTypeOf) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, Cr2Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Cr2Package.VALIDATION_STEP__NEXT_APPROVE:
			if (resolve)
				return getNextApprove();
			return basicGetNextApprove();
		case Cr2Package.VALIDATION_STEP__NEXT_REJECT:
			if (resolve)
				return getNextReject();
			return basicGetNextReject();
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
		case Cr2Package.VALIDATION_STEP__NEXT_APPROVE:
			setNextApprove((Step) newValue);
			return;
		case Cr2Package.VALIDATION_STEP__NEXT_REJECT:
			setNextReject((Step) newValue);
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
		case Cr2Package.VALIDATION_STEP__NEXT_APPROVE:
			setNextApprove((Step) null);
			return;
		case Cr2Package.VALIDATION_STEP__NEXT_REJECT:
			setNextReject((Step) null);
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
		case Cr2Package.VALIDATION_STEP__NEXT_APPROVE:
			return nextApprove != null;
		case Cr2Package.VALIDATION_STEP__NEXT_REJECT:
			return nextReject != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Cr2Package.VALIDATION_STEP___MUST_HAVE_DIFFERERENT_STEPS_EXCEPT_FOR_END__DIAGNOSTICCHAIN_MAP:
			return mustHaveDiffererentStepsExceptForEnd((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ValidationStepImpl
