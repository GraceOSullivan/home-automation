package Strategy;

import java.util.Scanner;

public class DecreaseTemperature extends Temperature {
    public double changeTemperature(double currentTemperature) {
        display();

        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();

        double newTemperature = (currentTemperature - temperature);
        return newTemperature;
    }
}
