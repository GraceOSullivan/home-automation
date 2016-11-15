public class IPCamera extends Camera {
    @Override
    void turnOn() {
        setType("ip");
        displayTurningOnQuery();
    }
}
