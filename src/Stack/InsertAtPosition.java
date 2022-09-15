package Stack;

import java.util.Stack;

public class InsertAtPosition {
    static Stack<Integer> s = new Stack<Integer>();
    static Stack<Integer> temp = new Stack<Integer>();

    public static void main(String[] args) {
        s.push(3);
        s.push(6);
        s.push(9);
        s.push(20);
        s.push(25);
        System.out.println("Before Insertion :" + s);
        insertAtPos(2, 15);
    }

    private static void insertAtPos(int pos, int val) {
        Stack<Integer> temp = new Stack<Integer>();
        for (int i = 0; i <= (s.size() - pos+1); i++) {
            int t = s.peek();
            temp.push(t);
            s.pop();
        }
        s.push(val);
        while (!temp.isEmpty()){
            int t = temp.peek();
            s.push(t);
            temp.pop();
        }
        System.out.println(s);
    }
}
