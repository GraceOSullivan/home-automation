class CameraFacade extends SecurityProductFacade{
    public CameraFacade() {
        SecurityProductFactory securityProductFactory = new CameraFactory();
        SecurityProduct securityProductBox = securityProductFactory.createProduct(SecurityProductType.BOX);
        SecurityProduct securityProductDome = securityProductFactory.createProduct(SecurityProductType.DOME);
        SecurityProduct securityProductIP = securityProductFactory.createProduct(SecurityProductType.IP);
        SecurityProduct securityProductThermal = securityProductFactory.createProduct(SecurityProductType.THERMAL);

        SecurityProduct [] securityProductsArray = new SecurityProduct []
                {securityProductBox, securityProductDome, securityProductIP, securityProductThermal};
        populateSecurityProductsList(securityProductsArray);
    }
}
