public class SensorFactory implements SecurityProductFactory {
    public SecurityProduct getProduct(SecurityProductType securityProductType) {
        switch (securityProductType) {
            case BEAM:
                return new BeamSensor();
            case CEILING:
                return new CeilingSensor();
            case CONTACT:
                return new ContactSensor();
            case DOOR:
                return new DoorSensor();
            case GLASS:
                return new GlassSensor();
            case SMOKE:
                return new SmokeSensor();
            case VIBRATION:
                return new VibrationSensor();
            default:
                return null;
        }
    }
}
