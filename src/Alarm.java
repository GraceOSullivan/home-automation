import java.util.Observable;
import java.util.Observer;

class Alarm extends SecurityProduct implements Observer {
    Alarm(SecurityProductType securityProductType) {
        setSecurityProductType(securityProductType);
    }

    public void turnOn() {
        int i = 0;
        try {
            do {
                System.out.println("INTRUDER ALERT...");
                Thread.sleep(1000);
                i++;
            } while (i < 5);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void turnOff() {
        System.out.println("Turning the " + getSecurityProductType().toString() + " alarms off...");
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o.toString() + " security product triggered...");
        turnOn();
    }
}