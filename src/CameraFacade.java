class CameraFacade extends SecurityProductFacade{
    CameraFacade() {
        SecurityProductFactory securityProductFactory = new CameraFactory();
        SecurityProduct securityProductBox = securityProductFactory.createProduct(SecurityProductType.BOX);
        SecurityProduct securityProductDome = securityProductFactory.createProduct(SecurityProductType.DOME);
        SecurityProduct securityProductIP = securityProductFactory.createProduct(SecurityProductType.IP);
        SecurityProduct securityProductThermal = securityProductFactory.createProduct(SecurityProductType.THERMAL);

        populateSecurityProductsList(securityProductBox, securityProductDome, securityProductIP, securityProductThermal);
    }
}
