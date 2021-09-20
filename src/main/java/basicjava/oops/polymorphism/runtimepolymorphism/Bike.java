package myjava.oops.polymorphism.runtimepolymorphism;

/**
 * The method is overridden not applicable data members, so runtime polymorphism can't be
 * achieved by data members.
 * In the example given below, both the classes have a data member speedLimit, we are
 * accessing the data member by the reference variable of Parent class which refers to the
 * subclass object. Since we are accessing the data member which is not overridden, hence it
 * will access the data member of Parent class always.
 *
 * @author Vishnu Kandanelly
 */
public class Bike {
    int speedLimit = 90;

    void name(){
        System.out.println(Bike.class.getName());
    }
}

class Honda extends Bike {
    int speedLimit = 150;

    @Override
    void name(){
        System.out.println(Honda.class.getName());
    }

    public static void main(String[] args) {
        Bike obj = new Honda(); //Honda
//        Bike obj = new Bike(); //Bike
        System.out.println(obj.speedLimit); //90
        obj.name();
    }
}
