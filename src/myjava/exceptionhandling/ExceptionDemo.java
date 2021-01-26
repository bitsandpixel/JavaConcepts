package myjava.exceptionhandling;

/**
 * @author Vishnu Kandanelly
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        int i = 9, j = 0, k;
        try {
            k = i / j;
        } catch (ArithmeticException e) {
            if (j == 0) {
                System.out.println("Cannot be divided by zero " + e);
            } else {
                System.out.println(e);
            }
        }
    }
}
