package security;

import misc.Printer;

import java.util.Observable;

public abstract class SecurityProduct extends Observable {
    private SecurityProductType securityProductType;
    private SecurityProductState securityProductState;

    abstract void turnOn();
    abstract void turnOff();

    public void setWasTriggered(boolean wasTriggered) {
        if (wasTriggered) {
            setChanged();
            notifyObservers();
        }
    }

    void setSecurityProductType(SecurityProductType securityProductType) {
        this.securityProductType = securityProductType;
    }

    void setSecurityProductState(SecurityProductState securityProductState) {
        this.securityProductState = securityProductState;
    }

    SecurityProductState getSecurityProductState() {
        return this.securityProductState;
    }

    SecurityProductType getSecurityProductType() {
        return this.securityProductType;
    }

    void printChangingState() {
        Printer.getInstance().print("Turning the " + getSecurityProductType().toString() + " " + getClass().getSimpleName() + " " + getSecurityProductState() + "...");
    }

    public String toString() {
        return this.securityProductType.toString();
    }
}
