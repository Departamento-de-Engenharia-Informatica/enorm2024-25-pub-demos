package pt.ipp.isep.mei.enorm.pam.cr2.proto3;

import pt.ipp.isep.mei.enorm.pam.cr2.proto3.domain.Article;
import pt.ipp.isep.mei.enorm.pam.cr2.proto3.domain.Comment;
import pt.ipp.isep.mei.enorm.pam.cr2.proto3.domain.Factory;
import pt.ipp.isep.mei.enorm.pam.cr2.proto3.domain.Repository;
import pt.ipp.isep.mei.enorm.pam.cr2.proto3.domain.ValidationCommentProcess;
import pt.ipp.isep.mei.enorm.pam.cr2.proto3.domain.ValidationCommentProcessImpl;

public class CommentArticleMenu {
	
	public static void executeMenu(String title) {
		boolean exit = false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {
			System.out.println("# Comment Article "+ title + " Menu #");
			System.out.println("Please select option:");

			System.out.println("0- Exit");
			System.out.println("1- Display Article");
			System.out.println("2- List Comments");
			System.out.println("3- Add Comment");

			// Read an integer from the input
			String line = in.nextLine();
			int num = Integer.valueOf(line);
			
			switch (num) {
				case 0:
					exit = true;
					break;
				case 1: 
					{
						System.out.println("Display Article:");
						Article a=Repository.getRepository().getArticleByTitle(title);
						System.out.println(" " + a.toString());
					}
					break;
				case 2:
					{
						System.out.println("List of Comments:");
						Article a=Repository.getRepository().getArticleByTitle(title);
						for (Comment c: a.getComments()) {
							System.out.println(" " + c.toString());
						}
						System.out.println("End List of Comments.");
					}
					break;
				case 3: {
					String author;
					String text;
					String date;
					System.out.println("Create Comment:");
					System.out.println(" Enter author:");
					author = in.nextLine();
					System.out.println(" Enter text:");
					text = in.nextLine();
					System.out.println(" Enter date:");
					date = in.nextLine();
					Comment c=Factory.newComment(text, author, date);
					// ValidationCommentProcessImpl validate=new ValidationCommentProcessImpl(c);
					// ValidationCommentProcess validate=SFactory
					ValidationCommentProcess validate=SFactoryMain.getSFactory().getValidationProcess(c);		
					if (validate.validate()) {
						Article a=Repository.getRepository().getArticleByTitle(title);
						a.getComments().add(c);
						Repository.getRepository().saveArticle(a);
						System.out.println("Comment Created!");
					}
					else {
						System.out.println("Comment is INVALID!!");						
					}
				}
				break;
					
			}
		}
	}
}
