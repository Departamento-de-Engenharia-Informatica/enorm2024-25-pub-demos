/**
 */
package pt.ipp.isep.mei.enorm.pam.cr2.util;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pt.ipp.isep.mei.enorm.pam.cr2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package
 * @generated
 */
public class Cr2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Cr2Validator INSTANCE = new Cr2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pt.ipp.isep.mei.enorm.pam.cr2";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'User Feedback Of Different Types' of 'Subject'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBJECT__USER_FEEDBACK_OF_DIFFERENT_TYPES = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Must Be Unique' of 'Feature'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FEATURE__NAME_MUST_BE_UNIQUE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Name' of 'Feature'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FEATURE__MUST_HAVE_NAME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Must Start With Uppercase' of 'Feature'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FEATURE__NAME_MUST_START_WITH_UPPERCASE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Mustbe Greater Than3 Chars' of 'Feature'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FEATURE__MUSTBE_GREATER_THAN3_CHARS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'One End Step Mandatory' of 'Moderation Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MODERATION_PROCESS__ONE_END_STEP_MANDATORY = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Differerent Steps Except For End' of 'Validation Step'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VALIDATION_STEP__MUST_HAVE_DIFFERERENT_STEPS_EXCEPT_FOR_END = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cr2Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Cr2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Cr2Package.MODEL:
			return validateModel((Model) value, diagnostics, context);
		case Cr2Package.SUBJECT:
			return validateSubject((Subject) value, diagnostics, context);
		case Cr2Package.USER_FEEDBACK:
			return validateUserFeedback((UserFeedback) value, diagnostics, context);
		case Cr2Package.COMMENT:
			return validateComment((Comment) value, diagnostics, context);
		case Cr2Package.FEATURE:
			return validateFeature((Feature) value, diagnostics, context);
		case Cr2Package.REVIEW:
			return validateReview((Review) value, diagnostics, context);
		case Cr2Package.MODERATION_PROCESS:
			return validateModerationProcess((ModerationProcess) value, diagnostics, context);
		case Cr2Package.STEP:
			return validateStep((Step) value, diagnostics, context);
		case Cr2Package.VALIDATION_STEP:
			return validateValidationStep((ValidationStep) value, diagnostics, context);
		case Cr2Package.MANUAL:
			return validateManual((Manual) value, diagnostics, context);
		case Cr2Package.AUTOMATIC:
			return validateAutomatic((Automatic) value, diagnostics, context);
		case Cr2Package.END:
			return validateEnd((End) value, diagnostics, context);
		case Cr2Package.GRADE_TYPE:
			return validateGradeType((GradeType) value, diagnostics, context);
		case Cr2Package.REVIEW_TYPE:
			return validateReviewType((ReviewType) value, diagnostics, context);
		case Cr2Package.COMMENT_TYPE:
			return validateCommentType((CommentType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubject(Subject subject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subject, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(subject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(subject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(subject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(subject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(subject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(subject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(subject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(subject, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSubject_userFeedbackOfDifferentTypes(subject, diagnostics, context);
		return result;
	}

	/**
	 * Validates the userFeedbackOfDifferentTypes constraint of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubject_userFeedbackOfDifferentTypes(Subject subject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return subject.userFeedbackOfDifferentTypes(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserFeedback(UserFeedback userFeedback, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userFeedback, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(feature, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(feature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(feature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(feature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(feature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(feature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(feature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(feature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(feature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFeature_mustbeGreaterThan3Chars(feature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFeature_nameMustBeUnique(feature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFeature_mustHaveName(feature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFeature_nameMustStartWithUppercase(feature, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mustHaveName constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature_mustHaveName(Feature feature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return feature.mustHaveName(diagnostics, context);
	}

	/**
	 * Validates the mustbeGreaterThan3Chars constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature_mustbeGreaterThan3Chars(Feature feature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return feature.mustbeGreaterThan3Chars(diagnostics, context);
	}

	/**
	 * Validates the nameMustStartWithUppercase constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature_nameMustStartWithUppercase(Feature feature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return feature.nameMustStartWithUppercase(diagnostics, context);
	}

	/**
	 * Validates the nameMustBeUnique constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature_nameMustBeUnique(Feature feature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return feature.nameMustBeUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReview(Review review, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(review, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModerationProcess(ModerationProcess moderationProcess, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(moderationProcess, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(moderationProcess, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(moderationProcess, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(moderationProcess, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(moderationProcess, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(moderationProcess, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(moderationProcess, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(moderationProcess, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(moderationProcess, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateModerationProcess_oneEndStepMandatory(moderationProcess, diagnostics, context);
		return result;
	}

	/**
	 * Validates the oneEndStepMandatory constraint of '<em>Moderation Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModerationProcess_oneEndStepMandatory(ModerationProcess moderationProcess,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return moderationProcess.oneEndStepMandatory(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(step, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidationStep(ValidationStep validationStep, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(validationStep, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(validationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(validationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(validationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(validationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(validationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(validationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(validationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(validationStep, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateValidationStep_mustHaveDiffererentStepsExceptForEnd(validationStep, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mustHaveDiffererentStepsExceptForEnd constraint of '<em>Validation Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidationStep_mustHaveDiffererentStepsExceptForEnd(ValidationStep validationStep,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validationStep.mustHaveDiffererentStepsExceptForEnd(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManual(Manual manual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manual, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(manual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(manual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(manual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(manual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(manual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(manual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(manual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(manual, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateValidationStep_mustHaveDiffererentStepsExceptForEnd(manual, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutomatic(Automatic automatic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(automatic, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(automatic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(automatic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(automatic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(automatic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(automatic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(automatic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(automatic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(automatic, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateValidationStep_mustHaveDiffererentStepsExceptForEnd(automatic, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnd(End end, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(end, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGradeType(GradeType gradeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewType(ReviewType reviewType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentType(CommentType commentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Cr2Validator
