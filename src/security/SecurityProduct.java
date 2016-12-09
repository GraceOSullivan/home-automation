package security;

import misc.Printer;

import java.util.Observable;

public abstract class SecurityProduct extends Observable {
    private SecurityProductType securityProductType;
    private SecurityProductState securityProductState;

    void turnOn() {
        setSecurityProductState(SecurityProductState.ON);
        printChangingState();
    }

    void turnOff() {
        setSecurityProductState(SecurityProductState.OFF);
        printChangingState();
    }

    private void printChangingState() {
        Printer.getInstance().print("Turning the " + getSecurityProductType().toString() + " " +
                getClass().getSimpleName() + " " + getSecurityProductState() + "...");
    }

    void setWasTriggered(boolean wasTriggered) {
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

    private SecurityProductState getSecurityProductState() {
        return this.securityProductState;
    }

    private SecurityProductType getSecurityProductType() {
        return this.securityProductType;
    }

    public String toString() {
        return this.securityProductType.toString();
    }
}