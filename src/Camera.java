abstract class Camera extends SecurityProduct {
    public void turnOn() {
        System.out.println("Turning the " + getSecurityProductType().toString() + " cameras on...");
    }

    public void turnOff() {
        System.out.println("Turning the " + getSecurityProductType().toString() + " cameras off...");
    }
}