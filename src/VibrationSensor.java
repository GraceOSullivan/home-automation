public class VibrationSensor extends Sensor  {

    @Override
    public void turnOn() {
        productType = ProductType.VIBRATION;
        displayTurningOnQuery();
    }
}
