package myjava.oops.class_object_method;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.NonNull;


/**
 * Example of Class and Object
 * Added Lombok support to this class
 *
 * @author Vishnu Kandanelly
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//TODO: check the clean code by baeldung to make changes as per the code cleaning strategies in java
public class StudentClass {
    private int ID;
    @NonNull
    private String name;

/*    public StudentClass(@NonNull int ID, @NonNull String name) {
        this.ID = ID;
        this.name = name;
    }*/

    public static void main(String[] args) {
        StudentClass student0 = new StudentClass(); /*Lombok has generated a parameterless constructor using @NoArgsConstructor Annotation*/
        StudentClass student1 = new StudentClass(1, "vishnu"); /*Lombok has created parameterless constructor using @AllArgsConstructor Annotation*/
        StudentClass student2 = new StudentClass(2, "kiran");
        /*Using the concept of anonymous class*/
        System.out.println(new StudentClass(3, "Viski").toString());

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
