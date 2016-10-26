import java.util.Random;

class Humidity extends GenerateRandomDouble {
    private double humidity;

    public Humidity() {
        humidity = generateRandomDouble(0.0, 100.0);
    }

    public double getHumidity() {
        return humidity;
    }
}
