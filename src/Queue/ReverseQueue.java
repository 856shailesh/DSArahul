package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(3);
        q.add(23);
        q.remove(); //FiFO
        q.add(22);
        //q.poll(); // return null if empty
        q.add(21);

        for (int e: q) {
            System.out.println(e);
        }
        reverse(q);
    }

    public static void reverse(Queue q){
        Stack s = new Stack<>();
        for (int i = 0; i <= q.size()+1; i++) {
            s.push(q.remove());
        }
        System.out.println("After Reversal");
        while (!s.isEmpty()){
           q.add(s.pop());
        }
        for (Object e: q )
        {
            System.out.println(e);
        }
    }
}
