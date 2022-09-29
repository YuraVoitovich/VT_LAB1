package main.java.task4;

public class Main {
    public static void main(String[] args) {
        ArrayCalculator arrayCalculator = new ArrayCalculator();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayCalculator.findAllPrimeNumbersIndexes(arr).forEach(System.out::println);
    }
}
