class Context {
    private final Temperature temperature;

    public Context(Temperature strategy) {
        this.temperature = strategy;
    }

    public double executeStrategy(double temperature) {
        return this.temperature.regulateTemperature(temperature);
    }
}
