public class AlarmFactory implements SecurityProductFactory {
    public SecurityProduct createProduct(SecurityProductType securityProductType) {
        switch (securityProductType) {
            case UNIVERSAL:
                return new Alarm(SecurityProductType.UNIVERSAL);
            default:
                return null;
        }
    }
}
