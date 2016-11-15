public class MagneticSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("magnetic");
        System.out.println("Turning the " + getType() + " sensors on...");
    }
}
