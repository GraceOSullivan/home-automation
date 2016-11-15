public class IPCamera extends Camera {
    @Override
    public void turnOn() {
        setSecurityProductType(SecurityProductType.IP);
        displayTurningOnQuery();
    }
}
