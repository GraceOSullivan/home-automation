package security;

import misc.Printer;

class Sensor extends SecurityProduct {
    Sensor(SecurityProductType securityProductType) {
        setSecurityProductType(securityProductType);
    }

    public void turnOn() {
        setSecurityProductState(SecurityProductState.ON);
        printChangingState();
    }

    public void turnOff() {
        setSecurityProductState(SecurityProductState.OFF);
        printChangingState();
    }
}
