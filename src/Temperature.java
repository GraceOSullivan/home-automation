interface Temperature {
    double regulateTemperature(double temperature);

    default void displayRegulatingTemperature() {
        Printer.getInstance().print("Regulating Temperature...");
    }

    default void displayKeepingTemperatureSame(){
        Printer.getInstance().print("Keeping the temperature the same...");
    }
}
