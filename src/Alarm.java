abstract class Alarm extends SecurityProduct {
    public void turnOn() {
        System.out.println("Turning the " + getSecurityProductType().toString() + " alarms on...");
    }

    public void turnOff() {
        System.out.println("Turning the " + getSecurityProductType().toString() + " alarms off...");
    }
}