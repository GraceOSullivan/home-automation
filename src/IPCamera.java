public class IPCamera extends Camera {
    @Override
    public void turnOn() {
        setType("ip");
        displayTurningOnQuery();
    }
}
