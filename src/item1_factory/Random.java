package item1_factory;

public class Random {
    private static double random;
//    private int random;

    public Random() {
    }

    public Random(int num) {
        Math.random();
    }

    public static double getRandom() {
        return random;
    }

    public static void maxRandom(double max) {
        double num = Math.random();
        if (num < max) {
            random = num;
        } else {
            maxRandom(max);
        }
    }

}
