package security;

import java.util.Observable;
import java.util.Observer;
import misc.Printer;

class Alarm extends SecurityProduct implements Observer {
    Alarm() {
        setSecurityProductType(SecurityProductType.UNIVERSAL);
    }

    void turnOn() {
        setSecurityProductState(SecurityProductState.ON);
        int soundAlarmCounter = 0;
        try {
            do {
                Printer.getInstance().print("INTRUDER ALERT...");
                Thread.sleep(1000);
                soundAlarmCounter++;
            } while (soundAlarmCounter < 5);
        } catch (InterruptedException ex) {
            Printer.getInstance().print("Alarm interrupted.");
        }
    }

    public void turnOff() {
        setSecurityProductState(SecurityProductState.OFF);
        printChangingState();
    }

    @Override
    public void update(Observable o, Object arg) {
        Printer.getInstance().print(o.toString() + " triggered...");
        turnOn();
    }
}