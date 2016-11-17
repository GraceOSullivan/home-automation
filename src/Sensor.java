abstract class Sensor extends SecurityProduct {
    public void turnOn() {
        System.out.println("Turning the " + getSecurityProductType().toString() + " sensors on...");
    }

    public void turnOff() {
        System.out.println("Turning the " + getSecurityProductType().toString() + " sensors off...");
    }
}
