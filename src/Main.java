import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        Hygrometer hygrometer = new Hygrometer();

        thermostat.displayCurrentTemperature();
        hygrometer.displayCurrentHumidity();

        System.out.println("\nWould you like to increase (i) or decrease (d) the temperature? (Any other key to keep it the same)");

        Scanner scanner = new Scanner(System.in);
        char decision = scanner.next().charAt(0);
        Context context = determineContext(decision);

        try {
            thermostat.setTemperature(context.executeStrategy(thermostat.getTemperature()));
        } catch (InputMismatchException ex) {
            context = new Context(new KeepTemperature());
            thermostat.setTemperature(context.executeStrategy(thermostat.getTemperature()));
        }

        thermostat.displayCurrentTemperature();
    }

    private static Context determineContext(char decision) {
        if (decision == 'i')
            return new Context(new IncreaseTemperature());
        else if (decision == 'd')
            return new Context(new DecreaseTemperature());
        else
            return new Context(new KeepTemperature());
    }
}
