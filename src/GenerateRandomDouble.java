import java.util.Random;

class GenerateRandomDouble {
    double generateRandomDouble(double min, double max){
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }
}
