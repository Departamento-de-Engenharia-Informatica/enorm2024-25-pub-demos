package pt.ipp.isep.mei.enorm.pam.publico.domain;

import pt.ipp.isep.mei.enorm.pam.publico.domain.Comment;

public class ValidationCommentProcessImpl2 implements ValidationCommentProcess {

	private Comment comment=null;

	public ValidationCommentProcessImpl2(Comment c) {
		comment=c;
	}
	
	public boolean validate() {
		return false;
	}
		
}
