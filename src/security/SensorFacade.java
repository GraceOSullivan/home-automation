package security;

class SensorFacade extends SecurityProductFacade {
    SensorFacade() {
        setSecurityProductFactoryType(new SensorFactory());
        SecurityProductFactory sensorFactory = getSecurityProductFactory();

        SecurityProduct securityProductBeam = sensorFactory.createProduct(SecurityProductType.BEAM);
        SecurityProduct securityProductCeiling = sensorFactory.createProduct(SecurityProductType.CEILING);
        SecurityProduct securityProductContact = sensorFactory.createProduct(SecurityProductType.CONTACT);
        SecurityProduct securityProductDoor = sensorFactory.createProduct(SecurityProductType.DOOR);
        SecurityProduct securityProductGlass = sensorFactory.createProduct(SecurityProductType.GLASS);
        SecurityProduct securityProductSmoke = sensorFactory.createProduct(SecurityProductType.SMOKE);
        SecurityProduct securityProductVibration = sensorFactory.createProduct(SecurityProductType.VIBRATION);

        populateSecurityProductsList(securityProductBeam, securityProductCeiling, securityProductContact,
                securityProductDoor, securityProductGlass, securityProductSmoke, securityProductVibration);
    }
}