public class BoxCamera extends Camera {
    @Override
    public void turnOn() {
        securityProductType.setType("box");
        displayTurningOnQuery();
    }
}
