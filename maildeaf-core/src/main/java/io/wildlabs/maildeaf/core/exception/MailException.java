package io.wildlabs.maildeaf.core.exception;

import io.wildlabs.maildeaf.core.model.Mail;

public class MailException extends RuntimeException {
    private final Mail mail;

    public MailException(Mail mail) {
        this.mail = mail;
    }

    public MailException(Mail mail, Throwable cause) {
        super(cause);
        this.mail = mail;
    }

    public Mail getMail() {
        return mail;
    }
}
