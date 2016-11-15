public class ContactSensor extends Sensor  {
    @Override
    public void turnOn() {
        productType = ProductType.CONTACT;
        displayTurningOnQuery();
    }
}
