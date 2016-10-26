import java.text.DecimalFormat;

class Thermostat extends GenerateRandomDouble{
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

    public double getHumidity() {
        return hygrometer.getHumidity();
    }

    private String formatToTwoDecimalPlaces(double number) {
        DecimalFormat decimal = new DecimalFormat("#.00");
        return decimal.format(number);
    }

    public void displayCurrentTemperature(){
        System.out.println("Temperature: " + formatToTwoDecimalPlaces(temperature) + "°C");
    }

    public void displayCurrentHumidity(){
        System.out.println("Humidity: " + formatToTwoDecimalPlaces(hygrometer.getHumidity()) + "%");
    }
}
