package regulation;

class RegulateHumidity implements Humidity {
    public double regulateTemperature(double currentTemperature) {
        displayRegulatingHumidity();

        return 35.0;
    }

    @Override
    public double regulateHumidity(double humidity) {
        displayRegulatingHumidity();

        return 35.0;
    }
}