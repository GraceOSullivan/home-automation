public class KeepTemperature extends Temperature {
    public double changeTemperature(double currentTemperature) {
        temperatureQueryDisplay();
        return currentTemperature;
    }

    @Override
    void temperatureQueryDisplay() {
        System.out.println("Temperature will remain the same");
    }
}
