public class BoxCamera extends Camera {
    @Override
    void turnOn() {
        setType("box");
        displayTurningOnQuery();
    }
}
