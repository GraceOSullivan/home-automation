public class SmokeSensor extends Sensor  {

    @Override
    public void turnOn() {
        setSecurityProductType(SecurityProductType.SMOKE);
        displayTurningOnQuery();
    }
}
