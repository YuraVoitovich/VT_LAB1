package main.java.task3;

import main.java.task3.exception.FunctionCalculatorException;

public class FunctionCalculator {
    public void printFunctionResultAsTable(double a, double b, double h) {
        if (b <= a) {
            throw new FunctionCalculatorException("b must be greater than a");
        }
        if (h <= 0) {
            throw new FunctionCalculatorException("h must be greater than 0");
        }

        double i = a;
        while (i <= b) {
            System.out.println(String.format("f(x)=%.2f|x=%.2f", Math.tan(i), i));
            i += h;
        }
    }
}
