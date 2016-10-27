class IncreaseTemperature extends Temperature {
    public double changeTemperature(double currentTemperature) {
        displayTemperatureQuery();

        double temperature = scanner.nextDouble();
        scanner.close();

        displayChangingTemperature();

        return currentTemperature + temperature;
    }
}
