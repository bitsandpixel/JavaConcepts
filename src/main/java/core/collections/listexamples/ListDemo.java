package core.collections.listexamples;

import lombok.Data;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Vishnu Kandanelly
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Person> people = new LinkedList<>();
        Person person = new Person("Louis", "Litt", 45);
        people.add(person);
        System.out.println(people.get(0).lastName);
        people.forEach(person1 -> System.out.println(person1.firstName));
        String p = people.toString();
        System.out.println(p);
    }
}

class PersonList {
    private PersonElement personElements;
}

class PersonElement implements Iterable<Person> {
    /**
     * The object that contains the exam information
     */
    private Person person;
    /**
     * The next element in this list
     */
    private PersonElement next;

    @Override
    public Iterator<Person> iterator() {
        return null;
    }
}


@Data
class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
