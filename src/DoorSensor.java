public class DoorSensor extends Sensor {

    @Override
    public void turnOn() {
        setType("door");
        displayTurningOnQuery();
    }
}
