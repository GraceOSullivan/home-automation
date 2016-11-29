package regulation;

import misc.Printer;
import misc.Number;

public class Hygrometer extends Number {
    private double humidity;

    Hygrometer() {
        humidity = generateRandomDouble(0.0, 90.0);
    }

    private void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    void displayCurrentHumidity() {
        Printer.getInstance().print("regulation.Humidity: " + formatToTwoDecimalPlaces(humidity) + "%");
    }

    void regulateHumidityIfNeeded() {
        final double TOO_ARID = 20.0;
        final double TO0_HUMID = 70.0;

        Context context;
        //if (humidity >= TOO_ARID || humidity <= TO0_HUMID)
           // context = new Context(new RegulateHumidity());
       // else
           // context = new Context(new KeepHumidity());

       // this.humidity = context.executeStrategy(humidity);
    }
}