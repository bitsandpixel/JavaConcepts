package advancedjava.java8features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Vishnu Kandanelly
 */
public class StremFilterDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("vishnu", "Kiran", "Viski", "Joe");

        //one of the old ways to print names other than Joe
        for (String name : names) {
            if (!name.equals("Joe")) {
                System.out.println(name);
            }
        }

        //using stream filter
//        names.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String name) {
//                return !name.equals("Joe");
//            }
//        }).forEach(name -> System.out.println(name));

        names.stream()
                .filter(name -> !name.equals("Joe"))
                .forEach(System.out::println);
    }
}
