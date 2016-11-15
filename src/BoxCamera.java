public class BoxCamera extends Camera {
    @Override
    public void turnOn() {
        securityProductType = SecurityProductType.BOX;
        displayTurningOnQuery();
    }
}
