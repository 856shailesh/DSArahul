package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {2, 6, 4, 1, 9, 3};
        int end = a.length;

        for (int i = 0; i < end; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j] < a[j - 1]) {
                    int t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
