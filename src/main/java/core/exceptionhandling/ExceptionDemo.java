package core.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vishnu Kandanelly
 */
public class ExceptionDemo {

    public static void main(String[] args) throws IOException, ArithmeticException {
        int i = 9;
        int k;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] intArray = new int[4];
        //try {
            System.out.print("Enter a number: ");
            int j = Integer.parseInt(bufferedReader.readLine());
            k = i / j;
            if (k < 1) {
                /*forcing the code */
                throw new ArithmeticException("k should be greater than zero");
            }
            for (int l = 0; l < intArray.length; l++) {
                intArray[l] = l + 1;
            }
//        } catch (IOException e) {
//            System.out.println("Input/Output Exception");
//        } catch (ArithmeticException e) {
//            System.out.println("Cannot be divided by zero " + e);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Maximum index is 4");
//        } catch (Exception e) {
//            System.out.println("Unknown exception");
//        } finally {
//            try {
//                bufferedReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Exiting... BYE!!");
//        }
    }
}
