package Strategy;

public class KeepTemperature extends Temperature{
    public double changeTemperature(double currentTemperature) {
        display();

        return currentTemperature;
    }

    @Override
    void display() {
        System.out.println("Temperature will remain the same");
    }
}
