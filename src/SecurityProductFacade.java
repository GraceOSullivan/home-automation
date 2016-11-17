import java.util.ArrayList;
import java.util.List;

abstract class SecurityProductFacade {
    List<SecurityProduct> securityProductList = new ArrayList<>();

    void turnOn() {
        securityProductList.forEach(SecurityProduct::turnOn);
    }

    void turnOff() {
        securityProductList.forEach(SecurityProduct::turnOff);
    }

    abstract void populateSecurityProductsList(SecurityProduct [] securityProductsArray);
}
