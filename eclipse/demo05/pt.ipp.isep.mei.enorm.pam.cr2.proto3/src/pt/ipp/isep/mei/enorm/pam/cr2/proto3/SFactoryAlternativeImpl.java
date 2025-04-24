package pt.ipp.isep.mei.enorm.pam.cr2.proto3;

import pt.ipp.isep.mei.enorm.pam.cr2.proto3.domain.Comment;
import pt.ipp.isep.mei.enorm.pam.cr2.proto3.domain.ValidationCommentProcess;
import pt.ipp.isep.mei.enorm.pam.cr2.proto3.domain.ValidationCommentProcessImpl2;

public class SFactoryAlternativeImpl implements SFactory {

	@Override
	public ValidationCommentProcess getValidationProcess(Comment c) {
		// TODO Auto-generated method stub
		return new ValidationCommentProcessImpl2(c);
	}
}
