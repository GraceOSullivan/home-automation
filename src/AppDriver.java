class AppDriver extends Number {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();

        System.out.println("SENSORS");
        SensorFacade sensorFacade = new SensorFacade();
        sensorFacade.turnOn();
        sensorFacade.turnOff();

        System.out.println("CAMERAS");
        CameraFacade cameraFacade = new CameraFacade();
        cameraFacade.turnOn();
        cameraFacade.turnOff();

/*

        securityProductFactory = new AlarmFactory();
        SecurityProduct securityProductUniversal = securityProductFactory.createProduct(SecurityProductType.UNIVERSAL);

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
