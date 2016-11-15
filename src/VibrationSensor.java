public class VibrationSensor extends Sensor  {

    @Override
    public void turnOn() {
        securityProductType.setType("vibration");
        displayTurningOnQuery();
    }
}
