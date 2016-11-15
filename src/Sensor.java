abstract class Sensor implements SecurityProduct{
    SecurityProductType securityProductType = new SecurityProductType();

    public void displayTurningOnQuery() {
        System.out.println("Turning the " + securityProductType.getType() + " sensors on...");
    }
}
