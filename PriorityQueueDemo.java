import java.util.Collections;
import java.util.*;

/*
* Priority Queue: It is a FIFO data structure that serves elements with
*                   HIGHEST Priority FIRST before elements with lower priority.
*   1. It is based on Priority HEAP.
*   2. Doesn't allow NULL.
* */

public class PriorityQueueDemo {

    public static void main(String[] args) {

        //by default, the elements are executed in ascending order.

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        // based on the condition you give, it takes its priority.


        // to add elements  we have offer() methods

        queue.offer(2.0);
        queue.offer(7.5);
        queue.offer(2.9);
        queue.offer(1.9);
        queue.offer(4.8);

        //to display the elements in the queue,

        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
    }
}
