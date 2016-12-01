package security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class SecurityProductFacade {
    private List<SecurityProduct> securityProductsList;
    private SecurityProductFactory securityProductFactory;

    SecurityProductFactory getSecurityProductFactory() {
        return this.securityProductFactory;
    }

    void setSecurityProductFactoryType(SecurityProductFactory securityProductFactory) {
        this.securityProductFactory = securityProductFactory;
    }

    void populateIndividualSecurityProductsList(SecurityProduct... securityProducts) {
        securityProductsList = new ArrayList<>();
        securityProductsList.addAll(Arrays.asList(securityProducts));
    }

    void turnOn() {
        securityProductsList.forEach(SecurityProduct::turnOn);
    }

    void turnOff() {
        securityProductsList.forEach(SecurityProduct::turnOff);
    }

    List<SecurityProduct> getIndividualSecurityProductsList() {
        return this.securityProductsList;
    }
}
