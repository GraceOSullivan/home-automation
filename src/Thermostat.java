import java.text.DecimalFormat;

class Thermostat extends GenerateRandomDouble{
    private double temperature;
    private final Humidity humidity;

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

    public double getHumidity() {
        return humidity.getHumidity();
    }

    private String formatToTwoDecimalPlaces(double number) {
        DecimalFormat decimal = new DecimalFormat("#.00");
        return decimal.format(number);
    }

    public void displayCurrentTemperature(){
        System.out.println("Temperature: " + formatToTwoDecimalPlaces(temperature) + "°C");
    }

    public void displayCurrentHumidity(){
        System.out.println("Humidity: " + formatToTwoDecimalPlaces(humidity.getHumidity()) + "%");
    }
}
