package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityqueueEx {
    public static void main(String[] args) {
        Queue<Integer> p = new PriorityQueue<>();
        p.offer(3);
        p.offer(8);
        p.offer(5);
        p.offer(1);

        System.out.println(p);

        p.poll();
        System.out.println(p);


        System.out.println( p.peek());

    }
}
