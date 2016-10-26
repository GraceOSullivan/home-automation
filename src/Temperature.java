import java.util.Scanner;

abstract class Temperature {
    final Scanner scanner = new Scanner(System.in);

    abstract double changeTemperature(double temperature);

    void displayTemperatureQuery(){
        System.out.println("How much would you like to change the temperature by? (°C)");
    }

    void displayChangingTemperature() {
        System.out.println("Changing Temperature...");
    }
}
