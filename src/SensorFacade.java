import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SensorFacade {
    private List<SecurityProduct> securityProductList;


    public SensorFacade() {
        SecurityProductFactory securityProductFactory = new SensorFactory();
        SecurityProduct securityProductBeam = securityProductFactory.getProduct(SecurityProductType.BEAM);
        SecurityProduct securityProductCeiling = securityProductFactory.getProduct(SecurityProductType.CEILING);
        SecurityProduct securityProductContact = securityProductFactory.getProduct(SecurityProductType.CONTACT);
        SecurityProduct securityProductDoor = securityProductFactory.getProduct(SecurityProductType.DOOR);
        SecurityProduct securityProductGlass = securityProductFactory.getProduct(SecurityProductType.GLASS);
        SecurityProduct securityProductSmoke = securityProductFactory.getProduct(SecurityProductType.SMOKE);
        SecurityProduct securityProductVibration = securityProductFactory.getProduct(SecurityProductType.VIBRATION);

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
