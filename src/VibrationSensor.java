public class VibrationSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("vibration");
        System.out.println("Turning the " + getType() + " sensors on...");
    }
}
