package myjava.oops.class_object_method;

/**
 * Demo of an Inner class.
 * Coded the class structure or calling of methods in a basic level so that beginners would understand.
 * <p>
 * //TODO: https://www.javatpoint.com/java-inner-class (complete the coding of all types of inner classes)
 *
 * @author Vishnu Kandanelly
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.number = 11;
        outerClass.name = "Vishnu";
        outerClass.greet();

        /*
         * Non static inner class object will be created with the help of an instance of an outer class
         * */
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.bye();

        /*
         * Static inner class constructor will be created using outer class name, we do not need to create an instance
         * of an outer class
         *
         * we can access static methods of an inner classes with its name just like we do for general class
         * */

        System.out.println(OuterClass.number + " is an even number: " + OuterClass.StaticInnerClass.isEven());

        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        System.out.println("square of the given number " + OuterClass.number + " is: " + staticInnerClass.squareOfTheNumber());


    }
}

class OuterClass {
    String name;
    static int number;

    public void greet() {
        System.out.println("Hello " + name);
    }

    class InnerClass {
        public void bye() {
            /*
             * We can access all the members of outer class including private data members and methods.
             * */
            System.out.println("Bye " + name);
        }
    }

    /**
     * static inner class
     * just like static method static inner would throw a static context error if you try to access non-static members
     * of outer class.
     * <p>
     * In this case we cannot access instance variable "name" in this static class.
     */
    static class StaticInnerClass {

        /**
         * static method of a static inner class
         *
         * @return returns a boolean value based on if the given number is even or not
         */
        public static boolean isEven() {
            return number % 2 == 0;
        }

        /**
         * Non static method can access static variables but not vice versa
         *
         * @return returns the square of a given number
         */
        public int squareOfTheNumber() {
            return number * number;
        }
    }
}
