abstract class SecurityProduct {
    abstract void turnOn();
    abstract void displayTurningOnQuery();

    public SecurityProductType securityProductType;

    SecurityProductType setSecurityProductType(SecurityProductType securityProductType) {
        this.securityProductType = securityProductType;
        return securityProductType;
    }
}
