package regulation;

import misc.Printer;

public class Thermostat extends Instrument {
    public Thermostat() {
        setLowerBoundary(10.0);
        setUpperBoundary(20.0);
        setFactorStat(generateRandomDouble(-10.0, 30.0));
    }

    @Override
    public void displayCurrentFactorStat() {
        Printer.getInstance().print("Temperature: " + formatToTwoDecimalPlaces(getFactorStat()) + "°C");
    }

    @Override
    Context determineContext(double lowerBoundary, double upperBoundary) {
        if (getFactorStat() >= lowerBoundary || getFactorStat() <= upperBoundary)
            return new Context(new RegulateTemperature());
        else
            return new Context(new KeepFactorUnchanged());
    }

    @Override
    public void regulateFactorIfNeeded() {
        Context context = determineContext(getLowerBoundary(), getUpperBoundary());
        setFactorStat(context.executeStrategy(getFactorStat()));
    }
}