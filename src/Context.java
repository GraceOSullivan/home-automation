class Context {
    private final Temperature temperature;

    Context(Temperature strategy) {
        this.temperature = strategy;
    }

    double executeStrategy(double temperature) {
        return this.temperature.regulateTemperature(temperature);
    }
}
