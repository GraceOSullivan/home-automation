package regulation;

import misc.Printer;
import misc.Number;

public class Thermostat extends Number {
    private double temperature;

    public Thermostat() {
        temperature = generateRandomDouble(-10.0, 30.0);
    }

    public void displayCurrentTemperature() {
        Printer.getInstance().print("Temperature: " + formatToTwoDecimalPlaces(temperature) + "°C");
    }

    public void regulateTemperatureIfNeeded() {
        final double TOO_HOT = 20.0;
        final double TO0_COLD = 10.0;

        TemperatureContext temperatureContext;
        if (temperature >= TOO_HOT || temperature <= TO0_COLD)
            temperatureContext = new TemperatureContext(new RegulateTemperature());
        else
            temperatureContext = new TemperatureContext(new KeepTemperature());

        this.temperature = temperatureContext.executeStrategy(temperature);
    }
}