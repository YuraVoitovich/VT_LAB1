package main.java.task8;

import java.util.ArrayList;

public class SequenceMerger {

    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = a.size() - 1;
        a.ensureCapacity(a.size() + b.size());
        a.addAll(b);
        int j = b.size() - 1;
        int k = a.size() - 1;

        // if a[i] <= b[j] we set b[j] in a[k]
        // if a[i] > b[j] we set a[i] in a[k]
        while (i >= 0 && j >= 0) {
            Integer aVal = a.get(i);
            Integer bVal = b.get(j);
            if (aVal > bVal) {
                a.set(k, aVal);
                i--;
            } else {
                a.set(k, bVal);
                j--;
            }
            k--;
        }

        //if a ends first
        while (j >= 0) {
            a.set(k, b.get(j));
            j--;
            k--;
        }
    }
}
