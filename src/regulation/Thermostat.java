package regulation;

import misc.Printer;

public class Thermostat extends Instrument {
    public Thermostat() {
        setLowerBoundary(XMLReader.getInstance().getValue("thermostatUpper"));
        setUpperBoundary(XMLReader.getInstance().getValue("thermostatPerfect"));
        setFactorStat(generateRandomDouble(-10.0, 35.0));
        setPerfectFactorStat(XMLReader.getInstance().getValue("thermostatLower"));
    }

    @Override
    public void displayCurrentFactorStat() {
        Printer.getInstance().print("Temperature: " + formatToTwoDecimalPlaces(getFactorStat()) + "°C");
    }
}