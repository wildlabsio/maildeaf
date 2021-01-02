package io.wildlabs.maildeaf.core.sender;

import io.wildlabs.maildeaf.core.exception.sender.MailSenderException;
import io.wildlabs.maildeaf.core.model.Mail;

import java.util.List;

public class ChainMailSender implements MailSender {
    private final List<MailSender> mailSenders;

    public ChainMailSender(List<MailSender> mailSenders) {
        this.mailSenders = mailSenders;
    }

    @Override
    public void sendMail(Mail mail) throws MailSenderException {
        for (MailSender mailSender : mailSenders) {
            mailSender.sendMail(mail);
        }
    }
}
