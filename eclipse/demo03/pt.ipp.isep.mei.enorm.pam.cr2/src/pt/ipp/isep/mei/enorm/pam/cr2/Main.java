package pt.ipp.isep.mei.enorm.pam.cr2;

public class Main {
	
	// Example of how to use the EMF library
	public static void main(String[] args) {
		
		// Initialize OCL
		//SaveModel.initOCL();
		
		// Create, Validate and Save a model for Publico
	    Model mPublico = SaveModel.createModelForPublico();
	    if (SaveModel.checkModel(mPublico)) {
	    	SaveModel.saveModel(mPublico, "Publico");
	    	GeneratePlantUML.fromModel(mPublico);
	    }
	    else
	    	System.out.println("Publico model is not valid!");
	    
	    // Create and Save an incomplete model for Publico with Moderation Process
	    Model mPublicoModProcess = SaveModel.createModelForPublicoWithModerationProcess();
	    SaveModel.saveModel(mPublicoModProcess, "PublicoATL");
	    GeneratePlantUML.fromModel(mPublicoModProcess);
	    
	    
	    // Create, Validate and Save a model for Amazon
	    Model mAmazon = SaveModel.createModelForAmazon();
	    if (SaveModel.checkModel(mAmazon))
	    {
	    	SaveModel.saveModel(mAmazon, "Amazon");
	    	GeneratePlantUML.fromFile("Amazon");
	    }
	    else
	    	System.out.println("Amazon model is not valid!");
		
	    
	    // Create, Validate and Save a model that is Invalid
	    Model myIvalidModel = SaveModel.createInvalidModel("Invalid");
	    if (SaveModel.checkModel(myIvalidModel))
	    	SaveModel.saveModel(myIvalidModel, "Invalid");
	    else
	    {
	    	System.out.println("The Invalid model will be saved anyway!");
		    SaveModel.saveModel(myIvalidModel, "Invalid2");
	    }
	    
	    // Validate a model created using "Dynamic Instance" feature
	    Model myDynamicModel = SaveModel.loadModel("DynamicModel1");
	    if (SaveModel.checkModel(myDynamicModel))
	    	System.out.println("The Dynamic model is valid!");
	    else
	    {
	    	System.out.println("The Dynamic model is invalid!");
	    }
	    
	    // Create, Validate and Save a "custom" model for testing
	    Model myModel = SaveModel.createModel("Teste2");
	    if (SaveModel.checkModel(myModel))
	    	SaveModel.saveModel(myModel, "Teste2");
	    else
	    	System.out.println("A testing model is not valid!");
	}
}
