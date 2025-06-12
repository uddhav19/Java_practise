package Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(2);
        adq.offerFirst(4);
        adq.offerLast(7);
        adq.offer(5);
        System.out.println(adq);
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.poll());
        System.out.println(adq);
        System.out.println(adq.pollFirst());
        System.out.println(adq);
        System.out.println(adq.pollLast());
        System.out.println(adq);


    }
}
