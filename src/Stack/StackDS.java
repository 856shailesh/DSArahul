package Stack;

import java.util.Stack;

public class StackDS {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        System.out.println(s.empty());
        s.push(3);
        s.push(5);
        s.push(10);
        s.push(15);
        System.out.println(s);

        //Reverse the Stack
        moveStack(s, s1);
        moveStack(s1, s2);
        moveStack(s2, s);
        System.out.println(s);

//        s.pop(); // LIFO , last ot go in will be the first one to come out
//        int peek = s.peek(); // Get the value of top
//        System.out.println(peek);
//        System.out.println(s.contains(5)); // if stack contain the value
//        s.insertElementAt(30,2); //insert element at position

    }

    private static void moveStack(Stack<Integer> s, Stack<Integer> s1) {
        while (!s.isEmpty()) {
            int temp = s.peek();
            s1.push(temp);
            s.pop();
        }
    }
}
