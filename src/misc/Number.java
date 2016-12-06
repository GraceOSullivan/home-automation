package misc;

import java.text.DecimalFormat;
import java.util.Random;

public abstract class Number {
    private static final Random random = new Random();

    static protected double generateRandomDouble(double min, double max){
        return min + (max - min) * random.nextDouble();
    }

    static int generateRandomInt(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    protected String formatToTwoDecimalPlaces(double number) {
        return new DecimalFormat("#.00").format(number);
    }
}
