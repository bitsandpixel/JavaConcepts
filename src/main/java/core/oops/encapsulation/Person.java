package core.oops.encapsulation;

/**
 * @author Vishnu Kandanelly
 */
public class Person {

    private double id;
    private String name;

    public Person() {
        //only PersonEncapsulation class can access and assign
        id = Math.random(); //TODO: generate an integer
        sayHello();
    }

    //This method is protected for giving access within PersonEncapsulation class only
    private void sayHello() {
        System.out.println("Hello - " + getId());
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
