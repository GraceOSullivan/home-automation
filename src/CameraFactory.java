public class CameraFactory implements SecurityProductFactory {
    public SecurityProduct createProduct(String productType) {
        if (productType.equalsIgnoreCase("BOX"))
            return new BoxCamera();
        else if (productType.equalsIgnoreCase("DOME"))
            return new DomeCamera();
        else if (productType.equalsIgnoreCase("IP"))
            return new IPCamera();
        else if (productType.equalsIgnoreCase("THERMAL"))
            return new ThermalCamera();
        else
            return null;
    }
}
