class AppDriver extends Number {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();

        SecurityFacade securityFacade = new SecurityFacade();
        securityFacade.turnOnSensors();
        securityFacade.turnOffSensors();
        securityFacade.turnOnCameras();
        securityFacade.turnOffCameras();

        //facade = new AlarmFacade();
        //facade.turnOn();

        /*
        for (SecurityProduct securityProduct : securityProductList) {
            if (securityProduct != null) {
                checkIfProductWasTriggered(securityProduct);
                if (securityProduct.wasTriggered()) {
                    System.out.println(securityProduct.getSecurityProductType() + " security product was triggered...");
                    securityProductUniversal.turnOn();
                }
            }
        }
        */
    }

    private static void checkIfProductWasTriggered(SecurityProduct securityProduct) {
        int randomNumber = generateRandomInt(1, 50);
        if (randomNumber == 25) {
            securityProduct.setWasTriggered(true);
        }
    }
}
