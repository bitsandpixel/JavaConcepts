package myjava.oops.abstraction;

/**
 * @author Vishnu Kandanelly
 */
public abstract class AbstractionEmployee {

    private String name;
    private int paymentPerHour;



    public AbstractionEmployee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    /**
     * abstract method
     * @return
     */
    public abstract int calculateSalary();
    //here I would explain about abstract methods
    //@example: why abstract methods cannot be static and why it is a illegal combination?

}
