class Camera extends SecurityProduct {
    Camera(SecurityProductType securityProductType) {
        setSecurityProductType(securityProductType);
    }

    public void turnOn() {
        System.out.println("Turning the " + getSecurityProductType().toString() + " cameras on...");
    }

    public void turnOff() {
        System.out.println("Turning the " + getSecurityProductType().toString() + " cameras off...");
    }
}