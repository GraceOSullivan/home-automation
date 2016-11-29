class Printer {
    private static Printer instance = null;

    private Printer() {
    }

    // Lazy instantiation
    public static Printer getInstance() {
        if (instance == null) {
            // Thread Safe. Might be costly operation in some case
            synchronized (Printer.class) {
                if (instance == null) {
                    instance = new Printer();
                }
            }
        }
        return instance;
    }

    public void print(Object text) {
        System.out.println(text);
    }
}