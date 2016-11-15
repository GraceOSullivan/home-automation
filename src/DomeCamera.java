public class DomeCamera extends Camera {
    @Override
    public void turnOn() {
        setType("dome");
        displayTurningOnQuery();
    }
}
