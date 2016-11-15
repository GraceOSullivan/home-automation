public class GlassSensor extends Sensor  {

    @Override
    public void turnOn() {
        securityProductType.setType("glass");
        displayTurningOnQuery();
    }
}
