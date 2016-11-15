public class DomeCamera extends Camera {
    @Override
    void turnOn() {
        setType("dome");
        displayTurningOnQuery();
    }
}
