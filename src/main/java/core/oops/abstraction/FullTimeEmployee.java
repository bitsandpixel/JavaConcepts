package myjava.oops.abstraction;

/**
 * @author Vishnu Kandanelly
 */
public class FullTimeEmployee extends AbstractionEmployee {

    private int workingHours = 8;

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }
}
