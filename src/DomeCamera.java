public class DomeCamera extends Camera {
    @Override
    public void turnOn() {
        securityProductType = SecurityProductType.DOME;
        displayTurningOnQuery();
    }
}
