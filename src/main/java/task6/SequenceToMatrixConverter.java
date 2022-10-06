package main.java.task6;

import java.util.Arrays;

public class SequenceToMatrixConverter {
    public int[][] convert(int[] arr) {
        int n = arr.length;
        if (n <= 0) {
            throw new SequenceToMatrixConverterException("Matrix dimension is incorrect");
        }
        if (arr.length % n != 0) {
            throw new SequenceToMatrixConverterException("Sequence size is incorrect");
        }

        int[][] matrix = new int[n][n];
        int k;
        for (int i = 0; i < n; i++) {
            k = i;
            for (int j = 0; j < arr.length; j++) {
                matrix[i][j] = arr[k++];
                if (k == arr.length) k = 0;
            }
        }
        return matrix;
    }
}
