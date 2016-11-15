public class BoxCamera extends Camera {
    @Override
    public void turnOn() {
        setSecurityProductType(SecurityProductType.BOX);
        displayTurningOnQuery();
    }
}
