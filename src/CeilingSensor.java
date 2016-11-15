public class CeilingSensor extends Sensor  {
    @Override
    public void turnOn() {
        securityProductType = SecurityProductType.CEILING;
        displayTurningOnQuery();
    }
}
