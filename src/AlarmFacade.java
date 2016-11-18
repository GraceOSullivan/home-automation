class AlarmFacade extends SecurityProductFacade {
    AlarmFacade() {
        setSecurityProductFactoryType(new AlarmFactory());
        SecurityProductFactory alarmFactory = getSecurityProductFactoryType();

        SecurityProduct securityProductUniversal = alarmFactory.createProduct(SecurityProductType.UNIVERSAL);

        populateIndividualSecurityProductsList(securityProductUniversal);
    }
}
