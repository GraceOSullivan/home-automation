public class GasSensor extends Sensor  {

    @Override
    public void turnOn() {
        securityProductType.setType("gas");
        displayTurningOnQuery();
    }
}
