public class IPCamera extends Camera {
    @Override
    public void turnOn() {
        securityProductType.setType("ip");
        displayTurningOnQuery();
    }
}
