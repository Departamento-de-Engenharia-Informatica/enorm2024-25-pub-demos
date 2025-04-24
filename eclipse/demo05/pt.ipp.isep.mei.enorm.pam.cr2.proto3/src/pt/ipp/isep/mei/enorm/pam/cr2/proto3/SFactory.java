package pt.ipp.isep.mei.enorm.pam.cr2.proto3;

import pt.ipp.isep.mei.enorm.pam.cr2.proto3.domain.Comment;
import pt.ipp.isep.mei.enorm.pam.cr2.proto3.domain.ValidationCommentProcess;

public interface SFactory {

	ValidationCommentProcess getValidationProcess(Comment c);
}
