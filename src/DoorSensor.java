public class DoorSensor extends Sensor {

    @Override
    public void turnOn() {
        productType = ProductType.DOOR;
        displayTurningOnQuery();
    }
}
