package email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email implements IEmail {
    private final String from;
    private final String to;
    private final String subject;
    private final String contents;

    private Email(EmailBuilder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.subject = builder.subject;
        this.contents = builder.contents;
    }

    @Override
    public String getCustomisedDetails(String customisedContents) {
        return "From: " + from +
                "\nTo: " + to +
                "\nSubject: " + subject +
                "\nContents: " + customisedContents;
    }

    @Override
    public String getContents() {
        return contents;
    }

    public static class EmailBuilder {
        private String from;
        private String to;
        private String subject;
        private String contents;

        public EmailBuilder from(String from) {
            this.from = validate(from) ? from : "Invalid email";
            return this;
        }

        public EmailBuilder to(String to) {
            this.to = validate(to) ? to : "Invalid email";
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