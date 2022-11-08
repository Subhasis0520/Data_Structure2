package collectionFramworks;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    public static void main(String[] args) {
        Queue<Integer> c = new PriorityQueue<>(Comparator.reverseOrder());
        c.offer(50);
        c.offer(220);
        c.offer(400);
        c.offer(40);
        c.offer(150);
        System.out.print(c);
        c.poll();
        System.out.print(c);
    }
}
