import java.util.Scanner;

public class IncreaseTemperature extends Temperature {
    public double changeTemperature(double currentTemperature) {
        displayTemperatureQuery();

        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();

        System.out.print("Increasing Temperature...");
        double newTemperature = (currentTemperature + temperature);
        return newTemperature;
    }
}
