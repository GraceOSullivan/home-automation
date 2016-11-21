import java.util.Observable;

abstract class SecurityProduct extends Observable {
    abstract void turnOn();
    abstract void turnOff();

    void setWasTriggered(boolean wasTriggered) {
        if (wasTriggered) {
            setChanged();
            notifyObservers();
        }
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
