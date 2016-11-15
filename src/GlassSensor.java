public class GlassSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("glass");
        System.out.println("Turning the " + getType() + " sensors on...");
    }
}
