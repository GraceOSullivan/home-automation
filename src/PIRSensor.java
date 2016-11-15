public class PIRSensor extends Sensor  {

    @Override
    public void turnOn() {
        securityProductType.setType("pir");
        displayTurningOnQuery();
    }
}
