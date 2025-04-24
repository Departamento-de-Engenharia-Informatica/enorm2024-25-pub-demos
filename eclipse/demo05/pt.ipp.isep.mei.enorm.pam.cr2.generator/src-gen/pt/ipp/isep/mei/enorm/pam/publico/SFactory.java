package pt.ipp.isep.mei.enorm.pam.publico;

import pt.ipp.isep.mei.enorm.pam.publico.domain.Comment;
import pt.ipp.isep.mei.enorm.pam.publico.domain.ValidationCommentProcess;

public interface SFactory {

	ValidationCommentProcess getValidationProcess(Comment c);
}
