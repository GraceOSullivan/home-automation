public class IncreaseTemperature extends Temperature {
    public double changeTemperature(double currentTemperature) {
        displayTemperatureQuery();

        double temperature = scanner.nextDouble();

        displayChangingTemperature();

        return currentTemperature + temperature;
    }
}
