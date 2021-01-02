package io.wildlabs.maildeaf.core;

import io.wildlabs.maildeaf.core.exception.MailException;
import io.wildlabs.maildeaf.core.model.Mail;

public interface MailService {
    void sendMail(Mail mail) throws MailException;
}
