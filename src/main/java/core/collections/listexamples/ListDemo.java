package core.collections.listexamples;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Vishnu Kandanelly
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Person> people = new LinkedList<>();
        Person person = new Person();
        person.setFirstName("Louis");
        person.setLastName("Litt");
        person.setAge(45);
        people.add(person);
        System.out.println(people.get(0).lastName);
        people.forEach(person1 -> System.out.println(person1.firstName));
    }
}

class PersonList {
    private PersonElement personElements;
}

class PersonElement {
    /**
     * The object that contains the exam information
     */
    private Person person;
    /**
     * The next element in this list
     */
    private PersonElement next;
}


@Data
class Person {
    String firstName;
    String lastName;
    int age;
}
