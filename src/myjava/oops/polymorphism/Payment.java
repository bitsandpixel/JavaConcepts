package myjava.oops.polymorphism;

/**
 * This represents payment interface
 *
 * @author Vishnu Kandanelly
 */
public interface Payment {
    public void pay();
}

/**
 * Cash IS-A Payment type
 */
class CashPayment implements Payment {

    /**
     * method overriding
     */
    @Override
    public void pay() {
        System.out.println("This is cash payment");
    }
}

class CreditPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("This is credit card payment");
    }
}

class Polymorphism{
    public static void main(String[] args) {
        //Here the runtime polymorphism fundamental is not applied,
        //as it is of single cash payment form
        CashPayment cashPayment = new CashPayment();
        cashPayment.pay();

        //single Payment instance can be used to pay by cash and credit card

        Payment payment = new CashPayment();
        payment.pay(); // pay by cash

        payment = new CreditPayment();
        payment.pay(); // pay by credit card



    }
}
