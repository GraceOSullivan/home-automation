package regulation;

class KeepHumidity implements Humidity {
    @Override
    public double regulateHumidity(double humidity) {
        displayKeepingHumiditySame();

        return humidity;
    }
}
