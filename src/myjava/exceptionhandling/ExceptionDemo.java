package myjava.exceptionhandling;

/**
 * @author Vishnu Kandanelly
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        int i = 9, j = 0, k;
        int[] intArry = new int[4];
        try {
            k = i / j;
            for (int l = 0; l < intArry.length; l++) {
                intArry[l] = l + 1;
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Maximum index is 4");
        } catch(Exception e){
            System.out.println("Unknown exception");
        }
    }
}
