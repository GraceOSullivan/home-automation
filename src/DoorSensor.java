public class DoorSensor extends Sensor {

    @Override
    public void turnOn() {
        setSecurityProductType(SecurityProductType.DOOR);
        displayTurningOnQuery();
    }
}
