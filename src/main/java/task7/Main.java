package main.java.task7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        int[] arr = {3, 1, 2, 6, 5};
        shellSort.sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
