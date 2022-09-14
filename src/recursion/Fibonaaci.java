package recursion;

public class Fibonaaci {

    public static void main(String[] args) {

        System.out.println(fibonaci(8));
    }

    private static int fibonaci(int f) {
        if (f == 0 || f == 1) return f;
        else return fibonaci(f-1) + fibonaci(f - 2);
    }
}
