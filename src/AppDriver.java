class AppDriver {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();

        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();

        SecurityProductFactory securityProductFactory;

        securityProductFactory = new SensorFactory();
        securityProductFactory.createProduct("BEAM").turnOn();
        securityProductFactory.createProduct("CEILING").turnOn();
        securityProductFactory.createProduct("CONTACT").turnOn();
        securityProductFactory.createProduct("DOOR").turnOn();
        securityProductFactory.createProduct("GLASS").turnOn();
        securityProductFactory.createProduct("SMOKE").turnOn();
        securityProductFactory.createProduct("VIBRATION").turnOn();

        securityProductFactory = new CameraFactory();
        securityProductFactory.createProduct("BOX").turnOn();
        securityProductFactory.createProduct("DOME").turnOn();
        securityProductFactory.createProduct("IP").turnOn();
        securityProductFactory.createProduct("THERMAL").turnOn();


        //Hygrometer hygrometer = new Hygrometer();
        //hygrometer.displayCurrentHumidity();

    }

}
