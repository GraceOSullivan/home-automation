public class IPCamera extends Camera {
    @Override
    public void turnOn() {
        productType = ProductType.IP;
        displayTurningOnQuery();
    }
}
