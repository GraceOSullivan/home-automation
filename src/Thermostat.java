import java.text.DecimalFormat;

class Thermostat extends GenerateRandomDouble {
    private double temperature;
    private final Hygrometer hygrometer;

    public Thermostat() {
        temperature = generateRandomDouble(-10.0, 30.0);
        hygrometer = new Hygrometer();
    }

    public double getTemperature() {
        return temperature;
    }


    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    private String formatToTwoDecimalPlaces(double number) {
        DecimalFormat decimal = new DecimalFormat("#.00");
        return decimal.format(number);
    }

    public void displayCurrentTemperature(){
        System.out.println("Temperature: " + formatToTwoDecimalPlaces(temperature) + "°C");
        checkTemperatureOK();
    }

    public void displayCurrentHumidity(){
        System.out.println("Humidity: " + formatToTwoDecimalPlaces(hygrometer.getHumidity()) + "%");
        checkHumidityOK();
    }

    private void checkTemperatureOK() {
        final double TOO_HOT = 30.0;
        final double TO0_COLD = 0.0;

        if (temperature >= TOO_HOT)
            System.out.println("-> It seems a bit hot, we recommend you decrease (d) the temperature");
        else if (temperature <= TO0_COLD)
            System.out.println("-> It seems a bit cold, we recommend you increase (i) the temperature");
        else
            System.out.println("-> The temperature seems fine, we recommend you keep it the same");
    }

    private void checkHumidityOK() {
        final double TOO_HUMID = 60.0;
        final double TOO_ARID = 20.0;

        if (hygrometer.getHumidity() >= TOO_HUMID)
            System.out.println("-> It seems a bit humid, we recommend you turn up the ventilation");
        else if (hygrometer.getHumidity() <= TOO_ARID)
            System.out.println("-> It seems a bit arid, we recommend you turn down the ventilation");
        else
            System.out.println("-> The humidity seems fine, we recommend you keep the ventilation levels the same");
    }
}
