package main.java.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Calculator {

    static int lis( int arr[], int n )
    {
        int result = 0;
        int[] lis = new int[n];

        /* Initialize LIS values
        for all indexes */
        for (int i = 0; i < n; i++ )
            lis[i] = 1;

        /* Compute optimized LIS
           values in bottom up manner */
        for (int i = 1; i < n; i++ )
            for (int j = 0; j < i; j++ )
                if ( arr[i] > arr[j] &&
                        lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        /* Pick resultimum of
        all LIS values */
        for (int i = 0; i < n; i++ )
            if (result < lis[i])
                result = lis[i];

        return result;
    }

    // function to calculate minimum
    // number of deletions
    public int minimumNumberOfDeletions(int arr[],
                                        int n)
    {
        // Find longest
        // increasing subsequence
        int len = lis(arr, n);

        // After removing elements
        // other than the lis, we get
        // sorted sequence.
        return (n - len);
    }

    // Driver Code
    public static void main (String[] args)
    {

    }

}
