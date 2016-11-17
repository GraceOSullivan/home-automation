public class AlarmFactory implements SecurityProductFactory {
    public SecurityProduct getProduct(SecurityProductType securityProductType) {
        switch (securityProductType) {
            case UNIVERSAL:
                return new UniversalAlarm();
            default:
                return null;
        }
    }
}
