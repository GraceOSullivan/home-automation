public class ThermalCamera extends Camera {
    @Override
    public void turnOn() {
        securityProductType = SecurityProductType.THERMAL;
        displayTurningOnQuery();
    }
}
