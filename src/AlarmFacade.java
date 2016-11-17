public class AlarmFacade extends SecurityProductFacade {
    public AlarmFacade() {
        SecurityProductFactory securityProductFactory = new AlarmFactory();
        SecurityProduct securityProductUniversal = securityProductFactory.createProduct(SecurityProductType.UNIVERSAL);
        SecurityProduct [] securityProductsArray = new SecurityProduct [] {securityProductUniversal};
        populateSecurityProductsList(securityProductsArray);
    }
}
