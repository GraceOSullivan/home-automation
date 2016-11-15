public class SmokeSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("smoke");
        System.out.println("Turning the " + getType() + " sensors on...");
    }
}
