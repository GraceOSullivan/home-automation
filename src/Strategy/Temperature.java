package Strategy;

public abstract class Temperature {
    abstract double changeTemperature(double temperature);
    void display(){
        System.out.println("How much would you like to change the temperature by? (°C)");
    }
}
