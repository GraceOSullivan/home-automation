package misc;

import java.text.DecimalFormat;
import java.util.Random;

public abstract class Number {
    protected double generateRandomDouble(double min, double max){
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    protected String formatToTwoDecimalPlaces(double number) {
        return new DecimalFormat("#.00").format(number);
    }

    static int generateRandomInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}
