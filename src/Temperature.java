public abstract class Temperature {
    abstract double changeTemperature(double temperature);
    void temperatureQueryDisplay(){
        System.out.println("How much would you like to change the temperature by? (°C)");
    }
}
