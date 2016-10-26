import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();

        thermostat.displayCurrentTemperature();
        thermostat.displayCurrentHumidity();

        System.out.println("Would you like to increase (i) or decrease (d) the temperature?");

        checkTemperature(thermostat.getTemperature());

        checkHumidity(thermostat.getHumidity());

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

    private static void checkHumidity(double humidity) {
        final double TOO_HUMID = 60.0;
        final double TOO_ARID = 20.0;

        if (humidity >= TOO_HUMID)
            System.out.println("-> It seems a bit humid, we recommend you turn up the ventilation");
        else if (humidity <= TOO_ARID)
            System.out.println("-> It seems a bit arid, we recommend you turn down the ventilation");
        else
            System.out.println("-> The humidity seems fine, we recommend you keep the ventilation levels the same");
    }

    private static void checkTemperature(double temperature) {
        final double TOO_HOT = 30.0;
        final double TO0_COLD = 0.0;

        if (temperature >= TOO_HOT)
            System.out.println("-> It seems a bit hot, we recommend you decrease (d) the temperature");
        else if (temperature <= TO0_COLD)
            System.out.println("-> It seems a bit cold, we recommend you increase (i) the temperature");
        else
            System.out.println("-> The temperature seems fine, we recommend you keep it the same");
    }
}
