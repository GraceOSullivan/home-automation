package security;

import java.util.Observable;

public abstract class SecurityProduct extends Observable {
    abstract void turnOn();
    abstract void turnOff();

    public void setWasTriggered(boolean wasTriggered) {
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
