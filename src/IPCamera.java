public class IPCamera extends Camera {
    @Override
    public void turnOn() {
        securityProductType = SecurityProductType.IP;
        displayTurningOnQuery();
    }
}
