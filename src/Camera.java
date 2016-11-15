abstract class Camera implements SecurityProduct {
    public ProductType productType;
    public void displayTurningOnQuery() {
        System.out.println("Turning the " + productType.toString() + " cameras on...");
    }
}