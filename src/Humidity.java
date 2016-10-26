import java.util.Random;

class Humidity {
    private double humidity;

    public Humidity() {
        humidity = determineHumidity();
    }

    private double determineHumidity(){
        Random random = new Random();
        double minHumidity = 0.0, maxHumidity = 100.0;
        return minHumidity + (maxHumidity - minHumidity) * random.nextDouble();
    }

    public double getHumidity() {
        return humidity;
    }
}
