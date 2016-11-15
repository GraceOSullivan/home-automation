public class GasSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("gas");
        System.out.println("Turning the " + getType() + " sensors on...");
    }
}
