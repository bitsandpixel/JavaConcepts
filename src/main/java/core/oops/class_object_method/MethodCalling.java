package core.oops.class_object_method;

/**
 * @author Vishnu Kandanelly
 */
public class MethodCalling {

    static int staticIntVariable = 5;

    public int addition(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    private int sumoFTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public void helloWorld() {
        MethodPractice addition = new MethodPractice();
        int sum = addition(2, 3);

        System.out.println("Hello World, This is " + sayHello() + ", the sum is:" + sum);
    }

    public static String sayHello() {
        return "Shailu";
    }

}

