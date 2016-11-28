import java.util.Observable;
import java.util.Observer;

class Alarm extends SecurityProduct implements Observer {
    Alarm() {
        setSecurityProductType(SecurityProductType.UNIVERSAL);
    }

    void turnOn() {
        int soundAlarmCounter = 0;
        try {
            do {
                System.out.println("INTRUDER ALERT...");
                Thread.sleep(1000);
                soundAlarmCounter++;
            } while (soundAlarmCounter < 5);
        } catch (InterruptedException ex) {
            System.out.println("Alarm interrupted.");
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