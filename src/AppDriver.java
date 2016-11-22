import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AppDriver extends Number {


    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();

        SecurityFacade securityFacade = new SecurityFacade();
        securityFacade.turnOnSensorsAndCameras();

        System.out.println("=== Checking for intruders ===");

        Alarm alarm = new Alarm(SecurityProductType.UNIVERSAL);

        // for-each loop in a functional manner
        securityFacade.getSecurityProductsList().stream().filter(securityProduct -> securityProduct != null).forEach(securityProduct -> {
            securityProduct.addObserver(alarm);
            checkIfProductWasTriggered(securityProduct);
        });

        Email invalidEmail = new Email("this is a bad email address @mail.com", "I'm invalid.");
        Email validEmail = new Email("daniel@mail.com", "I'm valid.");

        List<Email> emails = new ArrayList<>();
        emails.add(invalidEmail);
        emails.add(validEmail);

        for(Email email : emails) {
            if (email.getEmailAddress() == null) {
                System.out.println("Invalid email address");
            } else {
                System.out.println("Valid email address:");
                System.out.println(email.toString());
            }
        }
        // securityFacade.turnOffSensorsAndCameras();
    }

    private static void checkIfProductWasTriggered(SecurityProduct securityProduct) {
        int randomNumber = generateRandomInt(1, 25);
        if (randomNumber == 13) {
            securityProduct.setWasTriggered(true);
        }
    }
}
