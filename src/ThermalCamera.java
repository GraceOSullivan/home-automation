public class ThermalCamera extends Camera {
    @Override
    public void turnOn() {
        setType("thermal");
        displayTurningOnQuery();
    }
}
