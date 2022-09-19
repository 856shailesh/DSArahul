package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {2, 6, 4, 1, 9, 3};
        int end = a.length;

        for (int i = 0; i < end; i++) {
            for (int j = i; j < end; j++) {
                if (a[j] < a[i]) {
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
