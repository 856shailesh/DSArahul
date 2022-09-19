package practice.Stack;

import java.util.Stack;

public class stack1 {

    static Stack<Integer> s = new Stack<>();

    public static void main(String[] args) {
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(6);
        System.out.println(s);
        //reverse(s);
        insertatIndex(2, 13);
    }

    private static void insertatIndex(int index, int value) {
        Stack<Integer> temp = new Stack<>();
        for (int i = 1; i < s.size() - index; i++) {
            int t = s.pop();
            temp.push(t);
        }
        s.push(value);
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
        System.out.print("After Insertion at index "+ index + '\n' + s);

    }

    private static void reverse(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            temp.push(s.pop());
        }
        System.out.println(temp);
    }

}
