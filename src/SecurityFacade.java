public class SecurityFacade {
    SecurityProductFacade facade;

    void turnOnSensors() {
        facade = new SensorFacade();
        facade.turnOn();
    }

    void turnOffSensors() {
        facade = new SensorFacade();
        facade.turnOff();
    }

    void turnOnCameras() {
        facade = new CameraFacade();
        facade.turnOn();
    }

    void turnOffCameras() {
        facade = new CameraFacade();
        facade.turnOff();
    }
}
