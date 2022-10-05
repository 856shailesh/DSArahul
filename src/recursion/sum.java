package recursion;

public class sum {
    static int[] arr = {1,2,3,4,5};

    public static void main(String[] args) {
        int sum = 0;
        sum =  SumofDigits(arr.length -1 );
        System.out.println(sum);
    }

    private static int SumofDigits(int n) {
        if(n == 0 ) return arr[n];
        return arr[n] + SumofDigits(n-1);
    }
}
