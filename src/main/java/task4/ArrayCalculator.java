package main.java.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class ArrayCalculator {
    public List<Integer> findAllPrimeNumbersIndexes(int[] arr) {
        Objects.requireNonNull(arr);
        List<Integer> indexes = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (MathHelper.isPrime(arr[i])) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
