public class ThermalCamera extends Camera {
    @Override
    public void turnOn() {
        productType = ProductType.THERMAL;
        displayTurningOnQuery();
    }
}
