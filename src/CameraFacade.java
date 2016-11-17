import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CameraFacade {
    private List<SecurityProduct> securityProductList;

    public CameraFacade() {
        SecurityProductFactory securityProductFactory = new CameraFactory();
        SecurityProduct securityProductBox = securityProductFactory.getProduct(SecurityProductType.BOX);
        SecurityProduct securityProductDome = securityProductFactory.getProduct(SecurityProductType.DOME);
        SecurityProduct securityProductIP = securityProductFactory.getProduct(SecurityProductType.IP);
        SecurityProduct securityProductThermal = securityProductFactory.getProduct(SecurityProductType.THERMAL);

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
