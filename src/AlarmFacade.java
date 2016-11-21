class AlarmFacade extends SecurityProductFacade {
    AlarmFacade() {
        setSecurityProductFactoryType(new AlarmFactory());
        SecurityProductFactory alarmFactory = getSecurityProductFactory();

        SecurityProduct securityProductUniversal = alarmFactory.createProduct(SecurityProductType.UNIVERSAL);

        populateIndividualSecurityProductsList(securityProductUniversal);
    }
}
