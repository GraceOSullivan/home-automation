class AlarmFacade extends SecurityProductFacade {
    AlarmFacade() {
        SecurityProductFactory securityProductFactory = new AlarmFactory();
        SecurityProduct securityProductUniversal = securityProductFactory.createProduct(SecurityProductType.UNIVERSAL);

        populateSecurityProductsList(securityProductUniversal);
    }
}
