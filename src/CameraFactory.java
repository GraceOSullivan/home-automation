public class CameraFactory implements SecurityProductFactory {
    public SecurityProduct createProduct(ProductType productType) {
        switch (productType) {
            case BOX:
                return new BoxCamera();
            case DOME:
                return new DomeCamera();
            case IP:
                return new IPCamera();
            case THERMAL:
                return new ThermalCamera();
            default:
                return null;
        }
    }
}
