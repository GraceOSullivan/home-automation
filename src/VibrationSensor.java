public class VibrationSensor extends Sensor  {

    @Override
    public void turnOn() {
        securityProductType = SecurityProductType.VIBRATION;
        displayTurningOnQuery();
    }
}
