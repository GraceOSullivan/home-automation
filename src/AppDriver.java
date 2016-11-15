class AppDriver {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();

        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();

        SecurityProductFactory securityProductFactory;

        securityProductFactory = new SensorFactory();
        securityProductFactory.createProduct(SecurityProductType.BEAM).turnOn();
        securityProductFactory.createProduct(SecurityProductType.CEILING).turnOn();
        securityProductFactory.createProduct(SecurityProductType.CONTACT).turnOn();
        securityProductFactory.createProduct(SecurityProductType.DOOR).turnOn();
        securityProductFactory.createProduct(SecurityProductType.GLASS).turnOn();
        securityProductFactory.createProduct(SecurityProductType.SMOKE).turnOn();
        securityProductFactory.createProduct(SecurityProductType.VIBRATION).turnOn();

        securityProductFactory = new CameraFactory();
        securityProductFactory.createProduct(SecurityProductType.BOX).turnOn();
        securityProductFactory.createProduct(SecurityProductType.DOME).turnOn();
        securityProductFactory.createProduct(SecurityProductType.IP).turnOn();
        securityProductFactory.createProduct(SecurityProductType.THERMAL).turnOn();


        //Hygrometer hygrometer = new Hygrometer();
        //hygrometer.displayCurrentHumidity();

    }

}
