import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();

        thermostat.displayCurrentTemperature();
        thermostat.displayCurrentHumidity();


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

        thermostat.setTemperature(context.executeStrategy(thermostat.getTemperature()));

        thermostat.displayCurrentTemperature();


    }

}
