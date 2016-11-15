public class BeamSensor extends Sensor {

    @Override
    public void turnOn() {
        productType = ProductType.BEAM;
        displayTurningOnQuery();
    }
}
