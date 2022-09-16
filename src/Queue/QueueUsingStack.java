package Queue;

import java.util.Stack;

public class QueueUsingStack {

    static Stack s = new Stack();
    static Stack temp = new Stack();

    public void enqueue(int val) {
        s.push(val);
    }

    public int dequeue() {
        while (!s.isEmpty()) {
            int t = (int) s.pop();
            temp.push(t);
        }
        int ele = (int) temp.pop();
        while (!temp.isEmpty()) {
            int x = (int) temp.pop();
            s.push(x);
        }
        return ele;
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(40);
        q.dequeue();
        System.out.println(s);
    }
}
