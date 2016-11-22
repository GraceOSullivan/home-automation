import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        List<SecurityProduct> sensorList = sensorFacade.getIndividualSecurityProductsList();
        List<SecurityProduct> cameraList = cameraFacade.getIndividualSecurityProductsList();

        return Stream.concat(sensorList.stream(), cameraList.stream()).collect(Collectors.toList());
    }
}
