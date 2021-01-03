package io.wildlabs.maildeaf.core.model;

public class Email {
    private final String email;
    private final String name;

    public Email(String email) {
        this.email = email;
        this.name = null;
    }

    public Email(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
