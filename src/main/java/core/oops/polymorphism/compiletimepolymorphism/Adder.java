package myjava.oops.polymorphism.compiletimepolymorphism;

/**
 * //TODO: improve the examples later
 *
 * @author Vishnu Kandanelly
 */
public class Adder {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    /*
     *Even if you change the return type of the method, changing the type of parameters is must.
     */
//    public static double add(int a, int b) {
//        return a + b;
//    }


}

class TestOverloading1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(1, 2));
        System.out.println(Adder.add(1, 2, 3));
        System.out.println(Adder.add(1.2, 2.3));
    }
}
