public class SmokeSensor extends Sensor  {

    @Override
    public void turnOn() {
        productType = ProductType.SMOKE;
        displayTurningOnQuery();
    }
}
