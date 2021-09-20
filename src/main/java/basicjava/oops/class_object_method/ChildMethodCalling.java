package myjava.oops.class_object_method;

/**
 * @author Vishnu Kandanelly
 */
public class ChildMethodCalling extends MethodCalling {

    /*
    If you're wondering why you're allowed to access it from another instance of
    Static class than the one you're currently in (which generally isn't allowed
    for private variables), it's simply because static variables don't exist on
    a per-instance basis, but on a per class basis. This means that the same
    static variable of A can be accessed from all instances of A.

    If this wasn't the case, nobody would be able to access the private static
    variable at all, since it doesn't belong to one instance, but them all.
    */

    public static int useAddition(int a, int b) {
        ChildMethodCalling a1 = new ChildMethodCalling();
        int staticIntVariableInChild = ChildMethodCalling.staticIntVariable;
        int staticIntVariableInChild2 = new ChildMethodCalling().staticIntVariable;
        int sum = a1.addition(2, 5);
        String shailu = sayHello();
        String vishnu = sayName();
        return sum;
    }

    public static String sayName() {
        return "Vishnu";
    }

    public static String sayNameBye(String name) {
        return "bye " + name;
    }

    public String sayCaio() {
        return "say caio!!";
    }

    public int addition(int num1, int num2, int num3) {
        int sum = num1 + num2;
        return sum;
    }

}
