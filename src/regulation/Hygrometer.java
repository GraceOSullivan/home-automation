package regulation;

import misc.Printer;

public class Hygrometer extends Instrument {
    public Hygrometer() {
        setLowerBoundary(20.0);
        setUpperBoundary(70.0);
        setFactorStat(generateRandomDouble(0.0, 90.0));
    }

    @Override
    public void displayCurrentFactorStat() {
        Printer.getInstance().print("Humidity: " + formatToTwoDecimalPlaces(getFactorStat()) + "%");
    }

    @Override
    Context determineContext(double lowerBoundary, double upperBoundary) {
        if (getFactorStat() >= lowerBoundary || getFactorStat() <= upperBoundary)
            return new Context(new RegulateHumidity());
        else
            return new Context(new KeepFactorUnchanged());
    }

    @Override
    public void regulateFactorIfNeeded() {
        Context context = determineContext(getLowerBoundary(), getUpperBoundary());
        setFactorStat(context.executeStrategy(getFactorStat()));
    }
}