interface Humidity {
    double regulateHumidity(double humidity);

    default void displayRegulatingHumidity() {
        Printer.getInstance().print("Regulating Temperature...");
    }

    default void displayKeepingHumiditySame(){
        Printer.getInstance().print("Keeping the temperature the same...");
    }
}
