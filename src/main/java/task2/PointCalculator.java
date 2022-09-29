package main.java.task2;

public class PointCalculator {
    public boolean calculate(double x, double y) {
        if (y <= 0) {
            if (y >= -3) {
                return x >= -6 && x <= 6;
            } else {
                return false;
            }
        } else {
            if (y <= 5) {
                return x <= 4 && x >= -4;
            } else {
                return false;
            }
        }
    }
}
