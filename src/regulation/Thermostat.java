package regulation;

import misc.Printer;

public class Thermostat extends Instrument {
    public Thermostat() {
        setLowerBoundary(10.0);
        setUpperBoundary(20.0);
        setFactorStat(generateRandomDouble(-10.0, 30.0));
        setPerfectFactorStat(15.0);
    }

    @Override
    public void displayCurrentFactorStat() {
        Printer.getInstance().print("Temperature: " + formatToTwoDecimalPlaces(getFactorStat()) + "°C");
    }

    @Override
    Context determineContext() {
        if (getFactorStat() >= getLowerBoundary() || getFactorStat() <= getUpperBoundary())
            return new Context(new RegulateFactor());
        else
            return new Context(new KeepFactorUnchanged());
    }

}