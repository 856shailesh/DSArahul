package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInBuilt {
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
    }
}
