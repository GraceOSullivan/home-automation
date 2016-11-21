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

    void turnOn() {
        securityProductsList.forEach(SecurityProduct::turnOn);
    }

    void turnOff() {
        securityProductsList.forEach(SecurityProduct::turnOff);
    }

    void populateIndividualSecurityProductsList(SecurityProduct... securityProducts) {
        securityProductsList = new ArrayList<>();
        securityProductsList.addAll(Arrays.asList(securityProducts));
    }

    List<SecurityProduct> getSecurityProductsList() {
        return this.securityProductsList;
    }
}
