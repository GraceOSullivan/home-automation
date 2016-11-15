class AppDriver {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();

        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();

        SecurityProductFactory securityProductFactory;

        ProductType productType = null;

        securityProductFactory = new SensorFactory();
        securityProductFactory.createProduct(productType.BEAM).turnOn();
        securityProductFactory.createProduct(productType.CEILING).turnOn();
        securityProductFactory.createProduct(productType.CONTACT).turnOn();
        securityProductFactory.createProduct(productType.DOOR).turnOn();
        securityProductFactory.createProduct(productType.GLASS).turnOn();
        securityProductFactory.createProduct(productType.SMOKE).turnOn();
        securityProductFactory.createProduct(productType.VIBRATION).turnOn();

        securityProductFactory = new CameraFactory();
        securityProductFactory.createProduct(productType.BOX).turnOn();
        securityProductFactory.createProduct(productType.DOME).turnOn();
        securityProductFactory.createProduct(productType.IP).turnOn();
        securityProductFactory.createProduct(productType.THERMAL).turnOn();


        //Hygrometer hygrometer = new Hygrometer();
        //hygrometer.displayCurrentHumidity();

    }

}
