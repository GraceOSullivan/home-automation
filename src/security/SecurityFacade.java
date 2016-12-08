package security;

import misc.Number;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecurityFacade extends Number {
    private final SecurityProductFacade sensorFacade = new SensorFacade();
    private final SecurityProductFacade cameraFacade = new CameraFacade();

    public SecurityFacade() {
        addAlarmObserversToSecurityProducts();
    }

    public void turnOnSecurity() {
        sensorFacade.turnOn();
        cameraFacade.turnOn();

    }

    public void turnOffSecurity() {
        sensorFacade.turnOff();
        cameraFacade.turnOff();
    }

    private List<SecurityProduct> getSecurityProductsList() {
        List<SecurityProduct> sensorList = sensorFacade.getIndividualSecurityProductsList();
        List<SecurityProduct> cameraList = cameraFacade.getIndividualSecurityProductsList();

        return Stream.concat(sensorList.stream(), cameraList.stream()).collect(Collectors.toList());
    }

    private void addAlarmObserversToSecurityProducts() {
        Alarm alarm = new Alarm();
        List<SecurityProduct> securityProductList = getSecurityProductsList();
        for (SecurityProduct securityProduct : securityProductList) {
            securityProduct.addObserver(alarm);
        }
    }

    public void checkIfAnySecurityProductWasTriggered() {
        getSecurityProductsList().stream().filter(securityProduct -> securityProduct != null)
                .forEach(SecurityFacade::checkIfProductWasTriggered);
    }

    private static void checkIfProductWasTriggered(SecurityProduct securityProduct) {
        int randomNumber = generateRandomInt(1, 25);
        if (randomNumber <= 2) {
            securityProduct.setWasTriggered(true);
        }
    }
}
