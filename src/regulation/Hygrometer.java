package regulation;

import misc.Printer;

public class Hygrometer extends Instrument {
    public Hygrometer() {
        setLowerBoundary(25.0);
        setUpperBoundary(40.0);
        setFactorStat(generateRandomDouble(0.0, 90.0));
        setPerfectFactorStat(35.0);
    }

    @Override
    public void displayCurrentFactorStat() {
        Printer.getInstance().print("Humidity: " + formatToTwoDecimalPlaces(getFactorStat()) + "%");
    }

    @Override
    Context determineContext() {
        if (getFactorStat() <= getLowerBoundary() || getFactorStat() >= getUpperBoundary())
            return new Context(new RegulateFactor());
        else
            return new Context(new KeepFactorUnchanged());
    }
}