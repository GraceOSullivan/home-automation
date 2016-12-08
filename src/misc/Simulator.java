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

    private Instrument instrument;

    private void simulateThermostat() {
        instrument = new Thermostat();
        instrument.displayCurrentFactorStat();
        instrument.regulateFactorIfNeeded();
        instrument.displayCurrentFactorStat();
    }

    private void simulateHygrometer() {
        instrument = new Hygrometer();
        instrument.displayCurrentFactorStat();
        instrument.regulateFactorIfNeeded();
        instrument.displayCurrentFactorStat();
    }

    private static void simulateSecurity() {
        SecurityFacade securityFacade = new SecurityFacade();
        securityFacade.turnOnSecurity();
        Printer.getInstance().print("=== Checking for intruders ===");
        securityFacade.checkIfAnySecurityProductWasTriggered();
        securityFacade.turnOffSecurity();
    }

    private static void checkIfProductWasTriggered(SecurityProduct securityProduct) {
        int randomNumber = generateRandomInt(1, 25);
        if (randomNumber <= 2) {
            securityProduct.setWasTriggered(true);
        }
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
        /***************************************************************************************
         *    Skeleton for the continuous reading of user input source code was gotten from the following source:
         *
         *    Title: geting a multiline text with scanner class in java
         *    Author: Yohanes Khosiawan (StackOverflow Member)
         *    Date: 21-November-2014
         *    Code version: 1.0
         *    Availability: http://stackoverflow.com/questions/27055069/geting-a-multiline-text-with-scanner-class-in-java
         *
         ***************************************************************************************/
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

        myEmail = validateEmailAddressesWhileInvalid(in, sender, recipient, subject, contents, myEmail);

        EmailSender emailSender = new EmailSender();
        emailSender.sendAsFormalEmail(myEmail);
        emailSender.sendAsFriendlyEmail(myEmail);
        emailSender.sendAsSecureEmail(myEmail);
    }

    private static Email validateEmailAddressesWhileInvalid(Scanner in, String sender, String recipient, String subject, StringBuilder contents, Email myEmail) {
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
}
