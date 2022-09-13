package recursion;

//Factorial code using recursive method
public class Factorial {

    public static void main(String[] args) {
        int fact = 0;
        int sum = factorial(fact);
        System.out.println(sum);
    }

    private static int factorial(int n){

        if(n == 0 || n == 1) return 1;
        else {
            return n*factorial(n-1);
        }
    }
}
