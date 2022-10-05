package practice.recursion;

public class factorial1 {


    public static void main(String[] args) {
        int val = fact(5);
        System.out.println(val);
    }

    private static int fact(int i) {
        if (i == 1 || i == 0) return 1;
        return i * fact(i - 1);
    }
}
