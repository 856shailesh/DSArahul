package Stack;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(50);
        stack.push(25);
        stack.push(3);
        Stack<Integer> sorted = sortStack(stack);
        System.out.println(sorted);
    }

    private static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempstk = new Stack<Integer>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempstk.isEmpty() && temp < tempstk.peek()) {
                int tt = tempstk.pop();
                stack.push(tt);
            } tempstk.push(temp);
        }
        return tempstk;
    }

}

