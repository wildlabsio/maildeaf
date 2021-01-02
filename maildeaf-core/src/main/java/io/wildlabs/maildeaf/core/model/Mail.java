package io.wildlabs.maildeaf.core.model;

public class Mail {
    private final String from;
    private final String to;
    private final String subject;
    private final String plainText;
    private final String htmlText;

    private Mail(Builder builder) {
        from = builder.from;
        to = builder.to;
        subject = builder.subject;
        plainText = builder.plainText;
        htmlText = builder.htmlText;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
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
        private String from;
        private String to;
        private String subject;
        private String plainText;
        private String htmlText;

        private Builder() {
        }

        public Builder from(String val) {
            from = val;
            return this;
        }

        public Builder to(String val) {
            to = val;
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
