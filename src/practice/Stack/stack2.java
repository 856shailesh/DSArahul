package practice.Stack;

import java.util.Stack;

public class stack2 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(2);
        s.push(4);
        System.out.println(s.peek());
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.isEmpty());

    }
}
