package advancedjava.java8features.Streams;

import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @see "Stream need to have a terminal operation at the end to stop the flow of it. like forEach and Collect"
 * @see "We can use map method to transforming objects from one specific object to another or from same object
 * to another instance"
 *
 * @author Vishnu Kandanelly
 */
@Data
public class MapAndCollectDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Vishnu", "Kiran", "Viski", "Joe");

        System.out.println("----- imperative style to print names other than Joe -----");
        for (String name : names) {
            if (isNotJoe(name)) {
                User user = new User(name);
                System.out.println(user);
            }
        }


        System.out.println("----- using lambda and method reference (functional programming) -----");
        names.stream()
                .filter(MapAndCollectDemo::isNotJoe) //.filter(name -> isNotJoe(name))
                /*Whatever the argument comes to map, the same argument passed to the new instance of the User
                 * we are converting a string into a type of User */
                .map(User::new)
                .forEach(System.out::println);


        //Storing it as a list using collect method
        List<User> userNamesList = names.stream()
                .filter(MapAndCollectDemo::isNotJoe)
                .map(User::new)
                .collect(Collectors.toList());

    }

    /**
     * returns true if the given name is not equal to Joe
     *
     * @param name input name
     * @return true when the given name is not equal to Joe
     */
    private static boolean isNotJoe(String name) {
        return !name.equals("Joe");
    }
}

@Data
class User {
    private String name;
    private int age = 30;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
