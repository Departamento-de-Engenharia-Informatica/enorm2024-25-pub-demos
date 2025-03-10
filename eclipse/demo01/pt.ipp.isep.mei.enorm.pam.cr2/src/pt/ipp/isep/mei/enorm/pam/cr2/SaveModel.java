package pt.ipp.isep.mei.enorm.pam.cr2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


public class SaveModel {

	public static Model createModel(String name) {
		
		// Initialize the model
		Cr2Package.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		Cr2Factory factory = Cr2Factory.eINSTANCE;
		        
		// Create a model
		Model myModel = factory.createModel();
		myModel.setName(name);

		// Create a Subject
		Subject mySubject = factory.createSubject();
		mySubject.setName("Product");
		        
		// Set Subject to the Model
		myModel.setSubject(mySubject);

		// Create a Feature
		Feature myFeature = factory.createFeature();
		myFeature.setId("price3");

		// Add Feature to the Subject
		mySubject.getFeature().add(myFeature);
		       
		        
		// Create a Feedback
		UserFeedback myUserFeedback = (UserFeedback) factory.createReview();
		myUserFeedback.setName("Review");
		        
		// Add The Feedback to the Subject
		mySubject.getUserfeedback().add(myUserFeedback);
		
		return myModel;
	}
	
	
	public static Model createInvalidModel(String name) {
		
		// Initialize the model
		Cr2Package.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		Cr2Factory factory = Cr2Factory.eINSTANCE;
		        
		// Create a model
		Model myModel = factory.createModel();
		myModel.setName(name);

		// Create a Subject
		Subject mySubject = factory.createSubject();
		mySubject.setName("Service");
		        
		// Set Subject to the Model
		myModel.setSubject(mySubject);
		
		return myModel;
	}

	public static Model createModelForAmazon() {
		
		// Initialize the model
		Cr2Package.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		Cr2Factory factory = Cr2Factory.eINSTANCE;
		        
		// Create a model
		Model myModel = factory.createModel();
		myModel.setName("Amazon");

		// Create a Subject
		Subject mySubject = factory.createSubject();
		mySubject.setName("Product");
		        
		// Set Subject to the Model
		myModel.setSubject(mySubject);

		// Create a Feature
		Feature myFeaturePrice = factory.createFeature();
		myFeaturePrice.setId("price");

		// Add Feature to the Subject
		mySubject.getFeature().add(myFeaturePrice);
		
		// Create another Feature
		Feature myFeatureDescriptione = factory.createFeature();
		myFeatureDescriptione.setId("description");

		// Add Feature to the Subject
		mySubject.getFeature().add(myFeatureDescriptione);
		       
		        
		// Create a Feedback
		UserFeedback myUserFeedback = (UserFeedback) factory.createReview();
		myUserFeedback.setName("Review");
		        
		// Add The Feedback to the Subject
		mySubject.getUserfeedback().add(myUserFeedback);
		
		return myModel;
	}
	
	public static Model createModelForPublico() {
		
		// Initialize the model
		Cr2Package.eINSTANCE.eClass();

		// Retrieve the default factory singleton
		Cr2Factory factory = Cr2Factory.eINSTANCE;
		        
		// Create a model
		Model myModel = factory.createModel();
		myModel.setName("Publico");

		// Create a Subject
		Subject mySubject = factory.createSubject();
		mySubject.setName("Article");
		        
		// Set Subject to the Model
		myModel.setSubject(mySubject);

		// Create a Feature
		Feature myFeature = factory.createFeature();
		myFeature.setId("title");

		// Add Feature to the Subject
		mySubject.getFeature().add(myFeature);
		        
		        
		// Create a Feedback
		UserFeedback myUserFeedback = (UserFeedback) factory.createComment();
		myUserFeedback.setName("Comment");
		        
		// Add The Feedback to the Subject
		mySubject.getUserfeedback().add(myUserFeedback);
		
		return myModel;
	}

	public static void saveModel(Model myModel, String filename) {
		
		// Create ResourceSet and register factories
		// Associate the "xmi" and "ecore" extension with the XMI / Ecore resource format
		ResourceSet rs = new ResourceSetImpl();
		Map<String, Object> map = rs.getResourceFactoryRegistry().getExtensionToFactoryMap();
		map.put("ecore", new EcoreResourceFactoryImpl());
		map.put("xmi", new XMIResourceFactoryImpl());
		
		// Load the meta model dynamically and register it in the package registry of the ResourceSet 
		URI ecoreUri = URI.createFileURI(new File("./model/cr2.ecore").getAbsolutePath());
		Resource rMeta = rs.getResource(ecoreUri, true);
		EPackage metamodel = (EPackage)rMeta.getContents().get(0);
		rs.getPackageRegistry().put(metamodel.getNsURI(), metamodel);	
		
		
		// Create an output resource for the model instance and serialize it
		URI outputUri = URI.createFileURI(new File("instances/" + filename + ".xmi").getAbsolutePath());
		Resource rOut = rs.createResource(outputUri);
		rOut.getContents().clear();
		rOut.getContents().add(myModel);

		Map<Object,Object> options = new HashMap<Object,Object>();		
		options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		
		try {
			rOut.save(options);
			fixSavedModel(filename);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static boolean checkModel(Model myModel) {
		
		// Add a call to validation...
        // See: https://stackoverflow.com/questions/8594212/how-to-programmatically-trigger-validation-of-emf-model
        System.out.println("Diagnostic:");
        Diagnostic diag=Diagnostician.INSTANCE.validate(myModel);
        if (diag.getSeverity()!=Diagnostic.OK) {
        	System.out.println(diag.getMessage());
        	List<Diagnostic> l=diag.getChildren();
        	for (Diagnostic d: l) {
        		System.out.println(d.getMessage());
        	}
        	return false;
        }
        else {
        	System.out.println(" Everything seems fine :-)");
        	return true;
        }
	}

	public static Model loadModel(String filename) {
		
		// Create ResourceSet and register factories
		// Associate the "xmi" and "ecore" extension with the XMI / Ecore resource format
		ResourceSet rs = new ResourceSetImpl();
		Map<String, Object> map = rs.getResourceFactoryRegistry().getExtensionToFactoryMap();
		map.put("ecore", new EcoreResourceFactoryImpl());
		map.put("xmi", new XMIResourceFactoryImpl());
								
						
		// Load the input instance model dynamically
		URI inputUri = URI.createFileURI(new File("instances/" + filename + ".xmi").getAbsolutePath());
		Resource rInput = rs.getResource(inputUri, true);
		EObject inputRoot = rInput.getContents().get(0);
		Model myModel=(Model)inputRoot;
		
		return myModel;
	}

	private static void fixSavedModel(String filename) {
		
		// Create ResourceSet and register factories
		// Associate the "xmi" and "ecore" extension with the XMI / Ecore resource format
		ResourceSet rs = new ResourceSetImpl();
		Map<String, Object> map = rs.getResourceFactoryRegistry().getExtensionToFactoryMap();
		map.put("ecore", new EcoreResourceFactoryImpl());
		map.put("xmi", new XMIResourceFactoryImpl());
		
		// Load the meta model dynamically and register it in the package registry of the ResourceSet 
		URI ecoreUri = URI.createFileURI(new File("./model/cr2.ecore").getAbsolutePath());
		Resource rMeta = rs.getResource(ecoreUri, true);
		EPackage metamodel = (EPackage)rMeta.getContents().get(0);
		rs.getPackageRegistry().put(metamodel.getNsURI(), metamodel);	
		
		
		// Load the input instance model dynamically
		URI inputUri = URI.createFileURI(new File("instances/" + filename + ".xmi").getAbsolutePath());
		Resource rInput = rs.getResource(inputUri, true);
		EObject inputRoot = rInput.getContents().get(0);
		
	
		
		// Create an output resource for the model instance and serialize it
		URI outputUri = URI.createFileURI(new File("instances/" + filename + ".xmi").getAbsolutePath());
		Resource rOut = rs.createResource(outputUri);
		rOut.getContents().clear();
		rOut.getContents().add(inputRoot);

		Map<Object,Object> options = new HashMap<Object,Object>();		
		options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		try {
			rOut.save(options);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
