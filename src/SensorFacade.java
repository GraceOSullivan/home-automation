import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SensorFacade {
    private SecurityProductFactory securityProductFactory;
    private SecurityProduct securityProductBeam;
    private SecurityProduct securityProductCeiling;
    private SecurityProduct securityProductContact;
    private SecurityProduct securityProductDoor;
    private SecurityProduct securityProductGlass;
    private SecurityProduct securityProductSmoke;
    private SecurityProduct securityProductVibration;
    List<SecurityProduct> securityProductList;


    public SensorFacade() {
        securityProductFactory = new SensorFactory();
        securityProductBeam = securityProductFactory.getProduct(SecurityProductType.BEAM);
        securityProductCeiling = securityProductFactory.getProduct(SecurityProductType.CEILING);
        securityProductContact = securityProductFactory.getProduct(SecurityProductType.CONTACT);
        securityProductDoor = securityProductFactory.getProduct(SecurityProductType.DOOR);
        securityProductGlass = securityProductFactory.getProduct(SecurityProductType.GLASS);
        securityProductSmoke = securityProductFactory.getProduct(SecurityProductType.SMOKE);
        securityProductVibration = securityProductFactory.getProduct(SecurityProductType.VIBRATION);
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
        for (SecurityProduct securityProduct : securityProductList) {
            securityProduct.turnOn();
        }
    }

    public void turnOffSensors() {
        for (SecurityProduct securityProduct : securityProductList) {
            securityProduct.turnOff();
        }
    }
}
