public class VibrationSensor extends Sensor  {

    @Override
    public void turnOn() {
        setSecurityProductType(SecurityProductType.VIBRATION);
        displayTurningOnQuery();
    }
}
