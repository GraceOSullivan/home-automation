package regulation;

import misc.Printer;

interface Factor {
    double regulateFactorIfNeeded(Instrument instrument);

    default void displayRegulatingFactor() {
        Printer.getInstance().print("Regulating...");
    }

    default void displayFactorUnchanged() {
        Printer.getInstance().print("Keeping this the same...");
    }
}
