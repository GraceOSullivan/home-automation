import java.util.Random;
import java.text.DecimalFormat;

class Thermostat {
    private double temperature;
    private Humidity humidity;

    public Thermostat() {
        temperature = determineTemperature();
        humidity = new Humidity();
    }

    private double determineTemperature(){
        Random random = new Random();
        double minTemperature = -10.0, maxTemperature = 35.0;
        return minTemperature + (maxTemperature - minTemperature) * random.nextDouble();
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
