import java.util.Scanner;

public class DecreaseTemperature extends Temperature {
    public double changeTemperature(double currentTemperature) {
        temperatureQueryDisplay();

        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();

        System.out.println("Decreasing Temperature...");
        double newTemperature = (currentTemperature - temperature);
        return newTemperature;
    }
}
