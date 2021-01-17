package myjava.oops.class_object;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NonNull;


/**
 * Example of Class and Object
 * Added Lombok support to this class
 * @author Vishnu Kandanelly
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//TODO: check the clean code by baeldung to make changes as per the code cleaning strategies in java
public class StudentClass {
    private int ID;
    private String name;

    public static void main(String[] args) {
        StudentClass student0 = new StudentClass(); /*Lombok has generated a parameterless constructor using @NoArgsConstructor Annotation*/
        StudentClass student1 = new StudentClass(001, "vishnu"); /*Lombok has created parameterless constructor using @AllArgsConstructor Annotation*/
        StudentClass student2 = new StudentClass(002, "kiran");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + this.getID() + /*Lombok created parameterless constructor using @NoArgsConstructor Annotation*/
                ", name='" + this.getName() + '\'' +
                '}';
    }
}
