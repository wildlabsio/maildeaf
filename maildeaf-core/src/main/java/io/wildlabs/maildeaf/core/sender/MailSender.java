package io.wildlabs.maildeaf.core.sender;

import io.wildlabs.maildeaf.core.exception.sender.MailSenderException;
import io.wildlabs.maildeaf.core.model.Mail;

public interface MailSender {
    void sendMail(Mail mail) throws MailSenderException;
}
