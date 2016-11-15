public class MagneticSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("magnetic");
        displayTurningOnQuery();
    }
}
