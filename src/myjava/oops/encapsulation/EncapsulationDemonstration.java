package myjava.oops.encapsulation;

/**
 * @author Vishnu Kandanelly
 */
public class EncapsulationDemonstration {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Vishnu");

        /**
         * Note: As id and name are encapsulated in Person class, those cannot be accessed directly here.
         * Also there is no way to assign id in this class.
         * Try to uncomment below code and you would find compile time error.
         *
         * any attempt to assign a value to "id" variable will result in an error.
         * you cannot access sayHello() method from here.
         * */

        System.out.println("Person 1 - " + person.getId() + ": " + person.getName());
    }
}
