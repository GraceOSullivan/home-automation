import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SensorFacade {
    private List<SecurityProduct> securityProductList;


    public SensorFacade() {
        SecurityProductFactory securityProductFactory = new SensorFactory();
        SecurityProduct securityProductBeam = securityProductFactory.createProduct(SecurityProductType.BEAM);
        SecurityProduct securityProductCeiling = securityProductFactory.createProduct(SecurityProductType.CEILING);
        SecurityProduct securityProductContact = securityProductFactory.createProduct(SecurityProductType.CONTACT);
        SecurityProduct securityProductDoor = securityProductFactory.createProduct(SecurityProductType.DOOR);
        SecurityProduct securityProductGlass = securityProductFactory.createProduct(SecurityProductType.GLASS);
        SecurityProduct securityProductSmoke = securityProductFactory.createProduct(SecurityProductType.SMOKE);
        SecurityProduct securityProductVibration = securityProductFactory.createProduct(SecurityProductType.VIBRATION);

        SecurityProduct [] securityProductArray = new SecurityProduct []
                {securityProductBeam, securityProductCeiling, securityProductContact, securityProductDoor,
                        securityProductGlass, securityProductSmoke, securityProductVibration};
        addSensorsToList(securityProductArray);
    }

    private void addSensorsToList(SecurityProduct [] securityProductArray) {
        securityProductList = new ArrayList<>();
        securityProductList.addAll(Arrays.asList(securityProductArray));
    }

    public void turnOnSensors() {
        securityProductList.forEach(SecurityProduct::turnOn);
    }

    public void turnOffSensors() {
        securityProductList.forEach(SecurityProduct::turnOff);
    }
}
