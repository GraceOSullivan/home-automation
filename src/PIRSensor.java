public class PIRSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("pir");
        System.out.println("Turning the " + getType() + " sensors on...");
    }
}
