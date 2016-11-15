public class DomeCamera extends Camera {
    @Override
    public void turnOn() {
        setSecurityProductType(SecurityProductType.DOME);
        displayTurningOnQuery();
    }
}
