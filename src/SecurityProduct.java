abstract class SecurityProduct {
    abstract void turnOn();
    abstract void turnOff();
    private boolean wasTriggered = false;

    void setWasTriggered(boolean wasTriggered) {
        this.wasTriggered = wasTriggered;
    }

    boolean wasTriggered() {
        return this.wasTriggered;
    }

    private SecurityProductType securityProductType;

    void setSecurityProductType(SecurityProductType securityProductType) {
        this.securityProductType = securityProductType;
    }

    SecurityProductType getSecurityProductType() {
        return this.securityProductType;
    }

    public String toString() {
        return this.securityProductType.toString();
    }
}
