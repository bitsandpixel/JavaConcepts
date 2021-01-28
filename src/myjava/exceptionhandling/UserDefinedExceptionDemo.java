package myjava.exceptionhandling;

/**
 * @author Vishnu Kandanelly
 */
public class UserDefinedExceptionDemo {

    public static void main(String[] args) {
        int i = 5;
        try {
            if (i < 10) {
                throw new MyException("Number is less than 10");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
