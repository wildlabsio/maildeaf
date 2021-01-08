package io.wildlabs.maildeaf.core;

import io.wildlabs.maildeaf.core.exception.MailException;
import io.wildlabs.maildeaf.core.model.Mail;
import io.wildlabs.maildeaf.core.sender.MailSender;

public class MailDeaf {
    private final MailSender mailSender;

    public MailDeaf(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(Mail mail) throws MailException {
        mailSender.sendMail(mail);
    }
}
