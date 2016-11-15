public class ThermalCamera extends Camera {
    @Override
    void turnOn() {
        setType("thermal");
        displayTurningOnQuery();
    }
}
