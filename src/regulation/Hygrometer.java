package regulation;

import misc.Printer;
import misc.Number;

public class Hygrometer extends Number {
    private double humidity;

    public Hygrometer() {
        humidity = generateRandomDouble(0.0, 90.0);
    }

    public void displayCurrentHumidity() {
        Printer.getInstance().print("Humidity: " + formatToTwoDecimalPlaces(humidity) + "%");
    }

    public void regulateHumidityIfNeeded() {
        final double TOO_ARID = 20.0;
        final double TO0_HUMID = 70.0;

        HumidityContext humidityContext;
        if (humidity >= TOO_ARID || humidity <= TO0_HUMID)
            humidityContext = new HumidityContext(new RegulateHumidity());
        else
           humidityContext = new HumidityContext(new KeepHumidity());

        this.humidity = humidityContext.executeStrategy(humidity);
    }
}