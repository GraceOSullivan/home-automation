class Context {
    private final Temperature implementation;

    public Context(Temperature strategy) {
        this.implementation = strategy;
    }

    public double executeStrategy(double temperature) {
        return implementation.regulateTemperature(temperature);
    }
}
