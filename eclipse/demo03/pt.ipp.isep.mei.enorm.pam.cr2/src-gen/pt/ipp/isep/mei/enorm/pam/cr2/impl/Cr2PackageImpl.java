/**
 */
package pt.ipp.isep.mei.enorm.pam.cr2.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import pt.ipp.isep.mei.enorm.pam.cr2.Automatic;
import pt.ipp.isep.mei.enorm.pam.cr2.Comment;
import pt.ipp.isep.mei.enorm.pam.cr2.CommentType;
import pt.ipp.isep.mei.enorm.pam.cr2.Cr2Factory;
import pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package;
import pt.ipp.isep.mei.enorm.pam.cr2.End;
import pt.ipp.isep.mei.enorm.pam.cr2.Feature;
import pt.ipp.isep.mei.enorm.pam.cr2.GradeType;
import pt.ipp.isep.mei.enorm.pam.cr2.Manual;
import pt.ipp.isep.mei.enorm.pam.cr2.Model;
import pt.ipp.isep.mei.enorm.pam.cr2.ModerationProcess;
import pt.ipp.isep.mei.enorm.pam.cr2.Review;
import pt.ipp.isep.mei.enorm.pam.cr2.ReviewType;
import pt.ipp.isep.mei.enorm.pam.cr2.Step;
import pt.ipp.isep.mei.enorm.pam.cr2.Subject;
import pt.ipp.isep.mei.enorm.pam.cr2.UserFeedback;
import pt.ipp.isep.mei.enorm.pam.cr2.ValidationStep;
import pt.ipp.isep.mei.enorm.pam.cr2.util.Cr2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cr2PackageImpl extends EPackageImpl implements Cr2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moderationProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automaticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gradeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reviewTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commentTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Cr2PackageImpl() {
		super(eNS_URI, Cr2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Cr2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Cr2Package init() {
		if (isInited)
			return (Cr2Package) EPackage.Registry.INSTANCE.getEPackage(Cr2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredCr2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Cr2PackageImpl theCr2Package = registeredCr2Package instanceof Cr2PackageImpl
				? (Cr2PackageImpl) registeredCr2Package
				: new Cr2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCr2Package.createPackageContents();

		// Initialize created meta-data
		theCr2Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCr2Package, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return Cr2Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCr2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Cr2Package.eNS_URI, theCr2Package);
		return theCr2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Subject() {
		return (EReference) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModel_Name() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubject() {
		return subjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubject_Name() {
		return (EAttribute) subjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubject_Feature() {
		return (EReference) subjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubject_UserFeedback() {
		return (EReference) subjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubject_FeatureCount() {
		return (EAttribute) subjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSubject__UserFeedbackOfDifferentTypes__DiagnosticChain_Map() {
		return subjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserFeedback() {
		return userFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserFeedback_Subject() {
		return (EReference) userFeedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserFeedback_Name() {
		return (EAttribute) userFeedbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReview() {
		return reviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReview_GradeType() {
		return (EAttribute) reviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReview_ReviewType() {
		return (EAttribute) reviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModerationProcess() {
		return moderationProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModerationProcess_Name() {
		return (EAttribute) moderationProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModerationProcess_Step() {
		return (EReference) moderationProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModerationProcess_InitialStep() {
		return (EReference) moderationProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModerationProcess__OneEndStepMandatory__DiagnosticChain_Map() {
		return moderationProcessEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidationStep() {
		return validationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidationStep_NextApprove() {
		return (EReference) validationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getValidationStep_NextReject() {
		return (EReference) validationStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValidationStep__MustHaveDiffererentStepsExceptForEnd__DiagnosticChain_Map() {
		return validationStepEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManual() {
		return manualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutomatic() {
		return automaticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAutomatic_Method() {
		return (EAttribute) automaticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComment_CommentType() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComment_Reply() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComment_Moderation() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComment_ModerationProcess() {
		return (EReference) commentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComment_HasModerationProcess() {
		return (EAttribute) commentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Name() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeature__NameMustBeUnique__DiagnosticChain_Map() {
		return featureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeature__MustHaveName__DiagnosticChain_Map() {
		return featureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeature__NameMustStartWithUppercase__DiagnosticChain_Map() {
		return featureEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFeature__MustbeGreaterThan3Chars__DiagnosticChain_Map() {
		return featureEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGradeType() {
		return gradeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReviewType() {
		return reviewTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommentType() {
		return commentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cr2Factory getCr2Factory() {
		return (Cr2Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__SUBJECT);
		createEAttribute(modelEClass, MODEL__NAME);

		subjectEClass = createEClass(SUBJECT);
		createEAttribute(subjectEClass, SUBJECT__NAME);
		createEReference(subjectEClass, SUBJECT__FEATURE);
		createEReference(subjectEClass, SUBJECT__USER_FEEDBACK);
		createEAttribute(subjectEClass, SUBJECT__FEATURE_COUNT);
		createEOperation(subjectEClass, SUBJECT___USER_FEEDBACK_OF_DIFFERENT_TYPES__DIAGNOSTICCHAIN_MAP);

		userFeedbackEClass = createEClass(USER_FEEDBACK);
		createEReference(userFeedbackEClass, USER_FEEDBACK__SUBJECT);
		createEAttribute(userFeedbackEClass, USER_FEEDBACK__NAME);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__COMMENT_TYPE);
		createEAttribute(commentEClass, COMMENT__REPLY);
		createEAttribute(commentEClass, COMMENT__MODERATION);
		createEReference(commentEClass, COMMENT__MODERATION_PROCESS);
		createEAttribute(commentEClass, COMMENT__HAS_MODERATION_PROCESS);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEOperation(featureEClass, FEATURE___NAME_MUST_BE_UNIQUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(featureEClass, FEATURE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(featureEClass, FEATURE___NAME_MUST_START_WITH_UPPERCASE__DIAGNOSTICCHAIN_MAP);
		createEOperation(featureEClass, FEATURE___MUSTBE_GREATER_THAN3_CHARS__DIAGNOSTICCHAIN_MAP);

		reviewEClass = createEClass(REVIEW);
		createEAttribute(reviewEClass, REVIEW__GRADE_TYPE);
		createEAttribute(reviewEClass, REVIEW__REVIEW_TYPE);

		moderationProcessEClass = createEClass(MODERATION_PROCESS);
		createEAttribute(moderationProcessEClass, MODERATION_PROCESS__NAME);
		createEReference(moderationProcessEClass, MODERATION_PROCESS__STEP);
		createEReference(moderationProcessEClass, MODERATION_PROCESS__INITIAL_STEP);
		createEOperation(moderationProcessEClass, MODERATION_PROCESS___ONE_END_STEP_MANDATORY__DIAGNOSTICCHAIN_MAP);

		stepEClass = createEClass(STEP);

		validationStepEClass = createEClass(VALIDATION_STEP);
		createEReference(validationStepEClass, VALIDATION_STEP__NEXT_APPROVE);
		createEReference(validationStepEClass, VALIDATION_STEP__NEXT_REJECT);
		createEOperation(validationStepEClass,
				VALIDATION_STEP___MUST_HAVE_DIFFERERENT_STEPS_EXCEPT_FOR_END__DIAGNOSTICCHAIN_MAP);

		manualEClass = createEClass(MANUAL);

		automaticEClass = createEClass(AUTOMATIC);
		createEAttribute(automaticEClass, AUTOMATIC__METHOD);

		endEClass = createEClass(END);

		// Create enums
		gradeTypeEEnum = createEEnum(GRADE_TYPE);
		reviewTypeEEnum = createEEnum(REVIEW_TYPE);
		commentTypeEEnum = createEEnum(COMMENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commentEClass.getESuperTypes().add(this.getUserFeedback());
		reviewEClass.getESuperTypes().add(this.getUserFeedback());
		validationStepEClass.getESuperTypes().add(this.getStep());
		manualEClass.getESuperTypes().add(this.getValidationStep());
		automaticEClass.getESuperTypes().add(this.getValidationStep());
		endEClass.getESuperTypes().add(this.getStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Subject(), this.getSubject(), null, "subject", null, 1, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectEClass, Subject.class, "Subject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subject.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubject_Feature(), this.getFeature(), null, "feature", null, 0, -1, Subject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubject_UserFeedback(), this.getUserFeedback(), this.getUserFeedback_Subject(),
				"userFeedback", null, 1, 2, Subject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubject_FeatureCount(), ecorePackage.getEBigInteger(), "featureCount", null, 1, 1,
				Subject.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);

		EOperation op = initEOperation(getSubject__UserFeedbackOfDifferentTypes__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "userFeedbackOfDifferentTypes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userFeedbackEClass, UserFeedback.class, "UserFeedback", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserFeedback_Subject(), this.getSubject(), this.getSubject_UserFeedback(), "subject", null, 0,
				1, UserFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserFeedback_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserFeedback.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_CommentType(), this.getCommentType(), "commentType", null, 1, 1, Comment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Reply(), ecorePackage.getEBoolean(), "reply", "false", 1, 1, Comment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Moderation(), ecorePackage.getEBoolean(), "moderation", null, 1, 1, Comment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComment_ModerationProcess(), this.getModerationProcess(), null, "moderationProcess", null, 0,
				1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_HasModerationProcess(), ecorePackage.getEBoolean(), "hasModerationProcess", null, 1,
				1, Comment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFeature__NameMustBeUnique__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"nameMustBeUnique", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeature__MustHaveName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mustHaveName",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeature__NameMustStartWithUppercase__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"nameMustStartWithUppercase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeature__MustbeGreaterThan3Chars__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"mustbeGreaterThan3Chars", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reviewEClass, Review.class, "Review", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReview_GradeType(), this.getGradeType(), "gradeType", null, 1, 1, Review.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReview_ReviewType(), this.getReviewType(), "reviewType", null, 1, 1, Review.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moderationProcessEClass, ModerationProcess.class, "ModerationProcess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModerationProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ModerationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getModerationProcess_Step(), this.getStep(), null, "step", null, 0, -1, ModerationProcess.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModerationProcess_InitialStep(), this.getValidationStep(), null, "initialStep", null, 1, 1,
				ModerationProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getModerationProcess__OneEndStepMandatory__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "oneEndStepMandatory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(validationStepEClass, ValidationStep.class, "ValidationStep", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidationStep_NextApprove(), this.getStep(), null, "nextApprove", null, 1, 1,
				ValidationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidationStep_NextReject(), this.getStep(), null, "nextReject", null, 1, 1,
				ValidationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getValidationStep__MustHaveDiffererentStepsExceptForEnd__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "mustHaveDiffererentStepsExceptForEnd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(manualEClass, Manual.class, "Manual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(automaticEClass, Automatic.class, "Automatic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomatic_Method(), ecorePackage.getEString(), "method", null, 1, 1, Automatic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(gradeTypeEEnum, GradeType.class, "GradeType");
		addEEnumLiteral(gradeTypeEEnum, GradeType.STARS);
		addEEnumLiteral(gradeTypeEEnum, GradeType.CUSTOM);

		initEEnum(reviewTypeEEnum, ReviewType.class, "ReviewType");
		addEEnumLiteral(reviewTypeEEnum, ReviewType.ONLYGRADE);
		addEEnumLiteral(reviewTypeEEnum, ReviewType.ANNOTATED);

		initEEnum(commentTypeEEnum, CommentType.class, "CommentType");
		addEEnumLiteral(commentTypeEEnum, CommentType.SIMPLE);
		addEEnumLiteral(commentTypeEEnum, CommentType.RICHTEXT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(subjectEClass, source, new String[] { "constraints", "userFeedbackOfDifferentTypes" });
		addAnnotation(featureEClass, source, new String[] { "constraints", "mustbeGreaterThan3Chars" });
		addAnnotation(moderationProcessEClass, source, new String[] { "constraints", "oneEndStepMandatory" });
		addAnnotation(validationStepEClass, source,
				new String[] { "constraints", "mustHaveDiffererentStepsExceptForEnd" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getSubject__UserFeedbackOfDifferentTypes__DiagnosticChain_Map(), source,
				new String[] { "body", "self.userFeedback->isUnique(oclType().name)" });
		addAnnotation(getFeature__NameMustBeUnique__DiagnosticChain_Map(), source,
				new String[] { "body", "Feature.allInstances()->isUnique(e | e.name)" });
		addAnnotation(getFeature__MustHaveName__DiagnosticChain_Map(), source,
				new String[] { "body", "not self.name.oclIsUndefined()" });
		addAnnotation(getFeature__NameMustStartWithUppercase__DiagnosticChain_Map(), source,
				new String[] { "body", "self.name.substring(1, 1).toUpper().compareTo(self.name.substring(1,1))=0" });
		addAnnotation(getFeature__MustbeGreaterThan3Chars__DiagnosticChain_Map(), source,
				new String[] { "body", "self.name.size() > 3" });
		addAnnotation(getModerationProcess__OneEndStepMandatory__DiagnosticChain_Map(), source,
				new String[] { "body", "self.step->select(e | e.oclIsTypeOf(End))->size()=1" });
		addAnnotation(getValidationStep__MustHaveDiffererentStepsExceptForEnd__DiagnosticChain_Map(), source,
				new String[] { "body",
						"self.nextApprove = self.nextReject implies self.nextApprove.oclIsTypeOf(End)" });
	}

} //Cr2PackageImpl
