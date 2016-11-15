public class DoorSensor extends Sensor {

    @Override
    public void turnOn() {
        setType("door");
        System.out.println("Turning the " + getType() + " sensors on...");
    }
}
