public class ContactSensor extends Sensor  {

    @Override
    public void turnOn() {
        securityProductType.setType("contact");
        displayTurningOnQuery();
    }
}
