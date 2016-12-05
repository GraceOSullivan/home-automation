package misc;

public enum Printer {
    INSTANCE;
    private static Printer instance = null;

    Printer() {
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

    public void print(String text) {
        System.out.println(text);
    }
}