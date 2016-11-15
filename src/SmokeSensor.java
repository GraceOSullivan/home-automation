public class SmokeSensor extends Sensor  {

    @Override
    public void turnOn() {
        securityProductType.setType("smoke");
        displayTurningOnQuery();
    }
}
