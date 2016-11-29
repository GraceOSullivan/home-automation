package regulation;

import misc.Printer;
import misc.Number;

public class Thermostat extends Number {
    private double temperature;

    public Thermostat() {
        temperature = generateRandomDouble(-10.0, 30.0);
    }

    private void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void displayCurrentTemperature() {
        Printer.getInstance().print("Temperature: " + formatToTwoDecimalPlaces(temperature) + "°C");
    }

    public void regulateTemperatureIfNeeded() {
        final double TOO_HOT = 20.0;
        final double TO0_COLD = 10.0;

        Context context;
        if (temperature >= TOO_HOT || temperature <= TO0_COLD)
            context = new Context(new RegulateTemperature());
        else
            context = new Context(new KeepTemperature());

        this.temperature = context.executeStrategy(temperature);
    }
}
