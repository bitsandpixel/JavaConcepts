package myjava.oops.class_object;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * Example of Class and Object
 *
 * @author Vishnu Kandanelly
 */
@Data
//TODO: check the clean code by baeldung to make changes as per the code cleaning strategies in java
public class StudentClass {
    private int ID;
    private String name;

    public StudentClass(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public static void main(String[] args) {
        StudentClass student1 = new StudentClass(001, "vishnu");
        StudentClass student2 = new StudentClass(002, "kiran");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + this.getID() +
                ", name='" + this.getName() + '\'' +
                '}';
    }
}
