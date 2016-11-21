public class SensorFactory implements SecurityProductFactory {
    public SecurityProduct createProduct(SecurityProductType securityProductType) {
        switch (securityProductType) {
            case BEAM:
            case CEILING:
            case CONTACT:
            case DOOR:
            case GLASS:
            case SMOKE:
            case VIBRATION:
                return new Sensor(securityProductType);
            default:
                return null;
        }
    }
}
