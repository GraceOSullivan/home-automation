package misc;

import email.Email;
import email.EmailSender;
import regulation.Hygrometer;
import regulation.Thermostat;
import security.SecurityFacade;
import security.SecurityProduct;

class Simulator extends Number {
    void simulate() {
        simulateThermostat();
        simulateHygrometer();
        simulateSecurity();
        simulateEmail();
    }

    private static void simulateEmail() {
        Email myEmail = new Email.EmailBuilder()
                .from("dan@mail.com")
                .to("you")
                .subject("Notification")
                .contents("I have a new number as follows: 086-1234567.")
                .build();

        EmailSender emailSender = new EmailSender();
        emailSender.sendAsFormalEmail(myEmail);
        emailSender.sendAsFriendlyEmail(myEmail);
        emailSender.sendAsSecureEmail(myEmail);
    }

    private static void simulateSecurity() {
        SecurityFacade securityFacade = new SecurityFacade();
        securityFacade.turnOnSecurity();
        Printer.getInstance().print("=== Checking for intruders ===");
        securityFacade.getSecurityProductsList().stream().filter(securityProduct -> securityProduct != null).forEach(Simulator::checkIfProductWasTriggered);
        securityFacade.turnOffSecurity();
    }

    private static void simulateHygrometer() {
        Hygrometer hygrometer = new Hygrometer();
        hygrometer.displayCurrentFactorStat();
        hygrometer.regulateFactorIfNeeded();
        hygrometer.displayCurrentFactorStat();
    }

    private static void simulateThermostat() {
        Thermostat thermostat = new Thermostat();
        thermostat.displayCurrentFactorStat();
        thermostat.regulateFactorIfNeeded();
        thermostat.displayCurrentFactorStat();
    }

    private static void checkIfProductWasTriggered(SecurityProduct securityProduct) {
        int randomNumber = generateRandomInt(1, 25);
        if (randomNumber <= 2) {
            securityProduct.setWasTriggered(true);
        }
    }
}
