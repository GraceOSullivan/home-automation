import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AppDriver extends Number {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();

        SecurityProductFactory securityProductFactory;

        securityProductFactory = new SensorFactory();
        SecurityProduct securityProductBeam = securityProductFactory.getProduct(SecurityProductType.BEAM);
        SecurityProduct securityProductCeiling = securityProductFactory.getProduct(SecurityProductType.CEILING);
        SecurityProduct securityProductContact = securityProductFactory.getProduct(SecurityProductType.CONTACT);
        SecurityProduct securityProductDoor = securityProductFactory.getProduct(SecurityProductType.DOOR);
        SecurityProduct securityProductGlass = securityProductFactory.getProduct(SecurityProductType.GLASS);
        SecurityProduct securityProductSmoke = securityProductFactory.getProduct(SecurityProductType.SMOKE);
        SecurityProduct securityProductVibration = securityProductFactory.getProduct(SecurityProductType.VIBRATION);

        securityProductFactory = new CameraFactory();
        SecurityProduct securityProductBox = securityProductFactory.getProduct(SecurityProductType.BOX);
        SecurityProduct securityProductDome = securityProductFactory.getProduct(SecurityProductType.DOME);
        SecurityProduct securityProductIP = securityProductFactory.getProduct(SecurityProductType.IP);
        SecurityProduct securityProductThermal = securityProductFactory.getProduct(SecurityProductType.THERMAL);

        SecurityProduct [] securityProductArray = new SecurityProduct [] {securityProductBeam, securityProductCeiling,
                securityProductContact,securityProductDoor, securityProductGlass, securityProductSmoke,
                securityProductVibration, securityProductBox, securityProductDome, securityProductIP, securityProductThermal};
        List<SecurityProduct> securityProductList = new ArrayList<>();
        securityProductList.addAll(Arrays.asList(securityProductArray));

        securityProductFactory = new AlarmFactory();
        SecurityProduct securityProductUniversal = securityProductFactory.getProduct(SecurityProductType.UNIVERSAL);

        for (SecurityProduct securityProduct : securityProductList) {
            if (securityProduct != null) {
                determineIfProductWasTriggered(securityProduct);
            }
        }

        //Hygrometer hygrometer = new Hygrometer();
        //hygrometer.displayCurrentHumidity();

    }

    private static boolean determineIfProductWasTriggered(SecurityProduct securityProduct) {

    }
}
