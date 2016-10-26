import java.util.Random;
import java.text.DecimalFormat;

class Thermostat {
    private double temperature;

    public Thermostat() {
        temperature = determineTemperature();
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

    private String formatTemperature(double temperature) {
        DecimalFormat decimal = new DecimalFormat("#.00");
        return decimal.format(temperature);
    }

    public void displayCurrentTemperature(){
        System.out.println("--- Current Temperature: " + formatTemperature(temperature) + "°C ---");
    }

}
