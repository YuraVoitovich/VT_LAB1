package main.java.task6;

import java.util.Arrays;

public class SequenceToMatrixConverter {
    public int[][] convert(int[] arr, int n) {
        if (n <= 0) {
            throw new SequenceToMatrixConverterException("Matrix dimension is incorrect");
        }
        if (arr.length % n != 0) {
            throw new SequenceToMatrixConverterException("Sequence size is incorrect");
        }

        int[][] matrix = new int[n][n];
        int k = 0;
        int z = 0;
        for (int i = 0; i < arr.length; i++) {
            matrix[k][z++] = arr[i];
            if (i == (n * (k + 1) - 1)) {
                z = 0;
                k++;
            }
        }
        return matrix;
    }
}
