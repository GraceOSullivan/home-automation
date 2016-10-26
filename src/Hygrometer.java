class Hygrometer extends GenerateRandomDouble {
    private final double humidity;

    public Hygrometer() {
        humidity = generateRandomDouble(0.0, 100.0);
    }

    public double getHumidity() {
        return humidity;
    }
}
