package Strategy;

import java.util.Scanner;

public class DecreaseTemperature implements ITemperature {
    public double changeTemperature(double currentTemperature) {
        display();

        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();

        double newTemperature = (currentTemperature - temperature);
        return newTemperature;
    }

    public void display(){
        System.out.println("How much would you like to decrease the temperature by? (°C)");
    }
}
