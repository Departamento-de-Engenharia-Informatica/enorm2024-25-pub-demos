/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /pt.ipp.isep.mei.enorm.pam.cr2/model/cr2.ecore
 * using:
 *   /pt.ipp.isep.mei.enorm.pam.cr2/model/cr2.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package pt.ipp.isep.mei.enorm.pam.cr2;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import pt.ipp.isep.mei.enorm.pam.cr2.Cr2Package;
// import pt.ipp.isep.mei.enorm.pam.cr2.Cr2Tables;

/**
 * Cr2Tables provides the dispatch tables for the cr2 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Cr2Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Cr2Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2 = IdManager.getNsURIPackageId("http://pam.enorm.mei.isep.ipp.pt/cr2", null, Cr2Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Cr2Tables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Comment = Cr2Tables.PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2.getClassId("Comment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_End = Cr2Tables.PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2.getClassId("End", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Feature = Cr2Tables.PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2.getClassId("Feature", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Model = Cr2Tables.PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2.getClassId("Model", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ModerationProcess = Cr2Tables.PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2.getClassId("ModerationProcess", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Step = Cr2Tables.PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2.getClassId("Step", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Subject = Cr2Tables.PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2.getClassId("Subject", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_UserFeedback = Cr2Tables.PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2.getClassId("UserFeedback", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ValidationStep = Cr2Tables.PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2.getClassId("ValidationStep", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_CommentType = Cr2Tables.PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2.getEnumerationId("CommentType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_GradeType = Cr2Tables.PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2.getEnumerationId("GradeType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ReviewType = Cr2Tables.PACKid_http_c_s_s_pam_enorm_mei_isep_ipp_pt_s_cr2.getEnumerationId("ReviewType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_3 = ValueUtil.integerValueOf("3");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ModerationProcess = TypeId.BAG.getSpecializedId(Cr2Tables.CLSSid_ModerationProcess, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ValidationStep = TypeId.BAG.getSpecializedId(Cr2Tables.CLSSid_ValidationStep, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Feature = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_Feature, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Step = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_Step, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_UserFeedback = TypeId.ORDERED_SET.getSpecializedId(Cr2Tables.CLSSid_UserFeedback, true, ValueUtil.ONE_VALUE, ValueUtil.integerValueOf(2));
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Feature = TypeId.SET.getSpecializedId(Cr2Tables.CLSSid_Feature, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ModerationProcess = TypeId.SET.getSpecializedId(Cr2Tables.CLSSid_ModerationProcess, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Cr2Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Automatic = new EcoreExecutorType(Cr2Package.Literals.AUTOMATIC, PACKAGE, 0);
		public static final EcoreExecutorType _Comment = new EcoreExecutorType(Cr2Package.Literals.COMMENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _CommentType = new EcoreExecutorEnumeration(Cr2Package.Literals.COMMENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _End = new EcoreExecutorType(Cr2Package.Literals.END, PACKAGE, 0);
		public static final EcoreExecutorType _Feature = new EcoreExecutorType(Cr2Package.Literals.FEATURE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _GradeType = new EcoreExecutorEnumeration(Cr2Package.Literals.GRADE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Manual = new EcoreExecutorType(Cr2Package.Literals.MANUAL, PACKAGE, 0);
		public static final EcoreExecutorType _Model = new EcoreExecutorType(Cr2Package.Literals.MODEL, PACKAGE, 0);
		public static final EcoreExecutorType _ModerationProcess = new EcoreExecutorType(Cr2Package.Literals.MODERATION_PROCESS, PACKAGE, 0);
		public static final EcoreExecutorType _Review = new EcoreExecutorType(Cr2Package.Literals.REVIEW, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ReviewType = new EcoreExecutorEnumeration(Cr2Package.Literals.REVIEW_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Step = new EcoreExecutorType(Cr2Package.Literals.STEP, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Subject = new EcoreExecutorType(Cr2Package.Literals.SUBJECT, PACKAGE, 0);
		public static final EcoreExecutorType _UserFeedback = new EcoreExecutorType(Cr2Package.Literals.USER_FEEDBACK, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _ValidationStep = new EcoreExecutorType(Cr2Package.Literals.VALIDATION_STEP, PACKAGE, 0 | ExecutorType.ABSTRACT);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Automatic,
			_Comment,
			_CommentType,
			_End,
			_Feature,
			_GradeType,
			_Manual,
			_Model,
			_ModerationProcess,
			_Review,
			_ReviewType,
			_Step,
			_Subject,
			_UserFeedback,
			_ValidationStep
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Automatic__Automatic = new ExecutorFragment(Types._Automatic, Cr2Tables.Types._Automatic);
		private static final ExecutorFragment _Automatic__OclAny = new ExecutorFragment(Types._Automatic, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Automatic__OclElement = new ExecutorFragment(Types._Automatic, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Automatic__Step = new ExecutorFragment(Types._Automatic, Cr2Tables.Types._Step);
		private static final ExecutorFragment _Automatic__ValidationStep = new ExecutorFragment(Types._Automatic, Cr2Tables.Types._ValidationStep);

		private static final ExecutorFragment _Comment__Comment = new ExecutorFragment(Types._Comment, Cr2Tables.Types._Comment);
		private static final ExecutorFragment _Comment__OclAny = new ExecutorFragment(Types._Comment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Comment__OclElement = new ExecutorFragment(Types._Comment, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Comment__UserFeedback = new ExecutorFragment(Types._Comment, Cr2Tables.Types._UserFeedback);

		private static final ExecutorFragment _CommentType__CommentType = new ExecutorFragment(Types._CommentType, Cr2Tables.Types._CommentType);
		private static final ExecutorFragment _CommentType__OclAny = new ExecutorFragment(Types._CommentType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CommentType__OclElement = new ExecutorFragment(Types._CommentType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CommentType__OclEnumeration = new ExecutorFragment(Types._CommentType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _CommentType__OclType = new ExecutorFragment(Types._CommentType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _End__End = new ExecutorFragment(Types._End, Cr2Tables.Types._End);
		private static final ExecutorFragment _End__OclAny = new ExecutorFragment(Types._End, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _End__OclElement = new ExecutorFragment(Types._End, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _End__Step = new ExecutorFragment(Types._End, Cr2Tables.Types._Step);

		private static final ExecutorFragment _Feature__Feature = new ExecutorFragment(Types._Feature, Cr2Tables.Types._Feature);
		private static final ExecutorFragment _Feature__OclAny = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Feature__OclElement = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _GradeType__GradeType = new ExecutorFragment(Types._GradeType, Cr2Tables.Types._GradeType);
		private static final ExecutorFragment _GradeType__OclAny = new ExecutorFragment(Types._GradeType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _GradeType__OclElement = new ExecutorFragment(Types._GradeType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _GradeType__OclEnumeration = new ExecutorFragment(Types._GradeType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _GradeType__OclType = new ExecutorFragment(Types._GradeType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Manual__Manual = new ExecutorFragment(Types._Manual, Cr2Tables.Types._Manual);
		private static final ExecutorFragment _Manual__OclAny = new ExecutorFragment(Types._Manual, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Manual__OclElement = new ExecutorFragment(Types._Manual, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Manual__Step = new ExecutorFragment(Types._Manual, Cr2Tables.Types._Step);
		private static final ExecutorFragment _Manual__ValidationStep = new ExecutorFragment(Types._Manual, Cr2Tables.Types._ValidationStep);

		private static final ExecutorFragment _Model__Model = new ExecutorFragment(Types._Model, Cr2Tables.Types._Model);
		private static final ExecutorFragment _Model__OclAny = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Model__OclElement = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ModerationProcess__ModerationProcess = new ExecutorFragment(Types._ModerationProcess, Cr2Tables.Types._ModerationProcess);
		private static final ExecutorFragment _ModerationProcess__OclAny = new ExecutorFragment(Types._ModerationProcess, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ModerationProcess__OclElement = new ExecutorFragment(Types._ModerationProcess, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Review__OclAny = new ExecutorFragment(Types._Review, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Review__OclElement = new ExecutorFragment(Types._Review, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Review__Review = new ExecutorFragment(Types._Review, Cr2Tables.Types._Review);
		private static final ExecutorFragment _Review__UserFeedback = new ExecutorFragment(Types._Review, Cr2Tables.Types._UserFeedback);

		private static final ExecutorFragment _ReviewType__OclAny = new ExecutorFragment(Types._ReviewType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ReviewType__OclElement = new ExecutorFragment(Types._ReviewType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ReviewType__OclEnumeration = new ExecutorFragment(Types._ReviewType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ReviewType__OclType = new ExecutorFragment(Types._ReviewType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _ReviewType__ReviewType = new ExecutorFragment(Types._ReviewType, Cr2Tables.Types._ReviewType);

		private static final ExecutorFragment _Step__OclAny = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Step__OclElement = new ExecutorFragment(Types._Step, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Step__Step = new ExecutorFragment(Types._Step, Cr2Tables.Types._Step);

		private static final ExecutorFragment _Subject__OclAny = new ExecutorFragment(Types._Subject, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Subject__OclElement = new ExecutorFragment(Types._Subject, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Subject__Subject = new ExecutorFragment(Types._Subject, Cr2Tables.Types._Subject);

		private static final ExecutorFragment _UserFeedback__OclAny = new ExecutorFragment(Types._UserFeedback, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UserFeedback__OclElement = new ExecutorFragment(Types._UserFeedback, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UserFeedback__UserFeedback = new ExecutorFragment(Types._UserFeedback, Cr2Tables.Types._UserFeedback);

		private static final ExecutorFragment _ValidationStep__OclAny = new ExecutorFragment(Types._ValidationStep, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ValidationStep__OclElement = new ExecutorFragment(Types._ValidationStep, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ValidationStep__Step = new ExecutorFragment(Types._ValidationStep, Cr2Tables.Types._Step);
		private static final ExecutorFragment _ValidationStep__ValidationStep = new ExecutorFragment(Types._ValidationStep, Cr2Tables.Types._ValidationStep);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Automatic__method = new EcoreExecutorProperty(Cr2Package.Literals.AUTOMATIC__METHOD, Types._Automatic, 0);

		public static final ExecutorProperty _Comment__commentType = new EcoreExecutorProperty(Cr2Package.Literals.COMMENT__COMMENT_TYPE, Types._Comment, 0);
		public static final ExecutorProperty _Comment__hasModerationProcess = new EcoreExecutorProperty(Cr2Package.Literals.COMMENT__HAS_MODERATION_PROCESS, Types._Comment, 1);
		public static final ExecutorProperty _Comment__moderation = new EcoreExecutorProperty(Cr2Package.Literals.COMMENT__MODERATION, Types._Comment, 2);
		public static final ExecutorProperty _Comment__moderationProcess = new EcoreExecutorProperty(Cr2Package.Literals.COMMENT__MODERATION_PROCESS, Types._Comment, 3);
		public static final ExecutorProperty _Comment__reply = new EcoreExecutorProperty(Cr2Package.Literals.COMMENT__REPLY, Types._Comment, 4);

		public static final ExecutorProperty _Feature__name = new EcoreExecutorProperty(Cr2Package.Literals.FEATURE__NAME, Types._Feature, 0);
		public static final ExecutorProperty _Feature__Subject__feature = new ExecutorPropertyWithImplementation("Subject", Types._Feature, 1, new EcoreLibraryOppositeProperty(Cr2Package.Literals.SUBJECT__FEATURE));

		public static final ExecutorProperty _Model__name = new EcoreExecutorProperty(Cr2Package.Literals.MODEL__NAME, Types._Model, 0);
		public static final ExecutorProperty _Model__subject = new EcoreExecutorProperty(Cr2Package.Literals.MODEL__SUBJECT, Types._Model, 1);

		public static final ExecutorProperty _ModerationProcess__initialStep = new EcoreExecutorProperty(Cr2Package.Literals.MODERATION_PROCESS__INITIAL_STEP, Types._ModerationProcess, 0);
		public static final ExecutorProperty _ModerationProcess__name = new EcoreExecutorProperty(Cr2Package.Literals.MODERATION_PROCESS__NAME, Types._ModerationProcess, 1);
		public static final ExecutorProperty _ModerationProcess__step = new EcoreExecutorProperty(Cr2Package.Literals.MODERATION_PROCESS__STEP, Types._ModerationProcess, 2);
		public static final ExecutorProperty _ModerationProcess__Comment__moderationProcess = new ExecutorPropertyWithImplementation("Comment", Types._ModerationProcess, 3, new EcoreLibraryOppositeProperty(Cr2Package.Literals.COMMENT__MODERATION_PROCESS));

		public static final ExecutorProperty _Review__gradeType = new EcoreExecutorProperty(Cr2Package.Literals.REVIEW__GRADE_TYPE, Types._Review, 0);
		public static final ExecutorProperty _Review__reviewType = new EcoreExecutorProperty(Cr2Package.Literals.REVIEW__REVIEW_TYPE, Types._Review, 1);

		public static final ExecutorProperty _Step__name = new EcoreExecutorProperty(Cr2Package.Literals.STEP__NAME, Types._Step, 0);
		public static final ExecutorProperty _Step__ModerationProcess__step = new ExecutorPropertyWithImplementation("ModerationProcess", Types._Step, 1, new EcoreLibraryOppositeProperty(Cr2Package.Literals.MODERATION_PROCESS__STEP));
		public static final ExecutorProperty _Step__ValidationStep__nextApprove = new ExecutorPropertyWithImplementation("ValidationStep", Types._Step, 2, new EcoreLibraryOppositeProperty(Cr2Package.Literals.VALIDATION_STEP__NEXT_APPROVE));
		public static final ExecutorProperty _Step__ValidationStep__nextReject = new ExecutorPropertyWithImplementation("ValidationStep", Types._Step, 3, new EcoreLibraryOppositeProperty(Cr2Package.Literals.VALIDATION_STEP__NEXT_REJECT));

		public static final ExecutorProperty _Subject__feature = new EcoreExecutorProperty(Cr2Package.Literals.SUBJECT__FEATURE, Types._Subject, 0);
		public static final ExecutorProperty _Subject__featureCount = new EcoreExecutorProperty(Cr2Package.Literals.SUBJECT__FEATURE_COUNT, Types._Subject, 1);
		public static final ExecutorProperty _Subject__name = new EcoreExecutorProperty(Cr2Package.Literals.SUBJECT__NAME, Types._Subject, 2);
		public static final ExecutorProperty _Subject__userFeedback = new EcoreExecutorProperty(Cr2Package.Literals.SUBJECT__USER_FEEDBACK, Types._Subject, 3);
		public static final ExecutorProperty _Subject__Model__subject = new ExecutorPropertyWithImplementation("Model", Types._Subject, 4, new EcoreLibraryOppositeProperty(Cr2Package.Literals.MODEL__SUBJECT));

		public static final ExecutorProperty _UserFeedback__name = new EcoreExecutorProperty(Cr2Package.Literals.USER_FEEDBACK__NAME, Types._UserFeedback, 0);
		public static final ExecutorProperty _UserFeedback__subject = new EcoreExecutorProperty(Cr2Package.Literals.USER_FEEDBACK__SUBJECT, Types._UserFeedback, 1);

		public static final ExecutorProperty _ValidationStep__nextApprove = new EcoreExecutorProperty(Cr2Package.Literals.VALIDATION_STEP__NEXT_APPROVE, Types._ValidationStep, 0);
		public static final ExecutorProperty _ValidationStep__nextReject = new EcoreExecutorProperty(Cr2Package.Literals.VALIDATION_STEP__NEXT_REJECT, Types._ValidationStep, 1);
		public static final ExecutorProperty _ValidationStep__ModerationProcess__initialStep = new ExecutorPropertyWithImplementation("ModerationProcess", Types._ValidationStep, 2, new EcoreLibraryOppositeProperty(Cr2Package.Literals.MODERATION_PROCESS__INITIAL_STEP));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Automatic =
			{
				Fragments._Automatic__OclAny /* 0 */,
				Fragments._Automatic__OclElement /* 1 */,
				Fragments._Automatic__Step /* 2 */,
				Fragments._Automatic__ValidationStep /* 3 */,
				Fragments._Automatic__Automatic /* 4 */
			};
		private static final int /*@NonNull*/ [] __Automatic = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Comment =
			{
				Fragments._Comment__OclAny /* 0 */,
				Fragments._Comment__OclElement /* 1 */,
				Fragments._Comment__UserFeedback /* 2 */,
				Fragments._Comment__Comment /* 3 */
			};
		private static final int /*@NonNull*/ [] __Comment = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CommentType =
			{
				Fragments._CommentType__OclAny /* 0 */,
				Fragments._CommentType__OclElement /* 1 */,
				Fragments._CommentType__OclType /* 2 */,
				Fragments._CommentType__OclEnumeration /* 3 */,
				Fragments._CommentType__CommentType /* 4 */
			};
		private static final int /*@NonNull*/ [] __CommentType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _End =
			{
				Fragments._End__OclAny /* 0 */,
				Fragments._End__OclElement /* 1 */,
				Fragments._End__Step /* 2 */,
				Fragments._End__End /* 3 */
			};
		private static final int /*@NonNull*/ [] __End = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Feature =
			{
				Fragments._Feature__OclAny /* 0 */,
				Fragments._Feature__OclElement /* 1 */,
				Fragments._Feature__Feature /* 2 */
			};
		private static final int /*@NonNull*/ [] __Feature = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _GradeType =
			{
				Fragments._GradeType__OclAny /* 0 */,
				Fragments._GradeType__OclElement /* 1 */,
				Fragments._GradeType__OclType /* 2 */,
				Fragments._GradeType__OclEnumeration /* 3 */,
				Fragments._GradeType__GradeType /* 4 */
			};
		private static final int /*@NonNull*/ [] __GradeType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Manual =
			{
				Fragments._Manual__OclAny /* 0 */,
				Fragments._Manual__OclElement /* 1 */,
				Fragments._Manual__Step /* 2 */,
				Fragments._Manual__ValidationStep /* 3 */,
				Fragments._Manual__Manual /* 4 */
			};
		private static final int /*@NonNull*/ [] __Manual = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Model =
			{
				Fragments._Model__OclAny /* 0 */,
				Fragments._Model__OclElement /* 1 */,
				Fragments._Model__Model /* 2 */
			};
		private static final int /*@NonNull*/ [] __Model = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ModerationProcess =
			{
				Fragments._ModerationProcess__OclAny /* 0 */,
				Fragments._ModerationProcess__OclElement /* 1 */,
				Fragments._ModerationProcess__ModerationProcess /* 2 */
			};
		private static final int /*@NonNull*/ [] __ModerationProcess = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Review =
			{
				Fragments._Review__OclAny /* 0 */,
				Fragments._Review__OclElement /* 1 */,
				Fragments._Review__UserFeedback /* 2 */,
				Fragments._Review__Review /* 3 */
			};
		private static final int /*@NonNull*/ [] __Review = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ReviewType =
			{
				Fragments._ReviewType__OclAny /* 0 */,
				Fragments._ReviewType__OclElement /* 1 */,
				Fragments._ReviewType__OclType /* 2 */,
				Fragments._ReviewType__OclEnumeration /* 3 */,
				Fragments._ReviewType__ReviewType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ReviewType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Step =
			{
				Fragments._Step__OclAny /* 0 */,
				Fragments._Step__OclElement /* 1 */,
				Fragments._Step__Step /* 2 */
			};
		private static final int /*@NonNull*/ [] __Step = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Subject =
			{
				Fragments._Subject__OclAny /* 0 */,
				Fragments._Subject__OclElement /* 1 */,
				Fragments._Subject__Subject /* 2 */
			};
		private static final int /*@NonNull*/ [] __Subject = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UserFeedback =
			{
				Fragments._UserFeedback__OclAny /* 0 */,
				Fragments._UserFeedback__OclElement /* 1 */,
				Fragments._UserFeedback__UserFeedback /* 2 */
			};
		private static final int /*@NonNull*/ [] __UserFeedback = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ValidationStep =
			{
				Fragments._ValidationStep__OclAny /* 0 */,
				Fragments._ValidationStep__OclElement /* 1 */,
				Fragments._ValidationStep__Step /* 2 */,
				Fragments._ValidationStep__ValidationStep /* 3 */
			};
		private static final int /*@NonNull*/ [] __ValidationStep = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Automatic.initFragments(_Automatic, __Automatic);
			Types._Comment.initFragments(_Comment, __Comment);
			Types._CommentType.initFragments(_CommentType, __CommentType);
			Types._End.initFragments(_End, __End);
			Types._Feature.initFragments(_Feature, __Feature);
			Types._GradeType.initFragments(_GradeType, __GradeType);
			Types._Manual.initFragments(_Manual, __Manual);
			Types._Model.initFragments(_Model, __Model);
			Types._ModerationProcess.initFragments(_ModerationProcess, __ModerationProcess);
			Types._Review.initFragments(_Review, __Review);
			Types._ReviewType.initFragments(_ReviewType, __ReviewType);
			Types._Step.initFragments(_Step, __Step);
			Types._Subject.initFragments(_Subject, __Subject);
			Types._UserFeedback.initFragments(_UserFeedback, __UserFeedback);
			Types._ValidationStep.initFragments(_ValidationStep, __ValidationStep);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Automatic__Automatic = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Automatic__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Automatic__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Automatic__Step = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Automatic__ValidationStep = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Comment__Comment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Comment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Comment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Comment__UserFeedback = {};

		private static final ExecutorOperation /*@NonNull*/ [] _CommentType__CommentType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CommentType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommentType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommentType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommentType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _End__End = {};
		private static final ExecutorOperation /*@NonNull*/ [] _End__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _End__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _End__Step = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Feature__Feature = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Feature__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _GradeType__GradeType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GradeType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _GradeType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _GradeType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _GradeType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Manual__Manual = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Manual__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Manual__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Manual__Step = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Manual__ValidationStep = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Model__Model = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Model__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Model__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ModerationProcess__ModerationProcess = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ModerationProcess__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ModerationProcess__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Review__Review = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Review__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Review__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Review__UserFeedback = {};

		private static final ExecutorOperation /*@NonNull*/ [] _ReviewType__ReviewType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ReviewType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReviewType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReviewType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReviewType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Step__Step = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Step__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Subject__Subject = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Subject__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Subject__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UserFeedback__UserFeedback = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UserFeedback__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UserFeedback__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ValidationStep__ValidationStep = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ValidationStep__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ValidationStep__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ValidationStep__Step = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Automatic__Automatic.initOperations(_Automatic__Automatic);
			Fragments._Automatic__OclAny.initOperations(_Automatic__OclAny);
			Fragments._Automatic__OclElement.initOperations(_Automatic__OclElement);
			Fragments._Automatic__Step.initOperations(_Automatic__Step);
			Fragments._Automatic__ValidationStep.initOperations(_Automatic__ValidationStep);

			Fragments._Comment__Comment.initOperations(_Comment__Comment);
			Fragments._Comment__OclAny.initOperations(_Comment__OclAny);
			Fragments._Comment__OclElement.initOperations(_Comment__OclElement);
			Fragments._Comment__UserFeedback.initOperations(_Comment__UserFeedback);

			Fragments._CommentType__CommentType.initOperations(_CommentType__CommentType);
			Fragments._CommentType__OclAny.initOperations(_CommentType__OclAny);
			Fragments._CommentType__OclElement.initOperations(_CommentType__OclElement);
			Fragments._CommentType__OclEnumeration.initOperations(_CommentType__OclEnumeration);
			Fragments._CommentType__OclType.initOperations(_CommentType__OclType);

			Fragments._End__End.initOperations(_End__End);
			Fragments._End__OclAny.initOperations(_End__OclAny);
			Fragments._End__OclElement.initOperations(_End__OclElement);
			Fragments._End__Step.initOperations(_End__Step);

			Fragments._Feature__Feature.initOperations(_Feature__Feature);
			Fragments._Feature__OclAny.initOperations(_Feature__OclAny);
			Fragments._Feature__OclElement.initOperations(_Feature__OclElement);

			Fragments._GradeType__GradeType.initOperations(_GradeType__GradeType);
			Fragments._GradeType__OclAny.initOperations(_GradeType__OclAny);
			Fragments._GradeType__OclElement.initOperations(_GradeType__OclElement);
			Fragments._GradeType__OclEnumeration.initOperations(_GradeType__OclEnumeration);
			Fragments._GradeType__OclType.initOperations(_GradeType__OclType);

			Fragments._Manual__Manual.initOperations(_Manual__Manual);
			Fragments._Manual__OclAny.initOperations(_Manual__OclAny);
			Fragments._Manual__OclElement.initOperations(_Manual__OclElement);
			Fragments._Manual__Step.initOperations(_Manual__Step);
			Fragments._Manual__ValidationStep.initOperations(_Manual__ValidationStep);

			Fragments._Model__Model.initOperations(_Model__Model);
			Fragments._Model__OclAny.initOperations(_Model__OclAny);
			Fragments._Model__OclElement.initOperations(_Model__OclElement);

			Fragments._ModerationProcess__ModerationProcess.initOperations(_ModerationProcess__ModerationProcess);
			Fragments._ModerationProcess__OclAny.initOperations(_ModerationProcess__OclAny);
			Fragments._ModerationProcess__OclElement.initOperations(_ModerationProcess__OclElement);

			Fragments._Review__OclAny.initOperations(_Review__OclAny);
			Fragments._Review__OclElement.initOperations(_Review__OclElement);
			Fragments._Review__Review.initOperations(_Review__Review);
			Fragments._Review__UserFeedback.initOperations(_Review__UserFeedback);

			Fragments._ReviewType__OclAny.initOperations(_ReviewType__OclAny);
			Fragments._ReviewType__OclElement.initOperations(_ReviewType__OclElement);
			Fragments._ReviewType__OclEnumeration.initOperations(_ReviewType__OclEnumeration);
			Fragments._ReviewType__OclType.initOperations(_ReviewType__OclType);
			Fragments._ReviewType__ReviewType.initOperations(_ReviewType__ReviewType);

			Fragments._Step__OclAny.initOperations(_Step__OclAny);
			Fragments._Step__OclElement.initOperations(_Step__OclElement);
			Fragments._Step__Step.initOperations(_Step__Step);

			Fragments._Subject__OclAny.initOperations(_Subject__OclAny);
			Fragments._Subject__OclElement.initOperations(_Subject__OclElement);
			Fragments._Subject__Subject.initOperations(_Subject__Subject);

			Fragments._UserFeedback__OclAny.initOperations(_UserFeedback__OclAny);
			Fragments._UserFeedback__OclElement.initOperations(_UserFeedback__OclElement);
			Fragments._UserFeedback__UserFeedback.initOperations(_UserFeedback__UserFeedback);

			Fragments._ValidationStep__OclAny.initOperations(_ValidationStep__OclAny);
			Fragments._ValidationStep__OclElement.initOperations(_ValidationStep__OclElement);
			Fragments._ValidationStep__Step.initOperations(_ValidationStep__Step);
			Fragments._ValidationStep__ValidationStep.initOperations(_ValidationStep__ValidationStep);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Automatic = {
			Cr2Tables.Properties._Automatic__method,
			Cr2Tables.Properties._Step__name,
			Cr2Tables.Properties._ValidationStep__nextApprove,
			Cr2Tables.Properties._ValidationStep__nextReject,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Comment = {
			Cr2Tables.Properties._Comment__commentType,
			Cr2Tables.Properties._Comment__hasModerationProcess,
			Cr2Tables.Properties._Comment__moderation,
			Cr2Tables.Properties._Comment__moderationProcess,
			Cr2Tables.Properties._UserFeedback__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Cr2Tables.Properties._Comment__reply,
			Cr2Tables.Properties._UserFeedback__subject
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CommentType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _End = {
			Cr2Tables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Feature = {
			Cr2Tables.Properties._Feature__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _GradeType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Manual = {
			Cr2Tables.Properties._Step__name,
			Cr2Tables.Properties._ValidationStep__nextApprove,
			Cr2Tables.Properties._ValidationStep__nextReject,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Model = {
			Cr2Tables.Properties._Model__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Cr2Tables.Properties._Model__subject
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ModerationProcess = {
			Cr2Tables.Properties._ModerationProcess__initialStep,
			Cr2Tables.Properties._ModerationProcess__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Cr2Tables.Properties._ModerationProcess__step
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Review = {
			Cr2Tables.Properties._Review__gradeType,
			Cr2Tables.Properties._UserFeedback__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Cr2Tables.Properties._Review__reviewType,
			Cr2Tables.Properties._UserFeedback__subject
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ReviewType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Step = {
			Cr2Tables.Properties._Step__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Subject = {
			Cr2Tables.Properties._Subject__feature,
			Cr2Tables.Properties._Subject__featureCount,
			Cr2Tables.Properties._Subject__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Cr2Tables.Properties._Subject__userFeedback
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UserFeedback = {
			Cr2Tables.Properties._UserFeedback__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Cr2Tables.Properties._UserFeedback__subject
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ValidationStep = {
			Cr2Tables.Properties._Step__name,
			Cr2Tables.Properties._ValidationStep__nextApprove,
			Cr2Tables.Properties._ValidationStep__nextReject,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Automatic__Automatic.initProperties(_Automatic);
			Fragments._Comment__Comment.initProperties(_Comment);
			Fragments._CommentType__CommentType.initProperties(_CommentType);
			Fragments._End__End.initProperties(_End);
			Fragments._Feature__Feature.initProperties(_Feature);
			Fragments._GradeType__GradeType.initProperties(_GradeType);
			Fragments._Manual__Manual.initProperties(_Manual);
			Fragments._Model__Model.initProperties(_Model);
			Fragments._ModerationProcess__ModerationProcess.initProperties(_ModerationProcess);
			Fragments._Review__Review.initProperties(_Review);
			Fragments._ReviewType__ReviewType.initProperties(_ReviewType);
			Fragments._Step__Step.initProperties(_Step);
			Fragments._Subject__Subject.initProperties(_Subject);
			Fragments._UserFeedback__UserFeedback.initProperties(_UserFeedback);
			Fragments._ValidationStep__ValidationStep.initProperties(_ValidationStep);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _CommentType__SIMPLE = new EcoreExecutorEnumerationLiteral(Cr2Package.Literals.COMMENT_TYPE.getEEnumLiteral("SIMPLE"), Types._CommentType, 0);
		public static final EcoreExecutorEnumerationLiteral _CommentType__RICHTEXT = new EcoreExecutorEnumerationLiteral(Cr2Package.Literals.COMMENT_TYPE.getEEnumLiteral("RICHTEXT"), Types._CommentType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _CommentType = {
			_CommentType__SIMPLE,
			_CommentType__RICHTEXT
		};

		public static final EcoreExecutorEnumerationLiteral _GradeType__STARS = new EcoreExecutorEnumerationLiteral(Cr2Package.Literals.GRADE_TYPE.getEEnumLiteral("STARS"), Types._GradeType, 0);
		public static final EcoreExecutorEnumerationLiteral _GradeType__CUSTOM = new EcoreExecutorEnumerationLiteral(Cr2Package.Literals.GRADE_TYPE.getEEnumLiteral("CUSTOM"), Types._GradeType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _GradeType = {
			_GradeType__STARS,
			_GradeType__CUSTOM
		};

		public static final EcoreExecutorEnumerationLiteral _ReviewType__ONLYGRADE = new EcoreExecutorEnumerationLiteral(Cr2Package.Literals.REVIEW_TYPE.getEEnumLiteral("ONLYGRADE"), Types._ReviewType, 0);
		public static final EcoreExecutorEnumerationLiteral _ReviewType__ANNOTATED = new EcoreExecutorEnumerationLiteral(Cr2Package.Literals.REVIEW_TYPE.getEEnumLiteral("ANNOTATED"), Types._ReviewType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ReviewType = {
			_ReviewType__ONLYGRADE,
			_ReviewType__ANNOTATED
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._CommentType.initLiterals(_CommentType);
			Types._GradeType.initLiterals(_GradeType);
			Types._ReviewType.initLiterals(_ReviewType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Cr2Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Cr2Tables();
	}

	private Cr2Tables() {
		super(Cr2Package.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		Cr2Package.Literals.FEATURE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
