package main.java.task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(6, 8, 9));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 3, 5));
        System.out.println(a);
        System.out.println(b);
        SequenceMerger.merge(a, b);
        System.out.println(a);
    }
}
