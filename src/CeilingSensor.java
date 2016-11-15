public class CeilingSensor extends Sensor  {
    @Override
    public void turnOn() {
        productType = ProductType.CEILING;
        displayTurningOnQuery();
    }
}
