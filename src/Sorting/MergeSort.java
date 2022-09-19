package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {2, 6, 4, 1, 9, 3};
        sorting(a);
        System.out.println(Arrays.toString(a));

    }

    public static void sorting(int[] a) {
        if (a.length < 2) return;
        int len = a.length;
        int mid = len / 2;
        int left[] = new int[mid];
        int right[] = new int[len - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }
        for (int i = mid; i < len; i++) {
            right[i - mid] = a[i];
        }
        sorting(left);
        sorting(right);
        merge(left, right, a);
    }

    public static void merge(int[] left, int[] right, int[] a) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }
        while (i < left.length) a[k++] = left[i++];
        while (j < right.length) a[k++] = right[j++];
    }
}
