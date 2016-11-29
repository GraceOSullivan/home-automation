package security;

import misc.Printer;

class Camera extends SecurityProduct {
    Camera(SecurityProductType securityProductType) {
        setSecurityProductType(securityProductType);
    }

    public void turnOn() {
        Printer.getInstance().print("Turning the " + getSecurityProductType().toString() + " cameras on...");
    }

    public void turnOff() {
        Printer.getInstance().print("Turning the " + getSecurityProductType().toString() + " cameras off...");
    }
}