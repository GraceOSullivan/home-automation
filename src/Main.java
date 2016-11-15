class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();

        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();
        //Hygrometer hygrometer = new Hygrometer();
        //hygrometer.displayCurrentHumidity();
    }

}
