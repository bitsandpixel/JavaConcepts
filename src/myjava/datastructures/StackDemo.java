package myjava.datastructures;

/**
 * @author Vishnu Kandanelly
 */
public class StackDemo {
    //TODO: is stack size fixed?
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        stack[top] = data;
        top++;
    }


    public int pop() {
        top--;
        int data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int peek() {
        return stack[top - 1];
    }

    public void show() {
        for (int data : stack) {
            System.out.print(data + " ");
        }
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }
}

class Runner {
    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo();
        System.out.println(stackDemo.isEmpty());
        stackDemo.push(15);
        stackDemo.push(8);
        System.out.println("size: " + stackDemo.size());
        System.out.println("last added element: " + stackDemo.peek());
        stackDemo.push(6);
        stackDemo.push(7);

        System.out.println("removed: " + stackDemo.pop());
        System.out.println("size: " + stackDemo.size());
        System.out.println(stackDemo.isEmpty());


        stackDemo.show();
    }
}
