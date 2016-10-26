public class DecreaseTemperature extends Temperature {
    public double changeTemperature(double currentTemperature) {
        displayTemperatureQuery();

        double temperature = scanner.nextDouble();

        displayChangingTemperature();

        return currentTemperature - temperature;
    }
}
