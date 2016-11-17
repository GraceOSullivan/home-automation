class SensorFacade extends SecurityProductFacade{
    public SensorFacade() {
        SecurityProductFactory securityProductFactory = new SensorFactory();
        SecurityProduct securityProductBeam = securityProductFactory.createProduct(SecurityProductType.BEAM);
        SecurityProduct securityProductCeiling = securityProductFactory.createProduct(SecurityProductType.CEILING);
        SecurityProduct securityProductContact = securityProductFactory.createProduct(SecurityProductType.CONTACT);
        SecurityProduct securityProductDoor = securityProductFactory.createProduct(SecurityProductType.DOOR);
        SecurityProduct securityProductGlass = securityProductFactory.createProduct(SecurityProductType.GLASS);
        SecurityProduct securityProductSmoke = securityProductFactory.createProduct(SecurityProductType.SMOKE);
        SecurityProduct securityProductVibration = securityProductFactory.createProduct(SecurityProductType.VIBRATION);

        SecurityProduct [] securityProductsArray = new SecurityProduct []
                {securityProductBeam, securityProductCeiling, securityProductContact, securityProductDoor,
                        securityProductGlass, securityProductSmoke, securityProductVibration};
        populateSecurityProductsList(securityProductsArray);
    }
}
