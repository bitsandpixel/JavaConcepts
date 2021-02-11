package advancedjava.java8features;

/**
 * Lambda expression is an important feature of java introduced in JAVA SE 8.
 * It provides a clear and concise way to represent one method interface using an expression.
 * It is very useful in collection library. It helps to iterate, filter and extract data from collection.
 *
 * The Lambda expression is used to provide the implementation of an interface which has functional interface.
 * It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing
 * the implementation. Here, we just write the implementation code.
 *
 * The need of writing the obvious boiler plate code can be eliminated by using lambda expressions. 
 *
 * Java lambda expression is treated as a function, so compiler does not create .class file.
 */
public class LambdaExpressionDemo {
    public static void main(String[] args) {
        /* we could replace the anonymous class with lambda expression */

        /*
        Hello hello = new Hello() {
            public void greet(String name) {
                System.out.println("Namaskaram " + name);
            }
        };
        */

        /*we can further reduce the block of code even further*/

        /*
        Hello hello = (name) ->
        {
            System.out.println("Namaskaram " + name);
        };
        */

        Hello hello = (name) -> System.out.println("Namaskaram " + name);
        hello.greet("Vishnu");
    }
}

interface Hello {
    void greet(String name);
}

/*
Just to implement a single method we do not need a whole class, we could achieve the result with anonymous inner class too.
 */
/*class Namaste implements Hello {
    @Override
    public void greet(String name) {
        System.out.println("Namaskaram " + name);
    }
}*/
