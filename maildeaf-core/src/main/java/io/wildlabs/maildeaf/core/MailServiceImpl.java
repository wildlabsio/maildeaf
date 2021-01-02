package io.wildlabs.maildeaf.core;

import io.wildlabs.maildeaf.core.exception.MailException;
import io.wildlabs.maildeaf.core.model.Mail;
import io.wildlabs.maildeaf.core.sender.MailSender;

public class MailServiceImpl implements MailService {
    private final MailSender mailSender;

    public MailServiceImpl(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendMail(Mail mail) throws MailException {
        mailSender.sendMail(mail);
    }
}
