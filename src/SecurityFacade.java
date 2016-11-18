public class SecurityFacade {
    SecurityProductFacade sensorFacade = new SensorFacade();
    SecurityProductFacade cameraFacade = new CameraFacade();
    
    void turnOnSensorsAndCameras() {
        sensorFacade.turnOn();
        cameraFacade.turnOn();
    }

    void turnOffSensorsAndCameras() {
        sensorFacade.turnOff();
        cameraFacade.turnOff();
    }
}
