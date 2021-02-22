package advancedjava.java8features.LambdaExpressions;

/**
 * @author Vishnu Kandanelly
 */
public class PassingBehaviourInOOP {
    public static void main(String[] args) {
        HelloworldGreeting helloworldGreeting = new HelloworldGreeting();
        /*Using Anonymous class*/
        new PassingBehaviourInOOP().greet(helloworldGreeting);
    }

    /**
     * 
     * @param greeting
     */
    public void greet(Greeting greeting) {
        greeting.perform();
    }
}

interface Greeting {
    public void perform();
}

class HelloworldGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.println("Hello World!!");
    }
}
