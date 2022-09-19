package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 6, 11};
        int i = LinearSearch(10, a);
        if (i == -1) System.out.println("Element not present");
        else System.out.println("Value present at :" + i);
    }

    private static int LinearSearch(int val, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (val == a[i]) return i;
        }
        return -1;
    }
}
