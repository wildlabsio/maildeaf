package io.wildlabs.maildeaf.sender;

import com.sendgrid.*;
import io.wildlabs.maildeaf.core.exception.sender.MailSenderException;
import io.wildlabs.maildeaf.core.model.Mail;
import io.wildlabs.maildeaf.core.sender.MailSender;

public class SendGridMailSender implements MailSender {
    private final SendGrid sendGrid;

    public SendGridMailSender(SendGrid sendGrid) {
        this.sendGrid = sendGrid;
    }

    @Override
    public void sendMail(Mail mail) throws MailSenderException {
        try {
            com.sendgrid.Mail sendGridMail = new com.sendgrid.Mail(
                    convertEmail(mail.getFrom()),
                    mail.getSubject(),
                    convertEmail(mail.getTo()),
                    new Content("text/plain", mail.getPlainText())
            );

            sendGridMail.addContent(new Content("text/html", mail.getHtmlText()));

            Request request = new Request();
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(sendGridMail.build());

            sendGrid.api(request);
        } catch (Exception e) {
            throw new MailSenderException(mail, e);
        }
    }

    private Email convertEmail(String email) {
        return new Email(email);
    }
}
