import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        //Hygrometer hygrometer = new Hygrometer();

        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();
        //thermostat.displayCurrentTemperature();
        //hygrometer.displayCurrentHumidity();

        //System.out.println("\nWould you like to increase (i) or decrease (d) the temperature? (Any other key to keep it the same)");


        /*
        try {
            thermostat.setTemperature(context.executeStrategy(thermostat.getTemperature()));
        } catch (InputMismatchException ex) {
            context = new Context(new KeepTemperature());
            thermostat.setTemperature(context.executeStrategy(thermostat.getTemperature()));
        }

        thermostat.displayCurrentTemperature();
        */
    }

}
