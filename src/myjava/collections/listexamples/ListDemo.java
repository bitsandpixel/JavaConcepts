package myjava.collections.listexamples;

/**
 * @author Vishnu Kandanelly
 */
public class ListDemo {
}

class PersonList{
    private PersonElement personElements;
}

class PersonElement{
    /**
     * The object that contains the exam information
     */
    private Person person;
    /**
     * The next element in this list
     */
    private PersonElement next;
}



class Person{
    String firstName;
    String lastName;
    int age;
}
