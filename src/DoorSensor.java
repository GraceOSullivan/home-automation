public class DoorSensor extends Sensor {

    @Override
    public void turnOn() {
        securityProductType = SecurityProductType.DOOR;
        displayTurningOnQuery();
    }
}
