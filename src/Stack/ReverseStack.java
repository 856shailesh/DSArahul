package Stack;

import java.util.Iterator;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(3);
        s.push(6);
        s.push(9);
        System.out.println("Before reversing :" + s);

    }
    public static void reverse (Stack s){
        Stack<Integer> temp = new Stack<Integer>();
        Iterator value = s.iterator();
        while (value.hasNext()){
            //int t = s.pop();
        }

    }
}
