abstract class Sensor extends SecurityProduct{
    public void displayTurningOnQuery() {
        System.out.println("Turning the " + securityProductType.toString() + " sensors on...");
    }

    public void turnOn() {
        displayTurningOnQuery();
    }
}
