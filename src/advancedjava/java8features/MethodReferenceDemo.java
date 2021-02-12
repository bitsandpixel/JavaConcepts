package advancedjava.java8features;

import java.util.Arrays;
import java.util.List;

/**
 * Java provides a new feature called method reference in Java 8.
 * Method reference is used to refer method of functional interface.
 * It is compact and easy form of lambda expression.
 * Each time when you are using lambda expression to just referring a method,
 * you can replace your lambda expression with method reference.
 */
public class MethodReferenceDemo {
    public static void main(String[] args) {
        /*
         A Sample example of method reference (instead of call by value of java)
        */

        List<String> cities = Arrays.asList("Rome", "Cairo", "Calcutta");
//        cities.forEach(city -> System.out.println(city)); //using lambda expression
        cities.forEach(System.out::println);
    }
}
