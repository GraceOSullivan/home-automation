import java.util.List;

class SecurityFacade {
    private final SecurityProductFacade sensorFacade = new SensorFacade();
    private final SecurityProductFacade cameraFacade = new CameraFacade();
    private final SecurityProductFacade alarmFacade = new AlarmFacade();

    void turnOnSensorsAndCameras() {
        sensorFacade.turnOn();
        cameraFacade.turnOn();
    }

    void turnOffSensorsAndCameras() {
        sensorFacade.turnOff();
        cameraFacade.turnOff();
    }

    void turnOnAlarms() {
        alarmFacade.turnOn();
    }

    void turnOffAlarms() {
        alarmFacade.turnOff();
    }

    List<SecurityProduct> getSecurityProductsList() {
        List<SecurityProduct> securityProductsList = sensorFacade.getSecurityProductsList();
        securityProductsList.addAll(cameraFacade.getSecurityProductsList());
        return  securityProductsList;
    }
}
