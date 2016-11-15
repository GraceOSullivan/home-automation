public class ThermalCamera extends Camera {
    @Override
    public void turnOn() {
        setSecurityProductType(SecurityProductType.THERMAL);
        displayTurningOnQuery();
    }
}
