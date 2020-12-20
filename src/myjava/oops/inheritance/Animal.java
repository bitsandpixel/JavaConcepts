package myjava.oops.inheritance;

/**
 * TODO: implement examples for all kinds of inheritance.
 * @author Vishnu Kandanelly
 */
public class Animal {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sound(){
        System.out.println("by default it is mute");
    }
}

class Dog extends Animal{

    //Own behaviour
    private void bark(){
        System.out.println("Dog '"+getId()+"' is barking");
    }

    //Overriding super class behaviour
    @Override
    public void sound() {
        bark();
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setId(123); //inherited from super class
        dog.sound(); // overridden behaviour of sub class
    }

}
