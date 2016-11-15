public class BoxCamera extends Camera {
    @Override
    public void turnOn() {
        productType = ProductType.BOX;
        displayTurningOnQuery();
    }
}
