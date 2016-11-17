import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class SecurityProductFacade {
    private final List<SecurityProduct> securityProductList = new ArrayList<>();

    void turnOn() {
        securityProductList.forEach(SecurityProduct::turnOn);
    }

    void turnOff() {
        securityProductList.forEach(SecurityProduct::turnOff);
    }

    void populateSecurityProductsList(SecurityProduct... securityProducts) {
        securityProductList.addAll(Arrays.asList(securityProducts));
    }
}
