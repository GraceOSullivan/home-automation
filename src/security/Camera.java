package security;

import misc.Printer;

class Camera extends SecurityProduct {
    Camera(SecurityProductType securityProductType) {
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