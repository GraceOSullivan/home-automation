public class KeepTemperature extends Temperature {
    public double changeTemperature(double currentTemperature) {
        displayTemperatureQuery();

        return currentTemperature;
    }

    @Override
    void displayTemperatureQuery() {
        System.out.println("Temperature will remain the same");
    }
}
