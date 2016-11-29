package security;

import java.util.Observable;
import java.util.Observer;
import misc.Printer;

class Alarm extends SecurityProduct implements Observer {
    Alarm() {
        setSecurityProductType(SecurityProductType.UNIVERSAL);
    }

    void turnOn() {
        int soundAlarmCounter = 0;
        try {
            do {
                Printer.getInstance().print("INTRUDER ALERT...");
                Thread.sleep(1000);
                soundAlarmCounter++;
            } while (soundAlarmCounter < 5);
        } catch (InterruptedException ex) {
            Printer.getInstance().print("security.Alarm interrupted.");
        }
    }

    public void turnOff() {
        Printer.getInstance().print("Turning the " + getSecurityProductType().toString() + " alarms off...");
    }

    @Override
    public void update(Observable o, Object arg) {
        Printer.getInstance().print(o.toString() + " security product triggered...");
        turnOn();
    }
}