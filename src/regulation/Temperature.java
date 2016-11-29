package regulation;

import misc.Printer;

interface Temperature {
    double regulateTemperature(double temperature);

    default void displayRegulatingTemperature() {
        Printer.getInstance().print("Regulating temperature...");
    }

    default void displayKeepingTemperatureSame() {
        Printer.getInstance().print("Keeping the temperature the same...");
    }
}
