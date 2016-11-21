public class CameraFactory implements SecurityProductFactory {
    public SecurityProduct createProduct(SecurityProductType securityProductType) {
        switch (securityProductType) {
            case BOX:
                return new Camera(SecurityProductType.BOX);
            case DOME:
                return new Camera(SecurityProductType.DOME);
            case IP:
                return new Camera(SecurityProductType.IP);
            case THERMAL:
                return new Camera(SecurityProductType.THERMAL);
            default:
                return null;
        }
    }
}
