public class BeamSensor extends Sensor {

    @Override
    public void turnOn() {
        securityProductType = SecurityProductType.BEAM;
        displayTurningOnQuery();
    }
}
