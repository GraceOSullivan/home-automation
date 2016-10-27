import java.text.DecimalFormat;

class Thermostat extends Double {
    private double temperature;

    public Thermostat() {
        temperature = generateRandomDouble(-10.0, 30.0);
    }

    public double getTemperature() {
        return temperature;
    }


    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void displayCurrentTemperature(){
        System.out.println("Temperature: " + formatToTwoDecimalPlaces(temperature) + "°C");
        checkTemperatureOK();
    }

    private void checkTemperatureOK() {
        final double TOO_HOT = 30.0;
        final double TO0_COLD = 0.0;

        if (temperature >= TOO_HOT)
            System.out.println("-> It seems a bit hot, we recommend you decrease (d) the temperature");
        else if (temperature <= TO0_COLD)
            System.out.println("-> It seems a bit cold, we recommend you increase (i) the temperature");
        else
            System.out.println("-> The temperature seems fine, we recommend you keep it the same");
    }


}
