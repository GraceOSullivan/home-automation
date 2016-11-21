public class SensorFactory implements SecurityProductFactory {
    public SecurityProduct createProduct(SecurityProductType securityProductType) {
        switch (securityProductType) {
            case BEAM:
                return new Sensor(SecurityProductType.BEAM);
            case CEILING:
                return new Sensor(SecurityProductType.CEILING);
            case CONTACT:
                return new Sensor(SecurityProductType.CONTACT);
            case DOOR:
                return new Sensor(SecurityProductType.DOOR);
            case GLASS:
                return new Sensor(SecurityProductType.GLASS);
            case SMOKE:
                return new Sensor(SecurityProductType.SMOKE);
            case VIBRATION:
                return new Sensor(SecurityProductType.VIBRATION);
            default:
                return null;
        }
    }
}
