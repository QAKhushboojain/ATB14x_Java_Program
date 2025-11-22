package ex_030_Collection_Framework.CF_03_QUEUE;

import java.util.PriorityQueue;

public class Lab243_Queue {
    public static void main(String[] args) {
        // FIFO
        PriorityQueue q= new PriorityQueue();
        q.add("Khushboo");
        q.add("Jain");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

    }
}
