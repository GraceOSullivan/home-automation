abstract class Camera extends SecurityProduct {
    public void displayTurningOnQuery() {
        System.out.println("Turning the " + securityProductType.toString() + " cameras on...");
    }

    public void turnOn() {
        displayTurningOnQuery();
    }
}