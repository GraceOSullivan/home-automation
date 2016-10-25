import java.util.Random;
import java.text.DecimalFormat;

public class Thermostat {
    private double temperature;
    private String temperatureFormatted;

    public Thermostat() {
        temperature = determineTemperature();
        temperatureFormatted = formatTemperature(temperature);
    }

    private double determineTemperature(){
        Random random = new Random();
        double minTemperature = -10.0, maxTemperature = 35.0;
        double randomTemperature = minTemperature + (maxTemperature - minTemperature) * random.nextDouble();
        return randomTemperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getFormattedTemperature() {
        return formatTemperature(temperature);
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    private String formatTemperature(double temperature) {
        DecimalFormat decimal = new DecimalFormat("#.00");
        return decimal.format(temperature);
    }

}
