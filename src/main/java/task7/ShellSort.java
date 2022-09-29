package main.java.task7;

import java.util.Objects;

public class ShellSort {

    public void sort(int[] arr) {
        Objects.requireNonNull(arr);
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] <= arr[i+1]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i--;
                if (i < 0) {
                    i = 0;
                }
            }
        }
    }
}
