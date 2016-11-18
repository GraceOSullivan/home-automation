class CameraFacade extends SecurityProductFacade{
    CameraFacade() {
        setSecurityProductFactory(new CameraFactory());
        SecurityProductFactory cameraFactory = getSecurityProductFactory();
        SecurityProduct securityProductBox = cameraFactory.createProduct(SecurityProductType.BOX);
        SecurityProduct securityProductDome = cameraFactory.createProduct(SecurityProductType.DOME);
        SecurityProduct securityProductIP = cameraFactory.createProduct(SecurityProductType.IP);
        SecurityProduct securityProductThermal = cameraFactory.createProduct(SecurityProductType.THERMAL);

        populateSecurityProductsList(securityProductBox, securityProductDome, securityProductIP, securityProductThermal);
    }
}
