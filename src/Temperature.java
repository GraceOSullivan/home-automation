public abstract class Temperature {
    abstract double changeTemperature(double temperature);
    void displayTemperatureQuery(){
        System.out.println("How much would you like to change the temperature by? (°C)");
    }
}
