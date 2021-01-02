package io.wildlabs.maildeaf.core.exception.sender;

import io.wildlabs.maildeaf.core.exception.MailException;
import io.wildlabs.maildeaf.core.model.Mail;

public class MailSenderException extends MailException {
    public MailSenderException(Mail mail) {
        super(mail);
    }

    public MailSenderException(Mail mail, Throwable cause) {
        super(mail, cause);
    }
}
