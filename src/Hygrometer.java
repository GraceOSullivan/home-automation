class Hygrometer extends Number {
    private final double humidity;

    public Hygrometer() {
        humidity = generateRandomDouble(0.0, 100.0);
    }

    public double getHumidity() {
        return humidity;
    }


    public void displayCurrentHumidity(){
        System.out.println("Humidity: " + formatToTwoDecimalPlaces(getHumidity()) + "%");
        checkHumidityOK();
    }

    private void checkHumidityOK() {
        final double TOO_HUMID = 60.0;
        final double TOO_ARID = 20.0;

        if (getHumidity() >= TOO_HUMID)
            System.out.println("-> It seems a bit humid, we recommend you turn up the ventilation");
        else if (getHumidity() <= TOO_ARID)
            System.out.println("-> It seems a bit arid, we recommend you turn down the ventilation");
        else
            System.out.println("-> The humidity seems fine, we recommend you keep the ventilation levels the same");
    }
}