package myjava.oops.abstraction;

/**
 * @author Vishnu Kandanelly
 */
public class Contractor extends AbstractionEmployee {

    private int workingHours;

    public Contractor(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }

    /*
    //TODO: come with a strategy to log possible errors here
     @error: there is no default constructor in basicjava.oops.abstraction.AbstractionEmployee
     //can be fixed it by;
      1. adding default constructor in parent abstract class or
      2. creating an equivalent constructor(parameterized) in child class
     */

}
