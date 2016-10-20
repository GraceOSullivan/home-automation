package Strategy;

import java.util.Random;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double currentTemperature = calculateCurrentTemperature();

        DecimalFormat decimal = new DecimalFormat("#.00");
        System.out.println("--- Current Temperature: " + decimal.format(currentTemperature) + "°C ---\n");


        Context context = new Context(new IncreaseTemperature());
        currentTemperature = context.executeStrategy(currentTemperature);

        System.out.println("Increasing Temperature...");
        System.out.println("Temperature successfully increased to: " + currentTemperature + "°C\n");



        System.out.println("--- Current Temperature: " + currentTemperature + "°C ---\n");

        context = new Context(new DecreaseTemperature());
        currentTemperature = context.executeStrategy(currentTemperature);
        System.out.println("Decreasing Temperature...");
        System.out.println("Temperature successfully decreased to: " + currentTemperature + "°C");
    }

    private static double calculateCurrentTemperature(){
        Random random = new Random();
        double maxTemperature = 35.0;
        double minTemperature = -10.0;
        double temperature = minTemperature + (maxTemperature - minTemperature) * random.nextDouble();
        return temperature;
    }
}
