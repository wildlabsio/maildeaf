package io.wildlabs.maildeaf.sender.springmail;

import io.wildlabs.maildeaf.core.exception.sender.MailSenderException;
import io.wildlabs.maildeaf.core.model.Mail;
import io.wildlabs.maildeaf.core.sender.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;

public class SpringJavaMailSender implements MailSender {
    private final JavaMailSender mailSender;

    public SpringJavaMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendMail(Mail mail) throws MailSenderException {
        try {
            MimeMessage message = mailSender.createMimeMessage();

            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message, true);
            mimeMessageHelper.setFrom(mail.getFrom().getEmail(), mail.getFrom().getName());
            mimeMessageHelper.setTo(mail.getTo().getEmail());
            mimeMessageHelper.setSubject(mail.getSubject());

            if (mail.getHtmlText() != null) {
                mimeMessageHelper.setText(mail.getPlainText(), mail.getHtmlText());
            } else {
                mimeMessageHelper.setText(mail.getPlainText());
            }

            if (mail.getReplyTo() != null) {
                mimeMessageHelper.setReplyTo(mail.getReplyTo().getEmail(), mail.getReplyTo().getName());
            }

            mailSender.send(message);
        } catch (Exception e) {
            throw new MailSenderException(mail, e);
        }
    }
}
