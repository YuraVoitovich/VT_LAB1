package main.java.task5;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] arr = {30, 40, 2, 5, 1,
                7, 45, 50, 8};
        int n = arr.length;
        System.out.println("Minimum number of" +
                " deletions = " +
                calculator.minimumNumberOfDeletions(arr, n));
    }
}
