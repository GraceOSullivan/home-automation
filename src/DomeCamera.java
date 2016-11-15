public class DomeCamera extends Camera {
    @Override
    public void turnOn() {
        productType = ProductType.DOME;
        displayTurningOnQuery();
    }
}
