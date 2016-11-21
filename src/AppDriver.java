class AppDriver extends Number {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();

        SecurityFacade securityFacade = new SecurityFacade();
        securityFacade.turnOnSensorsAndCameras();

        // for-each loop in a functional manner
        securityFacade.getSecurityProductsList().stream().filter(securityProduct -> securityProduct != null).forEach(securityProduct -> {
            checkIfProductWasTriggered(securityProduct);
            if (securityProduct.wasTriggered()) {
                System.out.println(securityProduct.getSecurityProductType() + " security product was triggered...");
                securityProduct.setWasTriggered(true);
                securityFacade.turnOnAlarms();
            }
        });

        securityFacade.turnOffSensorsAndCameras();
    }

    private static void checkIfProductWasTriggered(SecurityProduct securityProduct) {
        int randomNumber = generateRandomInt(1, 25);
        if (randomNumber == 13) {
            securityProduct.setWasTriggered(true);
        }
    }
}
