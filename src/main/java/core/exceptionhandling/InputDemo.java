package core.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Try with resource introduced in 1.7
 *
 * @author Vishnu Kandanelly
 */
public class InputDemo {
    public static void main(String[] args) throws IOException {
        /*
         * Anything comes from outside of java using i/o or whenever we are dealing with an IO operation
         * all the related objects become resources.
         * Whenever one work with a resource, it is mandatory to close that resource.
         * We should always open a resource in try catch block to ensure there no open connection of resources.
         *
         * If you are creating the finally block just to close the resource, you can use the new feature introduced
         * in 1.7 where you can create the resource as a try block parameter.
         * In this scenario we do not need to create both catch(because throws(not handling the error
         *  when we use throws keyword, it just suppress the error) added to the method header)
         *      and finally block.
         */
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = bufferedReader.readLine();
        }
    }
}
