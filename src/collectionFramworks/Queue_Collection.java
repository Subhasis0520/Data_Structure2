package collectionFramworks;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Collection {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        System.out.print(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.print(queue);
    }
}
