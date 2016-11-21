import java.util.Observable;

abstract class SecurityProduct extends Observable {
    abstract void turnOn();
    abstract void turnOff();
    private boolean wasTriggered = false;

    void setWasTriggered(boolean wasTriggered) {
        setChanged();
        notifyObservers();
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
