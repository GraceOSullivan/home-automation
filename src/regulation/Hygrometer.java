package regulation;

import misc.Printer;

public class Hygrometer extends Instrument {
    public Hygrometer() {
        setLowerBoundary(XMLReader.getInstance().getHygrometerLowerBoundary());
        setUpperBoundary(XMLReader.getInstance().getHygrometerUpperBoundary());
        setFactorStat(generateRandomDouble(0.0, 90.0));
        setPerfectFactorStat(35.0);
    }

    @Override
    public void displayCurrentFactorStat() {
        Printer.getInstance().print("Humidity: " + formatToTwoDecimalPlaces(getFactorStat()) + "%");
    }
}