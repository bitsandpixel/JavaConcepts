package myjava.oops.class_object_method;

/**
 * @author Vishnu Kandanelly
 */
public class MethodPractice {

    private static String x = "Static variable";

    public static String getX() {
        return x;
    }



    /*
    datatypes -
    question 0) difference between heap memory and stack memory
    primitive datatypes  - byte, short, int, char, long, float, double
    question 1):
    primitive - it stores value
    reference datatypes - String, arrays, arrayilst, classes, lists
    reference - memory location (address or reference)
    question 2):

    OOPS -

    class  - blueprint
    object - physical
    inheritance, encapsulation, polymorphism

    class members - methods, variables

    method types - static method, instance method

    parts of method

    1) access modifiers
    2) access specifiers - static or non static
    3) return type - void is a non return type
    4) method name - like every variable it is a user defined
        4.1) parameters and their types
    public static void main(String[] args) - method schema/signature
     */
    public static void main(String[] args) {

        MethodPractice methodPractice = new MethodPractice();
        System.out.println(new MethodPractice().x);
        System.out.println(new MethodCalling().staticIntVariable);


        //question 3)
        ChildMethodCalling c1 = new ChildMethodCalling();

        int sum1 = c1.addition(2, 3);


        String name = ChildMethodCalling.sayName();

        String greetings = c1.sayCaio();

        String nameSay = ChildMethodCalling.sayNameBye(name);
//        System.out.println(name);
//        int sum2 = m1.sumoFTwoNumbers(3, 4);
        c1.helloWorld();
        System.out.println(MethodCalling.sayHello()+ "jshdvbjshdbvjshv ");
//        String jashvbdkushdvouasdhv = sayHello();
//        System.out.println(addition(2, 3));
        System.out.println(sum1);
//        System.out.println(m1.sumoFTwoNumbers(2, 3));
//        System.out.println(sum2);
//        sayHello
//        System.out.println(helloWorld());

    }

}

