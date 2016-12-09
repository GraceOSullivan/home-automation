package security;

class CameraFactory implements SecurityProductFactory {
    public SecurityProduct createProduct(SecurityProductType securityProductType) {
        switch (securityProductType) {
            case BOX:
            case DOME:
            case IP:
            case THERMAL:
                return new Camera(securityProductType);
            default:
                return null;
        }
    }
}