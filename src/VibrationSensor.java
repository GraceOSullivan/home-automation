public class VibrationSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("vibration");
        displayTurningOnQuery();
    }
}
