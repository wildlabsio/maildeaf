package io.wildlabs.maildeaf.core.sender;

import io.wildlabs.maildeaf.core.exception.sender.MailSenderException;
import io.wildlabs.maildeaf.core.model.Mail;

public class ProxyMailSender implements MailSender {
    private final MailSender mailSender;
    private final String to;

    public ProxyMailSender(MailSender mailSender, String to) {
        this.mailSender = mailSender;
        this.to = to;
    }

    @Override
    public void sendMail(Mail mail) throws MailSenderException {
        mailSender.sendMail(
                Mail.newBuilder()
                        .to(to)
                        .from(mail.getFrom())
                        .subject(mail.getSubject())
                        .plainText(mail.getPlainText())
                        .htmlText(mail.getHtmlText())
                        .build()
        );
    }
}
