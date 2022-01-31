package core.oops.class_object_method;

/**
 * @author Vishnu Kandanelly
 */
public class MethodPractice {

    //

    private static String staticVariable = "Static variable";
    int instanceVariable = 5;

    public static String getStaticVariable() {
        return staticVariable;
    }


    /*
    data types -
    question 0) difference between heap memory and stack memory
    primitive data types  - byte, short, int, char, long, float, double
    question 1):
    primitive - it stores value
    reference data types - String, arrays, arraylist, classes, lists
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

        MethodPractice methodPracticeReference = new MethodPractice();

        /*
        Non-static field 'instanceVariable' cannot be referenced from a static context
         */
//        System.out.println(MethodPractice.instanceVariable);
        //should call an instance variable with a reference of a class
        System.out.println(methodPracticeReference.instanceVariable);

        /*
        * Generally, public variables can be accessed by everybody, and private variables can only be accessed
        * from within the current instance of the class. In this example you're allowed to access the "staticVariable" variable
        * from the main method, because that method is within the "MethodPractice" class.

        * If you're wondering why you're allowed to access "staticVariable" from another instance of Static class than the one you're
        * currently in (which generally isn't allowed for private variables), it's simply because static variables
        * don't exist on a per-instance basis, but on a per class basis. This means that the same static variable
        * of A can be accessed from all instances of A.

        * If this wasn't the case, nobody would be able to access the private static variable at all, since it doesn't belong
        * to one instance, but them all.
        * */
        System.out.println(new MethodPractice().staticVariable); //calling with an anonymous object which does not have a name(reference variable)

        System.out.println(methodPracticeReference.staticVariable);

        System.out.println(MethodPractice.staticVariable);

        System.out.println(MethodPractice.getStaticVariable());

        System.out.println(new MethodCalling().staticIntVariable);//TODO: WAS IST DAS?


        //question 3)
        ChildMethodCalling c1 = new ChildMethodCalling();

        int sum1 = c1.addition(2, 3);


        String name = ChildMethodCalling.sayName();

        String greetings = c1.sayCaio();

        String nameSay = ChildMethodCalling.sayNameBye(name);
//        System.out.println(name);
//        int sum2 = m1.sumoFTwoNumbers(3, 4);
        c1.helloWorld();
        System.out.println(MethodCalling.sayHello() + "jshdvbjshdbvjshv ");
//        String jashvbdkushdvouasdhv = sayHello();
//        System.out.println(addition(2, 3));
        System.out.println(sum1);
//        System.out.println(m1.sumoFTwoNumbers(2, 3));
//        System.out.println(sum2);
//        sayHello
//        System.out.println(helloWorld());

    }

}

