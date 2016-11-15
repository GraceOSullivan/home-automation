public class ContactSensor extends Sensor  {
    @Override
    public void turnOn() {
        securityProductType = SecurityProductType.CONTACT;
        displayTurningOnQuery();
    }
}
