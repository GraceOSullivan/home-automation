package misc;

import email.Email;
import email.EmailSender;
import regulation.*;
import security.SecurityFacade;
import security.SecurityProduct;

import java.util.Scanner;

class Simulator extends Number {
    void simulate() {
        simulateThermostat();
        simulateHygrometer();
        simulateSecurity();
        simulateEmail();
    }

    private static void simulateEmail() {
        Scanner in = new Scanner(System.in);

        Printer.getInstance().print("Email address (your own):");
        String sender = in.next();

        Printer.getInstance().print("Email address (recipient):");
        String recipient = in.next();

        Printer.getInstance().print("Email subject:");
        String subject = in.next();

        Printer.getInstance().print("Email contents (\"/q\" on it's own line recipient stop writing):");
        // http://stackoverflow.com/questions/27055069/geting-a-multiline-text-with-scanner-class-in-java
        String TERMINATOR_STRING = "/q";
        StringBuilder contents = new StringBuilder();
        String strLine;
        while (!(strLine = in.nextLine()).equals(TERMINATOR_STRING)) {
            contents.append(strLine).append("\n");
        }

        Email myEmail = new Email.EmailBuilder()
                .sender(sender)
                .recipient(recipient)
                .subject(subject)
                .contents(contents.toString())
                .build();

        myEmail = validateEmailAddresses(in, sender, recipient, subject, contents, myEmail);

        EmailSender emailSender = new EmailSender();
        emailSender.sendAsFormalEmail(myEmail);
        emailSender.sendAsFriendlyEmail(myEmail);
        emailSender.sendAsSecureEmail(myEmail);
    }

    private static Email validateEmailAddresses(Scanner in, String sender, String recipient, String subject, StringBuilder contents, Email myEmail) {
        if (myEmail.getSender().equals("Invalid email") || myEmail.getRecipient().equals("Invalid email")) {
            while (myEmail.getSender().equals("Invalid email") || myEmail.getRecipient().equals("Invalid email")) {
                Printer.getInstance().print("Unable recipient send email...");
                if (myEmail.getSender().equals("Invalid email")) {
                    while (myEmail.getSender().equals("Invalid email")) {
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
                    while (myEmail.getRecipient().equals("Invalid email")) {
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

    private static void simulateSecurity() {
        SecurityFacade securityFacade = new SecurityFacade();
        securityFacade.turnOnSecurity();
        Printer.getInstance().print("=== Checking for intruders ===");
        securityFacade.getSecurityProductsList().stream().filter(securityProduct -> securityProduct != null).forEach(Simulator::checkIfProductWasTriggered);
        securityFacade.turnOffSecurity();
    }

    private Instrument instrument;

    private void simulateHygrometer() {
        instrument = new Hygrometer();
        instrument.displayCurrentFactorStat();
        instrument.regulateFactorIfNeeded();
        instrument.displayCurrentFactorStat();
    }

    private void simulateThermostat() {
        instrument = new Thermostat();
        instrument.displayCurrentFactorStat();
        instrument.regulateFactorIfNeeded();
        instrument.displayCurrentFactorStat();
    }

    private static void checkIfProductWasTriggered(SecurityProduct securityProduct) {
        int randomNumber = generateRandomInt(1, 25);
        if (randomNumber <= 2) {
            securityProduct.setWasTriggered(true);
        }
    }
}
