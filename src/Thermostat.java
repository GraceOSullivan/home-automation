class Thermostat extends Number {
    private double temperature;

    public Thermostat() {
        temperature = generateRandomDouble(-10.0, 30.0);
    }

    public double getTemperature() {
        return temperature;
    }


    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void displayCurrentTemperature(){
        System.out.println("Temperature: " + formatToTwoDecimalPlaces(temperature) + "°C");
    }

    public void regulateTemperatureIfNeeded() {
        final double TOO_HOT = 23.0;
        final double TO0_COLD = 7.0;

        Context context;
        if (temperature >= TOO_HOT || temperature <= TO0_COLD)
            context = new Context(new RegulateTemperature());
        else
            context = new Context(new KeepTemperature());

        setTemperature(context.executeStrategy(getTemperature()));
    }
}
