package pt.ipp.isep.mei.enorm.pam.cr2;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class GeneratePlantUML {
	
	public static void fromModel(Model myModel) {
		

		PrintWriter writer=null;
		try {
			//-----
			// Generate a plantuml file that represents the CR2 model in a UML diagram (other options/notations could be used)
			FileWriter w = new FileWriter("instances/" + myModel.getName() +".puml");
	        writer = new PrintWriter(w);
	        
	        writer.println("@startuml");
	        
	        //Create the Subject
			Subject mySubject=myModel.getSubject();
			writer.println("class "+mySubject.getName()+" << (S,#FF7700) >> {");
				// Add an attribute for each feature
				for (Feature fxt:mySubject.getFeature()) {
					writer.println("+" + fxt.getName());
				}
			writer.println("}");
			
			
			// For the User Feedback - Definition of User Feedback
	        for (UserFeedback uf: mySubject.getUserFeedback()) {
	        	writer.println("class "+uf.getName()+" << (F,green) >> {");
		        writer.println("}");	        	
	        }

			// For the User Feedback - Relationship with Subject 
	        for (UserFeedback uf: mySubject.getUserFeedback()) {
	        	writer.println(mySubject.getName()+" *-> "+uf.getName());
	        }
			
			//resource.save(Collections.EMPTY_MAP);
	        writer.println("@enduml");		
	        writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			writer.close();
		}
		
	}
	
	public static void fromFile(String filename) {
	
		Model myModel = SaveModel.loadModel(filename);
		
		fromModel(myModel);
				
	}

}
