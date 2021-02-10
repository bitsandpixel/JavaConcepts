package advancedjava.java8features;

public class FunctionalInterface {
    public static void main(String[] args) {
        Phone phone = new AndriodPhone();
        phone.call();
        phone.message();
    }
}

interface Phone {
    //TODO: variables in interfaces
    void call();/*every method in interfaces are abstract and public so we can omit them while declaring
    */

    /*now methods can have definition in interface with default keyword */
    default void message() {
        System.out.println("message");
    }
}


class AndriodPhone implements Phone {

    @Override
    public void call() {
        System.out.println("Calling");
    }
}
