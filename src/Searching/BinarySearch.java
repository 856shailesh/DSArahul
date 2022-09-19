package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 7, 9,13};
        int i = BinarySearch(12, a);
        if (i == -1) System.out.println("Element not present");
        else System.out.println("Value present at :" + i);
    }

    private static int BinarySearch(int val, int[] a){
        int left = 0;
        int right = a.length-1;

        while (left <= right){
            int mid = (right+left)/2;
            if(a[mid] == val) return mid;
            else if (a[mid] > val) right = mid-1;
            else left = mid+1;
        }
        return -1;
    }
}
