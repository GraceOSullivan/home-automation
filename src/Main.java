class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();

        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();

        Sensor beamSensor = new Sensor("Beam");
        Sensor ceilingSensor = new Sensor("Ceiling");
        Sensor contactSensor = new Sensor("Contact");
        Sensor doorSensor = new Sensor("Door");
        Sensor gasSensor = new Sensor("Gas");
        Sensor glassSensor = new Sensor("Glass");
        Sensor magneticSensor = new Sensor("Magnetic");
        Sensor pirSensor = new Sensor("PIR");
        Sensor smokeSensor = new Sensor("Smoke");
        Sensor vibrationSensor = new Sensor("Vibration");

        //Hygrometer hygrometer = new Hygrometer();
        //hygrometer.displayCurrentHumidity();


    }

}
