public class DoorSensor extends Sensor {

    @Override
    public void turnOn() {
        securityProductType.setType("door");
        displayTurningOnQuery();
    }
}
