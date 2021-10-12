package advancedjava.java7features.queue;

/**
 * @author Vishnu Kandanelly
 */
public class QueueInterfaceDemo {
    int[] queue = new int[5];
    int front;
    int rear;
    int size;

    public static void main(String[] args) {
        QueueInterfaceDemo que = new QueueInterfaceDemo();
        System.out.println("Is queue empty? = " + que.isEmpty());
//        que.enQueue(1);
//        que.enQueue(2);
//        que.enQueue(3);
//        que.enQueue(4);
        System.out.println("Is queue empty? = " + que.isEmpty());
        que.show();
        System.out.println("removed element is: " + que.deQueue());
        que.show();
        System.out.println("removed element is: " + que.deQueue());
        que.show();
        que.enQueue(5);
        que.enQueue(6);
        System.out.println("Is queue full? = " + que.isFull());
        que.enQueue(7);
        que.enQueue(8);
        System.out.println("Is queue full? = " + que.isFull());
        que.show();
        System.out.println("size= " + que.getSize());
        System.out.println("Actual values of queue array");
        for (int data :
                que.queue) {
            System.out.print(data + " ");

        }
    }

    private void enQueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        } else {
            System.out.println("Queue is full, Cannot add more values");
        }
    }

    private int deQueue() {
        int data = queue[front];
        if (!isEmpty()) {
            front = (front + 1) % 5;
            size--;
        } else {
            System.out.println("Queue is empty");
        }
        return data;
    }

    private void show() {
        System.out.print("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 5] + " ");
        }
        System.out.println();
    }

    private int getSize() {
        return size;
    }

    private boolean isEmpty() {
        return getSize() == 0;
    }

    private boolean isFull() {
        return getSize() == queue.length;
    }

}
