public class ContactSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("contact");
        System.out.println("Turning the " + getType() + " sensors on...");
    }
}
