package Strategy;

public class Context {
    private ITemperature currentTemperature;

    public Context(ITemperature strategy){
        this.currentTemperature = strategy;
    }

    public double executeStrategy(double temperature){
        return currentTemperature.changeTemperature(temperature);
    }
}
