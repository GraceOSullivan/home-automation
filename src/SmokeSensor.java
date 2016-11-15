public class SmokeSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("smoke");
        displayTurningOnQuery();
    }
}
