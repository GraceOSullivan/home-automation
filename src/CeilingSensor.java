public class CeilingSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("ceiling");
        displayTurningOnQuery();
    }
}
