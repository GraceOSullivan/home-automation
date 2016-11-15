abstract class Sensor implements SecurityProduct{
    public ProductType productType;
    public void displayTurningOnQuery() {
        System.out.println("Turning the " + productType.toString() + " sensors on...");
    }
}
