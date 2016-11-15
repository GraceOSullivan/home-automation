class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();

        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();

        Sensor beamSensor = new BeamSensor();
        Sensor ceilingSensor = new CeilingSensor();
        Sensor contactSensor = new ContactSensor();
        Sensor doorSensor = new DoorSensor();
        Sensor gasSensor = new GasSensor();
        Sensor glassSensor = new GlassSensor();
        Sensor magneticSensor = new MagneticSensor();
        Sensor pirSensor = new PIRSensor();
        Sensor smokeSensor = new SmokeSensor();
        Sensor vibrationSensor = new VibrationSensor();

        //Hygrometer hygrometer = new Hygrometer();
        //hygrometer.displayCurrentHumidity();

    }

}
