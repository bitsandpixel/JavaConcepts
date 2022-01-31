package core.datastructures;

/**
 * @author Vishnu Kandanelly
 */
public class StackDemo {
    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data) {
        if (top == capacity) {
            expand();
        }
        stack[top] = data;
        top++;
    }

    private void expand() {
        int length = top;
        int[] newStack = new int[capacity *= 2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
    }


    public int pop() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    private void shrink() {
        int length = size();
        if (length <= (capacity / 2) / 2) {
            capacity = capacity / 2;
            int[] newStack = new int[capacity];
            System.arraycopy(stack, 0, newStack, 0, length);
            stack = newStack;
        }
    }

    public int peek() {
        return stack[top - 1];
    }

    public void show() {
        for (int data : stack) {
            System.out.print(data + " ");
        }
        System.out.println();
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
        stackDemo.show();
        stackDemo.push(8);
        stackDemo.show();
        System.out.println("size: " + stackDemo.size());
        System.out.println("last added element: " + stackDemo.peek());
        stackDemo.push(6);
        stackDemo.show();
        System.out.println("removed: " + stackDemo.pop());
        stackDemo.push(7);
        stackDemo.show();
        stackDemo.push(10);
        stackDemo.show();
        stackDemo.push(9);
        stackDemo.show();
        stackDemo.push(19);
        stackDemo.show();
        System.out.println("size: " + stackDemo.size());
        System.out.println(stackDemo.isEmpty());
        stackDemo.show();
        System.out.println("removed: " + stackDemo.pop());
        stackDemo.show();
        System.out.println("removed: " + stackDemo.pop());
        stackDemo.show();
        System.out.println("removed: " + stackDemo.pop());
        stackDemo.show();
        System.out.println("removed: " + stackDemo.pop());
        stackDemo.show();
        System.out.println("removed: " + stackDemo.pop());
        stackDemo.show();
        System.out.println("removed: " + stackDemo.pop());
        stackDemo.show();

    }
}
