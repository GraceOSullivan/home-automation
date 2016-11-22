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

        securityFacade.turnOffSensorsAndCameras();

        EmailSender sender = new EmailSender();

        Email myemail = new Email.EmailBuilder()
                .from("dan@mail.com")
                .to("you")
                .subject("Notification")
                .contents("\"I have a new number as follows: 086-1234567.")
                .build();

        System.out.println("Sending formal email...");
        sender.sendAsFormalEmail(myemail);
        /*
        System.out.println("Sending secure email to " + email.getDestinationEmailAddress());
        sender.sendAsSecureEmail(email);
        System.out.println("Sending friendly email to " + email.getDestinationEmailAddress());
        sender.sendAsFriendlyEmail(email);
*/


    }

    private static void checkIfProductWasTriggered(SecurityProduct securityProduct) {
        int randomNumber = generateRandomInt(1, 25);
        if (randomNumber == 13) {
            securityProduct.setWasTriggered(true);
        }
    }
}
