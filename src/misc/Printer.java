package misc;

import org.omg.CORBA.PRIVATE_MEMBER;

public enum Printer {
    INSTANCE;
    private static Printer instance = null;

    private Printer() {
    }

    public static Printer getInstance() {
        if (instance == null) {
            synchronized (Printer.class) {
                if (instance == null) {
                    instance = Printer.INSTANCE;
                }
            }
        }
        return instance;
    }

    public void print(Object text) {
        System.out.println(text);
    }
}