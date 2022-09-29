package main.java.task1;
import static java.lang.Math.*;

public class Calculator {
    public double calculate(double x, double y) {
        return ((1 + pow(sin(x + y), 2)) / (2 + abs(x - (2 * x / (1 + pow(x, 2) * pow(y, 2)))))) + x;
    }
}
