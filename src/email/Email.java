package email;

// skeleton of code gotten from: http://blog.crisp.se/2013/10/09/perlundholm/another-builder-pattern-for-java

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email implements IEmail {
    private final String sender;
    private final String recipient;
    private final String subject;
    private final String contents;

    private Email(EmailBuilder builder) {
        this.sender = builder.sender;
        this.recipient = builder.recipient;
        this.subject = builder.subject;
        this.contents = builder.contents;
    }

    @Override
    public String getCustomisedDetails(String customisedContents) {
        return "From: " + sender +
                "\nTo: " + recipient +
                "\nSubject: " + subject +
                "\nContents: " + customisedContents;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public String getContents() {
        return contents;
    }

    public static class EmailBuilder {
        private String sender;
        private String recipient;
        private String subject;
        private String contents;

        public EmailBuilder sender(String sender) {
            this.sender = validate(sender) ? sender : "Invalid email";
            return this;
        }

        public EmailBuilder recipient(String recipient) {
            this.recipient = validate(recipient) ? recipient : "Invalid email";
            return this;
        }

        public EmailBuilder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailBuilder contents(String contents) {
            this.contents = contents;
            return this;
        }

        public Email build() {
            return new Email(this);
        }

        private boolean validate(String email) {
            final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
            return matcher.find();
        }
    }
}