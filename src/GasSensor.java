public class GasSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("gas");
        displayTurningOnQuery();
    }
}
