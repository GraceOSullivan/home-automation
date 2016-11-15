public class ContactSensor extends Sensor  {

    @Override
    public void turnOn() {
        setType("contact");
        displayTurningOnQuery();
    }
}
