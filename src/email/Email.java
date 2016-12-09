/***************************************************************************************
 *    Skeleton for the some of the code was gotten from the following source:
 *
 *    Title: Another builder pattern for Java
 *    Author: Per Lundholm
 *    Date: 09-October-2013
 *    Code version: 1.0
 *    Availability: http://blog.crisp.se/2013/10/09/perlundholm/another-builder-pattern-for-java
 *
 ***************************************************************************************/

package email;

import misc.Printer;

import java.util.Scanner;
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
        return "From: " + sender + "\nTo: " + recipient + "\nSubject: " + subject + "\nContents: " + customisedContents;
    }

    @Override
    public String getContents() {
        return contents;
    }

    public Email validateEmailAddressesWhileInvalid(Scanner in, String sender, String recipient, String subject,
                                                    StringBuilder contents, Email myEmail) {
        if (myEmail.sender.equals("Invalid email") || myEmail.recipient.equals("Invalid email")) {
            while (myEmail.sender.equals("Invalid email") || myEmail.recipient.equals("Invalid email")) {
                Printer.getInstance().print("Unable to send email...");
                if (myEmail.sender.equals("Invalid email")) {
                    while (myEmail.sender.equals("Invalid email")) {
                        Printer.getInstance().print("Invalid email address (sender). Try again:");
                        sender = in.next();
                        myEmail = new Email.EmailBuilder()
                                .sender(sender)
                                .recipient(recipient)
                                .subject(subject)
                                .contents(contents.toString())
                                .build();
                    }
                } else {
                    while (myEmail.recipient.equals("Invalid email")) {
                        Printer.getInstance().print("Invalid email address (recipient). Try again:");
                        recipient = in.next();
                        myEmail = new Email.EmailBuilder()
                                .sender(sender)
                                .recipient(recipient)
                                .subject(subject)
                                .contents(contents.toString())
                                .build();
                    }
                }
            }
        }
        return myEmail;
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
            final Pattern VALID_EMAIL_ADDRESS_REGEX =
                    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
            return matcher.find();
        }
    }
}