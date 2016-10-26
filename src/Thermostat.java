import java.util.Random;
import java.text.DecimalFormat;

class Thermostat extends GenerateRandomDouble{
    private double temperature;
    private Humidity humidity;

    public Thermostat() {
        temperature = generateRandomDouble(-50.0, 50.0);
        humidity = new Humidity();
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
        System.out.println("--- Current Temperature: " + formatToTwoDecimalPlaces(temperature) + "°C ---");
    }

    public void displayCurrentHumidity(){
        System.out.println("--- Current Humidity: " + formatToTwoDecimalPlaces(humidity.getHumidity()) + "% ---");
    }
}
