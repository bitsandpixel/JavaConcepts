package advancedjava.java8features.streams;

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

        System.out.println("----- imperative style to print names other than Joe -----");
        for (String name : names) {
            if (isNotJoe(name)) {
                System.out.println(name);
            }
        }


        System.out.println("----- using stream filter without lambda or method reference -----");
        names.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String name) {
                return isNotJoe(name);
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        System.out.println("----- using lambda and method reference (functional programming) -----");
        names.stream()
                .filter(StreamFilterDemo::isNotJoe) //.filter(name -> isNotJoe(name))
                .forEach(System.out::println);
    }

    /**
     * returns true if the given name is not equal to Joe
     * @param name input name
     * @return true when the given name is not equal to Joe
     */
    private static boolean isNotJoe(String name) {
        return !name.equals("Joe");
    }
}
