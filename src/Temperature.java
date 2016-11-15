interface Temperature {

    double regulateTemperature(double temperature);

    default void displayRegulatingTemperature() {
        System.out.println("Regulating Temperature...");
    }

    default void displayKeepingTemperatureSame(){
        System.out.println("Keeping the temperature the same...");
    }
}
