public class Context {
    private Temperature implementation;

    public Context(Temperature strategy) {
        this.implementation = strategy;
    }

    public double executeStrategy(double temperature) {
        return implementation.changeTemperature(temperature);
    }
}
