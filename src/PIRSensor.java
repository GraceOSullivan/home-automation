public class PIRSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("pir");
        displayTurningOnQuery();
    }
}
