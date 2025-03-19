package pt.ipp.isep.mei.enorm.pam.cr2;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.ExecEnv;
import org.eclipse.m2m.atl.emftvm.Metamodel;
import org.eclipse.m2m.atl.emftvm.Model;
import org.eclipse.m2m.atl.emftvm.impl.resource.EMFTVMResourceFactoryImpl;
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.ModuleResolver;
import org.eclipse.m2m.atl.emftvm.util.TimingData;
import org.eclipse.ocl.common.OCLConstants;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.pivot.model.OCLstdlib;

import org.eclipse.uml2.uml.UMLPackage;

public class CR2UML {

	public static void initOCL() {
		//-----------------------------------------
		// Initialize Stand alone OCLInEcore
		// The first thing to do before using any code of the model
		String oclDelegateURI = OCLConstants.OCL_DELEGATE_URI;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
			new OCLValidationDelegateFactory.Global());
		
		OCLDelegateDomain.initialize(null);
		
		org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup.doSetup();

		OCLstdlib.install(); 
		//-------------		
	}	
	
	public static void registerEcorePackages() {
		// Associate the "xmi" extension with the XMI resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		// Associate the "emftvm" extension with the EMFTVM resource format
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("emftvm", new EMFTVMResourceFactoryImpl());

		// Initialize the Cr2 package
		Cr2Package.eINSTANCE.eClass();

		// Initialize the EMFTVM package
		org.eclipse.m2m.atl.emftvm.EmftvmPackage.eINSTANCE.eClass();

		// For UML2
		UMLPackage.eINSTANCE.eClass();
	}

	public static void main(String[] args) {

		cr2ToUML("generateuml", "http://pam.enorm.mei.isep.ipp.pt/cr2", UMLPackage.eNS_URI, "instances/Amazon.xmi", "instances/AmazonUML.uml");

	}

	public static void cr2ToUML(String module, String metaModelIn, String metaModelOut, String modelIn, String modelOut) {
		
		// Initialize OCL support
		initOCL();
		
		registerEcorePackages();

		ExecEnv env = EmftvmFactory.eINSTANCE.createExecEnv();
		ResourceSet rs = new ResourceSetImpl();

		// Load metamodels
		Metamodel metaM = EmftvmFactory.eINSTANCE.createMetamodel();
		metaM.setResource(rs.getResource(URI.createURI(metaModelIn), true));
		env.registerMetaModel("CR2", metaM);

		Metamodel metaM2 = EmftvmFactory.eINSTANCE.createMetamodel();
		metaM2.setResource(rs.getResource(URI.createURI(metaModelOut), true));
		env.registerMetaModel("UML", metaM2);
		
		// Load models
		Model inModel = EmftvmFactory.eINSTANCE.createModel();
		inModel.setResource(rs.getResource(URI.createURI(modelIn, true), true));
		env.registerInOutModel("IN", inModel);

		Model outModel = EmftvmFactory.eINSTANCE.createModel();
		outModel.setResource(rs.createResource(URI.createFileURI(modelOut)));
		env.registerOutputModel("OUT", outModel);
		
		// Load and run module
		ModuleResolver mr = new DefaultModuleResolver("transformations/", new ResourceSetImpl());

		TimingData td = new TimingData();
		env.loadModule(mr, module);
		td.finishLoading();
		env.run(td);
		td.finish();

		// Save models
		try {
			outModel.getResource().save(Collections.emptyMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
