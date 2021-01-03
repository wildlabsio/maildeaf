package io.wildlabs.maildeaf.core.model;

public class Mail {
    private final Email from;
    private final Email to;
    private final Email replyTo;
    private final String subject;
    private final String plainText;
    private final String htmlText;

    private Mail(Builder builder) {
        from = builder.from;
        to = builder.to;
        replyTo = builder.replyTo;
        subject = builder.subject;
        plainText = builder.plainText;
        htmlText = builder.htmlText;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Email getFrom() {
        return from;
    }

    public Email getTo() {
        return to;
    }

    public Email getReplyTo() {
        return replyTo;
    }

    public String getSubject() {
        return subject;
    }

    public String getPlainText() {
        return plainText;
    }

    public String getHtmlText() {
        return htmlText;
    }

    public static final class Builder {
        private Email from;
        private Email to;
        private Email replyTo;
        private String subject;
        private String plainText;
        private String htmlText;

        private Builder() {
        }

        public Builder from(Email val) {
            from = val;
            return this;
        }

        public Builder to(Email val) {
            to = val;
            return this;
        }

        public Builder replyTo(Email val) {
            replyTo = val;
            return this;
        }

        public Builder subject(String val) {
            subject = val;
            return this;
        }

        public Builder plainText(String val) {
            plainText = val;
            return this;
        }

        public Builder htmlText(String val) {
            htmlText = val;
            return this;
        }

        public Mail build() {
            return new Mail(this);
        }
    }
}
