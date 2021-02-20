package myjava.oops.misc;

/**
 * There is only call by value in java, not call by reference. If we call a method passing a value,
 * it is known as call by value. The changes being done in the called method, is not affected in the calling method.
 */
public class CallByValueDemo {
    public static void main(String[] args) {
        System.out.println("-------operation 1------------------");
        Operation op = new Operation();

        System.out.println("before change " + op.data);
        op.change(500);
        System.out.println("after change " + op.data);

        System.out.println("-------operation 2------------------");

        Operation2 op2 = new Operation2();

        System.out.println("before change " + op2.data);
        op2.change(op2);//passing object
        System.out.println("after change " + op2.data);
    }
}

/**
 * In case of call by value original value is not changed.
 */
class Operation {
    int data = 50;

    void change(int data) {
        data = data + 100;//changes will be in the local variable only
    }
}

/**
 * In case of call by reference original value is changed if we made changes in the called method.
 * If we pass object in place of any primitive value, original value will be changed.
 * In this example we are passing object as a value.
 */
class Operation2 {
    int data = 50;

    void change(Operation2 op) {
        op.data = op.data + 100;//changes will be in the instance variable
    }
}

