class AppDriver extends Number {


    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();


        SecurityFacade securityFacade = new SecurityFacade();
        securityFacade.turnOnSecurity();

        System.out.println("=== Checking for intruders ===");

        // for-each loop in a functional manner
        securityFacade.getSecurityProductsList().stream().filter(securityProduct -> securityProduct != null).forEach(AppDriver::checkIfProductWasTriggered);

        securityFacade.turnOffSecurity();


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

    private static void checkIfProductWasTriggered(SecurityProduct securityProduct) {
        int randomNumber = generateRandomInt(1, 25);
        if (randomNumber == 13) {
            securityProduct.setWasTriggered(true);
        }
    }
}
