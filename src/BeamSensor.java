public class BeamSensor extends Sensor {

    @Override
    public void turnOn() {
        setSecurityProductType(SecurityProductType.BEAM);
        displayTurningOnQuery();
    }
}
