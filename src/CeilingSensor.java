public class CeilingSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("ceiling");
        System.out.println("Turning the " + getType() + " sensors on...");
    }
}
