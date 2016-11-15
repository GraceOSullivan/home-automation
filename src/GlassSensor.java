public class GlassSensor extends Sensor  {

    @Override
    public void turnOn() {
        securityProductType = SecurityProductType.GLASS;
        displayTurningOnQuery();
    }
}
