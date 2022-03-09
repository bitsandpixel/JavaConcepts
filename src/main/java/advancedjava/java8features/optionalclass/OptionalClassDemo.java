package advancedjava.java8features.optionalclass;

import java.util.Optional;

/**
 * Tired of using NullPointerExceptions, use "Optional" class
 * @URL https://www.oracle.com/technical-resources/articles/java/java8-optional.html
 * @URL https://www.baeldung.com/java-optional
 * @URL 'https://youtu.be/1xCxoOuDZuU'
 *
 * @author Vishnu Kandanelly
 */
public class OptionalClassDemo {

    public static void main(String[] args) {
        /*
        Creating an empty optional class
         */
        Optional<Integer> emptyOptional = Optional.empty();
        System.out.println("is present:" + emptyOptional.isPresent());

        /*
        Creating Optional class with the static method of()
         */
        String name = "Vishnu";
        Optional<String> ofOptional = Optional.of(name);
        /*
        However, the argument passed to the of() method can't be null. Otherwise,
        we'll get a NullPointerException:
         */
        System.out.println("is present:" + ofOptional.isPresent());

        Optional<String> ofNullable = Optional.ofNullable(null);
        /*
        If we are expecting nullable values, we can also create the Optional object
        with ofNullable().
        By doing this, if we pass in a null reference, it doesn't throw an exception
        but rather returns an empty Optional object
         */
        System.out.println(ofNullable.isEmpty());//true

        Optional<String> names = Optional.ofNullable("Vishnu");
        String orElse = names.orElse("Kiran");
        /*If Value available "Vishnu" would be printed otherwise Kiran would be printed.*/
        System.out.println(orElse);
    }
}
