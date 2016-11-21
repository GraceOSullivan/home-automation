class Sensor extends SecurityProduct {
    Sensor(SecurityProductType securityProductType) {
        setSecurityProductType(securityProductType);
    }

    public void turnOn() {
        System.out.println("Turning the " + getSecurityProductType().toString() + " sensors on...");
    }

    public void turnOff() {
        System.out.println("Turning the " + getSecurityProductType().toString() + " sensors off...");
    }
}
