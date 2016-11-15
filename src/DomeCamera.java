public class DomeCamera extends Camera {
    @Override
    public void turnOn() {
        securityProductType.setType("dome");
        displayTurningOnQuery();
    }
}
