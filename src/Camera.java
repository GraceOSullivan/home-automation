abstract class Camera implements SecurityProduct {
    SecurityProductType securityProductType = new SecurityProductType();
    public void displayTurningOnQuery() {
        System.out.println("Turning the " + securityProductType.getType() + " cameras on...");
    }
}