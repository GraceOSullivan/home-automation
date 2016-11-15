abstract class Temperature {

    abstract double changeTemperature(double temperature);

    void displayRegulatingTemperature() {
        System.out.println("Regulating Temperature...");
    }

    void displayKeepingTemperatureSame(){
        System.out.println("Keeping the temperature the same...");
    }
}
