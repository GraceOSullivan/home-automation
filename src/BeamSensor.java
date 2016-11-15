public class BeamSensor extends Sensor {

    @Override
    public void turnOn() {
        securityProductType.setType("beam");
        displayTurningOnQuery();
    }


}
