package core.datastructures;

import java.util.*;
/**
 * @author Vishnu Kandanelly
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> integers = new LinkedList<>();
        // Adds elements {0, 1, 2, 3, 4} to
        // the queue
        for (int i = 0; i < 5; i++) {
            integers.add(i);
        }
        // Display contents of the queue.
        System.out.println("Elements of the Queue: " + integers);

        // To remove the head of queue.
        int removedele = integers.remove();
        System.out.println("removed element-"
                + removedele);

        System.out.println(integers);

        // To view the head of queue
        int head = integers.peek();
        System.out.println("head of queue-"
                + head);

        // Rest all methods of collection
        // interface like size and contains
        // can be used with this
        // implementation.
        int size = integers.size();
        System.out.println("Size of queue-"
                + size);


    }
}
