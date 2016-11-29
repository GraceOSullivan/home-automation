package regulation;

import misc.Printer;

interface Humidity {
    double regulateHumidity(double humidity);

    default void displayRegulatingHumidity() {
        Printer.getInstance().print("Regulating humidity...");
    }

    default void displayKeepingHumiditySame(){
        Printer.getInstance().print("Keeping the humidity the same...");
    }
}
