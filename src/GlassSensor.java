public class GlassSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("glass");
        displayTurningOnQuery();
    }
}
