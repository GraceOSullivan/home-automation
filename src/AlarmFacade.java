class AlarmFacade extends SecurityProductFacade {
    AlarmFacade() {
        setSecurityProductFactory(new AlarmFactory());
        SecurityProductFactory alarmFactory = getSecurityProductFactory();
        SecurityProduct securityProductUniversal = alarmFactory.createProduct(SecurityProductType.UNIVERSAL);

        populateSecurityProductsList(securityProductUniversal);
    }
}
