public class AlarmFactory implements SecurityProductFactory {
    public SecurityProduct createProduct(SecurityProductType securityProductType) {
        switch (securityProductType) {
            case UNIVERSAL:
                return new UniversalAlarm();
            default:
                return null;
        }
    }
}
