class Printer {
    private static Printer instance = null;

    private Printer() {
    }

    static Printer getInstance() {
        if (instance == null) {
            synchronized (Printer.class) {
                if (instance == null) {
                    instance = new Printer();
                }
            }
        }
        return instance;
    }

    void print(Object text) {
        System.out.println(text);
    }
}