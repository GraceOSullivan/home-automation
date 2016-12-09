package regulation;

import misc.Printer;

public class Thermostat extends Instrument {
    public Thermostat() {
        setLowerBoundary(XMLReader.getInstance().getValue("thermostatLower"));
        setUpperBoundary(XMLReader.getInstance().getValue("thermostatUpper"));
        setCurrentFactorStat(generateRandomDouble(-10.0, 35.0));
        setPerfectFactorStat(XMLReader.getInstance().getValue("thermostatPerfect"));
    }

    @Override
    public void displayCurrentFactorStat() {
        Printer.getInstance().print("Temperature: " + formatToTwoDecimalPlaces(getCurrentFactorStat()) + "°C");
    }
}