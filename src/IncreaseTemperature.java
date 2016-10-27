import java.util.Scanner;

class IncreaseTemperature extends Temperature {
    public double changeTemperature(double currentTemperature) {
        displayTemperatureQuery();

        final Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        scanner.close();

        displayChangingTemperature();

        return currentTemperature + temperature;
    }
}
