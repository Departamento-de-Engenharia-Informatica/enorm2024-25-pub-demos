package pt.ipp.isep.mei.enorm.pam.publico;


import pt.ipp.isep.mei.enorm.pam.publico.SFactory;
import pt.ipp.isep.mei.enorm.pam.publico.domain.Comment;
import pt.ipp.isep.mei.enorm.pam.publico.domain.ValidationCommentProcess;
import pt.ipp.isep.mei.enorm.pam.publico.domain.ValidationCommentProcessImpl2;

public class SFactoryAlternativeImpl implements SFactory {

	@Override
	public ValidationCommentProcess getValidationProcess(Comment c) {
		// TODO Auto-generated method stub
		return new ValidationCommentProcessImpl2(c);
	}
}
