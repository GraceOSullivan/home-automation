abstract class Sensor implements SecurityProduct{
    public SecurityProductType securityProductType;
    public void displayTurningOnQuery() {
        System.out.println("Turning the " + securityProductType.toString() + " sensors on...");
    }
}
