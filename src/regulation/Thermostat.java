package regulation;

import misc.Printer;

public class Thermostat extends Instrument {
    public Thermostat() {
        setLowerBoundary(XMLReader.getInstance().getThermostatLowerBoundary());
        setUpperBoundary(XMLReader.getInstance().getThermostatUpperBoundary());
        setFactorStat(generateRandomDouble(-10.0, 30.0));
        setPerfectFactorStat(15.0);
    }

    @Override
    public void displayCurrentFactorStat() {
        Printer.getInstance().print("Temperature: " + formatToTwoDecimalPlaces(getFactorStat()) + "°C");
    }
}