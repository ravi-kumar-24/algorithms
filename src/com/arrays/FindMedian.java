package com.arrays;

import java.util.Arrays;

public class FindMedian {
    public static double findMedian(int a[], int n)
    {
    // First we sort the array
        Arrays.sort(a);

    // check for even case
        if (n % 2 != 0)
            return (double)a[n / 2];
        //1 2 3 4 5 6 7 8
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }

    // Driver program
    public static void main(String args[])
    {
        int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 ,9};
        int n = a.length;
        System.out.println("Median = " + findMedian(a, n));
    }
}
