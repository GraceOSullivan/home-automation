public class ContactSensor extends Sensor  {
    @Override
    public void turnOn() {
        setSecurityProductType(SecurityProductType.CONTACT);
        displayTurningOnQuery();
    }
}
