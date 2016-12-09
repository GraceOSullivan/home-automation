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

package misc;

import email.Email;
import email.EmailSender;
import regulation.*;
import security.SecurityFacade;

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

    private static void simulateEmail() {
        Scanner in = new Scanner(System.in);

        Printer.getInstance().print("Email address (your own):");
        String sender = in.next();

        Printer.getInstance().print("Email address (recipient):");
        String recipient = in.next();

        Printer.getInstance().print("Email subject:");
        String subject = in.next();

        Printer.getInstance().print("Email contents (\"/q\" on it's own line recipient stop writing):");
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

        myEmail = myEmail.validateEmailAddressesWhileInvalid(in, sender, recipient, subject, contents, myEmail);

        EmailSender emailSender = new EmailSender();
        emailSender.sendAsFormalEmail(myEmail);
        emailSender.sendAsFriendlyEmail(myEmail);
        emailSender.sendAsSecureEmail(myEmail);
    }
}