public class MagneticSensor extends Sensor  {

    @Override
    public void turnOn() {
        securityProductType.setType("magnetic");
        displayTurningOnQuery();
    }
}
