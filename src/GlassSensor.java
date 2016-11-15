public class GlassSensor extends Sensor  {

    @Override
    public void turnOn() {
        productType = ProductType.GLASS;
        displayTurningOnQuery();
    }
}
