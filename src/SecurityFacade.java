import java.util.List;

class SecurityFacade {
    private final SecurityProductFacade sensorFacade = new SensorFacade();
    private final SecurityProductFacade cameraFacade = new CameraFacade();

    void turnOnSensorsAndCameras() {
        sensorFacade.turnOn();
        cameraFacade.turnOn();
    }

    void turnOffSensorsAndCameras() {
        sensorFacade.turnOff();
        cameraFacade.turnOff();
    }

    List<SecurityProduct> getSecurityProductsList() {
        List<SecurityProduct> securityProductsList = sensorFacade.getSecurityProductsList();
        securityProductsList.addAll(cameraFacade.getSecurityProductsList());
        return securityProductsList;
    }
}
