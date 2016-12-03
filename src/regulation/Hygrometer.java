package regulation;

import misc.Printer;

public class Hygrometer extends Instrument {
    public Hygrometer() {
        setLowerBoundary(XMLReader.getInstance().getValue("hygrometerUpper"));
        setUpperBoundary(XMLReader.getInstance().getValue("hygrometerLower"));
        setFactorStat(generateRandomDouble(0.0, 90.0));
        setPerfectFactorStat(XMLReader.getInstance().getValue("hygrometerPerfect"));
    }

    @Override
    public void displayCurrentFactorStat() {
        Printer.getInstance().print("Humidity: " + formatToTwoDecimalPlaces(getFactorStat()) + "%");
    }
}