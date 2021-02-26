package myjava.oops.class_object_method;

/**
 * @author Vishnu Kandanelly
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outerClass = new Outer();
        outerClass.name = "Vishnu";
        outerClass.greet();

        Outer.Inner innerClass = outerClass.new Inner();
        innerClass.bye();
    }
}

class Outer {
    String name;

    public void greet() {
        System.out.println("Hello " + name);
    }

    class Inner {
        public void bye() {
            /*
             * We can access all the members of outer class including private data members and methods.
             * */
            System.out.println("Bye " + name);
        }
    }
}
