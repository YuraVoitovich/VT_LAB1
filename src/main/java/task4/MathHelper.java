package main.java.task4;

public class MathHelper {
    public static boolean isPrime(int x) {
        if (x <= 0) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
