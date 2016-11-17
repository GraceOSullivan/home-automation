import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AppDriver extends Number {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.displayCurrentTemperature();
        thermostat.regulateTemperatureIfNeeded();
        thermostat.displayCurrentTemperature();

        SensorFacade sensorFacade = new SensorFacade();
        sensorFacade.turnOnSensors();
        sensorFacade.turnOffSensors();
/*
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
                checkIfProductWasTriggered(securityProduct);
                if (securityProduct.wasTriggered()) {
                    System.out.println(securityProduct.getSecurityProductType() + " security product was triggered...");
                    securityProductUniversal.turnOn();
                }
            }
        }
        */
    }

    private static void checkIfProductWasTriggered(SecurityProduct securityProduct) {
        int randomNumber = generateRandomInt(1, 50);
        if (randomNumber == 25) {
            securityProduct.setWasTriggered(true);
        }
    }
}
