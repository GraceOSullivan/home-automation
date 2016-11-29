package regulation;

class HumidityContext {
    private final Humidity humidity;

    HumidityContext(Humidity strategy) {
        this.humidity = strategy;
    }

    double executeStrategy(double humidity) {
        return this.humidity.regulateHumidity(humidity);
    }
}
