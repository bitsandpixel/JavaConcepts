package advancedjava.java8features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Vishnu Kandanelly
 */
public class StreamFilterDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("vishnu", "Kiran", "Viski", "Joe");

        System.out.println("----- one of the old ways to print names other than Joe -----");
        for (String name : names) {
            if (!name.equals("Joe")) {
                System.out.println(name);
            }
        }


        System.out.println("----- using stream filter without lambda or method reference -----");
        names.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String name) {
                return !name.equals("Joe");
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        System.out.println("----- using lambda and method reference -----");
        names.stream()
                .filter(name -> !name.equals("Joe"))
                .forEach(System.out::println);
    }
}
