package recursion;

public class Recursion_1 {
    static int[] arr = {2,12,33,45,43};

    public static void main(String[] args) {
        int value = sumOfDigit(arr.length-1);
        System.out.println(value);
    }

    private static int sumOfDigit(int n) {
        if(n == 0) return n;
        return arr[n] + sumOfDigit(n-1);

    }
}
