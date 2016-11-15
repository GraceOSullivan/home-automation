public class ThermalCamera extends Camera {
    @Override
    public void turnOn() {
        securityProductType.setType("thermal");
        displayTurningOnQuery();
    }
}
