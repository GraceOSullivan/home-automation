public class BeamSensor extends Sensor {

    @Override
    public void turnOn() {
        setType("beam");
        displayTurningOnQuery();
    }


}
