public class BoxCamera extends Camera {
    @Override
    public void turnOn() {
        setType("box");
        displayTurningOnQuery();
    }
}
