import java.util.Random;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Thermostat {
    public static void main(String[] args) {
        double currentTemperature = calculateCurrentTemperature();

        DecimalFormat decimal = new DecimalFormat("#.00");
        System.out.println("--- Current Temperature: " + decimal.format(currentTemperature) + "°C ---");
        System.out.println("Would you like to increase (i) or decrease (d) the temperature?");

        Scanner scanner = new Scanner(System.in);
        char decision = scanner.next().charAt(0);

        Context context;
        if (decision == 'i')
            context = new Context(new IncreaseTemperature());

        else if (decision == 'd')
            context = new Context(new DecreaseTemperature());

        else
            context = new Context(new KeepTemperature());

        currentTemperature = context.executeStrategy(currentTemperature);
        System.out.println(decimal.format(currentTemperature));
    }

    private static double calculateCurrentTemperature(){
        Random random = new Random();
        double minTemperature = -10.0, maxTemperature = 35.0;
        double randomTemperature = minTemperature + (maxTemperature - minTemperature) * random.nextDouble();
        return randomTemperature;
    }
}
