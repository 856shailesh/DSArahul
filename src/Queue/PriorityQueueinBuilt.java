package Queue;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueinBuilt {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        q.add(3);
        q.add(213);
        //q.remove(); //FiFO
        q.add(22);
        q.add(2);
        for (int e: q) {
            System.out.println(e);
        }
    }
}
