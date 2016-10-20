package Strategy;

public class Main {
    public static void main(String[] args) {
        double temperature = 20.0;

        System.out.println("--- Current Temperature: " + temperature + "°C ---\n");

        Context context = new Context(new IncreaseTemperature());
        temperature = context.executeStrategy(temperature);
        System.out.println("Increasing Temperature...");
        System.out.println("Temperature successfully increased to: " + temperature + "°C\n");

        System.out.println("--- Current Temperature: " + temperature + "°C ---\n");

        context = new Context(new DecreaseTemperature());
        temperature = context.executeStrategy(temperature);
        System.out.println("Decreasing Temperature...");
        System.out.println("Temperature successfully decreased to: " + temperature + "°C");
    }
}
