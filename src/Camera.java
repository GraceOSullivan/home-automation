abstract class Camera implements SecurityProduct {
    public SecurityProductType securityProductType;
    public void displayTurningOnQuery() {
        System.out.println("Turning the " + securityProductType.toString() + " cameras on...");
    }
}