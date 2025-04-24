package  pt.ipp.isep.mei.enorm.pam.publico.domain;

public class Factory {

	public static Article newArticle(  String title,  String author,  String text	) {
		Article a=new Article( title,  author,  text);
		return a;
	}

	public static Comment newComment(String author, String text, String date) {
		Comment c=new Comment(author, text, date);
		return c;
	}
	
}