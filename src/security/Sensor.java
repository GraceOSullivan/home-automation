package security;

import misc.Printer;

class Sensor extends SecurityProduct {
    Sensor(SecurityProductType securityProductType) {
        setSecurityProductType(securityProductType);
    }

    public void turnOn() {
        Printer.getInstance().print("Turning the " + getSecurityProductType().toString() + " sensors on...");
    }

    public void turnOff() {
        Printer.getInstance().print("Turning the " + getSecurityProductType().toString() + " sensors off...");
    }
}
