package Strategy;

public class Context {
    private Temperature currentTemperature;

    public Context(Temperature strategy){
        this.currentTemperature = strategy;
    }

    public double executeStrategy(double temperature){
        return currentTemperature.changeTemperature(temperature);
    }
}
