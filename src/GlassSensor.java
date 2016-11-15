public class GlassSensor extends Sensor  {

    @Override
    public void turnOn() {
        setSecurityProductType(SecurityProductType.GLASS);
        displayTurningOnQuery();
    }
}
