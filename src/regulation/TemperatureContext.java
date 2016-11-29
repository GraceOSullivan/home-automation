package regulation;

class TemperatureContext {
    private final Temperature temperature;

    TemperatureContext(Temperature strategy) {
        this.temperature = strategy;
    }

    double executeStrategy(double temperature) {
        return this.temperature.regulateTemperature(temperature);
    }
}
