class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();

        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();

        SensorFactory sensorFactory = new SensorFactory();
        sensorFactory.getSensor("BEAM").turnOn();
        sensorFactory.getSensor("CEILING").turnOn();
        sensorFactory.getSensor("CONTACT").turnOn();
        sensorFactory.getSensor("DOOR").turnOn();
        sensorFactory.getSensor("GAS").turnOn();
        sensorFactory.getSensor("GLASS").turnOn();
        sensorFactory.getSensor("MAGNETIC").turnOn();
        sensorFactory.getSensor("PIR").turnOn();
        sensorFactory.getSensor("SMOKE").turnOn();
        sensorFactory.getSensor("VIBRATION").turnOn();

        //Hygrometer hygrometer = new Hygrometer();
        //hygrometer.displayCurrentHumidity();

    }

}
