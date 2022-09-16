package Stack;

import java.util.Stack;


public class MinimumElement {

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> temp = new Stack<>();

    public static void main(String[] args) {
        customPush(10);
        customPop();
        customPush(20);
        customPush(35);
        customPush(3);
        customPop();
        System.out.println("Minimum element is " + temp.peek());
    }

    private static void customPush(int i) {
        stack.push(i);
        if(temp.isEmpty()) temp.push(i);
        else if (temp.peek() > i ) {
            temp.push(i);
        }
    }
    
    private static void customPop(){
        int item = stack.peek();
        stack.pop();
        if (temp.peek() == item) temp.pop();

    }


}
