package main.java.task6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SequenceToMatrixConverter sequenceToMatrixConverter = new SequenceToMatrixConverter();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        MatrixPrinter matrixPrinter = new MatrixPrinter();
        matrixPrinter.print(sequenceToMatrixConverter.convert(a, 3));
    }
}
