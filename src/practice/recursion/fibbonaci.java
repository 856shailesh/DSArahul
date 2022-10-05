package practice.recursion;

public class fibbonaci {

    public static void main(String[] args) {
        int val = fibb(15);
        System.out.println(val);
    }

    private static int fibb(int i) {
        if (i == 1) return 1;
        return i + fibb(i - 1);
    }
}
