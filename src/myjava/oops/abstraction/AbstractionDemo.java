package myjava.oops.abstraction;

/**
 * @author Vishnu Kandanelly
 */
public class AbstractionDemo {
    public static void main(String[] args) {
        AbstractionEmployee contractor = new Contractor("contractor", 10, 10);
        AbstractionEmployee fullTimeEmployee = new FullTimeEmployee("fullTimeEmployee", 20);
        System.out.println("Contractor Employee Salary: " + contractor.calculateSalary());
        System.out.println("FullTime Employee Salary: " + fullTimeEmployee.calculateSalary());

    }
}
