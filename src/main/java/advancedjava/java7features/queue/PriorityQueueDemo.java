package advancedjava.java7features.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Vishnu Kandanelly <https://github.com/bitsandpixel>
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {

        System.out.println("diff b/w Priority Queue and Queue");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 10; i > 0; i--) {
            priorityQueue.add(i);
        }


        System.out.println(priorityQueue.peek()); //peeks at the head



        Queue<Integer> queue = new LinkedList<>();

        for (int i = 10; i > 0; i--) {
            queue.add(i);
        }
        System.out.println(queue.peek());

        System.out.println("PriorityQueue Sorts the data ");
        System.out.println(priorityQueue);
        System.out.println(queue);

    }
}
