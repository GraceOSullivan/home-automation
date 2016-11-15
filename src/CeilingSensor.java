public class CeilingSensor extends Sensor  {
    @Override
    public void turnOn() {
        securityProductType.setType("ceiling");
        displayTurningOnQuery();
    }
}
