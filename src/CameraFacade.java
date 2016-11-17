import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CameraFacade {
    private List<SecurityProduct> securityProductList;

    public CameraFacade() {
        SecurityProductFactory securityProductFactory = new CameraFactory();
        SecurityProduct securityProductBox = securityProductFactory.createProduct(SecurityProductType.BOX);
        SecurityProduct securityProductDome = securityProductFactory.createProduct(SecurityProductType.DOME);
        SecurityProduct securityProductIP = securityProductFactory.createProduct(SecurityProductType.IP);
        SecurityProduct securityProductThermal = securityProductFactory.createProduct(SecurityProductType.THERMAL);

        SecurityProduct [] securityProductArray = new SecurityProduct []
                {securityProductBox, securityProductDome, securityProductIP, securityProductThermal};
        addCamerasToList(securityProductArray);
    }

    private void addCamerasToList(SecurityProduct [] securityProductArray) {
        securityProductList = new ArrayList<>();
        securityProductList.addAll(Arrays.asList(securityProductArray));
    }

    public void turnOnCameras() {
        securityProductList.forEach(SecurityProduct::turnOn);
    }

    public void turnOffCameras() {
        securityProductList.forEach(SecurityProduct::turnOff);
    }
}
